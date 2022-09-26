// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: configuration-service.proto

package org.apache.skywalking.oap.server.configuration.service;

public interface ConfigurationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ConfigurationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Logic name of this cluster,
   * in case the remote configuration center implementation support
   * configuration management for multiple clusters.
   * </pre>
   *
   * <code>string clusterName = 1;</code>
   * @return The clusterName.
   */
  java.lang.String getClusterName();
  /**
   * <pre>
   * Logic name of this cluster,
   * in case the remote configuration center implementation support
   * configuration management for multiple clusters.
   * </pre>
   *
   * <code>string clusterName = 1;</code>
   * @return The bytes for clusterName.
   */
  com.google.protobuf.ByteString
      getClusterNameBytes();

  /**
   * <pre>
   * The config UUID response from the config server side.
   * </pre>
   *
   * <code>string uuid = 2;</code>
   * @return The uuid.
   */
  java.lang.String getUuid();
  /**
   * <pre>
   * The config UUID response from the config server side.
   * </pre>
   *
   * <code>string uuid = 2;</code>
   * @return The bytes for uuid.
   */
  com.google.protobuf.ByteString
      getUuidBytes();
}