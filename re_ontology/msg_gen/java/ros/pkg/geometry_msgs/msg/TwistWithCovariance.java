/* Auto-generated by genmsg_java.py for file /opt/ros/fuerte/share/geometry_msgs/msg/TwistWithCovariance.msg */

package ros.pkg.geometry_msgs.msg;

import java.nio.ByteBuffer;

public class TwistWithCovariance extends ros.communication.Message {

  public ros.pkg.geometry_msgs.msg.Twist twist = new ros.pkg.geometry_msgs.msg.Twist();
  public double[] covariance = new double[36];

  public TwistWithCovariance() {
  }

  public static java.lang.String __s_getDataType() { return "geometry_msgs/TwistWithCovariance"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "1fe8a28e6890a4cc3ae4c3ca5c7d82e6"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "# This expresses velocity in free space with uncertianty.\n" +
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

  public TwistWithCovariance clone() {
    TwistWithCovariance c = new TwistWithCovariance();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += twist.serializationLength();
    __l += 288; // covariance
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    twist.serialize(bb, seq);

    for(double val : covariance) {
      bb.putDouble(val);
    }
  }

  public void deserialize(ByteBuffer bb) {
    twist.deserialize(bb);

    int __covariance_len = covariance.length;;
    covariance = new double[__covariance_len];
    for(int __i=0; __i<__covariance_len; __i++) {
      covariance[__i] = bb.getDouble();
    }
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof TwistWithCovariance))
      return false;
    TwistWithCovariance other = (TwistWithCovariance) o;
    return
      twist.equals(other.twist) &&
      java.util.Arrays.equals(covariance, other.covariance) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.twist == null ? 0 : this.twist.hashCode());
    result = prime * result + java.util.Arrays.hashCode(this.covariance);
    return result;
  }
} // class TwistWithCovariance
