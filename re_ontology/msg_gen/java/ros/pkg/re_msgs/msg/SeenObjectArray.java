/* Auto-generated by genmsg_java.py for file /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_msgs/msg/SeenObjectArray.msg */

package ros.pkg.re_msgs.msg;

import java.nio.ByteBuffer;

public class SeenObjectArray extends ros.communication.Message {

  public ros.pkg.std_msgs.msg.Header header = new ros.pkg.std_msgs.msg.Header();
  public java.util.ArrayList<ros.pkg.re_msgs.msg.SeenObject> object = new java.util.ArrayList<ros.pkg.re_msgs.msg.SeenObject>();

  public SeenObjectArray() {
  }

  public static java.lang.String __s_getDataType() { return "re_msgs/SeenObjectArray"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "db06ee56fb2cfb4568deee7165cba35f"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "#This represents a list of objects\n" +
"Header header\n" +
"SeenObject[] object\n" +
"\n" +
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
"MSG: re_msgs/SeenObject\n" +
"#This represents a Object\n" +
"time stamp\n" +
"string name\n" +
"geometry_msgs/Pose pose\n" +
"\n" +
"================================================================================\n" +
"MSG: geometry_msgs/Pose\n" +
"# A representation of pose in free space, composed of postion and orientation. \n" +
"Point position\n" +
"Quaternion orientation\n" +
"\n" +
"================================================================================\n" +
"MSG: geometry_msgs/Point\n" +
"# This contains the position of a point in free space\n" +
"float64 x\n" +
"float64 y\n" +
"float64 z\n" +
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

  public SeenObjectArray clone() {
    SeenObjectArray c = new SeenObjectArray();
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
    for(ros.pkg.re_msgs.msg.SeenObject val : object) {
      __l += val.serializationLength();
    }
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    header.serialize(bb, seq);
    bb.putInt(object.size());
    for(ros.pkg.re_msgs.msg.SeenObject val : object) {
      val.serialize(bb, seq);
    }
  }

  public void deserialize(ByteBuffer bb) {
    header.deserialize(bb);

    int __object_len = bb.getInt();
    object = new java.util.ArrayList<ros.pkg.re_msgs.msg.SeenObject>(__object_len);
    for(int __i=0; __i<__object_len; __i++) {
      ros.pkg.re_msgs.msg.SeenObject __tmp = new ros.pkg.re_msgs.msg.SeenObject();
      __tmp.deserialize(bb);
      object.add(__tmp);;
    }
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof SeenObjectArray))
      return false;
    SeenObjectArray other = (SeenObjectArray) o;
    return
      header.equals(other.header) &&
      object.equals(other.object) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.header == null ? 0 : this.header.hashCode());
    result = prime * result + (this.object == null ? 0 : this.object.hashCode());
    return result;
  }
} // class SeenObjectArray

