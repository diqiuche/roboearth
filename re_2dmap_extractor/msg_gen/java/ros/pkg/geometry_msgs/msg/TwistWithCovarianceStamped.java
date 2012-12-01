/* Auto-generated by genmsg_java.py for file /opt/ros/fuerte/share/geometry_msgs/msg/TwistWithCovarianceStamped.msg */

package ros.pkg.geometry_msgs.msg;

import java.nio.ByteBuffer;

public class TwistWithCovarianceStamped extends ros.communication.Message {

  public ros.pkg.std_msgs.msg.Header header = new ros.pkg.std_msgs.msg.Header();
  public ros.pkg.geometry_msgs.msg.TwistWithCovariance twist = new ros.pkg.geometry_msgs.msg.TwistWithCovariance();

  public TwistWithCovarianceStamped() {
  }

  public static java.lang.String __s_getDataType() { return "geometry_msgs/TwistWithCovarianceStamped"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "8927a1a12fb2607ceea095b2dc440a96"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "# This represents an estimate twist with reference coordinate frame and timestamp.\n" +
"Header header\n" +
"TwistWithCovariance twist\n" +
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
"MSG: geometry_msgs/TwistWithCovariance\n" +
"# This expresses velocity in free space with uncertianty.\n" +
"\n" +
"Twist twist\n" +
"\n" +
"# Row-major representation of the 6x6 covariance matrix\n" +
"# The orientation parameters use a fixed-axis representation.\n" +
"# In order, the parameters are:\n" +
"# (x, y, z, rotation about X axis, rotation about Y axis, rotation about Z axis)\n" +
"float64[36] covariance\n" +
"\n" +
"================================================================================\n" +
"MSG: geometry_msgs/Twist\n" +
"# This expresses velocity in free space broken into it's linear and angular parts. \n" +
"Vector3  linear\n" +
"Vector3  angular\n" +
"\n" +
"================================================================================\n" +
"MSG: geometry_msgs/Vector3\n" +
"# This represents a vector in free space. \n" +
"\n" +
"float64 x\n" +
"float64 y\n" +
"float64 z\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public TwistWithCovarianceStamped clone() {
    TwistWithCovarianceStamped c = new TwistWithCovarianceStamped();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += header.serializationLength();
    __l += twist.serializationLength();
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    header.serialize(bb, seq);
    twist.serialize(bb, seq);
  }

  public void deserialize(ByteBuffer bb) {
    header.deserialize(bb);
    twist.deserialize(bb);
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof TwistWithCovarianceStamped))
      return false;
    TwistWithCovarianceStamped other = (TwistWithCovarianceStamped) o;
    return
      header.equals(other.header) &&
      twist.equals(other.twist) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.header == null ? 0 : this.header.hashCode());
    result = prime * result + (this.twist == null ? 0 : this.twist.hashCode());
    return result;
  }
} // class TwistWithCovarianceStamped

