// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: laptop_service.proto

package com.example.project.protobuf.pb;

public final class LaptopServiceOuterClass {
  private LaptopServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_example_protobuf_CreateLaptopRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_example_protobuf_CreateLaptopRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_example_protobuf_CreateLaptopResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_example_protobuf_CreateLaptopResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_example_protobuf_SearchLaptopRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_example_protobuf_SearchLaptopRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_example_protobuf_SearchLaptopResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_example_protobuf_SearchLaptopResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024laptop_service.proto\022\020example.protobuf" +
      "\032\024laptop_message.proto\032\024filter_message.p" +
      "roto\"?\n\023CreateLaptopRequest\022(\n\006laptop\030\001 " +
      "\001(\0132\030.example.protobuf.Laptop\"\"\n\024CreateL" +
      "aptopResponse\022\n\n\002id\030\001 \001(\t\"?\n\023SearchLapto" +
      "pRequest\022(\n\006filter\030\001 \001(\0132\030.example.proto" +
      "buf.Filter\"@\n\024SearchLaptopResponse\022(\n\006la" +
      "ptop\030\001 \001(\0132\030.example.protobuf.Laptop2\323\001\n" +
      "\rLaptopService\022_\n\014CreateLaptop\022%.example" +
      ".protobuf.CreateLaptopRequest\032&.example." +
      "protobuf.CreateLaptopResponse\"\000\022a\n\014Searc" +
      "hLaptop\022%.example.protobuf.SearchLaptopR" +
      "equest\032&.example.protobuf.SearchLaptopRe" +
      "sponse\"\0000\001B\'\n\037com.example.project.protob" +
      "uf.pbP\001Z\002pbb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.example.project.protobuf.pb.LaptopMessage.getDescriptor(),
          com.example.project.protobuf.pb.FilterMessage.getDescriptor(),
        });
    internal_static_example_protobuf_CreateLaptopRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_example_protobuf_CreateLaptopRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_example_protobuf_CreateLaptopRequest_descriptor,
        new java.lang.String[] { "Laptop", });
    internal_static_example_protobuf_CreateLaptopResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_example_protobuf_CreateLaptopResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_example_protobuf_CreateLaptopResponse_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_example_protobuf_SearchLaptopRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_example_protobuf_SearchLaptopRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_example_protobuf_SearchLaptopRequest_descriptor,
        new java.lang.String[] { "Filter", });
    internal_static_example_protobuf_SearchLaptopResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_example_protobuf_SearchLaptopResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_example_protobuf_SearchLaptopResponse_descriptor,
        new java.lang.String[] { "Laptop", });
    com.example.project.protobuf.pb.LaptopMessage.getDescriptor();
    com.example.project.protobuf.pb.FilterMessage.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
