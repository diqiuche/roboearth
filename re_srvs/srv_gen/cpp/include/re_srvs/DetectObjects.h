/* Auto-generated by genmsg_cpp for file /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_srvs/srv/DetectObjects.srv */
#ifndef RE_SRVS_SERVICE_DETECTOBJECTS_H
#define RE_SRVS_SERVICE_DETECTOBJECTS_H
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
struct DetectObjectsRequest_ {
  typedef DetectObjectsRequest_<ContainerAllocator> Type;

  DetectObjectsRequest_()
  : uids()
  {
  }

  DetectObjectsRequest_(const ContainerAllocator& _alloc)
  : uids(_alloc)
  {
  }

  typedef std::vector<std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other > , typename ContainerAllocator::template rebind<std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other > >::other >  _uids_type;
  std::vector<std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other > , typename ContainerAllocator::template rebind<std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other > >::other >  uids;


  typedef boost::shared_ptr< ::re_srvs::DetectObjectsRequest_<ContainerAllocator> > Ptr;
  typedef boost::shared_ptr< ::re_srvs::DetectObjectsRequest_<ContainerAllocator>  const> ConstPtr;
  boost::shared_ptr<std::map<std::string, std::string> > __connection_header;
}; // struct DetectObjectsRequest
typedef  ::re_srvs::DetectObjectsRequest_<std::allocator<void> > DetectObjectsRequest;

typedef boost::shared_ptr< ::re_srvs::DetectObjectsRequest> DetectObjectsRequestPtr;
typedef boost::shared_ptr< ::re_srvs::DetectObjectsRequest const> DetectObjectsRequestConstPtr;


template <class ContainerAllocator>
struct DetectObjectsResponse_ {
  typedef DetectObjectsResponse_<ContainerAllocator> Type;

  DetectObjectsResponse_()
  : detectableUIDs()
  {
  }

  DetectObjectsResponse_(const ContainerAllocator& _alloc)
  : detectableUIDs(_alloc)
  {
  }

  typedef std::vector<std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other > , typename ContainerAllocator::template rebind<std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other > >::other >  _detectableUIDs_type;
  std::vector<std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other > , typename ContainerAllocator::template rebind<std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other > >::other >  detectableUIDs;


  typedef boost::shared_ptr< ::re_srvs::DetectObjectsResponse_<ContainerAllocator> > Ptr;
  typedef boost::shared_ptr< ::re_srvs::DetectObjectsResponse_<ContainerAllocator>  const> ConstPtr;
  boost::shared_ptr<std::map<std::string, std::string> > __connection_header;
}; // struct DetectObjectsResponse
typedef  ::re_srvs::DetectObjectsResponse_<std::allocator<void> > DetectObjectsResponse;

typedef boost::shared_ptr< ::re_srvs::DetectObjectsResponse> DetectObjectsResponsePtr;
typedef boost::shared_ptr< ::re_srvs::DetectObjectsResponse const> DetectObjectsResponseConstPtr;

struct DetectObjects
{

typedef DetectObjectsRequest Request;
typedef DetectObjectsResponse Response;
Request request;
Response response;

typedef Request RequestType;
typedef Response ResponseType;
}; // struct DetectObjects
} // namespace re_srvs

namespace ros
{
namespace message_traits
{
template<class ContainerAllocator> struct IsMessage< ::re_srvs::DetectObjectsRequest_<ContainerAllocator> > : public TrueType {};
template<class ContainerAllocator> struct IsMessage< ::re_srvs::DetectObjectsRequest_<ContainerAllocator>  const> : public TrueType {};
template<class ContainerAllocator>
struct MD5Sum< ::re_srvs::DetectObjectsRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "f2f2e3485c4c49aa895ae6d90a73649b";
  }

  static const char* value(const  ::re_srvs::DetectObjectsRequest_<ContainerAllocator> &) { return value(); } 
  static const uint64_t static_value1 = 0xf2f2e3485c4c49aaULL;
  static const uint64_t static_value2 = 0x895ae6d90a73649bULL;
};

