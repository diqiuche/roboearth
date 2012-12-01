/* Auto-generated by genmsg_cpp for file /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_srvs/srv/GetObject.srv */
#ifndef RE_SRVS_SERVICE_GETOBJECT_H
#define RE_SRVS_SERVICE_GETOBJECT_H
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




namespace re_srvs
{
template <class ContainerAllocator>
struct GetObjectRequest_ {
  typedef GetObjectRequest_<ContainerAllocator> Type;

  GetObjectRequest_()
  : objectUID()
  {
  }

  GetObjectRequest_(const ContainerAllocator& _alloc)
  : objectUID(_alloc)
  {
  }

  typedef std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  _objectUID_type;
  std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  objectUID;


  typedef boost::shared_ptr< ::re_srvs::GetObjectRequest_<ContainerAllocator> > Ptr;
  typedef boost::shared_ptr< ::re_srvs::GetObjectRequest_<ContainerAllocator>  const> ConstPtr;
  boost::shared_ptr<std::map<std::string, std::string> > __connection_header;
}; // struct GetObjectRequest
typedef  ::re_srvs::GetObjectRequest_<std::allocator<void> > GetObjectRequest;

typedef boost::shared_ptr< ::re_srvs::GetObjectRequest> GetObjectRequestPtr;
typedef boost::shared_ptr< ::re_srvs::GetObjectRequest const> GetObjectRequestConstPtr;


template <class ContainerAllocator>
struct GetObjectResponse_ {
  typedef GetObjectResponse_<ContainerAllocator> Type;

  GetObjectResponse_()
  : success(false)
  , object()
  , filenames()
  , fileURLs()
  {
  }

  GetObjectResponse_(const ContainerAllocator& _alloc)
  : success(false)
  , object(_alloc)
  , filenames(_alloc)
  , fileURLs(_alloc)
  {
  }

  typedef uint8_t _success_type;
  uint8_t success;

  typedef std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  _object_type;
  std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  object;

  typedef std::vector<std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other > , typename ContainerAllocator::template rebind<std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other > >::other >  _filenames_type;
  std::vector<std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other > , typename ContainerAllocator::template rebind<std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other > >::other >  filenames;

  typedef std::vector<std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other > , typename ContainerAllocator::template rebind<std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other > >::other >  _fileURLs_type;
  std::vector<std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other > , typename ContainerAllocator::template rebind<std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other > >::other >  fileURLs;


  typedef boost::shared_ptr< ::re_srvs::GetObjectResponse_<ContainerAllocator> > Ptr;
  typedef boost::shared_ptr< ::re_srvs::GetObjectResponse_<ContainerAllocator>  const> ConstPtr;
  boost::shared_ptr<std::map<std::string, std::string> > __connection_header;
}; // struct GetObjectResponse
typedef  ::re_srvs::GetObjectResponse_<std::allocator<void> > GetObjectResponse;

typedef boost::shared_ptr< ::re_srvs::GetObjectResponse> GetObjectResponsePtr;
typedef boost::shared_ptr< ::re_srvs::GetObjectResponse const> GetObjectResponseConstPtr;

struct GetObject
{

typedef GetObjectRequest Request;
typedef GetObjectResponse Response;
Request request;
Response response;

typedef Request RequestType;
typedef Response ResponseType;
}; // struct GetObject
} // namespace re_srvs

namespace ros
{
namespace message_traits
{
template<class ContainerAllocator> struct IsMessage< ::re_srvs::GetObjectRequest_<ContainerAllocator> > : public TrueType {};
template<class ContainerAllocator> struct IsMessage< ::re_srvs::GetObjectRequest_<ContainerAllocator>  const> : public TrueType {};
template<class ContainerAllocator>
struct MD5Sum< ::re_srvs::GetObjectRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "fa53b074fd40f64f804894a103901a6d";
  }

  static const char* value(const  ::re_srvs::GetObjectRequest_<ContainerAllocator> &) { return value(); } 
  static const uint64_t static_value1 = 0xfa53b074fd40f64fULL;
  static const uint64_t static_value2 = 0x804894a103901a6dULL;
};

