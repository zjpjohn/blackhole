// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AssignConsumer.proto

package com.dp.blackhole.protocol.control;

public final class AssignConsumerPB {
  private AssignConsumerPB() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class AssignConsumer extends
      com.google.protobuf.GeneratedMessage {
    // Use AssignConsumer.newBuilder() to construct.
    private AssignConsumer() {
      initFields();
    }
    private AssignConsumer(boolean noInit) {}
    
    private static final AssignConsumer defaultInstance;
    public static AssignConsumer getDefaultInstance() {
      return defaultInstance;
    }
    
    public AssignConsumer getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dp.blackhole.protocol.control.AssignConsumerPB.internal_static_blackhole_AssignConsumer_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dp.blackhole.protocol.control.AssignConsumerPB.internal_static_blackhole_AssignConsumer_fieldAccessorTable;
    }
    
    public static final class PartitionOffset extends
        com.google.protobuf.GeneratedMessage {
      // Use PartitionOffset.newBuilder() to construct.
      private PartitionOffset() {
        initFields();
      }
      private PartitionOffset(boolean noInit) {}
      
      private static final PartitionOffset defaultInstance;
      public static PartitionOffset getDefaultInstance() {
        return defaultInstance;
      }
      
      public PartitionOffset getDefaultInstanceForType() {
        return defaultInstance;
      }
      
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.dp.blackhole.protocol.control.AssignConsumerPB.internal_static_blackhole_AssignConsumer_PartitionOffset_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.dp.blackhole.protocol.control.AssignConsumerPB.internal_static_blackhole_AssignConsumer_PartitionOffset_fieldAccessorTable;
      }
      
      // required string brokerString = 1;
      public static final int BROKERSTRING_FIELD_NUMBER = 1;
      private boolean hasBrokerString;
      private java.lang.String brokerString_ = "";
      public boolean hasBrokerString() { return hasBrokerString; }
      public java.lang.String getBrokerString() { return brokerString_; }
      
      // required string partitionName = 2;
      public static final int PARTITIONNAME_FIELD_NUMBER = 2;
      private boolean hasPartitionName;
      private java.lang.String partitionName_ = "";
      public boolean hasPartitionName() { return hasPartitionName; }
      public java.lang.String getPartitionName() { return partitionName_; }
      
      // required int64 offset = 3;
      public static final int OFFSET_FIELD_NUMBER = 3;
      private boolean hasOffset;
      private long offset_ = 0L;
      public boolean hasOffset() { return hasOffset; }
      public long getOffset() { return offset_; }
      
      private void initFields() {
      }
      public final boolean isInitialized() {
        if (!hasBrokerString) return false;
        if (!hasPartitionName) return false;
        if (!hasOffset) return false;
        return true;
      }
      
      public void writeTo(com.google.protobuf.CodedOutputStream output)
                          throws java.io.IOException {
        getSerializedSize();
        if (hasBrokerString()) {
          output.writeString(1, getBrokerString());
        }
        if (hasPartitionName()) {
          output.writeString(2, getPartitionName());
        }
        if (hasOffset()) {
          output.writeInt64(3, getOffset());
        }
        getUnknownFields().writeTo(output);
      }
      
      private int memoizedSerializedSize = -1;
      public int getSerializedSize() {
        int size = memoizedSerializedSize;
        if (size != -1) return size;
      
        size = 0;
        if (hasBrokerString()) {
          size += com.google.protobuf.CodedOutputStream
            .computeStringSize(1, getBrokerString());
        }
        if (hasPartitionName()) {
          size += com.google.protobuf.CodedOutputStream
            .computeStringSize(2, getPartitionName());
        }
        if (hasOffset()) {
          size += com.google.protobuf.CodedOutputStream
            .computeInt64Size(3, getOffset());
        }
        size += getUnknownFields().getSerializedSize();
        memoizedSerializedSize = size;
        return size;
      }
      
