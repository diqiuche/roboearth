/* Auto-generated by genmsg_cpp for file /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_srvs/srv/QueryActionRecipes.srv */
#ifndef RE_SRVS_SERVICE_QUERYACTIONRECIPES_H
#define RE_SRVS_SERVICE_QUERYACTIONRECIPES_H
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
struct QueryActionRecipesRequest_ {
  typedef QueryActionRecipesRequest_<ContainerAllocator> Type;

  QueryActionRecipesRequest_()
  : query()
  {
  }

  QueryActionRecipesRequest_(const ContainerAllocator& _alloc)
  : query(_alloc)
  {
  }

  typedef std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  _query_type;
  std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  query;


  typedef boost::shared_ptr< ::re_srvs::QueryActionRecipesRequest_<ContainerAllocator> > Ptr;
  typedef boost::shared_ptr< ::re_srvs::QueryActionRecipesRequest_<ContainerAllocator>  const> ConstPtr;
  boost::shared_ptr<std::map<std::string, std::string> > __connection_header;
}; // struct QueryActionRecipesRequest
typedef  ::re_srvs::QueryActionRecipesRequest_<std::allocator<void> > QueryActionRecipesRequest;

typedef boost::shared_ptr< ::re_srvs::QueryActionRecipesRequest> QueryActionRecipesRequestPtr;
typedef boost::shared_ptr< ::re_srvs::QueryActionRecipesRequest const> QueryActionRecipesRequestConstPtr;


template <class ContainerAllocator>
struct QueryActionRecipesResponse_ {
  typedef QueryActionRecipesResponse_<ContainerAllocator> Type;

  QueryActionRecipesResponse_()
  : result()
  {
  }

  QueryActionRecipesResponse_(const ContainerAllocator& _alloc)
  : result(_alloc)
  {
  }

  typedef std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  _result_type;
  std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  result;


  typedef boost::shared_ptr< ::re_srvs::QueryActionRecipesResponse_<ContainerAllocator> > Ptr;
  typedef boost::shared_ptr< ::re_srvs::QueryActionRecipesResponse_<ContainerAllocator>  const> ConstPtr;
  boost::shared_ptr<std::map<std::string, std::string> > __connection_header;
}; // struct QueryActionRecipesResponse
typedef  ::re_srvs::QueryActionRecipesResponse_<std::allocator<void> > QueryActionRecipesResponse;

typedef boost::shared_ptr< ::re_srvs::QueryActionRecipesResponse> QueryActionRecipesResponsePtr;
typedef boost::shared_ptr< ::re_srvs::QueryActionRecipesResponse const> QueryActionRecipesResponseConstPtr;

struct QueryActionRecipes
{

typedef QueryActionRecipesRequest Request;
typedef QueryActionRecipesResponse Response;
Request request;
Response response;

typedef Request RequestType;
typedef Response ResponseType;
}; // struct QueryActionRecipes
} // namespace re_srvs

namespace ros
{
namespace message_traits
{
template<class ContainerAllocator> struct IsMessage< ::re_srvs::QueryActionRecipesRequest_<ContainerAllocator> > : public TrueType {};
template<class ContainerAllocator> struct IsMessage< ::re_srvs::QueryActionRecipesRequest_<ContainerAllocator>  const> : public TrueType {};
template<class ContainerAllocator>
struct MD5Sum< ::re_srvs::QueryActionRecipesRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "6490a46152f373285fe18f491ed93702";
  }

  static const char* value(const  ::re_srvs::QueryActionRecipesRequest_<ContainerAllocator> &) { return value(); } 
  static const uint64_t static_value1 = 0x6490a46152f37328ULL;
  static const uint64_t static_value2 = 0x5fe18f491ed93702ULL;
};

template<class ContainerAllocator>
struct DataType< ::re_srvs::QueryActionRecipesRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_srvs/QueryActionRecipesRequest";
  }

  static const char* value(const  ::re_srvs::QueryActionRecipesRequest_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct Definition< ::re_srvs::QueryActionRecipesRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "string query\n\
\n\
";
  }

  static const char* value(const  ::re_srvs::QueryActionRecipesRequest_<ContainerAllocator> &) { return value(); } 
};

} // namespace message_traits
} // namespace ros


