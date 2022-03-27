// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VersionInfo.proto

package org.robocup_logistics.llsf_msgs;

public final class VersionProtos {
  private VersionProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface VersionInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:llsf_msgs.VersionInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required uint32 version_major = 1;</code>
     * @return Whether the versionMajor field is set.
     */
    boolean hasVersionMajor();
    /**
     * <code>required uint32 version_major = 1;</code>
     * @return The versionMajor.
     */
    int getVersionMajor();

    /**
     * <code>required uint32 version_minor = 2;</code>
     * @return Whether the versionMinor field is set.
     */
    boolean hasVersionMinor();
    /**
     * <code>required uint32 version_minor = 2;</code>
     * @return The versionMinor.
     */
    int getVersionMinor();

    /**
     * <code>required uint32 version_micro = 3;</code>
     * @return Whether the versionMicro field is set.
     */
    boolean hasVersionMicro();
    /**
     * <code>required uint32 version_micro = 3;</code>
     * @return The versionMicro.
     */
    int getVersionMicro();

    /**
     * <code>required string version_string = 4;</code>
     * @return Whether the versionString field is set.
     */
    boolean hasVersionString();
    /**
     * <code>required string version_string = 4;</code>
     * @return The versionString.
     */
    java.lang.String getVersionString();
    /**
     * <code>required string version_string = 4;</code>
     * @return The bytes for versionString.
     */
    com.google.protobuf.ByteString
        getVersionStringBytes();
  }
  /**
   * Protobuf type {@code llsf_msgs.VersionInfo}
   */
  public static final class VersionInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:llsf_msgs.VersionInfo)
      VersionInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use VersionInfo.newBuilder() to construct.
    private VersionInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private VersionInfo() {
      versionString_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new VersionInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private VersionInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
              bitField0_ |= 0x00000001;
              versionMajor_ = input.readUInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              versionMinor_ = input.readUInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              versionMicro_ = input.readUInt32();
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              versionString_ = bs;
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
      return org.robocup_logistics.llsf_msgs.VersionProtos.internal_static_llsf_msgs_VersionInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.robocup_logistics.llsf_msgs.VersionProtos.internal_static_llsf_msgs_VersionInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo.class, org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo.Builder.class);
    }

    /**
     * Protobuf enum {@code llsf_msgs.VersionInfo.CompType}
     */
    public enum CompType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>COMP_ID = 2000;</code>
       */
      COMP_ID(2000),
      /**
       * <code>MSG_TYPE = 3;</code>
       */
      MSG_TYPE(3),
      ;

      /**
       * <code>COMP_ID = 2000;</code>
       */
      public static final int COMP_ID_VALUE = 2000;
      /**
       * <code>MSG_TYPE = 3;</code>
       */
      public static final int MSG_TYPE_VALUE = 3;


      public final int getNumber() {
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static CompType valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static CompType forNumber(int value) {
        switch (value) {
          case 2000: return COMP_ID;
          case 3: return MSG_TYPE;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<CompType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          CompType> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<CompType>() {
              public CompType findValueByNumber(int number) {
                return CompType.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo.getDescriptor().getEnumTypes().get(0);
      }

      private static final CompType[] VALUES = values();

      public static CompType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private CompType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:llsf_msgs.VersionInfo.CompType)
    }

    private int bitField0_;
    public static final int VERSION_MAJOR_FIELD_NUMBER = 1;
    private int versionMajor_;
    /**
     * <code>required uint32 version_major = 1;</code>
     * @return Whether the versionMajor field is set.
     */
    @java.lang.Override
    public boolean hasVersionMajor() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required uint32 version_major = 1;</code>
     * @return The versionMajor.
     */
    @java.lang.Override
    public int getVersionMajor() {
      return versionMajor_;
    }

    public static final int VERSION_MINOR_FIELD_NUMBER = 2;
    private int versionMinor_;
    /**
     * <code>required uint32 version_minor = 2;</code>
     * @return Whether the versionMinor field is set.
     */
    @java.lang.Override
    public boolean hasVersionMinor() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required uint32 version_minor = 2;</code>
     * @return The versionMinor.
     */
    @java.lang.Override
    public int getVersionMinor() {
      return versionMinor_;
    }

    public static final int VERSION_MICRO_FIELD_NUMBER = 3;
    private int versionMicro_;
    /**
     * <code>required uint32 version_micro = 3;</code>
     * @return Whether the versionMicro field is set.
     */
    @java.lang.Override
    public boolean hasVersionMicro() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>required uint32 version_micro = 3;</code>
     * @return The versionMicro.
     */
    @java.lang.Override
    public int getVersionMicro() {
      return versionMicro_;
    }

    public static final int VERSION_STRING_FIELD_NUMBER = 4;
    private volatile java.lang.Object versionString_;
    /**
     * <code>required string version_string = 4;</code>
     * @return Whether the versionString field is set.
     */
    @java.lang.Override
    public boolean hasVersionString() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>required string version_string = 4;</code>
     * @return The versionString.
     */
    @java.lang.Override
    public java.lang.String getVersionString() {
      java.lang.Object ref = versionString_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          versionString_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string version_string = 4;</code>
     * @return The bytes for versionString.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getVersionStringBytes() {
      java.lang.Object ref = versionString_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        versionString_ = b;
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

      if (!hasVersionMajor()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasVersionMinor()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasVersionMicro()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasVersionString()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeUInt32(1, versionMajor_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeUInt32(2, versionMinor_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeUInt32(3, versionMicro_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, versionString_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, versionMajor_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, versionMinor_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, versionMicro_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, versionString_);
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
      if (!(obj instanceof org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo)) {
        return super.equals(obj);
      }
      org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo other = (org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo) obj;

      if (hasVersionMajor() != other.hasVersionMajor()) return false;
      if (hasVersionMajor()) {
        if (getVersionMajor()
            != other.getVersionMajor()) return false;
      }
      if (hasVersionMinor() != other.hasVersionMinor()) return false;
      if (hasVersionMinor()) {
        if (getVersionMinor()
            != other.getVersionMinor()) return false;
      }
      if (hasVersionMicro() != other.hasVersionMicro()) return false;
      if (hasVersionMicro()) {
        if (getVersionMicro()
            != other.getVersionMicro()) return false;
      }
      if (hasVersionString() != other.hasVersionString()) return false;
      if (hasVersionString()) {
        if (!getVersionString()
            .equals(other.getVersionString())) return false;
      }
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
      if (hasVersionMajor()) {
        hash = (37 * hash) + VERSION_MAJOR_FIELD_NUMBER;
        hash = (53 * hash) + getVersionMajor();
      }
      if (hasVersionMinor()) {
        hash = (37 * hash) + VERSION_MINOR_FIELD_NUMBER;
        hash = (53 * hash) + getVersionMinor();
      }
      if (hasVersionMicro()) {
        hash = (37 * hash) + VERSION_MICRO_FIELD_NUMBER;
        hash = (53 * hash) + getVersionMicro();
      }
      if (hasVersionString()) {
        hash = (37 * hash) + VERSION_STRING_FIELD_NUMBER;
        hash = (53 * hash) + getVersionString().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo parseFrom(
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
    public static Builder newBuilder(org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo prototype) {
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
     * Protobuf type {@code llsf_msgs.VersionInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:llsf_msgs.VersionInfo)
        org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.robocup_logistics.llsf_msgs.VersionProtos.internal_static_llsf_msgs_VersionInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.robocup_logistics.llsf_msgs.VersionProtos.internal_static_llsf_msgs_VersionInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo.class, org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo.Builder.class);
      }

      // Construct using org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo.newBuilder()
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
        versionMajor_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        versionMinor_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        versionMicro_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        versionString_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.robocup_logistics.llsf_msgs.VersionProtos.internal_static_llsf_msgs_VersionInfo_descriptor;
      }

      @java.lang.Override
      public org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo getDefaultInstanceForType() {
        return org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo.getDefaultInstance();
      }

      @java.lang.Override
      public org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo build() {
        org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo buildPartial() {
        org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo result = new org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.versionMajor_ = versionMajor_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.versionMinor_ = versionMinor_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.versionMicro_ = versionMicro_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          to_bitField0_ |= 0x00000008;
        }
        result.versionString_ = versionString_;
        result.bitField0_ = to_bitField0_;
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
        if (other instanceof org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo) {
          return mergeFrom((org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo other) {
        if (other == org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo.getDefaultInstance()) return this;
        if (other.hasVersionMajor()) {
          setVersionMajor(other.getVersionMajor());
        }
        if (other.hasVersionMinor()) {
          setVersionMinor(other.getVersionMinor());
        }
        if (other.hasVersionMicro()) {
          setVersionMicro(other.getVersionMicro());
        }
        if (other.hasVersionString()) {
          bitField0_ |= 0x00000008;
          versionString_ = other.versionString_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasVersionMajor()) {
          return false;
        }
        if (!hasVersionMinor()) {
          return false;
        }
        if (!hasVersionMicro()) {
          return false;
        }
        if (!hasVersionString()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int versionMajor_ ;
      /**
       * <code>required uint32 version_major = 1;</code>
       * @return Whether the versionMajor field is set.
       */
      @java.lang.Override
      public boolean hasVersionMajor() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required uint32 version_major = 1;</code>
       * @return The versionMajor.
       */
      @java.lang.Override
      public int getVersionMajor() {
        return versionMajor_;
      }
      /**
       * <code>required uint32 version_major = 1;</code>
       * @param value The versionMajor to set.
       * @return This builder for chaining.
       */
      public Builder setVersionMajor(int value) {
        bitField0_ |= 0x00000001;
        versionMajor_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint32 version_major = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearVersionMajor() {
        bitField0_ = (bitField0_ & ~0x00000001);
        versionMajor_ = 0;
        onChanged();
        return this;
      }

      private int versionMinor_ ;
      /**
       * <code>required uint32 version_minor = 2;</code>
       * @return Whether the versionMinor field is set.
       */
      @java.lang.Override
      public boolean hasVersionMinor() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required uint32 version_minor = 2;</code>
       * @return The versionMinor.
       */
      @java.lang.Override
      public int getVersionMinor() {
        return versionMinor_;
      }
      /**
       * <code>required uint32 version_minor = 2;</code>
       * @param value The versionMinor to set.
       * @return This builder for chaining.
       */
      public Builder setVersionMinor(int value) {
        bitField0_ |= 0x00000002;
        versionMinor_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint32 version_minor = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearVersionMinor() {
        bitField0_ = (bitField0_ & ~0x00000002);
        versionMinor_ = 0;
        onChanged();
        return this;
      }

      private int versionMicro_ ;
      /**
       * <code>required uint32 version_micro = 3;</code>
       * @return Whether the versionMicro field is set.
       */
      @java.lang.Override
      public boolean hasVersionMicro() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>required uint32 version_micro = 3;</code>
       * @return The versionMicro.
       */
      @java.lang.Override
      public int getVersionMicro() {
        return versionMicro_;
      }
      /**
       * <code>required uint32 version_micro = 3;</code>
       * @param value The versionMicro to set.
       * @return This builder for chaining.
       */
      public Builder setVersionMicro(int value) {
        bitField0_ |= 0x00000004;
        versionMicro_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint32 version_micro = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearVersionMicro() {
        bitField0_ = (bitField0_ & ~0x00000004);
        versionMicro_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object versionString_ = "";
      /**
       * <code>required string version_string = 4;</code>
       * @return Whether the versionString field is set.
       */
      public boolean hasVersionString() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>required string version_string = 4;</code>
       * @return The versionString.
       */
      public java.lang.String getVersionString() {
        java.lang.Object ref = versionString_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            versionString_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string version_string = 4;</code>
       * @return The bytes for versionString.
       */
      public com.google.protobuf.ByteString
          getVersionStringBytes() {
        java.lang.Object ref = versionString_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          versionString_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string version_string = 4;</code>
       * @param value The versionString to set.
       * @return This builder for chaining.
       */
      public Builder setVersionString(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        versionString_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string version_string = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearVersionString() {
        bitField0_ = (bitField0_ & ~0x00000008);
        versionString_ = getDefaultInstance().getVersionString();
        onChanged();
        return this;
      }
      /**
       * <code>required string version_string = 4;</code>
       * @param value The bytes for versionString to set.
       * @return This builder for chaining.
       */
      public Builder setVersionStringBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        versionString_ = value;
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


      // @@protoc_insertion_point(builder_scope:llsf_msgs.VersionInfo)
    }

    // @@protoc_insertion_point(class_scope:llsf_msgs.VersionInfo)
    private static final org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo();
    }

    public static org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<VersionInfo>
        PARSER = new com.google.protobuf.AbstractParser<VersionInfo>() {
      @java.lang.Override
      public VersionInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new VersionInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<VersionInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VersionInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.robocup_logistics.llsf_msgs.VersionProtos.VersionInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_llsf_msgs_VersionInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_llsf_msgs_VersionInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021VersionInfo.proto\022\tllsf_msgs\"\222\001\n\013Versi" +
      "onInfo\022\025\n\rversion_major\030\001 \002(\r\022\025\n\rversion" +
      "_minor\030\002 \002(\r\022\025\n\rversion_micro\030\003 \002(\r\022\026\n\016v" +
      "ersion_string\030\004 \002(\t\"&\n\010CompType\022\014\n\007COMP_" +
      "ID\020\320\017\022\014\n\010MSG_TYPE\020\003B0\n\037org.robocup_logis" +
      "tics.llsf_msgsB\rVersionProtos"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_llsf_msgs_VersionInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_llsf_msgs_VersionInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_llsf_msgs_VersionInfo_descriptor,
        new java.lang.String[] { "VersionMajor", "VersionMinor", "VersionMicro", "VersionString", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}