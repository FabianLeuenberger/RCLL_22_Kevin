// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SimTimeSync.proto

package org.robocup_logistics.llsf_msgs;

public final class SimTimeSyncProtos {
  private SimTimeSyncProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SimTimeSyncOrBuilder extends
      // @@protoc_insertion_point(interface_extends:llsf_msgs.SimTimeSync)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required .llsf_msgs.Time sim_time = 1;</code>
     * @return Whether the simTime field is set.
     */
    boolean hasSimTime();
    /**
     * <code>required .llsf_msgs.Time sim_time = 1;</code>
     * @return The simTime.
     */
    org.robocup_logistics.llsf_msgs.TimeProtos.Time getSimTime();
    /**
     * <code>required .llsf_msgs.Time sim_time = 1;</code>
     */
    org.robocup_logistics.llsf_msgs.TimeProtos.TimeOrBuilder getSimTimeOrBuilder();

    /**
     * <code>required float real_time_factor = 2;</code>
     * @return Whether the realTimeFactor field is set.
     */
    boolean hasRealTimeFactor();
    /**
     * <code>required float real_time_factor = 2;</code>
     * @return The realTimeFactor.
     */
    float getRealTimeFactor();

    /**
     * <code>required bool paused = 3;</code>
     * @return Whether the paused field is set.
     */
    boolean hasPaused();
    /**
     * <code>required bool paused = 3;</code>
     * @return The paused.
     */
    boolean getPaused();
  }
  /**
   * Protobuf type {@code llsf_msgs.SimTimeSync}
   */
  public static final class SimTimeSync extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:llsf_msgs.SimTimeSync)
      SimTimeSyncOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SimTimeSync.newBuilder() to construct.
    private SimTimeSync(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SimTimeSync() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SimTimeSync();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SimTimeSync(
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
            case 10: {
              org.robocup_logistics.llsf_msgs.TimeProtos.Time.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = simTime_.toBuilder();
              }
              simTime_ = input.readMessage(org.robocup_logistics.llsf_msgs.TimeProtos.Time.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(simTime_);
                simTime_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 21: {
              bitField0_ |= 0x00000002;
              realTimeFactor_ = input.readFloat();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              paused_ = input.readBool();
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
      return org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.internal_static_llsf_msgs_SimTimeSync_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.internal_static_llsf_msgs_SimTimeSync_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync.class, org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync.Builder.class);
    }

    /**
     * Protobuf enum {@code llsf_msgs.SimTimeSync.CompType}
     */
    public enum CompType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>COMP_ID = 2000;</code>
       */
      COMP_ID(2000),
      /**
       * <code>MSG_TYPE = 327;</code>
       */
      MSG_TYPE(327),
      ;

      /**
       * <code>COMP_ID = 2000;</code>
       */
      public static final int COMP_ID_VALUE = 2000;
      /**
       * <code>MSG_TYPE = 327;</code>
       */
      public static final int MSG_TYPE_VALUE = 327;


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
          case 327: return MSG_TYPE;
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
        return org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync.getDescriptor().getEnumTypes().get(0);
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

      // @@protoc_insertion_point(enum_scope:llsf_msgs.SimTimeSync.CompType)
    }

    private int bitField0_;
    public static final int SIM_TIME_FIELD_NUMBER = 1;
    private org.robocup_logistics.llsf_msgs.TimeProtos.Time simTime_;
    /**
     * <code>required .llsf_msgs.Time sim_time = 1;</code>
     * @return Whether the simTime field is set.
     */
    @java.lang.Override
    public boolean hasSimTime() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required .llsf_msgs.Time sim_time = 1;</code>
     * @return The simTime.
     */
    @java.lang.Override
    public org.robocup_logistics.llsf_msgs.TimeProtos.Time getSimTime() {
      return simTime_ == null ? org.robocup_logistics.llsf_msgs.TimeProtos.Time.getDefaultInstance() : simTime_;
    }
    /**
     * <code>required .llsf_msgs.Time sim_time = 1;</code>
     */
    @java.lang.Override
    public org.robocup_logistics.llsf_msgs.TimeProtos.TimeOrBuilder getSimTimeOrBuilder() {
      return simTime_ == null ? org.robocup_logistics.llsf_msgs.TimeProtos.Time.getDefaultInstance() : simTime_;
    }

    public static final int REAL_TIME_FACTOR_FIELD_NUMBER = 2;
    private float realTimeFactor_;
    /**
     * <code>required float real_time_factor = 2;</code>
     * @return Whether the realTimeFactor field is set.
     */
    @java.lang.Override
    public boolean hasRealTimeFactor() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required float real_time_factor = 2;</code>
     * @return The realTimeFactor.
     */
    @java.lang.Override
    public float getRealTimeFactor() {
      return realTimeFactor_;
    }

    public static final int PAUSED_FIELD_NUMBER = 3;
    private boolean paused_;
    /**
     * <code>required bool paused = 3;</code>
     * @return Whether the paused field is set.
     */
    @java.lang.Override
    public boolean hasPaused() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>required bool paused = 3;</code>
     * @return The paused.
     */
    @java.lang.Override
    public boolean getPaused() {
      return paused_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasSimTime()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasRealTimeFactor()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPaused()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getSimTime().isInitialized()) {
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
        output.writeMessage(1, getSimTime());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeFloat(2, realTimeFactor_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeBool(3, paused_);
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
          .computeMessageSize(1, getSimTime());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, realTimeFactor_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, paused_);
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
      if (!(obj instanceof org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync)) {
        return super.equals(obj);
      }
      org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync other = (org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync) obj;

      if (hasSimTime() != other.hasSimTime()) return false;
      if (hasSimTime()) {
        if (!getSimTime()
            .equals(other.getSimTime())) return false;
      }
      if (hasRealTimeFactor() != other.hasRealTimeFactor()) return false;
      if (hasRealTimeFactor()) {
        if (java.lang.Float.floatToIntBits(getRealTimeFactor())
            != java.lang.Float.floatToIntBits(
                other.getRealTimeFactor())) return false;
      }
      if (hasPaused() != other.hasPaused()) return false;
      if (hasPaused()) {
        if (getPaused()
            != other.getPaused()) return false;
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
      if (hasSimTime()) {
        hash = (37 * hash) + SIM_TIME_FIELD_NUMBER;
        hash = (53 * hash) + getSimTime().hashCode();
      }
      if (hasRealTimeFactor()) {
        hash = (37 * hash) + REAL_TIME_FACTOR_FIELD_NUMBER;
        hash = (53 * hash) + java.lang.Float.floatToIntBits(
            getRealTimeFactor());
      }
      if (hasPaused()) {
        hash = (37 * hash) + PAUSED_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getPaused());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync parseFrom(
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
    public static Builder newBuilder(org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync prototype) {
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
     * Protobuf type {@code llsf_msgs.SimTimeSync}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:llsf_msgs.SimTimeSync)
        org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSyncOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.internal_static_llsf_msgs_SimTimeSync_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.internal_static_llsf_msgs_SimTimeSync_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync.class, org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync.Builder.class);
      }

      // Construct using org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync.newBuilder()
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
          getSimTimeFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (simTimeBuilder_ == null) {
          simTime_ = null;
        } else {
          simTimeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        realTimeFactor_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000002);
        paused_ = false;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.internal_static_llsf_msgs_SimTimeSync_descriptor;
      }

      @java.lang.Override
      public org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync getDefaultInstanceForType() {
        return org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync.getDefaultInstance();
      }

      @java.lang.Override
      public org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync build() {
        org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync buildPartial() {
        org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync result = new org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          if (simTimeBuilder_ == null) {
            result.simTime_ = simTime_;
          } else {
            result.simTime_ = simTimeBuilder_.build();
          }
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.realTimeFactor_ = realTimeFactor_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.paused_ = paused_;
          to_bitField0_ |= 0x00000004;
        }
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
        if (other instanceof org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync) {
          return mergeFrom((org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync other) {
        if (other == org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync.getDefaultInstance()) return this;
        if (other.hasSimTime()) {
          mergeSimTime(other.getSimTime());
        }
        if (other.hasRealTimeFactor()) {
          setRealTimeFactor(other.getRealTimeFactor());
        }
        if (other.hasPaused()) {
          setPaused(other.getPaused());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasSimTime()) {
          return false;
        }
        if (!hasRealTimeFactor()) {
          return false;
        }
        if (!hasPaused()) {
          return false;
        }
        if (!getSimTime().isInitialized()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private org.robocup_logistics.llsf_msgs.TimeProtos.Time simTime_;
      private com.google.protobuf.SingleFieldBuilderV3<
          org.robocup_logistics.llsf_msgs.TimeProtos.Time, org.robocup_logistics.llsf_msgs.TimeProtos.Time.Builder, org.robocup_logistics.llsf_msgs.TimeProtos.TimeOrBuilder> simTimeBuilder_;
      /**
       * <code>required .llsf_msgs.Time sim_time = 1;</code>
       * @return Whether the simTime field is set.
       */
      public boolean hasSimTime() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required .llsf_msgs.Time sim_time = 1;</code>
       * @return The simTime.
       */
      public org.robocup_logistics.llsf_msgs.TimeProtos.Time getSimTime() {
        if (simTimeBuilder_ == null) {
          return simTime_ == null ? org.robocup_logistics.llsf_msgs.TimeProtos.Time.getDefaultInstance() : simTime_;
        } else {
          return simTimeBuilder_.getMessage();
        }
      }
      /**
       * <code>required .llsf_msgs.Time sim_time = 1;</code>
       */
      public Builder setSimTime(org.robocup_logistics.llsf_msgs.TimeProtos.Time value) {
        if (simTimeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          simTime_ = value;
          onChanged();
        } else {
          simTimeBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .llsf_msgs.Time sim_time = 1;</code>
       */
      public Builder setSimTime(
          org.robocup_logistics.llsf_msgs.TimeProtos.Time.Builder builderForValue) {
        if (simTimeBuilder_ == null) {
          simTime_ = builderForValue.build();
          onChanged();
        } else {
          simTimeBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .llsf_msgs.Time sim_time = 1;</code>
       */
      public Builder mergeSimTime(org.robocup_logistics.llsf_msgs.TimeProtos.Time value) {
        if (simTimeBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
              simTime_ != null &&
              simTime_ != org.robocup_logistics.llsf_msgs.TimeProtos.Time.getDefaultInstance()) {
            simTime_ =
              org.robocup_logistics.llsf_msgs.TimeProtos.Time.newBuilder(simTime_).mergeFrom(value).buildPartial();
          } else {
            simTime_ = value;
          }
          onChanged();
        } else {
          simTimeBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>required .llsf_msgs.Time sim_time = 1;</code>
       */
      public Builder clearSimTime() {
        if (simTimeBuilder_ == null) {
          simTime_ = null;
          onChanged();
        } else {
          simTimeBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>required .llsf_msgs.Time sim_time = 1;</code>
       */
      public org.robocup_logistics.llsf_msgs.TimeProtos.Time.Builder getSimTimeBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getSimTimeFieldBuilder().getBuilder();
      }
      /**
       * <code>required .llsf_msgs.Time sim_time = 1;</code>
       */
      public org.robocup_logistics.llsf_msgs.TimeProtos.TimeOrBuilder getSimTimeOrBuilder() {
        if (simTimeBuilder_ != null) {
          return simTimeBuilder_.getMessageOrBuilder();
        } else {
          return simTime_ == null ?
              org.robocup_logistics.llsf_msgs.TimeProtos.Time.getDefaultInstance() : simTime_;
        }
      }
      /**
       * <code>required .llsf_msgs.Time sim_time = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          org.robocup_logistics.llsf_msgs.TimeProtos.Time, org.robocup_logistics.llsf_msgs.TimeProtos.Time.Builder, org.robocup_logistics.llsf_msgs.TimeProtos.TimeOrBuilder> 
          getSimTimeFieldBuilder() {
        if (simTimeBuilder_ == null) {
          simTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              org.robocup_logistics.llsf_msgs.TimeProtos.Time, org.robocup_logistics.llsf_msgs.TimeProtos.Time.Builder, org.robocup_logistics.llsf_msgs.TimeProtos.TimeOrBuilder>(
                  getSimTime(),
                  getParentForChildren(),
                  isClean());
          simTime_ = null;
        }
        return simTimeBuilder_;
      }

      private float realTimeFactor_ ;
      /**
       * <code>required float real_time_factor = 2;</code>
       * @return Whether the realTimeFactor field is set.
       */
      @java.lang.Override
      public boolean hasRealTimeFactor() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required float real_time_factor = 2;</code>
       * @return The realTimeFactor.
       */
      @java.lang.Override
      public float getRealTimeFactor() {
        return realTimeFactor_;
      }
      /**
       * <code>required float real_time_factor = 2;</code>
       * @param value The realTimeFactor to set.
       * @return This builder for chaining.
       */
      public Builder setRealTimeFactor(float value) {
        bitField0_ |= 0x00000002;
        realTimeFactor_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required float real_time_factor = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRealTimeFactor() {
        bitField0_ = (bitField0_ & ~0x00000002);
        realTimeFactor_ = 0F;
        onChanged();
        return this;
      }

      private boolean paused_ ;
      /**
       * <code>required bool paused = 3;</code>
       * @return Whether the paused field is set.
       */
      @java.lang.Override
      public boolean hasPaused() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>required bool paused = 3;</code>
       * @return The paused.
       */
      @java.lang.Override
      public boolean getPaused() {
        return paused_;
      }
      /**
       * <code>required bool paused = 3;</code>
       * @param value The paused to set.
       * @return This builder for chaining.
       */
      public Builder setPaused(boolean value) {
        bitField0_ |= 0x00000004;
        paused_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bool paused = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearPaused() {
        bitField0_ = (bitField0_ & ~0x00000004);
        paused_ = false;
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


      // @@protoc_insertion_point(builder_scope:llsf_msgs.SimTimeSync)
    }

    // @@protoc_insertion_point(class_scope:llsf_msgs.SimTimeSync)
    private static final org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync();
    }

    public static org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<SimTimeSync>
        PARSER = new com.google.protobuf.AbstractParser<SimTimeSync>() {
      @java.lang.Override
      public SimTimeSync parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SimTimeSync(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SimTimeSync> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SimTimeSync> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.robocup_logistics.llsf_msgs.SimTimeSyncProtos.SimTimeSync getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_llsf_msgs_SimTimeSync_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_llsf_msgs_SimTimeSync_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021SimTimeSync.proto\022\tllsf_msgs\032\nTime.pro" +
      "to\"\203\001\n\013SimTimeSync\022!\n\010sim_time\030\001 \002(\0132\017.l" +
      "lsf_msgs.Time\022\030\n\020real_time_factor\030\002 \002(\002\022" +
      "\016\n\006paused\030\003 \002(\010\"\'\n\010CompType\022\014\n\007COMP_ID\020\320" +
      "\017\022\r\n\010MSG_TYPE\020\307\002B4\n\037org.robocup_logistic" +
      "s.llsf_msgsB\021SimTimeSyncProtos"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.robocup_logistics.llsf_msgs.TimeProtos.getDescriptor(),
        });
    internal_static_llsf_msgs_SimTimeSync_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_llsf_msgs_SimTimeSync_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_llsf_msgs_SimTimeSync_descriptor,
        new java.lang.String[] { "SimTime", "RealTimeFactor", "Paused", });
    org.robocup_logistics.llsf_msgs.TimeProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}