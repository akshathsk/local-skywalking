// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language-agent/JVMMetric.proto

package org.apache.skywalking.apm.network.language.agent.v3;

/**
 * Protobuf type {@code skywalking.v3.MemoryPool}
 */
public final class MemoryPool extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:skywalking.v3.MemoryPool)
    MemoryPoolOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MemoryPool.newBuilder() to construct.
  private MemoryPool(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MemoryPool() {
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MemoryPool();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MemoryPool(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 16: {

            init_ = input.readInt64();
            break;
          }
          case 24: {

            max_ = input.readInt64();
            break;
          }
          case 32: {

            used_ = input.readInt64();
            break;
          }
          case 40: {

            committed_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.skywalking.apm.network.language.agent.v3.JVMMetricOuterClass.internal_static_skywalking_v3_MemoryPool_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.skywalking.apm.network.language.agent.v3.JVMMetricOuterClass.internal_static_skywalking_v3_MemoryPool_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.skywalking.apm.network.language.agent.v3.MemoryPool.class, org.apache.skywalking.apm.network.language.agent.v3.MemoryPool.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <code>.skywalking.v3.PoolType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.skywalking.v3.PoolType type = 1;</code>
   * @return The type.
   */
  @java.lang.Override public org.apache.skywalking.apm.network.language.agent.v3.PoolType getType() {
    @SuppressWarnings("deprecation")
    org.apache.skywalking.apm.network.language.agent.v3.PoolType result = org.apache.skywalking.apm.network.language.agent.v3.PoolType.valueOf(type_);
    return result == null ? org.apache.skywalking.apm.network.language.agent.v3.PoolType.UNRECOGNIZED : result;
  }

  public static final int INIT_FIELD_NUMBER = 2;
  private long init_;
  /**
   * <code>int64 init = 2;</code>
   * @return The init.
   */
  @java.lang.Override
  public long getInit() {
    return init_;
  }

  public static final int MAX_FIELD_NUMBER = 3;
  private long max_;
  /**
   * <code>int64 max = 3;</code>
   * @return The max.
   */
  @java.lang.Override
  public long getMax() {
    return max_;
  }

  public static final int USED_FIELD_NUMBER = 4;
  private long used_;
  /**
   * <code>int64 used = 4;</code>
   * @return The used.
   */
  @java.lang.Override
  public long getUsed() {
    return used_;
  }

  public static final int COMMITTED_FIELD_NUMBER = 5;
  private long committed_;
  /**
   * <code>int64 committed = 5;</code>
   * @return The committed.
   */
  @java.lang.Override
  public long getCommitted() {
    return committed_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (type_ != org.apache.skywalking.apm.network.language.agent.v3.PoolType.CODE_CACHE_USAGE.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (init_ != 0L) {
      output.writeInt64(2, init_);
    }
    if (max_ != 0L) {
      output.writeInt64(3, max_);
    }
    if (used_ != 0L) {
      output.writeInt64(4, used_);
    }
    if (committed_ != 0L) {
      output.writeInt64(5, committed_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != org.apache.skywalking.apm.network.language.agent.v3.PoolType.CODE_CACHE_USAGE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (init_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, init_);
    }
    if (max_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, max_);
    }
    if (used_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, used_);
    }
    if (committed_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, committed_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.apache.skywalking.apm.network.language.agent.v3.MemoryPool)) {
      return super.equals(obj);
    }
    org.apache.skywalking.apm.network.language.agent.v3.MemoryPool other = (org.apache.skywalking.apm.network.language.agent.v3.MemoryPool) obj;

    if (type_ != other.type_) return false;
    if (getInit()
        != other.getInit()) return false;
    if (getMax()
        != other.getMax()) return false;
    if (getUsed()
        != other.getUsed()) return false;
    if (getCommitted()
        != other.getCommitted()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + INIT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getInit());
    hash = (37 * hash) + MAX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMax());
    hash = (37 * hash) + USED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUsed());
    hash = (37 * hash) + COMMITTED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCommitted());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.skywalking.apm.network.language.agent.v3.MemoryPool parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.MemoryPool parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.MemoryPool parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.MemoryPool parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.MemoryPool parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.MemoryPool parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.MemoryPool parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.MemoryPool parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.MemoryPool parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.MemoryPool parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.MemoryPool parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.language.agent.v3.MemoryPool parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.apache.skywalking.apm.network.language.agent.v3.MemoryPool prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code skywalking.v3.MemoryPool}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:skywalking.v3.MemoryPool)
      org.apache.skywalking.apm.network.language.agent.v3.MemoryPoolOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.skywalking.apm.network.language.agent.v3.JVMMetricOuterClass.internal_static_skywalking_v3_MemoryPool_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.skywalking.apm.network.language.agent.v3.JVMMetricOuterClass.internal_static_skywalking_v3_MemoryPool_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.skywalking.apm.network.language.agent.v3.MemoryPool.class, org.apache.skywalking.apm.network.language.agent.v3.MemoryPool.Builder.class);
    }

    // Construct using org.apache.skywalking.apm.network.language.agent.v3.MemoryPool.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      type_ = 0;

      init_ = 0L;

      max_ = 0L;

      used_ = 0L;

      committed_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.skywalking.apm.network.language.agent.v3.JVMMetricOuterClass.internal_static_skywalking_v3_MemoryPool_descriptor;
    }

    @java.lang.Override
    public org.apache.skywalking.apm.network.language.agent.v3.MemoryPool getDefaultInstanceForType() {
      return org.apache.skywalking.apm.network.language.agent.v3.MemoryPool.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.skywalking.apm.network.language.agent.v3.MemoryPool build() {
      org.apache.skywalking.apm.network.language.agent.v3.MemoryPool result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.skywalking.apm.network.language.agent.v3.MemoryPool buildPartial() {
      org.apache.skywalking.apm.network.language.agent.v3.MemoryPool result = new org.apache.skywalking.apm.network.language.agent.v3.MemoryPool(this);
      result.type_ = type_;
      result.init_ = init_;
      result.max_ = max_;
      result.used_ = used_;
      result.committed_ = committed_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.apache.skywalking.apm.network.language.agent.v3.MemoryPool) {
        return mergeFrom((org.apache.skywalking.apm.network.language.agent.v3.MemoryPool)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.skywalking.apm.network.language.agent.v3.MemoryPool other) {
      if (other == org.apache.skywalking.apm.network.language.agent.v3.MemoryPool.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.getInit() != 0L) {
        setInit(other.getInit());
      }
      if (other.getMax() != 0L) {
        setMax(other.getMax());
      }
      if (other.getUsed() != 0L) {
        setUsed(other.getUsed());
      }
      if (other.getCommitted() != 0L) {
        setCommitted(other.getCommitted());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.apache.skywalking.apm.network.language.agent.v3.MemoryPool parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.apache.skywalking.apm.network.language.agent.v3.MemoryPool) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int type_ = 0;
    /**
     * <code>.skywalking.v3.PoolType type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.skywalking.v3.PoolType type = 1;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.skywalking.v3.PoolType type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public org.apache.skywalking.apm.network.language.agent.v3.PoolType getType() {
      @SuppressWarnings("deprecation")
      org.apache.skywalking.apm.network.language.agent.v3.PoolType result = org.apache.skywalking.apm.network.language.agent.v3.PoolType.valueOf(type_);
      return result == null ? org.apache.skywalking.apm.network.language.agent.v3.PoolType.UNRECOGNIZED : result;
    }
    /**
     * <code>.skywalking.v3.PoolType type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(org.apache.skywalking.apm.network.language.agent.v3.PoolType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.skywalking.v3.PoolType type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private long init_ ;
    /**
     * <code>int64 init = 2;</code>
     * @return The init.
     */
    @java.lang.Override
    public long getInit() {
      return init_;
    }
    /**
     * <code>int64 init = 2;</code>
     * @param value The init to set.
     * @return This builder for chaining.
     */
    public Builder setInit(long value) {
      
      init_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 init = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearInit() {
      
      init_ = 0L;
      onChanged();
      return this;
    }

    private long max_ ;
    /**
     * <code>int64 max = 3;</code>
     * @return The max.
     */
    @java.lang.Override
    public long getMax() {
      return max_;
    }
    /**
     * <code>int64 max = 3;</code>
     * @param value The max to set.
     * @return This builder for chaining.
     */
    public Builder setMax(long value) {
      
      max_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 max = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMax() {
      
      max_ = 0L;
      onChanged();
      return this;
    }

    private long used_ ;
    /**
     * <code>int64 used = 4;</code>
     * @return The used.
     */
    @java.lang.Override
    public long getUsed() {
      return used_;
    }
    /**
     * <code>int64 used = 4;</code>
     * @param value The used to set.
     * @return This builder for chaining.
     */
    public Builder setUsed(long value) {
      
      used_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 used = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearUsed() {
      
      used_ = 0L;
      onChanged();
      return this;
    }

    private long committed_ ;
    /**
     * <code>int64 committed = 5;</code>
     * @return The committed.
     */
    @java.lang.Override
    public long getCommitted() {
      return committed_;
    }
    /**
     * <code>int64 committed = 5;</code>
     * @param value The committed to set.
     * @return This builder for chaining.
     */
    public Builder setCommitted(long value) {
      
      committed_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 committed = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearCommitted() {
      
      committed_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:skywalking.v3.MemoryPool)
  }

  // @@protoc_insertion_point(class_scope:skywalking.v3.MemoryPool)
  private static final org.apache.skywalking.apm.network.language.agent.v3.MemoryPool DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.skywalking.apm.network.language.agent.v3.MemoryPool();
  }

  public static org.apache.skywalking.apm.network.language.agent.v3.MemoryPool getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MemoryPool>
      PARSER = new com.google.protobuf.AbstractParser<MemoryPool>() {
    @java.lang.Override
    public MemoryPool parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MemoryPool(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MemoryPool> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MemoryPool> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.skywalking.apm.network.language.agent.v3.MemoryPool getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

