/* Auto-generated by genmsg_cpp for file /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_srvs/srv/QueryObjects.srv */
#ifndef RE_SRVS_SERVICE_QUERYOBJECTS_H
#define RE_SRVS_SERVICE_QUERYOBJECTS_H
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
struct QueryObjectsRequest_ {
  typedef QueryObjectsRequest_<ContainerAllocator> Type;

  QueryObjectsRequest_()
  : query()
  {
  }

  QueryObjectsRequest_(const ContainerAllocator& _alloc)
  : query(_alloc)
  {
  }

  typedef std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  _query_type;
  std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  query;


  typedef boost::shared_ptr< ::re_srvs::QueryObjectsRequest_<ContainerAllocator> > Ptr;
  typedef boost::shared_ptr< ::re_srvs::QueryObjectsRequest_<ContainerAllocator>  const> ConstPtr;
  boost::shared_ptr<std::map<std::string, std::string> > __connection_header;
}; // struct QueryObjectsRequest
typedef  ::re_srvs::QueryObjectsRequest_<std::allocator<void> > QueryObjectsRequest;

typedef boost::shared_ptr< ::re_srvs::QueryObjectsRequest> QueryObjectsRequestPtr;
typedef boost::shared_ptr< ::re_srvs::QueryObjectsRequest const> QueryObjectsRequestConstPtr;


template <class ContainerAllocator>
struct QueryObjectsResponse_ {
  typedef QueryObjectsResponse_<ContainerAllocator> Type;

  QueryObjectsResponse_()
  : result()
  {
  }

  QueryObjectsResponse_(const ContainerAllocator& _alloc)
  : result(_alloc)
  {
  }

  typedef std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  _result_type;
  std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  result;


  typedef boost::shared_ptr< ::re_srvs::QueryObjectsResponse_<ContainerAllocator> > Ptr;
  typedef boost::shared_ptr< ::re_srvs::QueryObjectsResponse_<ContainerAllocator>  const> ConstPtr;
  boost::shared_ptr<std::map<std::string, std::string> > __connection_header;
}; // struct QueryObjectsResponse
typedef  ::re_srvs::QueryObjectsResponse_<std::allocator<void> > QueryObjectsResponse;

typedef boost::shared_ptr< ::re_srvs::QueryObjectsResponse> QueryObjectsResponsePtr;
typedef boost::shared_ptr< ::re_srvs::QueryObjectsResponse const> QueryObjectsResponseConstPtr;

struct QueryObjects
{

typedef QueryObjectsRequest Request;
typedef QueryObjectsResponse Response;
Request request;
Response response;

typedef Request RequestType;
typedef Response ResponseType;
}; // struct QueryObjects
} // namespace re_srvs

namespace ros
{
namespace message_traits
{
template<class ContainerAllocator> struct IsMessage< ::re_srvs::QueryObjectsRequest_<ContainerAllocator> > : public TrueType {};
template<class ContainerAllocator> struct IsMessage< ::re_srvs::QueryObjectsRequest_<ContainerAllocator>  const> : public TrueType {};
template<class ContainerAllocator>
struct MD5Sum< ::re_srvs::QueryObjectsRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "6490a46152f373285fe18f491ed93702";
  }

  static const char* value(const  ::re_srvs::QueryObjectsRequest_<ContainerAllocator> &) { return value(); } 
  static const uint64_t static_value1 = 0x6490a46152f37328ULL;
  static const uint64_t static_value2 = 0x5fe18f491ed93702ULL;
};

template<class ContainerAllocator>
struct DataType< ::re_srvs::QueryObjectsRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_srvs/QueryObjectsRequest";
  }

  static const char* value(const  ::re_srvs::QueryObjectsRequest_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct Definition< ::re_srvs::QueryObjectsRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "string query\n\
\n\
";
  }

  static const char* value(const  ::re_srvs::QueryObjectsRequest_<ContainerAllocator> &) { return value(); } 
};

} // namespace message_traits
} // namespace ros


namespace ros
{
namespace message_traits
{
template<class ContainerAllocator> struct IsMessage< ::re_srvs::QueryObjectsResponse_<ContainerAllocator> > : public TrueType {};
template<class ContainerAllocator> struct IsMessage< ::re_srvs::QueryObjectsResponse_<ContainerAllocator>  const> : public TrueType {};
template<class ContainerAllocator>
struct MD5Sum< ::re_srvs::QueryObjectsResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "c22f2a1ed8654a0b365f1bb3f7ff2c0f";
  }

  static const char* value(const  ::re_srvs::QueryObjectsResponse_<ContainerAllocator> &) { return value(); } 
  static const uint64_t static_value1 = 0xc22f2a1ed8654a0bULL;
  static const uint64_t static_value2 = 0x365f1bb3f7ff2c0fULL;
};

template<class ContainerAllocator>
struct DataType< ::re_srvs::QueryObjectsResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_srvs/QueryObjectsResponse";
  }

  static const char* value(const  ::re_srvs::QueryObjectsResponse_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct Definition< ::re_srvs::QueryObjectsResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "string result\n\
\n\
\n\
";
  }

  static const char* value(const  ::re_srvs::QueryObjectsResponse_<ContainerAllocator> &) { return value(); } 
};

} // namespace message_traits
} // namespace ros

namespace ros
{
namespace serialization
{

template<class ContainerAllocator> struct Serializer< ::re_srvs::QueryObjectsRequest_<ContainerAllocator> >
{
  template<typename Stream, typename T> inline static void allInOne(Stream& stream, T m)
  {
    stream.next(m.query);
  }

  ROS_DECLARE_ALLINONE_SERIALIZER;
}; // struct QueryObjectsRequest_
} // namespace serialization
} // namespace ros


namespace ros
{
namespace serialization
{

template<class ContainerAllocator> struct Serializer< ::re_srvs::QueryObjectsResponse_<ContainerAllocator> >
{
  template<typename Stream, typename T> inline static void allInOne(Stream& stream, T m)
  {
    stream.next(m.result);
  }

  ROS_DECLARE_ALLINONE_SERIALIZER;
}; // struct QueryObjectsResponse_
} // namespace serialization
} // namespace ros

namespace ros
{
namespace service_traits
{
template<>
struct MD5Sum<re_srvs::QueryObjects> {
  static const char* value() 
  {
    return "40ece397ad679f27203bff340007bd45";
  }

  static const char* value(const re_srvs::QueryObjects&) { return value(); } 
};

template<>
struct DataType<re_srvs::QueryObjects> {
  static const char* value() 
  {
    return "re_srvs/QueryObjects";
  }

  static const char* value(const re_srvs::QueryObjects&) { return value(); } 
};

template<class ContainerAllocator>
struct MD5Sum<re_srvs::QueryObjectsRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "40ece397ad679f27203bff340007bd45";
  }

  static const char* value(const re_srvs::QueryObjectsRequest_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct DataType<re_srvs::QueryObjectsRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_srvs/QueryObjects";
  }

  static const char* value(const re_srvs::QueryObjectsRequest_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct MD5Sum<re_srvs::QueryObjectsResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "40ece397ad679f27203bff340007bd45";
  }

  static const char* value(const re_srvs::QueryObjectsResponse_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct DataType<re_srvs::QueryObjectsResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_srvs/QueryObjects";
  }

  static const char* value(const re_srvs::QueryObjectsResponse_<ContainerAllocator> &) { return value(); } 
};

} // namespace service_traits
} // namespace ros

#endif // RE_SRVS_SERVICE_QUERYOBJECTS_H

