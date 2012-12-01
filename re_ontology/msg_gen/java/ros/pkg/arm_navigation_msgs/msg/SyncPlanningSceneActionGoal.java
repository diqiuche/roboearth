/* Auto-generated by genmsg_java.py for file /opt/ros/fuerte/stacks/arm_navigation/arm_navigation_msgs/msg/SyncPlanningSceneActionGoal.msg */

package ros.pkg.arm_navigation_msgs.msg;

import java.nio.ByteBuffer;

public class SyncPlanningSceneActionGoal extends ros.communication.Message {

  public ros.pkg.std_msgs.msg.Header header = new ros.pkg.std_msgs.msg.Header();
  public ros.pkg.actionlib_msgs.msg.GoalID goal_id = new ros.pkg.actionlib_msgs.msg.GoalID();
  public ros.pkg.arm_navigation_msgs.msg.SyncPlanningSceneGoal goal = new ros.pkg.arm_navigation_msgs.msg.SyncPlanningSceneGoal();

  public SyncPlanningSceneActionGoal() {
  }

  public static java.lang.String __s_getDataType() { return "arm_navigation_msgs/SyncPlanningSceneActionGoal"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "d841beb927266bf620ac574e2b28ec55"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\n" +
"\n" +
"Header header\n" +
"actionlib_msgs/GoalID goal_id\n" +
"SyncPlanningSceneGoal goal\n" +
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
"MSG: actionlib_msgs/GoalID\n" +
"# The stamp should store the time at which this goal was requested.\n" +
"# It is used by an action server when it tries to preempt all\n" +
"# goals that were requested before a certain time\n" +
"time stamp\n" +
"\n" +
"# The id provides a way to associate feedback and\n" +
"# result message with specific goal requests. The id\n" +
"# specified must be unique.\n" +
"string id\n" +
"\n" +
"\n" +
"================================================================================\n" +
"MSG: arm_navigation_msgs/SyncPlanningSceneGoal\n" +
"# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\n" +
"# THIS MESSAGE IS FOR INTERNAL COMMUNICATION BETWEEN\n" +
"# PLANNING ENVIRONMENT COMPONENTS ONLY\n" +
"\n" +
"#Full planning scene\n" +
"PlanningScene planning_scene\n" +
"\n" +
"================================================================================\n" +
"MSG: arm_navigation_msgs/PlanningScene\n" +
"#full robot state\n" +
"arm_navigation_msgs/RobotState robot_state\n" +
"\n" +
"#additional frames for duplicating tf\n" +
"geometry_msgs/TransformStamped[] fixed_frame_transforms\n" +
"\n" +
"#full allowed collision matrix\n" +
"AllowedCollisionMatrix allowed_collision_matrix\n" +
"\n" +
"#allowed contacts\n" +
"arm_navigation_msgs/AllowedContactSpecification[] allowed_contacts\n" +
"\n" +
"#all link paddings\n" +
"arm_navigation_msgs/LinkPadding[] link_padding\n" +
"\n" +
"#collision objects\n" +
"arm_navigation_msgs/CollisionObject[] collision_objects\n" +
"arm_navigation_msgs/AttachedCollisionObject[] attached_collision_objects\n" +
"\n" +
"#the collision map\n" +
"arm_navigation_msgs/CollisionMap collision_map\n" +
"\n" +
"================================================================================\n" +
"MSG: arm_navigation_msgs/RobotState\n" +
"# This message contains information about the robot state, i.e. the positions of its joints and links\n" +
"sensor_msgs/JointState joint_state\n" +
"arm_navigation_msgs/MultiDOFJointState multi_dof_joint_state\n" +
"\n" +
"================================================================================\n" +
"MSG: sensor_msgs/JointState\n" +
"# This is a message that holds data to describe the state of a set of torque controlled joints. \n" +
"#\n" +
"# The state of each joint (revolute or prismatic) is defined by:\n" +
"#  * the position of the joint (rad or m),\n" +
"#  * the velocity of the joint (rad/s or m/s) and \n" +
"#  * the effort that is applied in the joint (Nm or N).\n" +
"#\n" +
"# Each joint is uniquely identified by its name\n" +
"# The header specifies the time at which the joint states were recorded. All the joint states\n" +
"# in one message have to be recorded at the same time.\n" +
"#\n" +
"# This message consists of a multiple arrays, one for each part of the joint state. \n" +
"# The goal is to make each of the fields optional. When e.g. your joints have no\n" +
"# effort associated with them, you can leave the effort array empty. \n" +
"#\n" +
"# All arrays in this message should have the same size, or be empty.\n" +
"# This is the only way to uniquely associate the joint name with the correct\n" +
"# states.\n" +
"\n" +
"\n" +
"Header header\n" +
"\n" +
"string[] name\n" +
"float64[] position\n" +
"float64[] velocity\n" +
"float64[] effort\n" +
"\n" +
"================================================================================\n" +
"MSG: arm_navigation_msgs/MultiDOFJointState\n" +
"#A representation of a multi-dof joint state\n" +
"time stamp\n" +
"string[] joint_names\n" +
"string[] frame_ids\n" +
"string[] child_frame_ids\n" +
"geometry_msgs/Pose[] poses\n" +
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
"================================================================================\n" +
"MSG: geometry_msgs/TransformStamped\n" +
"# This expresses a transform from coordinate frame header.frame_id\n" +
"# to the coordinate frame child_frame_id\n" +
"#\n" +
"# This message is mostly used by the \n" +
"# <a href=\"http://www.ros.org/wiki/tf\">tf</a> package. \n" +
"# See it's documentation for more information.\n" +
"\n" +
"Header header\n" +
"string child_frame_id # the frame id of the child frame\n" +
"Transform transform\n" +
"\n" +
"================================================================================\n" +
"MSG: geometry_msgs/Transform\n" +
"# This represents the transform between two coordinate frames in free space.\n" +
"\n" +
"Vector3 translation\n" +
"Quaternion rotation\n" +
"\n" +
"================================================================================\n" +
"MSG: geometry_msgs/Vector3\n" +
"# This represents a vector in free space. \n" +
"\n" +
"float64 x\n" +
"float64 y\n" +
"float64 z\n" +
"================================================================================\n" +
"MSG: arm_navigation_msgs/AllowedCollisionMatrix\n" +
"# the list of link names in the matrix\n" +
"string[] link_names\n" +
"\n" +
"# the individual entries in the allowed collision matrix\n" +
"# symmetric, with same order as link_names\n" +
"AllowedCollisionEntry[] entries\n" +
"\n" +
"================================================================================\n" +
"MSG: arm_navigation_msgs/AllowedCollisionEntry\n" +
"# whether or not collision checking is enabled\n" +
"bool[] enabled\n" +
"\n" +
"================================================================================\n" +
"MSG: arm_navigation_msgs/AllowedContactSpecification\n" +
"# The names of the regions\n" +
"string name\n" +
"\n" +
"# The shape of the region in the environment\n" +
"arm_navigation_msgs/Shape shape\n" +
"\n" +
"# The pose of the space defining the region\n" +
"geometry_msgs/PoseStamped pose_stamped\n" +
"\n" +
"# The set of links that will be allowed to have penetration contact within this region\n" +
"string[] link_names\n" +
"\n" +
"# The maximum penetration depth allowed for every link\n" +
"float64 penetration_depth\n" +
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
"MSG: geometry_msgs/PoseStamped\n" +
"# A Pose with reference coordinate frame and timestamp\n" +
"Header header\n" +
"Pose pose\n" +
"\n" +
"================================================================================\n" +
"MSG: arm_navigation_msgs/LinkPadding\n" +
"#name for the link\n" +
"string link_name\n" +
"\n" +
"# padding to apply to the link\n" +
"float64 padding\n" +
"\n" +
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
"================================================================================\n" +
"MSG: arm_navigation_msgs/CollisionMap\n" +
"#header for interpreting box positions\n" +
"Header header\n" +
"\n" +
"#boxes for use in collision testing\n" +
"OrientedBoundingBox[] boxes\n" +
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

  public SyncPlanningSceneActionGoal clone() {
    SyncPlanningSceneActionGoal c = new SyncPlanningSceneActionGoal();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += header.serializationLength();
    __l += goal_id.serializationLength();
    __l += goal.serializationLength();
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    header.serialize(bb, seq);
    goal_id.serialize(bb, seq);
    goal.serialize(bb, seq);
  }

  public void deserialize(ByteBuffer bb) {
    header.deserialize(bb);
    goal_id.deserialize(bb);
    goal.deserialize(bb);
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof SyncPlanningSceneActionGoal))
      return false;
    SyncPlanningSceneActionGoal other = (SyncPlanningSceneActionGoal) o;
    return
      header.equals(other.header) &&
      goal_id.equals(other.goal_id) &&
      goal.equals(other.goal) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.header == null ? 0 : this.header.hashCode());
    result = prime * result + (this.goal_id == null ? 0 : this.goal_id.hashCode());
    result = prime * result + (this.goal == null ? 0 : this.goal.hashCode());
    return result;
  }
} // class SyncPlanningSceneActionGoal