template<class ContainerAllocator>
struct DataType< ::re_srvs::GetObjectRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_srvs/GetObjectRequest";
  }

  static const char* value(const  ::re_srvs::GetObjectRequest_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct Definition< ::re_srvs::GetObjectRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "string objectUID\n\
\n\
";
  }

  static const char* value(const  ::re_srvs::GetObjectRequest_<ContainerAllocator> &) { return value(); } 
};

} // namespace message_traits
} // namespace ros


namespace ros
{
namespace message_traits
{
template<class ContainerAllocator> struct IsMessage< ::re_srvs::GetObjectResponse_<ContainerAllocator> > : public TrueType {};
template<class ContainerAllocator> struct IsMessage< ::re_srvs::GetObjectResponse_<ContainerAllocator>  const> : public TrueType {};
template<class ContainerAllocator>
struct MD5Sum< ::re_srvs::GetObjectResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "6680bd0894926a783607f6ad55eea3dc";
  }

  static const char* value(const  ::re_srvs::GetObjectResponse_<ContainerAllocator> &) { return value(); } 
  static const uint64_t static_value1 = 0x6680bd0894926a78ULL;
  static const uint64_t static_value2 = 0x3607f6ad55eea3dcULL;
};

template<class ContainerAllocator>
struct DataType< ::re_srvs::GetObjectResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_srvs/GetObjectResponse";
  }

  static const char* value(const  ::re_srvs::GetObjectResponse_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct Definition< ::re_srvs::GetObjectResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "bool success\n\
string object\n\
string[] filenames\n\
string[] fileURLs\n\
\n\
\n\
";
  }

  static const char* value(const  ::re_srvs::GetObjectResponse_<ContainerAllocator> &) { return value(); } 
};

} // namespace message_traits
} // namespace ros

namespace ros
{
namespace serialization
{

template<class ContainerAllocator> struct Serializer< ::re_srvs::GetObjectRequest_<ContainerAllocator> >
{
  template<typename Stream, typename T> inline static void allInOne(Stream& stream, T m)
  {
    stream.next(m.objectUID);
  }

  ROS_DECLARE_ALLINONE_SERIALIZER;
}; // struct GetObjectRequest_
} // namespace serialization
} // namespace ros


namespace ros
{
namespace serialization
{

template<class ContainerAllocator> struct Serializer< ::re_srvs::GetObjectResponse_<ContainerAllocator> >
{
  template<typename Stream, typename T> inline static void allInOne(Stream& stream, T m)
  {
    stream.next(m.success);
    stream.next(m.object);
    stream.next(m.filenames);
    stream.next(m.fileURLs);
  }

  ROS_DECLARE_ALLINONE_SERIALIZER;
}; // struct GetObjectResponse_
} // namespace serialization
} // namespace ros

namespace ros
{
namespace service_traits
{
template<>
struct MD5Sum<re_srvs::GetObject> {
  static const char* value() 
  {
    return "6fb904ebd7c4b2123383460b1386ddc5";
  }

  static const char* value(const re_srvs::GetObject&) { return value(); } 
};

template<>
struct DataType<re_srvs::GetObject> {
  static const char* value() 
  {
    return "re_srvs/GetObject";
  }

  static const char* value(const re_srvs::GetObject&) { return value(); } 
};

template<class ContainerAllocator>
struct MD5Sum<re_srvs::GetObjectRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "6fb904ebd7c4b2123383460b1386ddc5";
  }

  static const char* value(const re_srvs::GetObjectRequest_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct DataType<re_srvs::GetObjectRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_srvs/GetObject";
  }

  static const char* value(const re_srvs::GetObjectRequest_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct MD5Sum<re_srvs::GetObjectResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "6fb904ebd7c4b2123383460b1386ddc5";
  }

  static const char* value(const re_srvs::GetObjectResponse_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct DataType<re_srvs::GetObjectResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_srvs/GetObject";
  }

  static const char* value(const re_srvs::GetObjectResponse_<ContainerAllocator> &) { return value(); } 
};

} // namespace service_traits
} // namespace ros

#endif // RE_SRVS_SERVICE_GETOBJECT_H

