// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language-agent/JVMMetric.proto

package org.apache.skywalking.apm.network.language.agent.v3;

public interface MemoryPoolOrBuilder extends
    // @@protoc_insertion_point(interface_extends:skywalking.v3.MemoryPool)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.skywalking.v3.PoolType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.skywalking.v3.PoolType type = 1;</code>
   * @return The type.
   */
  org.apache.skywalking.apm.network.language.agent.v3.PoolType getType();

  /**
   * <code>int64 init = 2;</code>
   * @return The init.
   */
  long getInit();

  /**
   * <code>int64 max = 3;</code>
   * @return The max.
   */
  long getMax();

  /**
   * <code>int64 used = 4;</code>
   * @return The used.
   */
  long getUsed();

  /**
   * <code>int64 committed = 5;</code>
   * @return The committed.
   */
  long getCommitted();
}