      public static com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return newBuilder().mergeFrom(data).buildParsed();
      }
      public static com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return newBuilder().mergeFrom(data, extensionRegistry)
                 .buildParsed();
      }
      public static com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return newBuilder().mergeFrom(data).buildParsed();
      }
      public static com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return newBuilder().mergeFrom(data, extensionRegistry)
                 .buildParsed();
      }
      public static com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return newBuilder().mergeFrom(input).buildParsed();
      }
      public static com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return newBuilder().mergeFrom(input, extensionRegistry)
                 .buildParsed();
      }
      public static com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
        Builder builder = newBuilder();
        if (builder.mergeDelimitedFrom(input)) {
          return builder.buildParsed();
        } else {
          return null;
        }
      }
      public static com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Builder builder = newBuilder();
        if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
          return builder.buildParsed();
        } else {
          return null;
        }
      }
      public static com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return newBuilder().mergeFrom(input).buildParsed();
      }
      public static com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return newBuilder().mergeFrom(input, extensionRegistry)
                 .buildParsed();
      }
      
      public static Builder newBuilder() { return Builder.create(); }
      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder(com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset prototype) {
        return newBuilder().mergeFrom(prototype);
      }
      public Builder toBuilder() { return newBuilder(this); }
      
      public static final class Builder extends
          com.google.protobuf.GeneratedMessage.Builder<Builder> {
        private com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset result;
        
        // Construct using com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset.newBuilder()
        private Builder() {}
        
        private static Builder create() {
          Builder builder = new Builder();
          builder.result = new com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset();
          return builder;
        }
        
        protected com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset internalGetResult() {
          return result;
        }
        
        public Builder clear() {
          if (result == null) {
            throw new IllegalStateException(
              "Cannot call clear() after build().");
          }
          result = new com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset();
          return this;
        }
        
        public Builder clone() {
          return create().mergeFrom(result);
        }
        
        public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset.getDescriptor();
        }
        
        public com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset getDefaultInstanceForType() {
          return com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset.getDefaultInstance();
        }
        
        public boolean isInitialized() {
          return result.isInitialized();
        }
        public com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset build() {
          if (result != null && !isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return buildPartial();
        }
        
        private com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset buildParsed()
            throws com.google.protobuf.InvalidProtocolBufferException {
          if (!isInitialized()) {
            throw newUninitializedMessageException(
              result).asInvalidProtocolBufferException();
          }
          return buildPartial();
        }
        
        public com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset buildPartial() {
          if (result == null) {
            throw new IllegalStateException(
              "build() has already been called on this Builder.");
          }
          com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset returnMe = result;
          result = null;
          return returnMe;
        }
        
        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset) {
            return mergeFrom((com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }
        
        public Builder mergeFrom(com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset other) {
          if (other == com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset.getDefaultInstance()) return this;
          if (other.hasBrokerString()) {
            setBrokerString(other.getBrokerString());
          }
          if (other.hasPartitionName()) {
            setPartitionName(other.getPartitionName());
          }
          if (other.hasOffset()) {
            setOffset(other.getOffset());
          }
          this.mergeUnknownFields(other.getUnknownFields());
          return this;
        }
        
        public Builder mergeFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
          com.google.protobuf.UnknownFieldSet.Builder unknownFields =
            com.google.protobuf.UnknownFieldSet.newBuilder(
              this.getUnknownFields());
          while (true) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                this.setUnknownFields(unknownFields.build());
                return this;
              default: {
                if (!parseUnknownField(input, unknownFields,
                                       extensionRegistry, tag)) {
                  this.setUnknownFields(unknownFields.build());
                  return this;
                }
                break;
              }
              case 10: {
                setBrokerString(input.readString());
                break;
              }
              case 18: {
                setPartitionName(input.readString());
                break;
              }
              case 24: {
                setOffset(input.readInt64());
                break;
              }
            }
          }
        }
        
        
        // required string brokerString = 1;
        public boolean hasBrokerString() {
          return result.hasBrokerString();
        }
        public java.lang.String getBrokerString() {
          return result.getBrokerString();
        }
        public Builder setBrokerString(java.lang.String value) {
          if (value == null) {
    throw new NullPointerException();
  }
  result.hasBrokerString = true;
          result.brokerString_ = value;
          return this;
        }
        public Builder clearBrokerString() {
          result.hasBrokerString = false;
          result.brokerString_ = getDefaultInstance().getBrokerString();
          return this;
        }
        
        // required string partitionName = 2;
        public boolean hasPartitionName() {
          return result.hasPartitionName();
        }
        public java.lang.String getPartitionName() {
          return result.getPartitionName();
        }
        public Builder setPartitionName(java.lang.String value) {
          if (value == null) {
    throw new NullPointerException();
  }
  result.hasPartitionName = true;
          result.partitionName_ = value;
          return this;
        }
        public Builder clearPartitionName() {
          result.hasPartitionName = false;
          result.partitionName_ = getDefaultInstance().getPartitionName();
          return this;
        }
        
        // required int64 offset = 3;
        public boolean hasOffset() {
          return result.hasOffset();
        }
        public long getOffset() {
          return result.getOffset();
        }
        public Builder setOffset(long value) {
          result.hasOffset = true;
          result.offset_ = value;
          return this;
        }
        public Builder clearOffset() {
          result.hasOffset = false;
          result.offset_ = 0L;
          return this;
        }
        
        // @@protoc_insertion_point(builder_scope:blackhole.AssignConsumer.PartitionOffset)
      }
      
      static {
        defaultInstance = new PartitionOffset(true);
        com.dp.blackhole.protocol.control.AssignConsumerPB.internalForceInit();
        defaultInstance.initFields();
      }
      
      // @@protoc_insertion_point(class_scope:blackhole.AssignConsumer.PartitionOffset)
    }
    
    // required string group = 1;
    public static final int GROUP_FIELD_NUMBER = 1;
    private boolean hasGroup;
    private java.lang.String group_ = "";
    public boolean hasGroup() { return hasGroup; }
    public java.lang.String getGroup() { return group_; }
    
    // required string topic = 2;
    public static final int TOPIC_FIELD_NUMBER = 2;
    private boolean hasTopic;
    private java.lang.String topic_ = "";
    public boolean hasTopic() { return hasTopic; }
    public java.lang.String getTopic() { return topic_; }
    
    // required string consumerIdString = 3;
    public static final int CONSUMERIDSTRING_FIELD_NUMBER = 3;
    private boolean hasConsumerIdString;
    private java.lang.String consumerIdString_ = "";
    public boolean hasConsumerIdString() { return hasConsumerIdString; }
    public java.lang.String getConsumerIdString() { return consumerIdString_; }
    
    // repeated .blackhole.AssignConsumer.PartitionOffset partitionOffsets = 4;
    public static final int PARTITIONOFFSETS_FIELD_NUMBER = 4;
    private java.util.List<com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset> partitionOffsets_ =
      java.util.Collections.emptyList();
    public java.util.List<com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset> getPartitionOffsetsList() {
      return partitionOffsets_;
    }
    public int getPartitionOffsetsCount() { return partitionOffsets_.size(); }
    public com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset getPartitionOffsets(int index) {
      return partitionOffsets_.get(index);
    }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      if (!hasGroup) return false;
      if (!hasTopic) return false;
      if (!hasConsumerIdString) return false;
      for (com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset element : getPartitionOffsetsList()) {
        if (!element.isInitialized()) return false;
      }
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasGroup()) {
        output.writeString(1, getGroup());
      }
      if (hasTopic()) {
        output.writeString(2, getTopic());
      }
      if (hasConsumerIdString()) {
        output.writeString(3, getConsumerIdString());
      }
      for (com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset element : getPartitionOffsetsList()) {
        output.writeMessage(4, element);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasGroup()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getGroup());
      }
      if (hasTopic()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getTopic());
      }
      if (hasConsumerIdString()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(3, getConsumerIdString());
      }
      for (com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset element : getPartitionOffsetsList()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, element);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer result;
      
      // Construct using com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer();
        return builder;
      }
      
      protected com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.getDescriptor();
      }
      
      public com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer getDefaultInstanceForType() {
        return com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        if (result.partitionOffsets_ != java.util.Collections.EMPTY_LIST) {
          result.partitionOffsets_ =
            java.util.Collections.unmodifiableList(result.partitionOffsets_);
        }
        com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer) {
          return mergeFrom((com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer other) {
        if (other == com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.getDefaultInstance()) return this;
        if (other.hasGroup()) {
          setGroup(other.getGroup());
        }
        if (other.hasTopic()) {
          setTopic(other.getTopic());
        }
        if (other.hasConsumerIdString()) {
          setConsumerIdString(other.getConsumerIdString());
        }
        if (!other.partitionOffsets_.isEmpty()) {
          if (result.partitionOffsets_.isEmpty()) {
            result.partitionOffsets_ = new java.util.ArrayList<com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset>();
          }
          result.partitionOffsets_.addAll(other.partitionOffsets_);
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 10: {
              setGroup(input.readString());
              break;
            }
            case 18: {
              setTopic(input.readString());
              break;
            }
            case 26: {
              setConsumerIdString(input.readString());
              break;
            }
            case 34: {
              com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset.Builder subBuilder = com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addPartitionOffsets(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      
      // required string group = 1;
      public boolean hasGroup() {
        return result.hasGroup();
      }
      public java.lang.String getGroup() {
        return result.getGroup();
      }
      public Builder setGroup(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasGroup = true;
        result.group_ = value;
        return this;
      }
      public Builder clearGroup() {
        result.hasGroup = false;
        result.group_ = getDefaultInstance().getGroup();
        return this;
      }
      
      // required string topic = 2;
      public boolean hasTopic() {
        return result.hasTopic();
      }
      public java.lang.String getTopic() {
        return result.getTopic();
      }
      public Builder setTopic(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasTopic = true;
        result.topic_ = value;
        return this;
      }
      public Builder clearTopic() {
        result.hasTopic = false;
        result.topic_ = getDefaultInstance().getTopic();
        return this;
      }
      
      // required string consumerIdString = 3;
      public boolean hasConsumerIdString() {
        return result.hasConsumerIdString();
      }
      public java.lang.String getConsumerIdString() {
        return result.getConsumerIdString();
      }
      public Builder setConsumerIdString(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasConsumerIdString = true;
        result.consumerIdString_ = value;
        return this;
      }
      public Builder clearConsumerIdString() {
        result.hasConsumerIdString = false;
        result.consumerIdString_ = getDefaultInstance().getConsumerIdString();
        return this;
      }
      
      // repeated .blackhole.AssignConsumer.PartitionOffset partitionOffsets = 4;
      public java.util.List<com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset> getPartitionOffsetsList() {
        return java.util.Collections.unmodifiableList(result.partitionOffsets_);
      }
      public int getPartitionOffsetsCount() {
        return result.getPartitionOffsetsCount();
      }
      public com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset getPartitionOffsets(int index) {
        return result.getPartitionOffsets(index);
      }
      public Builder setPartitionOffsets(int index, com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.partitionOffsets_.set(index, value);
        return this;
      }
      public Builder setPartitionOffsets(int index, com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset.Builder builderForValue) {
        result.partitionOffsets_.set(index, builderForValue.build());
        return this;
      }
      public Builder addPartitionOffsets(com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset value) {
        if (value == null) {
          throw new NullPointerException();
        }
        if (result.partitionOffsets_.isEmpty()) {
          result.partitionOffsets_ = new java.util.ArrayList<com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset>();
        }
        result.partitionOffsets_.add(value);
        return this;
      }
      public Builder addPartitionOffsets(com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset.Builder builderForValue) {
        if (result.partitionOffsets_.isEmpty()) {
          result.partitionOffsets_ = new java.util.ArrayList<com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset>();
        }
        result.partitionOffsets_.add(builderForValue.build());
        return this;
      }
      public Builder addAllPartitionOffsets(
          java.lang.Iterable<? extends com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset> values) {
        if (result.partitionOffsets_.isEmpty()) {
          result.partitionOffsets_ = new java.util.ArrayList<com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset>();
        }
        super.addAll(values, result.partitionOffsets_);
        return this;
      }
      public Builder clearPartitionOffsets() {
        result.partitionOffsets_ = java.util.Collections.emptyList();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:blackhole.AssignConsumer)
    }
    
    static {
      defaultInstance = new AssignConsumer(true);
      com.dp.blackhole.protocol.control.AssignConsumerPB.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:blackhole.AssignConsumer)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_blackhole_AssignConsumer_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_blackhole_AssignConsumer_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_blackhole_AssignConsumer_PartitionOffset_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_blackhole_AssignConsumer_PartitionOffset_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024AssignConsumer.proto\022\tblackhole\"\335\001\n\016As" +
      "signConsumer\022\r\n\005group\030\001 \002(\t\022\r\n\005topic\030\002 \002" +
      "(\t\022\030\n\020consumerIdString\030\003 \002(\t\022C\n\020partitio" +
      "nOffsets\030\004 \003(\0132).blackhole.AssignConsume" +
      "r.PartitionOffset\032N\n\017PartitionOffset\022\024\n\014" +
      "brokerString\030\001 \002(\t\022\025\n\rpartitionName\030\002 \002(" +
      "\t\022\016\n\006offset\030\003 \002(\003B5\n!com.dp.blackhole.pr" +
      "otocol.controlB\020AssignConsumerPB"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_blackhole_AssignConsumer_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_blackhole_AssignConsumer_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_blackhole_AssignConsumer_descriptor,
              new java.lang.String[] { "Group", "Topic", "ConsumerIdString", "PartitionOffsets", },
              com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.class,
              com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.Builder.class);
          internal_static_blackhole_AssignConsumer_PartitionOffset_descriptor =
            internal_static_blackhole_AssignConsumer_descriptor.getNestedTypes().get(0);
          internal_static_blackhole_AssignConsumer_PartitionOffset_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_blackhole_AssignConsumer_PartitionOffset_descriptor,
              new java.lang.String[] { "BrokerString", "PartitionName", "Offset", },
              com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset.class,
              com.dp.blackhole.protocol.control.AssignConsumerPB.AssignConsumer.PartitionOffset.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}
