/* Auto-generated by genmsg_cpp for file /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_srvs/srv/GetEnvironmentBinaryFile.srv */
#ifndef RE_SRVS_SERVICE_GETENVIRONMENTBINARYFILE_H
#define RE_SRVS_SERVICE_GETENVIRONMENTBINARYFILE_H
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

#include "ros/service_traits.h"



#include "re_msgs/File.h"

namespace re_srvs
{
template <class ContainerAllocator>
struct GetEnvironmentBinaryFileRequest_ {
  typedef GetEnvironmentBinaryFileRequest_<ContainerAllocator> Type;

  GetEnvironmentBinaryFileRequest_()
  : envUID()
  , filename()
  {
  }

  GetEnvironmentBinaryFileRequest_(const ContainerAllocator& _alloc)
  : envUID(_alloc)
  , filename(_alloc)
  {
  }

  typedef std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  _envUID_type;
  std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  envUID;

  typedef std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  _filename_type;
  std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  filename;


  typedef boost::shared_ptr< ::re_srvs::GetEnvironmentBinaryFileRequest_<ContainerAllocator> > Ptr;
  typedef boost::shared_ptr< ::re_srvs::GetEnvironmentBinaryFileRequest_<ContainerAllocator>  const> ConstPtr;
  boost::shared_ptr<std::map<std::string, std::string> > __connection_header;
}; // struct GetEnvironmentBinaryFileRequest
typedef  ::re_srvs::GetEnvironmentBinaryFileRequest_<std::allocator<void> > GetEnvironmentBinaryFileRequest;

typedef boost::shared_ptr< ::re_srvs::GetEnvironmentBinaryFileRequest> GetEnvironmentBinaryFileRequestPtr;
typedef boost::shared_ptr< ::re_srvs::GetEnvironmentBinaryFileRequest const> GetEnvironmentBinaryFileRequestConstPtr;


template <class ContainerAllocator>
struct GetEnvironmentBinaryFileResponse_ {
  typedef GetEnvironmentBinaryFileResponse_<ContainerAllocator> Type;

  GetEnvironmentBinaryFileResponse_()
  : success(false)
  , file()
  {
  }

  GetEnvironmentBinaryFileResponse_(const ContainerAllocator& _alloc)
  : success(false)
  , file(_alloc)
  {
  }

  typedef uint8_t _success_type;
  uint8_t success;

  typedef  ::re_msgs::File_<ContainerAllocator>  _file_type;
   ::re_msgs::File_<ContainerAllocator>  file;


  typedef boost::shared_ptr< ::re_srvs::GetEnvironmentBinaryFileResponse_<ContainerAllocator> > Ptr;
  typedef boost::shared_ptr< ::re_srvs::GetEnvironmentBinaryFileResponse_<ContainerAllocator>  const> ConstPtr;
  boost::shared_ptr<std::map<std::string, std::string> > __connection_header;
}; // struct GetEnvironmentBinaryFileResponse
typedef  ::re_srvs::GetEnvironmentBinaryFileResponse_<std::allocator<void> > GetEnvironmentBinaryFileResponse;

typedef boost::shared_ptr< ::re_srvs::GetEnvironmentBinaryFileResponse> GetEnvironmentBinaryFileResponsePtr;
typedef boost::shared_ptr< ::re_srvs::GetEnvironmentBinaryFileResponse const> GetEnvironmentBinaryFileResponseConstPtr;

struct GetEnvironmentBinaryFile
{

typedef GetEnvironmentBinaryFileRequest Request;
typedef GetEnvironmentBinaryFileResponse Response;
Request request;
Response response;

typedef Request RequestType;
typedef Response ResponseType;
}; // struct GetEnvironmentBinaryFile
} // namespace re_srvs

namespace ros
{
namespace message_traits
{
template<class ContainerAllocator> struct IsMessage< ::re_srvs::GetEnvironmentBinaryFileRequest_<ContainerAllocator> > : public TrueType {};
template<class ContainerAllocator> struct IsMessage< ::re_srvs::GetEnvironmentBinaryFileRequest_<ContainerAllocator>  const> : public TrueType {};
template<class ContainerAllocator>
struct MD5Sum< ::re_srvs::GetEnvironmentBinaryFileRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "438fc866c4a0866b4f0dcf9d4e62dc23";
  }

  static const char* value(const  ::re_srvs::GetEnvironmentBinaryFileRequest_<ContainerAllocator> &) { return value(); } 
  static const uint64_t static_value1 = 0x438fc866c4a0866bULL;
  static const uint64_t static_value2 = 0x4f0dcf9d4e62dc23ULL;
};

