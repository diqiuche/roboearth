/* Auto-generated by genmsg_java.py for file /opt/ros/fuerte/share/geometry_msgs/msg/Quaternion.msg */

package ros.pkg.geometry_msgs.msg;

import java.nio.ByteBuffer;

public class Quaternion extends ros.communication.Message {

  public double x;
  public double y;
  public double z;
  public double w;

  public Quaternion() {
  }

  public static java.lang.String __s_getDataType() { return "geometry_msgs/Quaternion"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "a779879fadf0160734f906b8c19c7004"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "# This represents an orientation in free space in quaternion form.\n" +
"\n" +
"float64 x\n" +
"float64 y\n" +
"float64 z\n" +
"float64 w\n" +
"\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public Quaternion clone() {
    Quaternion c = new Quaternion();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += 8; // x
    __l += 8; // y
    __l += 8; // z
    __l += 8; // w
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    bb.putDouble(x);
    bb.putDouble(y);
    bb.putDouble(z);
    bb.putDouble(w);
  }

  public void deserialize(ByteBuffer bb) {
    x = bb.getDouble();
    y = bb.getDouble();
    z = bb.getDouble();
    w = bb.getDouble();
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Quaternion))
      return false;
    Quaternion other = (Quaternion) o;
    return
      x == other.x &&
      y == other.y &&
      z == other.z &&
      w == other.w &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (int)((tmp = Double.doubleToLongBits(this.x)) ^ (tmp >>> 32));
    result = prime * result + (int)((tmp = Double.doubleToLongBits(this.y)) ^ (tmp >>> 32));
    result = prime * result + (int)((tmp = Double.doubleToLongBits(this.z)) ^ (tmp >>> 32));
    result = prime * result + (int)((tmp = Double.doubleToLongBits(this.w)) ^ (tmp >>> 32));
    return result;
  }
} // class Quaternion

