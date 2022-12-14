// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language-agent/CLRMetric.proto

package org.apache.skywalking.apm.network.language.agent.v3;

public interface CLRMetricCollectionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:skywalking.v3.CLRMetricCollection)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .skywalking.v3.CLRMetric metrics = 1;</code>
   */
  java.util.List<org.apache.skywalking.apm.network.language.agent.v3.CLRMetric> 
      getMetricsList();
  /**
   * <code>repeated .skywalking.v3.CLRMetric metrics = 1;</code>
   */
  org.apache.skywalking.apm.network.language.agent.v3.CLRMetric getMetrics(int index);
  /**
   * <code>repeated .skywalking.v3.CLRMetric metrics = 1;</code>
   */
  int getMetricsCount();
  /**
   * <code>repeated .skywalking.v3.CLRMetric metrics = 1;</code>
   */
  java.util.List<? extends org.apache.skywalking.apm.network.language.agent.v3.CLRMetricOrBuilder> 
      getMetricsOrBuilderList();
  /**
   * <code>repeated .skywalking.v3.CLRMetric metrics = 1;</code>
   */
  org.apache.skywalking.apm.network.language.agent.v3.CLRMetricOrBuilder getMetricsOrBuilder(
      int index);

  /**
   * <code>string service = 2;</code>
   * @return The service.
   */
  java.lang.String getService();
  /**
   * <code>string service = 2;</code>
   * @return The bytes for service.
   */
  com.google.protobuf.ByteString
      getServiceBytes();

  /**
   * <code>string serviceInstance = 3;</code>
   * @return The serviceInstance.
   */
  java.lang.String getServiceInstance();
  /**
   * <code>string serviceInstance = 3;</code>
   * @return The bytes for serviceInstance.
   */
  com.google.protobuf.ByteString
      getServiceInstanceBytes();
}
