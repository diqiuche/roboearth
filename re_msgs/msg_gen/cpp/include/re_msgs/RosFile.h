/* Auto-generated by genmsg_cpp for file /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_msgs/msg/RosFile.msg */
#ifndef RE_MSGS_MESSAGE_ROSFILE_H
#define RE_MSGS_MESSAGE_ROSFILE_H
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


namespace re_msgs
{
template <class ContainerAllocator>
struct RosFile_ {
  typedef RosFile_<ContainerAllocator> Type;

  RosFile_()
  : name()
  , data()
  {
  }

  RosFile_(const ContainerAllocator& _alloc)
  : name(_alloc)
  , data(_alloc)
  {
  }

  typedef std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  _name_type;
  std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  name;

  typedef std::vector<int8_t, typename ContainerAllocator::template rebind<int8_t>::other >  _data_type;
  std::vector<int8_t, typename ContainerAllocator::template rebind<int8_t>::other >  data;


  typedef boost::shared_ptr< ::re_msgs::RosFile_<ContainerAllocator> > Ptr;
  typedef boost::shared_ptr< ::re_msgs::RosFile_<ContainerAllocator>  const> ConstPtr;
  boost::shared_ptr<std::map<std::string, std::string> > __connection_header;
}; // struct RosFile
typedef  ::re_msgs::RosFile_<std::allocator<void> > RosFile;

typedef boost::shared_ptr< ::re_msgs::RosFile> RosFilePtr;
typedef boost::shared_ptr< ::re_msgs::RosFile const> RosFileConstPtr;


template<typename ContainerAllocator>
std::ostream& operator<<(std::ostream& s, const  ::re_msgs::RosFile_<ContainerAllocator> & v)
{
  ros::message_operations::Printer< ::re_msgs::RosFile_<ContainerAllocator> >::stream(s, "", v);
  return s;}

} // namespace re_msgs

namespace ros
{
namespace message_traits
{
template<class ContainerAllocator> struct IsMessage< ::re_msgs::RosFile_<ContainerAllocator> > : public TrueType {};
template<class ContainerAllocator> struct IsMessage< ::re_msgs::RosFile_<ContainerAllocator>  const> : public TrueType {};
template<class ContainerAllocator>
struct MD5Sum< ::re_msgs::RosFile_<ContainerAllocator> > {
  static const char* value() 
  {
    return "893fbfd6413e9fa51a46d64705c3b6c3";
  }

  static const char* value(const  ::re_msgs::RosFile_<ContainerAllocator> &) { return value(); } 
  static const uint64_t static_value1 = 0x893fbfd6413e9fa5ULL;
  static const uint64_t static_value2 = 0x1a46d64705c3b6c3ULL;
};

template<class ContainerAllocator>
struct DataType< ::re_msgs::RosFile_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_msgs/RosFile";
  }

  static const char* value(const  ::re_msgs::RosFile_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct Definition< ::re_msgs::RosFile_<ContainerAllocator> > {
  static const char* value() 
  {
    return "# This file representation is used to pass binary data to the RoboEarthDB.\n\
# As the endianess isn't stored, only files with a byte order mark (BOM) or\n\
# an implicitly specified endianess should be transferred.\n\
string name   # file name\n\
int8[] data   # binary data \n\
\n\
";
  }

  static const char* value(const  ::re_msgs::RosFile_<ContainerAllocator> &) { return value(); } 
};

} // namespace message_traits
} // namespace ros

namespace ros
{
namespace serialization
{

template<class ContainerAllocator> struct Serializer< ::re_msgs::RosFile_<ContainerAllocator> >
{
  template<typename Stream, typename T> inline static void allInOne(Stream& stream, T m)
  {
    stream.next(m.name);
    stream.next(m.data);
  }

  ROS_DECLARE_ALLINONE_SERIALIZER;
}; // struct RosFile_
} // namespace serialization
} // namespace ros

namespace ros
{
namespace message_operations
{

template<class ContainerAllocator>
struct Printer< ::re_msgs::RosFile_<ContainerAllocator> >
{
  template<typename Stream> static void stream(Stream& s, const std::string& indent, const  ::re_msgs::RosFile_<ContainerAllocator> & v) 
  {
    s << indent << "name: ";
    Printer<std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other > >::stream(s, indent + "  ", v.name);
    s << indent << "data[]" << std::endl;
    for (size_t i = 0; i < v.data.size(); ++i)
    {
      s << indent << "  data[" << i << "]: ";
      Printer<int8_t>::stream(s, indent + "  ", v.data[i]);
    }
  }
};


} // namespace message_operations
} // namespace ros

#endif // RE_MSGS_MESSAGE_ROSFILE_H

