// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: keyboard_message.proto

package com.example.project.protobuf.pb;

/**
 * Protobuf type {@code example.protobuf.Keyboard}
 */
public final class Keyboard extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:example.protobuf.Keyboard)
    KeyboardOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Keyboard.newBuilder() to construct.
  private Keyboard(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Keyboard() {
    layout_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Keyboard();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Keyboard(
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

            layout_ = rawValue;
            break;
          }
          case 16: {

            backlit_ = input.readBool();
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return com.example.project.protobuf.pb.KeyboardMessage.internal_static_example_protobuf_Keyboard_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.project.protobuf.pb.KeyboardMessage.internal_static_example_protobuf_Keyboard_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.project.protobuf.pb.Keyboard.class, com.example.project.protobuf.pb.Keyboard.Builder.class);
  }

  /**
   * Protobuf enum {@code example.protobuf.Keyboard.Layout}
   */
  public enum Layout
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <code>QWERTY = 1;</code>
     */
    QWERTY(1),
    /**
     * <code>QWERTZ = 2;</code>
     */
    QWERTZ(2),
    /**
     * <code>AZERTY = 3;</code>
     */
    AZERTY(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <code>QWERTY = 1;</code>
     */
    public static final int QWERTY_VALUE = 1;
    /**
     * <code>QWERTZ = 2;</code>
     */
    public static final int QWERTZ_VALUE = 2;
    /**
     * <code>AZERTY = 3;</code>
     */
    public static final int AZERTY_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Layout valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Layout forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return QWERTY;
        case 2: return QWERTZ;
        case 3: return AZERTY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Layout>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Layout> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Layout>() {
            public Layout findValueByNumber(int number) {
              return Layout.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.example.project.protobuf.pb.Keyboard.getDescriptor().getEnumTypes().get(0);
    }

    private static final Layout[] VALUES = values();

    public static Layout valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Layout(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:example.protobuf.Keyboard.Layout)
  }

  public static final int LAYOUT_FIELD_NUMBER = 1;
  private int layout_;
  /**
   * <code>.example.protobuf.Keyboard.Layout layout = 1;</code>
   * @return The enum numeric value on the wire for layout.
   */
  @java.lang.Override public int getLayoutValue() {
    return layout_;
  }
  /**
   * <code>.example.protobuf.Keyboard.Layout layout = 1;</code>
   * @return The layout.
   */
  @java.lang.Override public com.example.project.protobuf.pb.Keyboard.Layout getLayout() {
    @SuppressWarnings("deprecation")
    com.example.project.protobuf.pb.Keyboard.Layout result = com.example.project.protobuf.pb.Keyboard.Layout.valueOf(layout_);
    return result == null ? com.example.project.protobuf.pb.Keyboard.Layout.UNRECOGNIZED : result;
  }

  public static final int BACKLIT_FIELD_NUMBER = 2;
  private boolean backlit_;
  /**
   * <code>bool backlit = 2;</code>
   * @return The backlit.
   */
  @java.lang.Override
  public boolean getBacklit() {
    return backlit_;
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
    if (layout_ != com.example.project.protobuf.pb.Keyboard.Layout.UNKNOWN.getNumber()) {
      output.writeEnum(1, layout_);
    }
    if (backlit_ != false) {
      output.writeBool(2, backlit_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (layout_ != com.example.project.protobuf.pb.Keyboard.Layout.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, layout_);
    }
    if (backlit_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, backlit_);
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
    if (!(obj instanceof com.example.project.protobuf.pb.Keyboard)) {
      return super.equals(obj);
    }
    com.example.project.protobuf.pb.Keyboard other = (com.example.project.protobuf.pb.Keyboard) obj;

    if (layout_ != other.layout_) return false;
    if (getBacklit()
        != other.getBacklit()) return false;
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
    hash = (37 * hash) + LAYOUT_FIELD_NUMBER;
    hash = (53 * hash) + layout_;
    hash = (37 * hash) + BACKLIT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getBacklit());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.project.protobuf.pb.Keyboard parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.project.protobuf.pb.Keyboard parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.project.protobuf.pb.Keyboard parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.project.protobuf.pb.Keyboard parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.project.protobuf.pb.Keyboard parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.project.protobuf.pb.Keyboard parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.project.protobuf.pb.Keyboard parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.project.protobuf.pb.Keyboard parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.project.protobuf.pb.Keyboard parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.project.protobuf.pb.Keyboard parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.project.protobuf.pb.Keyboard parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.project.protobuf.pb.Keyboard parseFrom(
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
  public static Builder newBuilder(com.example.project.protobuf.pb.Keyboard prototype) {
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
   * Protobuf type {@code example.protobuf.Keyboard}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:example.protobuf.Keyboard)
      com.example.project.protobuf.pb.KeyboardOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.project.protobuf.pb.KeyboardMessage.internal_static_example_protobuf_Keyboard_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.project.protobuf.pb.KeyboardMessage.internal_static_example_protobuf_Keyboard_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.project.protobuf.pb.Keyboard.class, com.example.project.protobuf.pb.Keyboard.Builder.class);
    }

    // Construct using com.example.project.protobuf.pb.Keyboard.newBuilder()
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
      layout_ = 0;

      backlit_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.project.protobuf.pb.KeyboardMessage.internal_static_example_protobuf_Keyboard_descriptor;
    }

    @java.lang.Override
    public com.example.project.protobuf.pb.Keyboard getDefaultInstanceForType() {
      return com.example.project.protobuf.pb.Keyboard.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.project.protobuf.pb.Keyboard build() {
      com.example.project.protobuf.pb.Keyboard result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.project.protobuf.pb.Keyboard buildPartial() {
      com.example.project.protobuf.pb.Keyboard result = new com.example.project.protobuf.pb.Keyboard(this);
      result.layout_ = layout_;
      result.backlit_ = backlit_;
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
      if (other instanceof com.example.project.protobuf.pb.Keyboard) {
        return mergeFrom((com.example.project.protobuf.pb.Keyboard)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.project.protobuf.pb.Keyboard other) {
      if (other == com.example.project.protobuf.pb.Keyboard.getDefaultInstance()) return this;
      if (other.layout_ != 0) {
        setLayoutValue(other.getLayoutValue());
      }
      if (other.getBacklit() != false) {
        setBacklit(other.getBacklit());
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
      com.example.project.protobuf.pb.Keyboard parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.project.protobuf.pb.Keyboard) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int layout_ = 0;
    /**
     * <code>.example.protobuf.Keyboard.Layout layout = 1;</code>
     * @return The enum numeric value on the wire for layout.
     */
    @java.lang.Override public int getLayoutValue() {
      return layout_;
    }
    /**
     * <code>.example.protobuf.Keyboard.Layout layout = 1;</code>
     * @param value The enum numeric value on the wire for layout to set.
     * @return This builder for chaining.
     */
    public Builder setLayoutValue(int value) {
      
      layout_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.example.protobuf.Keyboard.Layout layout = 1;</code>
     * @return The layout.
     */
    @java.lang.Override
    public com.example.project.protobuf.pb.Keyboard.Layout getLayout() {
      @SuppressWarnings("deprecation")
      com.example.project.protobuf.pb.Keyboard.Layout result = com.example.project.protobuf.pb.Keyboard.Layout.valueOf(layout_);
      return result == null ? com.example.project.protobuf.pb.Keyboard.Layout.UNRECOGNIZED : result;
    }
    /**
     * <code>.example.protobuf.Keyboard.Layout layout = 1;</code>
     * @param value The layout to set.
     * @return This builder for chaining.
     */
    public Builder setLayout(com.example.project.protobuf.pb.Keyboard.Layout value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      layout_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.example.protobuf.Keyboard.Layout layout = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLayout() {
      
      layout_ = 0;
      onChanged();
      return this;
    }

    private boolean backlit_ ;
    /**
     * <code>bool backlit = 2;</code>
     * @return The backlit.
     */
    @java.lang.Override
    public boolean getBacklit() {
      return backlit_;
    }
    /**
     * <code>bool backlit = 2;</code>
     * @param value The backlit to set.
     * @return This builder for chaining.
     */
    public Builder setBacklit(boolean value) {
      
      backlit_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool backlit = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBacklit() {
      
      backlit_ = false;
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


    // @@protoc_insertion_point(builder_scope:example.protobuf.Keyboard)
  }

  // @@protoc_insertion_point(class_scope:example.protobuf.Keyboard)
  private static final com.example.project.protobuf.pb.Keyboard DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.project.protobuf.pb.Keyboard();
  }

  public static com.example.project.protobuf.pb.Keyboard getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Keyboard>
      PARSER = new com.google.protobuf.AbstractParser<Keyboard>() {
    @java.lang.Override
    public Keyboard parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Keyboard(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Keyboard> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Keyboard> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.project.protobuf.pb.Keyboard getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
