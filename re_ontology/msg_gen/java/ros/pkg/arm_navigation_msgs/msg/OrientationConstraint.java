/* Auto-generated by genmsg_java.py for file /opt/ros/fuerte/stacks/arm_navigation/arm_navigation_msgs/msg/OrientationConstraint.msg */

package ros.pkg.arm_navigation_msgs.msg;

import java.nio.ByteBuffer;

public class OrientationConstraint extends ros.communication.Message {
  static public final int LINK_FRAME = 0;
  static public final int HEADER_FRAME = 1;

  public ros.pkg.std_msgs.msg.Header header = new ros.pkg.std_msgs.msg.Header();
  public java.lang.String link_name = new java.lang.String();
  public int type;
  public ros.pkg.geometry_msgs.msg.Quaternion orientation = new ros.pkg.geometry_msgs.msg.Quaternion();
  public double absolute_roll_tolerance;
  public double absolute_pitch_tolerance;
  public double absolute_yaw_tolerance;
  public double weight;

  public OrientationConstraint() {
  }

  public static java.lang.String __s_getDataType() { return "arm_navigation_msgs/OrientationConstraint"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "27d99749ba49d4a822298bbd1e0988ba"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "# This message contains the definition of an orientation constraint.\n" +
"Header header\n" +
"\n" +
"# The robot link this constraint refers to\n" +
"string link_name\n" +
"\n" +
"# The type of the constraint\n" +
"int32 type\n" +
"int32 LINK_FRAME=0\n" +
"int32 HEADER_FRAME=1\n" +
"\n" +
"# The desired orientation of the robot link specified as a quaternion\n" +
"geometry_msgs/Quaternion orientation\n" +
"\n" +
"# optional RPY error tolerances specified if \n" +
"float64 absolute_roll_tolerance\n" +
"float64 absolute_pitch_tolerance\n" +
"float64 absolute_yaw_tolerance\n" +
"\n" +
"# Constraint weighting factor - a weight for this constraint\n" +
"float64 weight\n" +
"\n" +
"================================================================================\n" +
"MSG: std_msgs/Header\n" +
"# Standard metadata for higher-level stamped data types.\n" +
"# This is generally used to communicate timestamped data \n" +
"# in a particular coordinate frame.\n" +
"# \n" +
"# sequence ID: consecutively increasing ID \n" +
"uint32 seq\n" +
"#Two-integer timestamp that is expressed as:\n" +
"# * stamp.secs: seconds (stamp_secs) since epoch\n" +
"# * stamp.nsecs: nanoseconds since stamp_secs\n" +
"# time-handling sugar is provided by the client library\n" +
"time stamp\n" +
"#Frame this data is associated with\n" +
"# 0: no frame\n" +
"# 1: global frame\n" +
"string frame_id\n" +
"\n" +
"================================================================================\n" +
"MSG: geometry_msgs/Quaternion\n" +
"# This represents an orientation in free space in quaternion form.\n" +
"\n" +
"float64 x\n" +
"float64 y\n" +
"float64 z\n" +
"float64 w\n" +
"\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public OrientationConstraint clone() {
    OrientationConstraint c = new OrientationConstraint();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += header.serializationLength();
    __l += 4 + link_name.length();
    __l += 4; // type
    __l += orientation.serializationLength();
    __l += 8; // absolute_roll_tolerance
    __l += 8; // absolute_pitch_tolerance
    __l += 8; // absolute_yaw_tolerance
    __l += 8; // weight
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    header.serialize(bb, seq);
    Serialization.writeString(bb, link_name);
    bb.putInt(type);
    orientation.serialize(bb, seq);
    bb.putDouble(absolute_roll_tolerance);
    bb.putDouble(absolute_pitch_tolerance);
    bb.putDouble(absolute_yaw_tolerance);
    bb.putDouble(weight);
  }

  public void deserialize(ByteBuffer bb) {
    header.deserialize(bb);
    link_name = Serialization.readString(bb);
    type = bb.getInt();
    orientation.deserialize(bb);
    absolute_roll_tolerance = bb.getDouble();
    absolute_pitch_tolerance = bb.getDouble();
    absolute_yaw_tolerance = bb.getDouble();
    weight = bb.getDouble();
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof OrientationConstraint))
      return false;
    OrientationConstraint other = (OrientationConstraint) o;
    return
      header.equals(other.header) &&
      link_name.equals(other.link_name) &&
      type == other.type &&
      orientation.equals(other.orientation) &&
      absolute_roll_tolerance == other.absolute_roll_tolerance &&
      absolute_pitch_tolerance == other.absolute_pitch_tolerance &&
      absolute_yaw_tolerance == other.absolute_yaw_tolerance &&
      weight == other.weight &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.header == null ? 0 : this.header.hashCode());
    result = prime * result + (this.link_name == null ? 0 : this.link_name.hashCode());
    result = prime * result + this.type;
    result = prime * result + (this.orientation == null ? 0 : this.orientation.hashCode());
    result = prime * result + (int)((tmp = Double.doubleToLongBits(this.absolute_roll_tolerance)) ^ (tmp >>> 32));
    result = prime * result + (int)((tmp = Double.doubleToLongBits(this.absolute_pitch_tolerance)) ^ (tmp >>> 32));
    result = prime * result + (int)((tmp = Double.doubleToLongBits(this.absolute_yaw_tolerance)) ^ (tmp >>> 32));
    result = prime * result + (int)((tmp = Double.doubleToLongBits(this.weight)) ^ (tmp >>> 32));
    return result;
  }
} // class OrientationConstraint