namespace ros
{
namespace message_traits
{
template<class ContainerAllocator> struct IsMessage< ::re_srvs::QueryActionRecipesResponse_<ContainerAllocator> > : public TrueType {};
template<class ContainerAllocator> struct IsMessage< ::re_srvs::QueryActionRecipesResponse_<ContainerAllocator>  const> : public TrueType {};
template<class ContainerAllocator>
struct MD5Sum< ::re_srvs::QueryActionRecipesResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "c22f2a1ed8654a0b365f1bb3f7ff2c0f";
  }

  static const char* value(const  ::re_srvs::QueryActionRecipesResponse_<ContainerAllocator> &) { return value(); } 
  static const uint64_t static_value1 = 0xc22f2a1ed8654a0bULL;
  static const uint64_t static_value2 = 0x365f1bb3f7ff2c0fULL;
};

template<class ContainerAllocator>
struct DataType< ::re_srvs::QueryActionRecipesResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_srvs/QueryActionRecipesResponse";
  }

  static const char* value(const  ::re_srvs::QueryActionRecipesResponse_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct Definition< ::re_srvs::QueryActionRecipesResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "string result\n\
\n\
\n\
";
  }

  static const char* value(const  ::re_srvs::QueryActionRecipesResponse_<ContainerAllocator> &) { return value(); } 
};

} // namespace message_traits
} // namespace ros

namespace ros
{
namespace serialization
{

template<class ContainerAllocator> struct Serializer< ::re_srvs::QueryActionRecipesRequest_<ContainerAllocator> >
{
  template<typename Stream, typename T> inline static void allInOne(Stream& stream, T m)
  {
    stream.next(m.query);
  }

  ROS_DECLARE_ALLINONE_SERIALIZER;
}; // struct QueryActionRecipesRequest_
} // namespace serialization
} // namespace ros


namespace ros
{
namespace serialization
{

template<class ContainerAllocator> struct Serializer< ::re_srvs::QueryActionRecipesResponse_<ContainerAllocator> >
{
  template<typename Stream, typename T> inline static void allInOne(Stream& stream, T m)
  {
    stream.next(m.result);
  }

  ROS_DECLARE_ALLINONE_SERIALIZER;
}; // struct QueryActionRecipesResponse_
} // namespace serialization
} // namespace ros

namespace ros
{
namespace service_traits
{
template<>
struct MD5Sum<re_srvs::QueryActionRecipes> {
  static const char* value() 
  {
    return "40ece397ad679f27203bff340007bd45";
  }

  static const char* value(const re_srvs::QueryActionRecipes&) { return value(); } 
};

template<>
struct DataType<re_srvs::QueryActionRecipes> {
  static const char* value() 
  {
    return "re_srvs/QueryActionRecipes";
  }

  static const char* value(const re_srvs::QueryActionRecipes&) { return value(); } 
};

template<class ContainerAllocator>
struct MD5Sum<re_srvs::QueryActionRecipesRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "40ece397ad679f27203bff340007bd45";
  }

  static const char* value(const re_srvs::QueryActionRecipesRequest_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct DataType<re_srvs::QueryActionRecipesRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_srvs/QueryActionRecipes";
  }

  static const char* value(const re_srvs::QueryActionRecipesRequest_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct MD5Sum<re_srvs::QueryActionRecipesResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "40ece397ad679f27203bff340007bd45";
  }

  static const char* value(const re_srvs::QueryActionRecipesResponse_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct DataType<re_srvs::QueryActionRecipesResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_srvs/QueryActionRecipes";
  }

  static const char* value(const re_srvs::QueryActionRecipesResponse_<ContainerAllocator> &) { return value(); } 
};

} // namespace service_traits
} // namespace ros

#endif // RE_SRVS_SERVICE_QUERYACTIONRECIPES_H

