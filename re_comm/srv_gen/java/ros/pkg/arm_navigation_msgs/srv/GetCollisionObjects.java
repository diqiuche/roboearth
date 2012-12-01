/* Auto-generated by genmsg_cpp for file /opt/ros/fuerte/stacks/arm_navigation/arm_navigation_msgs/srv/GetCollisionObjects.srv */

package ros.pkg.arm_navigation_msgs.srv;

import java.nio.ByteBuffer;


public class GetCollisionObjects extends ros.communication.Service<GetCollisionObjects.Request, GetCollisionObjects.Response> {

  public static java.lang.String __s_getDataType() { return "arm_navigation_msgs/GetCollisionObjects"; }
  public static java.lang.String __s_getMD5Sum() { return "8a4f57995c7be09c22ca01de6eb557ac"; }

  public java.lang.String getDataType() { return GetCollisionObjects.__s_getDataType(); }
  public java.lang.String getMD5Sum() { return GetCollisionObjects.__s_getMD5Sum(); }

  public GetCollisionObjects.Request createRequest() {
    return new GetCollisionObjects.Request();
  }

  public GetCollisionObjects.Response createResponse() {
    return new GetCollisionObjects.Response();
  }

static public class Request extends ros.communication.Message {

  public boolean include_points;

  public Request() {
  }

  public static java.lang.String __s_getDataType() { return "arm_navigation_msgs/GetCollisionObjectsRequest"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "3ae7288b23c84452d229e442c1673708"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getServerMD5Sum() { return "8a4f57995c7be09c22ca01de6eb557ac"; }
  public java.lang.String getServerMD5Sum() { return __s_getServerMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "\n" +
"\n" +
"\n" +
"bool include_points\n" +
"\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public Request clone() {
    Request c = new Request();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += 1; // include_points
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    bb.put((byte)(include_points ? 1 : 0));
  }

  public void deserialize(ByteBuffer bb) {
    include_points = bb.get() != 0 ? true : false;
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Request))
      return false;
    Request other = (Request) o;
    return
      include_points == other.include_points &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.include_points ? 1231 : 1237);
    return result;
  }
} // class Request

static public class Response extends ros.communication.Message {

  public ros.pkg.arm_navigation_msgs.msg.CollisionMap points = new ros.pkg.arm_navigation_msgs.msg.CollisionMap();
  public java.util.ArrayList<ros.pkg.arm_navigation_msgs.msg.CollisionObject> collision_objects = new java.util.ArrayList<ros.pkg.arm_navigation_msgs.msg.CollisionObject>();
  public java.util.ArrayList<ros.pkg.arm_navigation_msgs.msg.AttachedCollisionObject> attached_collision_objects = new java.util.ArrayList<ros.pkg.arm_navigation_msgs.msg.AttachedCollisionObject>();

  public Response() {
  }

