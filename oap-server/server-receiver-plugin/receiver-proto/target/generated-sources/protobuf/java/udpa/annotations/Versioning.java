// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: udpa/annotations/versioning.proto

package udpa.annotations;

public final class Versioning {
  private Versioning() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(udpa.annotations.Versioning.versioning);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface VersioningAnnotationOrBuilder extends
      // @@protoc_insertion_point(interface_extends:udpa.annotations.VersioningAnnotation)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Track the previous message type. E.g. this message might be
     * udpa.foo.v3alpha.Foo and it was previously udpa.bar.v2.Bar. This
     * information is consumed by UDPA via proto descriptors.
     * </pre>
     *
     * <code>string previous_message_type = 1;</code>
     * @return The previousMessageType.
     */
    java.lang.String getPreviousMessageType();
    /**
     * <pre>
     * Track the previous message type. E.g. this message might be
     * udpa.foo.v3alpha.Foo and it was previously udpa.bar.v2.Bar. This
     * information is consumed by UDPA via proto descriptors.
     * </pre>
     *
     * <code>string previous_message_type = 1;</code>
     * @return The bytes for previousMessageType.
     */
    com.google.protobuf.ByteString
        getPreviousMessageTypeBytes();
  }
  /**
   * Protobuf type {@code udpa.annotations.VersioningAnnotation}
   */
  public static final class VersioningAnnotation extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:udpa.annotations.VersioningAnnotation)
      VersioningAnnotationOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use VersioningAnnotation.newBuilder() to construct.
    private VersioningAnnotation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private VersioningAnnotation() {
      previousMessageType_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new VersioningAnnotation();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private VersioningAnnotation(
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              previousMessageType_ = s;
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
      return udpa.annotations.Versioning.internal_static_udpa_annotations_VersioningAnnotation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return udpa.annotations.Versioning.internal_static_udpa_annotations_VersioningAnnotation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              udpa.annotations.Versioning.VersioningAnnotation.class, udpa.annotations.Versioning.VersioningAnnotation.Builder.class);
    }

    public static final int PREVIOUS_MESSAGE_TYPE_FIELD_NUMBER = 1;
    private volatile java.lang.Object previousMessageType_;
    /**
     * <pre>
     * Track the previous message type. E.g. this message might be
     * udpa.foo.v3alpha.Foo and it was previously udpa.bar.v2.Bar. This
     * information is consumed by UDPA via proto descriptors.
     * </pre>
     *
     * <code>string previous_message_type = 1;</code>
     * @return The previousMessageType.
     */
    @java.lang.Override
    public java.lang.String getPreviousMessageType() {
      java.lang.Object ref = previousMessageType_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        previousMessageType_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Track the previous message type. E.g. this message might be
     * udpa.foo.v3alpha.Foo and it was previously udpa.bar.v2.Bar. This
     * information is consumed by UDPA via proto descriptors.
     * </pre>
     *
     * <code>string previous_message_type = 1;</code>
     * @return The bytes for previousMessageType.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPreviousMessageTypeBytes() {
      java.lang.Object ref = previousMessageType_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        previousMessageType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(previousMessageType_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, previousMessageType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(previousMessageType_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, previousMessageType_);
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
      if (!(obj instanceof udpa.annotations.Versioning.VersioningAnnotation)) {
        return super.equals(obj);
      }
      udpa.annotations.Versioning.VersioningAnnotation other = (udpa.annotations.Versioning.VersioningAnnotation) obj;

      if (!getPreviousMessageType()
          .equals(other.getPreviousMessageType())) return false;
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
      hash = (37 * hash) + PREVIOUS_MESSAGE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getPreviousMessageType().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static udpa.annotations.Versioning.VersioningAnnotation parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static udpa.annotations.Versioning.VersioningAnnotation parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static udpa.annotations.Versioning.VersioningAnnotation parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static udpa.annotations.Versioning.VersioningAnnotation parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static udpa.annotations.Versioning.VersioningAnnotation parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static udpa.annotations.Versioning.VersioningAnnotation parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static udpa.annotations.Versioning.VersioningAnnotation parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static udpa.annotations.Versioning.VersioningAnnotation parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static udpa.annotations.Versioning.VersioningAnnotation parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static udpa.annotations.Versioning.VersioningAnnotation parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static udpa.annotations.Versioning.VersioningAnnotation parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static udpa.annotations.Versioning.VersioningAnnotation parseFrom(
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
    public static Builder newBuilder(udpa.annotations.Versioning.VersioningAnnotation prototype) {
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
     * Protobuf type {@code udpa.annotations.VersioningAnnotation}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:udpa.annotations.VersioningAnnotation)
        udpa.annotations.Versioning.VersioningAnnotationOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return udpa.annotations.Versioning.internal_static_udpa_annotations_VersioningAnnotation_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return udpa.annotations.Versioning.internal_static_udpa_annotations_VersioningAnnotation_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                udpa.annotations.Versioning.VersioningAnnotation.class, udpa.annotations.Versioning.VersioningAnnotation.Builder.class);
      }

      // Construct using udpa.annotations.Versioning.VersioningAnnotation.newBuilder()
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
        previousMessageType_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return udpa.annotations.Versioning.internal_static_udpa_annotations_VersioningAnnotation_descriptor;
      }

      @java.lang.Override
      public udpa.annotations.Versioning.VersioningAnnotation getDefaultInstanceForType() {
        return udpa.annotations.Versioning.VersioningAnnotation.getDefaultInstance();
      }

      @java.lang.Override
      public udpa.annotations.Versioning.VersioningAnnotation build() {
        udpa.annotations.Versioning.VersioningAnnotation result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public udpa.annotations.Versioning.VersioningAnnotation buildPartial() {
        udpa.annotations.Versioning.VersioningAnnotation result = new udpa.annotations.Versioning.VersioningAnnotation(this);
        result.previousMessageType_ = previousMessageType_;
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
        if (other instanceof udpa.annotations.Versioning.VersioningAnnotation) {
          return mergeFrom((udpa.annotations.Versioning.VersioningAnnotation)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(udpa.annotations.Versioning.VersioningAnnotation other) {
        if (other == udpa.annotations.Versioning.VersioningAnnotation.getDefaultInstance()) return this;
        if (!other.getPreviousMessageType().isEmpty()) {
          previousMessageType_ = other.previousMessageType_;
          onChanged();
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
        udpa.annotations.Versioning.VersioningAnnotation parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (udpa.annotations.Versioning.VersioningAnnotation) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object previousMessageType_ = "";
      /**
       * <pre>
       * Track the previous message type. E.g. this message might be
       * udpa.foo.v3alpha.Foo and it was previously udpa.bar.v2.Bar. This
       * information is consumed by UDPA via proto descriptors.
       * </pre>
       *
       * <code>string previous_message_type = 1;</code>
       * @return The previousMessageType.
       */
      public java.lang.String getPreviousMessageType() {
        java.lang.Object ref = previousMessageType_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          previousMessageType_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Track the previous message type. E.g. this message might be
       * udpa.foo.v3alpha.Foo and it was previously udpa.bar.v2.Bar. This
       * information is consumed by UDPA via proto descriptors.
       * </pre>
       *
       * <code>string previous_message_type = 1;</code>
       * @return The bytes for previousMessageType.
       */
      public com.google.protobuf.ByteString
          getPreviousMessageTypeBytes() {
        java.lang.Object ref = previousMessageType_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          previousMessageType_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Track the previous message type. E.g. this message might be
       * udpa.foo.v3alpha.Foo and it was previously udpa.bar.v2.Bar. This
       * information is consumed by UDPA via proto descriptors.
       * </pre>
       *
       * <code>string previous_message_type = 1;</code>
       * @param value The previousMessageType to set.
       * @return This builder for chaining.
       */
      public Builder setPreviousMessageType(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        previousMessageType_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Track the previous message type. E.g. this message might be
       * udpa.foo.v3alpha.Foo and it was previously udpa.bar.v2.Bar. This
       * information is consumed by UDPA via proto descriptors.
       * </pre>
       *
       * <code>string previous_message_type = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearPreviousMessageType() {
        
        previousMessageType_ = getDefaultInstance().getPreviousMessageType();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Track the previous message type. E.g. this message might be
       * udpa.foo.v3alpha.Foo and it was previously udpa.bar.v2.Bar. This
       * information is consumed by UDPA via proto descriptors.
       * </pre>
       *
       * <code>string previous_message_type = 1;</code>
       * @param value The bytes for previousMessageType to set.
       * @return This builder for chaining.
       */
      public Builder setPreviousMessageTypeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        previousMessageType_ = value;
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


      // @@protoc_insertion_point(builder_scope:udpa.annotations.VersioningAnnotation)
    }

    // @@protoc_insertion_point(class_scope:udpa.annotations.VersioningAnnotation)
    private static final udpa.annotations.Versioning.VersioningAnnotation DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new udpa.annotations.Versioning.VersioningAnnotation();
    }

    public static udpa.annotations.Versioning.VersioningAnnotation getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<VersioningAnnotation>
        PARSER = new com.google.protobuf.AbstractParser<VersioningAnnotation>() {
      @java.lang.Override
      public VersioningAnnotation parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new VersioningAnnotation(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<VersioningAnnotation> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VersioningAnnotation> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public udpa.annotations.Versioning.VersioningAnnotation getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public static final int VERSIONING_FIELD_NUMBER = 7881811;
  /**
   * <pre>
   * Magic number derived from 0x78 ('x') 0x44 ('D') 0x53 ('S')
   * </pre>
   *
   * <code>extend .google.protobuf.MessageOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MessageOptions,
      udpa.annotations.Versioning.VersioningAnnotation> versioning = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        udpa.annotations.Versioning.VersioningAnnotation.class,
        udpa.annotations.Versioning.VersioningAnnotation.getDefaultInstance());
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_udpa_annotations_VersioningAnnotation_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_udpa_annotations_VersioningAnnotation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!udpa/annotations/versioning.proto\022\020udp" +
      "a.annotations\032 google/protobuf/descripto" +
      "r.proto\"5\n\024VersioningAnnotation\022\035\n\025previ" +
      "ous_message_type\030\001 \001(\t:^\n\nversioning\022\037.g" +
      "oogle.protobuf.MessageOptions\030\323\210\341\003 \001(\0132&" +
      ".udpa.annotations.VersioningAnnotationb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        });
    internal_static_udpa_annotations_VersioningAnnotation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_udpa_annotations_VersioningAnnotation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_udpa_annotations_VersioningAnnotation_descriptor,
        new java.lang.String[] { "PreviousMessageType", });
    versioning.internalInit(descriptor.getExtensions().get(0));
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
