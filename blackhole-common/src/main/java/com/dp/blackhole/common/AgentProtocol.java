package com.dp.blackhole.common;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class AgentProtocol {
    public static final int STREAM = 1;
    public static final int RECOVERY = 2;
  
    public class AgentHead {
        public int type;
        public String app;
        public long peroid;
        public long ts;
        public long size;
        public boolean hasCompressed;
    }
    
    public DataOutputStream sendHead (DataOutputStream out, AgentHead head) throws IOException {

        out.writeInt(head.type);
        Util.writeString(head.app, out);
        out.writeLong(head.peroid);

        if (head.type == RECOVERY) {
            out.writeLong(head.ts);
            out.writeLong(head.size);
            out.writeBoolean(head.hasCompressed);
        }

        return out;
    }
    
    public AgentHead recieveHead (DataInputStream in, AgentHead head) throws IOException {
        head.type = in.readInt();
        head.app = Util.readString(in);
        head.peroid = in.readLong();
        if (head.type == RECOVERY) {
            head.ts = in.readLong();
            head.size = in.readLong();
            head.hasCompressed = in.readBoolean();
        }
        return head;
    }
}
