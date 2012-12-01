/* Auto-generated by genmsg_java.py for file /opt/ros/fuerte/stacks/arm_navigation/arm_navigation_msgs/msg/JointLimits.msg */

package ros.pkg.arm_navigation_msgs.msg;

import java.nio.ByteBuffer;

public class JointLimits extends ros.communication.Message {

  public java.lang.String joint_name = new java.lang.String();
  public boolean has_position_limits;
  public double min_position;
  public double max_position;
  public boolean has_velocity_limits;
  public double max_velocity;
  public boolean has_acceleration_limits;
  public double max_acceleration;

  public JointLimits() {
  }

  public static java.lang.String __s_getDataType() { return "arm_navigation_msgs/JointLimits"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "8ca618c7329ea46142cbc864a2efe856"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "# This message contains information about limits of a particular joint (or control dimension)\n" +
"string joint_name\n" +
"\n" +
"# true if the joint has position limits\n" +
"bool has_position_limits\n" +
"\n" +
"# min and max position limits\n" +
"float64 min_position\n" +
"float64 max_position\n" +
"\n" +
"# true if joint has velocity limits\n" +
"bool has_velocity_limits\n" +
"\n" +
"# max velocity limit\n" +
"float64 max_velocity\n" +
"# min_velocity is assumed to be -max_velocity\n" +
"\n" +
"# true if joint has acceleration limits\n" +
"bool has_acceleration_limits\n" +
"# max acceleration limit\n" +
"float64 max_acceleration\n" +
"# min_acceleration is assumed to be -max_acceleration\n" +
"\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public JointLimits clone() {
    JointLimits c = new JointLimits();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += 4 + joint_name.length();
    __l += 1; // has_position_limits
    __l += 8; // min_position
    __l += 8; // max_position
    __l += 1; // has_velocity_limits
    __l += 8; // max_velocity
    __l += 1; // has_acceleration_limits
    __l += 8; // max_acceleration
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    Serialization.writeString(bb, joint_name);
    bb.put((byte)(has_position_limits ? 1 : 0));
    bb.putDouble(min_position);
    bb.putDouble(max_position);
    bb.put((byte)(has_velocity_limits ? 1 : 0));
    bb.putDouble(max_velocity);
    bb.put((byte)(has_acceleration_limits ? 1 : 0));
    bb.putDouble(max_acceleration);
  }

  public void deserialize(ByteBuffer bb) {
    joint_name = Serialization.readString(bb);
    has_position_limits = bb.get() != 0 ? true : false;
    min_position = bb.getDouble();
    max_position = bb.getDouble();
    has_velocity_limits = bb.get() != 0 ? true : false;
    max_velocity = bb.getDouble();
    has_acceleration_limits = bb.get() != 0 ? true : false;
    max_acceleration = bb.getDouble();
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof JointLimits))
      return false;
    JointLimits other = (JointLimits) o;
    return
      joint_name.equals(other.joint_name) &&
      has_position_limits == other.has_position_limits &&
      min_position == other.min_position &&
      max_position == other.max_position &&
      has_velocity_limits == other.has_velocity_limits &&
      max_velocity == other.max_velocity &&
      has_acceleration_limits == other.has_acceleration_limits &&
      max_acceleration == other.max_acceleration &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.joint_name == null ? 0 : this.joint_name.hashCode());
    result = prime * result + (this.has_position_limits ? 1231 : 1237);
    result = prime * result + (int)((tmp = Double.doubleToLongBits(this.min_position)) ^ (tmp >>> 32));
    result = prime * result + (int)((tmp = Double.doubleToLongBits(this.max_position)) ^ (tmp >>> 32));
    result = prime * result + (this.has_velocity_limits ? 1231 : 1237);
    result = prime * result + (int)((tmp = Double.doubleToLongBits(this.max_velocity)) ^ (tmp >>> 32));
    result = prime * result + (this.has_acceleration_limits ? 1231 : 1237);
    result = prime * result + (int)((tmp = Double.doubleToLongBits(this.max_acceleration)) ^ (tmp >>> 32));
    return result;
  }
} // class JointLimits
