/* Auto-generated by genmsg_cpp for file /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_msgs/msg/SeenObject.msg */
#ifndef RE_MSGS_MESSAGE_SEENOBJECT_H
#define RE_MSGS_MESSAGE_SEENOBJECT_H
#include <string>
#include <vector>
#include <map>
#include <ostream>
#include "ros/serialization.h"
#include "ros/builtin_message_traits.h"
#include "ros/message_operations.h"
#include "ros/time.h"

#include "ros/macros.h"

#include "ros/assert.h"

#include "geometry_msgs/Pose.h"

namespace re_msgs
{
template <class ContainerAllocator>
struct SeenObject_ {
  typedef SeenObject_<ContainerAllocator> Type;

  SeenObject_()
  : stamp()
  , name()
  , pose()
  {
  }

  SeenObject_(const ContainerAllocator& _alloc)
  : stamp()
  , name(_alloc)
  , pose(_alloc)
  {
  }

  typedef ros::Time _stamp_type;
  ros::Time stamp;

  typedef std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  _name_type;
  std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  name;

  typedef  ::geometry_msgs::Pose_<ContainerAllocator>  _pose_type;
   ::geometry_msgs::Pose_<ContainerAllocator>  pose;


  typedef boost::shared_ptr< ::re_msgs::SeenObject_<ContainerAllocator> > Ptr;
  typedef boost::shared_ptr< ::re_msgs::SeenObject_<ContainerAllocator>  const> ConstPtr;
  boost::shared_ptr<std::map<std::string, std::string> > __connection_header;
}; // struct SeenObject
typedef  ::re_msgs::SeenObject_<std::allocator<void> > SeenObject;

typedef boost::shared_ptr< ::re_msgs::SeenObject> SeenObjectPtr;
typedef boost::shared_ptr< ::re_msgs::SeenObject const> SeenObjectConstPtr;


template<typename ContainerAllocator>
std::ostream& operator<<(std::ostream& s, const  ::re_msgs::SeenObject_<ContainerAllocator> & v)
{
  ros::message_operations::Printer< ::re_msgs::SeenObject_<ContainerAllocator> >::stream(s, "", v);
  return s;}

} // namespace re_msgs

namespace ros
{
namespace message_traits
{
template<class ContainerAllocator> struct IsMessage< ::re_msgs::SeenObject_<ContainerAllocator> > : public TrueType {};
template<class ContainerAllocator> struct IsMessage< ::re_msgs::SeenObject_<ContainerAllocator>  const> : public TrueType {};
template<class ContainerAllocator>
struct MD5Sum< ::re_msgs::SeenObject_<ContainerAllocator> > {
  static const char* value() 
  {
    return "9d793db59f53f1c133df1a2136f9483a";
  }

  static const char* value(const  ::re_msgs::SeenObject_<ContainerAllocator> &) { return value(); } 
  static const uint64_t static_value1 = 0x9d793db59f53f1c1ULL;
  static const uint64_t static_value2 = 0x33df1a2136f9483aULL;
};

template<class ContainerAllocator>
struct DataType< ::re_msgs::SeenObject_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_msgs/SeenObject";
  }

  static const char* value(const  ::re_msgs::SeenObject_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct Definition< ::re_msgs::SeenObject_<ContainerAllocator> > {
  static const char* value() 
  {
    return "#This represents a Object\n\
time stamp\n\
string name\n\
geometry_msgs/Pose pose\n\
\n\
================================================================================\n\
MSG: geometry_msgs/Pose\n\
# A representation of pose in free space, composed of postion and orientation. \n\
Point position\n\
Quaternion orientation\n\
\n\
================================================================================\n\
MSG: geometry_msgs/Point\n\
# This contains the position of a point in free space\n\
float64 x\n\
float64 y\n\
float64 z\n\
\n\
================================================================================\n\
MSG: geometry_msgs/Quaternion\n\
# This represents an orientation in free space in quaternion form.\n\
\n\
float64 x\n\
float64 y\n\
float64 z\n\
float64 w\n\
\n\
";
  }

  static const char* value(const  ::re_msgs::SeenObject_<ContainerAllocator> &) { return value(); } 
};

} // namespace message_traits
} // namespace ros

namespace ros
{
namespace serialization
{

template<class ContainerAllocator> struct Serializer< ::re_msgs::SeenObject_<ContainerAllocator> >
{
  template<typename Stream, typename T> inline static void allInOne(Stream& stream, T m)
  {
    stream.next(m.stamp);
    stream.next(m.name);
    stream.next(m.pose);
  }

  ROS_DECLARE_ALLINONE_SERIALIZER;
}; // struct SeenObject_
} // namespace serialization
} // namespace ros

namespace ros
{
namespace message_operations
{

template<class ContainerAllocator>
struct Printer< ::re_msgs::SeenObject_<ContainerAllocator> >
{
  template<typename Stream> static void stream(Stream& s, const std::string& indent, const  ::re_msgs::SeenObject_<ContainerAllocator> & v) 
  {
    s << indent << "stamp: ";
    Printer<ros::Time>::stream(s, indent + "  ", v.stamp);
    s << indent << "name: ";
    Printer<std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other > >::stream(s, indent + "  ", v.name);
    s << indent << "pose: ";
s << std::endl;
    Printer< ::geometry_msgs::Pose_<ContainerAllocator> >::stream(s, indent + "  ", v.pose);
  }
};


} // namespace message_operations
} // namespace ros

#endif // RE_MSGS_MESSAGE_SEENOBJECT_H