template<class ContainerAllocator>
struct DataType< ::re_srvs::DetectObjectsRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_srvs/DetectObjectsRequest";
  }

  static const char* value(const  ::re_srvs::DetectObjectsRequest_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct Definition< ::re_srvs::DetectObjectsRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "\n\
\n\
string[] uids\n\
\n\
";
  }

  static const char* value(const  ::re_srvs::DetectObjectsRequest_<ContainerAllocator> &) { return value(); } 
};

} // namespace message_traits
} // namespace ros


namespace ros
{
namespace message_traits
{
template<class ContainerAllocator> struct IsMessage< ::re_srvs::DetectObjectsResponse_<ContainerAllocator> > : public TrueType {};
template<class ContainerAllocator> struct IsMessage< ::re_srvs::DetectObjectsResponse_<ContainerAllocator>  const> : public TrueType {};
template<class ContainerAllocator>
struct MD5Sum< ::re_srvs::DetectObjectsResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "222138c99add27c7446706fe8a724bc6";
  }

  static const char* value(const  ::re_srvs::DetectObjectsResponse_<ContainerAllocator> &) { return value(); } 
  static const uint64_t static_value1 = 0x222138c99add27c7ULL;
  static const uint64_t static_value2 = 0x446706fe8a724bc6ULL;
};

template<class ContainerAllocator>
struct DataType< ::re_srvs::DetectObjectsResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_srvs/DetectObjectsResponse";
  }

  static const char* value(const  ::re_srvs::DetectObjectsResponse_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct Definition< ::re_srvs::DetectObjectsResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "string[] detectableUIDs\n\
\n\
\n\
\n\
";
  }

  static const char* value(const  ::re_srvs::DetectObjectsResponse_<ContainerAllocator> &) { return value(); } 
};

} // namespace message_traits
} // namespace ros

namespace ros
{
namespace serialization
{

template<class ContainerAllocator> struct Serializer< ::re_srvs::DetectObjectsRequest_<ContainerAllocator> >
{
  template<typename Stream, typename T> inline static void allInOne(Stream& stream, T m)
  {
    stream.next(m.uids);
  }

  ROS_DECLARE_ALLINONE_SERIALIZER;
}; // struct DetectObjectsRequest_
} // namespace serialization
} // namespace ros


namespace ros
{
namespace serialization
{

template<class ContainerAllocator> struct Serializer< ::re_srvs::DetectObjectsResponse_<ContainerAllocator> >
{
  template<typename Stream, typename T> inline static void allInOne(Stream& stream, T m)
  {
    stream.next(m.detectableUIDs);
  }

  ROS_DECLARE_ALLINONE_SERIALIZER;
}; // struct DetectObjectsResponse_
} // namespace serialization
} // namespace ros

namespace ros
{
namespace service_traits
{
template<>
struct MD5Sum<re_srvs::DetectObjects> {
  static const char* value() 
  {
    return "8521e6e6a78bb6612fbdd6cf68737d7b";
  }

  static const char* value(const re_srvs::DetectObjects&) { return value(); } 
};

template<>
struct DataType<re_srvs::DetectObjects> {
  static const char* value() 
  {
    return "re_srvs/DetectObjects";
  }

  static const char* value(const re_srvs::DetectObjects&) { return value(); } 
};

template<class ContainerAllocator>
struct MD5Sum<re_srvs::DetectObjectsRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "8521e6e6a78bb6612fbdd6cf68737d7b";
  }

  static const char* value(const re_srvs::DetectObjectsRequest_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct DataType<re_srvs::DetectObjectsRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_srvs/DetectObjects";
  }

  static const char* value(const re_srvs::DetectObjectsRequest_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct MD5Sum<re_srvs::DetectObjectsResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "8521e6e6a78bb6612fbdd6cf68737d7b";
  }

  static const char* value(const re_srvs::DetectObjectsResponse_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct DataType<re_srvs::DetectObjectsResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_srvs/DetectObjects";
  }

  static const char* value(const re_srvs::DetectObjectsResponse_<ContainerAllocator> &) { return value(); } 
};

} // namespace service_traits
} // namespace ros

#endif // RE_SRVS_SERVICE_DETECTOBJECTS_H