template<class ContainerAllocator>
struct DataType< ::re_srvs::GetEnvironmentBinaryFileRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_srvs/GetEnvironmentBinaryFileRequest";
  }

  static const char* value(const  ::re_srvs::GetEnvironmentBinaryFileRequest_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct Definition< ::re_srvs::GetEnvironmentBinaryFileRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "string envUID\n\
string filename\n\
\n\
";
  }

  static const char* value(const  ::re_srvs::GetEnvironmentBinaryFileRequest_<ContainerAllocator> &) { return value(); } 
};

} // namespace message_traits
} // namespace ros


namespace ros
{
namespace message_traits
{
template<class ContainerAllocator> struct IsMessage< ::re_srvs::GetEnvironmentBinaryFileResponse_<ContainerAllocator> > : public TrueType {};
template<class ContainerAllocator> struct IsMessage< ::re_srvs::GetEnvironmentBinaryFileResponse_<ContainerAllocator>  const> : public TrueType {};
template<class ContainerAllocator>
struct MD5Sum< ::re_srvs::GetEnvironmentBinaryFileResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "561f98c4157d288cbbbd58ca0ab1e87a";
  }

  static const char* value(const  ::re_srvs::GetEnvironmentBinaryFileResponse_<ContainerAllocator> &) { return value(); } 
  static const uint64_t static_value1 = 0x561f98c4157d288cULL;
  static const uint64_t static_value2 = 0xbbbd58ca0ab1e87aULL;
};

template<class ContainerAllocator>
struct DataType< ::re_srvs::GetEnvironmentBinaryFileResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_srvs/GetEnvironmentBinaryFileResponse";
  }

  static const char* value(const  ::re_srvs::GetEnvironmentBinaryFileResponse_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct Definition< ::re_srvs::GetEnvironmentBinaryFileResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "bool success\n\
re_msgs/File file\n\
\n\
\n\
================================================================================\n\
MSG: re_msgs/File\n\
# This file representation is used to pass binary data to the RoboEarthDB.\n\
# As the endianess isn't stored, only files with a byte order mark (BOM) or\n\
# an implicitly specified endianess should be transferred.\n\
string name   # file name\n\
int8[] data   # binary data \n\
\n\
";
  }

  static const char* value(const  ::re_srvs::GetEnvironmentBinaryFileResponse_<ContainerAllocator> &) { return value(); } 
};

} // namespace message_traits
} // namespace ros

namespace ros
{
namespace serialization
{

template<class ContainerAllocator> struct Serializer< ::re_srvs::GetEnvironmentBinaryFileRequest_<ContainerAllocator> >
{
  template<typename Stream, typename T> inline static void allInOne(Stream& stream, T m)
  {
    stream.next(m.envUID);
    stream.next(m.filename);
  }

  ROS_DECLARE_ALLINONE_SERIALIZER;
}; // struct GetEnvironmentBinaryFileRequest_
} // namespace serialization
} // namespace ros


namespace ros
{
namespace serialization
{

template<class ContainerAllocator> struct Serializer< ::re_srvs::GetEnvironmentBinaryFileResponse_<ContainerAllocator> >
{
  template<typename Stream, typename T> inline static void allInOne(Stream& stream, T m)
  {
    stream.next(m.success);
    stream.next(m.file);
  }

  ROS_DECLARE_ALLINONE_SERIALIZER;
}; // struct GetEnvironmentBinaryFileResponse_
} // namespace serialization
} // namespace ros

namespace ros
{
namespace service_traits
{
template<>
struct MD5Sum<re_srvs::GetEnvironmentBinaryFile> {
  static const char* value() 
  {
    return "5ee8ef47af201972a853e50a0a644f44";
  }

  static const char* value(const re_srvs::GetEnvironmentBinaryFile&) { return value(); } 
};

template<>
struct DataType<re_srvs::GetEnvironmentBinaryFile> {
  static const char* value() 
  {
    return "re_srvs/GetEnvironmentBinaryFile";
  }

  static const char* value(const re_srvs::GetEnvironmentBinaryFile&) { return value(); } 
};

template<class ContainerAllocator>
struct MD5Sum<re_srvs::GetEnvironmentBinaryFileRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "5ee8ef47af201972a853e50a0a644f44";
  }

  static const char* value(const re_srvs::GetEnvironmentBinaryFileRequest_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct DataType<re_srvs::GetEnvironmentBinaryFileRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_srvs/GetEnvironmentBinaryFile";
  }

  static const char* value(const re_srvs::GetEnvironmentBinaryFileRequest_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct MD5Sum<re_srvs::GetEnvironmentBinaryFileResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "5ee8ef47af201972a853e50a0a644f44";
  }

  static const char* value(const re_srvs::GetEnvironmentBinaryFileResponse_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct DataType<re_srvs::GetEnvironmentBinaryFileResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_srvs/GetEnvironmentBinaryFile";
  }

  static const char* value(const re_srvs::GetEnvironmentBinaryFileResponse_<ContainerAllocator> &) { return value(); } 
};

} // namespace service_traits
} // namespace ros

#endif // RE_SRVS_SERVICE_GETENVIRONMENTBINARYFILE_H