  public static java.lang.String __s_getDataType() { return "arm_navigation_msgs/GetCollisionObjectsResponse"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "c361b849f4eb74ea667a930b0b9dc801"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getServerMD5Sum() { return "8a4f57995c7be09c22ca01de6eb557ac"; }
  public java.lang.String getServerMD5Sum() { return __s_getServerMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "\n" +
"arm_navigation_msgs/CollisionMap points\n" +
"\n" +
"arm_navigation_msgs/CollisionObject[] collision_objects\n" +
"\n" +
"arm_navigation_msgs/AttachedCollisionObject[] attached_collision_objects\n" +
"\n" +
"\n" +
"================================================================================\n" +
"MSG: arm_navigation_msgs/CollisionMap\n" +
"#header for interpreting box positions\n" +
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
"================================================================================\n" +
"MSG: arm_navigation_msgs/CollisionObject\n" +
"# a header, used for interpreting the poses\n" +
"Header header\n" +
"\n" +
"# the id of the object\n" +
"string id\n" +
"\n" +
"# The padding used for filtering points near the object.\n" +
"# This does not affect collision checking for the object.  \n" +
"# Set to negative to get zero padding.\n" +
"float32 padding\n" +
"\n" +
"#This contains what is to be done with the object\n" +
"CollisionObjectOperation operation\n" +
"\n" +
"#the shapes associated with the object\n" +
"arm_navigation_msgs/Shape[] shapes\n" +
"\n" +
"#the poses associated with the shapes - will be transformed using the header\n" +
"geometry_msgs/Pose[] poses\n" +
"\n" +
"================================================================================\n" +
"MSG: arm_navigation_msgs/CollisionObjectOperation\n" +
"#Puts the object into the environment\n" +
"#or updates the object if already added\n" +
"byte ADD=0\n" +
"\n" +
"#Removes the object from the environment entirely\n" +
"byte REMOVE=1\n" +
"\n" +
"#Only valid within the context of a CollisionAttachedObject message\n" +
"#Will be ignored if sent with an CollisionObject message\n" +
"#Takes an attached object, detaches from the attached link\n" +
"#But adds back in as regular object\n" +
"byte DETACH_AND_ADD_AS_OBJECT=2\n" +
"\n" +
"#Only valid within the context of a CollisionAttachedObject message\n" +
"#Will be ignored if sent with an CollisionObject message\n" +
"#Takes current object in the environment and removes it as\n" +
"#a regular object\n" +
"byte ATTACH_AND_REMOVE_AS_OBJECT=3\n" +
"\n" +
"# Byte code for operation\n" +
"byte operation\n" +
"\n" +
"================================================================================\n" +
"MSG: arm_navigation_msgs/Shape\n" +
"byte SPHERE=0\n" +
"byte BOX=1\n" +
"byte CYLINDER=2\n" +
"byte MESH=3\n" +
"\n" +
"byte type\n" +
"\n" +
"\n" +
"#### define sphere, box, cylinder ####\n" +
"# the origin of each shape is considered at the shape's center\n" +
"\n" +
"# for sphere\n" +
"# radius := dimensions[0]\n" +
"\n" +
"# for cylinder\n" +
"# radius := dimensions[0]\n" +
"# length := dimensions[1]\n" +
"# the length is along the Z axis\n" +
"\n" +
"# for box\n" +
"# size_x := dimensions[0]\n" +
"# size_y := dimensions[1]\n" +
"# size_z := dimensions[2]\n" +
"float64[] dimensions\n" +
"\n" +
"\n" +
"#### define mesh ####\n" +
"\n" +
"# list of triangles; triangle k is defined by tre vertices located\n" +
"# at indices triangles[3k], triangles[3k+1], triangles[3k+2]\n" +
"int32[] triangles\n" +
"geometry_msgs/Point[] vertices\n" +
"\n" +
"================================================================================\n" +
"MSG: geometry_msgs/Point\n" +
"# This contains the position of a point in free space\n" +
"float64 x\n" +
"float64 y\n" +
"float64 z\n" +
"\n" +
"================================================================================\n" +
"MSG: geometry_msgs/Pose\n" +
"# A representation of pose in free space, composed of postion and orientation. \n" +
"Point position\n" +
"Quaternion orientation\n" +
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
"================================================================================\n" +
"MSG: arm_navigation_msgs/AttachedCollisionObject\n" +
"# The CollisionObject will be attached with a fixed joint to this link\n" +
"# If link name is set to REMOVE_ALL_ATTACHED_OBJECTS and object.operation \n" +
"# is set to REMOVE will remove all attached bodies attached to any object\n" +
"string link_name\n" +
"\n" +
"#Reserved for indicating that all attached objects should be removed\n" +
"string REMOVE_ALL_ATTACHED_OBJECTS = \"all\"\n" +
"\n" +
"#This contains the actual shapes and poses for the CollisionObject\n" +
"#to be attached to the link\n" +
"#If action is remove and no object.id is set, all objects\n" +
"#attached to the link indicated by link_name will be removed\n" +
"CollisionObject object\n" +
"\n" +
"# The set of links that the attached objects are allowed to touch\n" +
"# by default - the link_name is included by default\n" +
"string[] touch_links\n" +
"\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public Response clone() {
    Response c = new Response();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += points.serializationLength();
    __l += 4;
    for(ros.pkg.arm_navigation_msgs.msg.CollisionObject val : collision_objects) {
      __l += val.serializationLength();
    }
    __l += 4;
    for(ros.pkg.arm_navigation_msgs.msg.AttachedCollisionObject val : attached_collision_objects) {
      __l += val.serializationLength();
    }
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    points.serialize(bb, seq);
    bb.putInt(collision_objects.size());
    for(ros.pkg.arm_navigation_msgs.msg.CollisionObject val : collision_objects) {
      val.serialize(bb, seq);
    }
    bb.putInt(attached_collision_objects.size());
    for(ros.pkg.arm_navigation_msgs.msg.AttachedCollisionObject val : attached_collision_objects) {
      val.serialize(bb, seq);
    }
  }

  public void deserialize(ByteBuffer bb) {
    points.deserialize(bb);

    int __collision_objects_len = bb.getInt();
    collision_objects = new java.util.ArrayList<ros.pkg.arm_navigation_msgs.msg.CollisionObject>(__collision_objects_len);
    for(int __i=0; __i<__collision_objects_len; __i++) {
      ros.pkg.arm_navigation_msgs.msg.CollisionObject __tmp = new ros.pkg.arm_navigation_msgs.msg.CollisionObject();
      __tmp.deserialize(bb);
      collision_objects.add(__tmp);;
    }

    int __attached_collision_objects_len = bb.getInt();
    attached_collision_objects = new java.util.ArrayList<ros.pkg.arm_navigation_msgs.msg.AttachedCollisionObject>(__attached_collision_objects_len);
    for(int __i=0; __i<__attached_collision_objects_len; __i++) {
      ros.pkg.arm_navigation_msgs.msg.AttachedCollisionObject __tmp = new ros.pkg.arm_navigation_msgs.msg.AttachedCollisionObject();
      __tmp.deserialize(bb);
      attached_collision_objects.add(__tmp);;
    }
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Response))
      return false;
    Response other = (Response) o;
    return
      points.equals(other.points) &&
      collision_objects.equals(other.collision_objects) &&
      attached_collision_objects.equals(other.attached_collision_objects) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.points == null ? 0 : this.points.hashCode());
    result = prime * result + (this.collision_objects == null ? 0 : this.collision_objects.hashCode());
    result = prime * result + (this.attached_collision_objects == null ? 0 : this.attached_collision_objects.hashCode());
    return result;
  }
} // class Response

} //class

