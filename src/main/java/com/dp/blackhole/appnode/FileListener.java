package com.dp.blackhole.appnode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.contentobjects.jnotify.IJNotify;
import net.contentobjects.jnotify.JNotifyException;
import net.contentobjects.jnotify.JNotifyListener;

import com.dp.blackhole.common.Util;

public class FileListener implements JNotifyListener{
    private static final Log LOG = LogFactory.getLog(FileListener.class);
    public static final int FILE_CREATED    = 0x1;
    public static final int FILE_DELETED    = 0x2;
    public static final int FILE_MODIFIED   = 0x4;
    public static final int FILE_RENAMED    = 0x8;
    public static final int FILE_ANY        = FILE_CREATED | FILE_DELETED | FILE_MODIFIED | FILE_RENAMED;
    private IJNotify iJNotifyInstance;
    private HashMap<String, LogReader> readerMap;
    private Set<String> parentWathchPathSet;
    private HashMap<String, Integer> path2wd;

    public FileListener() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        iJNotifyInstance = (IJNotify) Class.forName("net.contentobjects.jnotify.linux.JNotifyAdapterLinux").newInstance();
        readerMap = new HashMap<String, LogReader>();
        parentWathchPathSet = new HashSet<String>();
        path2wd = new HashMap<String, Integer>();
    }

    public synchronized boolean registerLogReader(final String watchPath, final LogReader reader) {
        if (!readerMap.containsKey(watchPath)) {
            readerMap.put(watchPath, reader);
            String parentPath = Util.getParentAbsolutePath(watchPath);
            int fwd;
            if (!parentWathchPathSet.contains(parentPath)) {
                parentWathchPathSet.add(parentPath);
                try {
                    fwd = iJNotifyInstance.addWatch(parentPath, FILE_CREATED, false, this);
                    path2wd.put(parentPath, fwd);
                } catch (JNotifyException e) {
                    LOG.error("Failed to add watch for " + parentPath, e);
                    readerMap.remove(watchPath);
                    parentWathchPathSet.remove(parentPath);
                    return false;
                }
                LOG.info("Registerring and monitoring parent path " + parentPath + " \"FILE_CREATE\"");
            } else {
                LOG.info("Watch parent path " + parentPath + " has already exist in the Set");
            }
            int wd;
            try {
                wd = iJNotifyInstance.addWatch(watchPath, FILE_MODIFIED, false, this);
            } catch (JNotifyException e) {
                LOG.error("Failed to add watch for " + watchPath, e);
                readerMap.remove(watchPath);
                return false;
            }
            LOG.info("Registerring and monitoring tail file " + watchPath + " \"FILE_MODIFIED\"");

            path2wd.put(watchPath, wd);
        } else {
            LOG.info("Watch path " + watchPath + " has already exist in the Map");
        }
        return true;
    }
    
    public synchronized boolean unregisterLogReader(String watchPath) {
        if (!path2wd.containsKey(watchPath)) {
            return false;
        }
        int wd = path2wd.get(watchPath);
        try {
            if (iJNotifyInstance.removeWatch(wd)) {
                path2wd.remove(watchPath);
            }
        } catch (JNotifyException e) {
            LOG.warn("Failed to remove wd " + wd + " for " + watchPath, e);
            return false;
        }
        readerMap.remove(watchPath);
        if (readerMap.isEmpty()) {
            parentWathchPathSet.clear();
        }
        return true;
    }

    /**
     * trigger by file create in parent path
     * if created file is which we watched,
     * remove associated wd from inotify and
     * add watch again (also persistent new wd).
     */
    @Override
    public void fileCreated(int wd, String rootPath, String name) {
        String createdFilePath = rootPath + "/" + name;
        LogReader reader;
        if ((reader = readerMap.get(createdFilePath)) != null) {
            LOG.info("rotate detected of " + createdFilePath);
            reader.eventWriter.processRotate();
            try {
                Integer oldWd;
                if ((oldWd = path2wd.get(createdFilePath)) != null) {
                    iJNotifyInstance.removeWatch(oldWd);//TODO review
                    path2wd.remove(createdFilePath);
                }
            } catch (JNotifyException e) {
                LOG.warn("Failed to remove wd " + wd + " for " + createdFilePath, e);
            }
            try {
                int newWd = iJNotifyInstance.addWatch(createdFilePath, FILE_MODIFIED, false, this);
                path2wd.put(createdFilePath, newWd);
                LOG.info("Re-monitoring "+ createdFilePath + " \"FILE_MODIFIED\" for rotate.");
            } catch (JNotifyException e) {
                LOG.error("Failed to add watch for " + createdFilePath, e);
            }
        }
        else {
            LOG.info("create file " + createdFilePath + " is not in reader map");
        }
    }

    @Override
    public void fileDeleted(int wd, String rootPath, String name) {
    }

    @Override
    public void fileModified(int wd, String rootPath, String name) {
        readerMap.get(rootPath).eventWriter.process();
    }

    @Override
    public void fileRenamed(int wd, String rootPath, String oldName,
            String newName) {
    }
}