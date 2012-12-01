/* Auto-generated by genmsg_java.py for file /opt/ros/fuerte/stacks/arm_navigation/arm_navigation_msgs/msg/CollisionMap.msg */

package ros.pkg.arm_navigation_msgs.msg;

import java.nio.ByteBuffer;

public class CollisionMap extends ros.communication.Message {

  public ros.pkg.std_msgs.msg.Header header = new ros.pkg.std_msgs.msg.Header();
  public java.util.ArrayList<ros.pkg.arm_navigation_msgs.msg.OrientedBoundingBox> boxes = new java.util.ArrayList<ros.pkg.arm_navigation_msgs.msg.OrientedBoundingBox>();

  public CollisionMap() {
  }

  public static java.lang.String __s_getDataType() { return "arm_navigation_msgs/CollisionMap"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "18ca54db41ccebbe82f61f9801dede89"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "#header for interpreting box positions\n" +
"Header header\n" +
"\n" +
"#boxes for use in collision testing\n" +
"OrientedBoundingBox[] boxes\n" +
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
"MSG: arm_navigation_msgs/OrientedBoundingBox\n" +
"#the center of the box\n" +
"geometry_msgs/Point32 center\n" +
"\n" +
"#the extents of the box, assuming the center is at the point\n" +
"geometry_msgs/Point32 extents\n" +
"\n" +
"#the axis of the box\n" +
"geometry_msgs/Point32 axis\n" +
"\n" +
"#the angle of rotation around the axis\n" +
"float32 angle\n" +
"\n" +
"================================================================================\n" +
"MSG: geometry_msgs/Point32\n" +
"# This contains the position of a point in free space(with 32 bits of precision).\n" +
"# It is recommeded to use Point wherever possible instead of Point32.  \n" +
"# \n" +
"# This recommendation is to promote interoperability.  \n" +
"#\n" +
"# This message is designed to take up less space when sending\n" +
"# lots of points at once, as in the case of a PointCloud.  \n" +
"\n" +
"float32 x\n" +
"float32 y\n" +
"float32 z\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public CollisionMap clone() {
    CollisionMap c = new CollisionMap();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += header.serializationLength();
    __l += 4;
    for(ros.pkg.arm_navigation_msgs.msg.OrientedBoundingBox val : boxes) {
      __l += val.serializationLength();
    }
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    header.serialize(bb, seq);
    bb.putInt(boxes.size());
    for(ros.pkg.arm_navigation_msgs.msg.OrientedBoundingBox val : boxes) {
      val.serialize(bb, seq);
    }
  }

  public void deserialize(ByteBuffer bb) {
    header.deserialize(bb);

    int __boxes_len = bb.getInt();
    boxes = new java.util.ArrayList<ros.pkg.arm_navigation_msgs.msg.OrientedBoundingBox>(__boxes_len);
    for(int __i=0; __i<__boxes_len; __i++) {
      ros.pkg.arm_navigation_msgs.msg.OrientedBoundingBox __tmp = new ros.pkg.arm_navigation_msgs.msg.OrientedBoundingBox();
      __tmp.deserialize(bb);
      boxes.add(__tmp);;
    }
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof CollisionMap))
      return false;
    CollisionMap other = (CollisionMap) o;
    return
      header.equals(other.header) &&
      boxes.equals(other.boxes) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.header == null ? 0 : this.header.hashCode());
    result = prime * result + (this.boxes == null ? 0 : this.boxes.hashCode());
    return result;
  }
} // class CollisionMap

