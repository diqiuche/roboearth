/* Auto-generated by genmsg_cpp for file /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_srvs/srv/DelEnvironment.srv */
#ifndef RE_SRVS_SERVICE_DELENVIRONMENT_H
#define RE_SRVS_SERVICE_DELENVIRONMENT_H
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
struct DelEnvironmentRequest_ {
  typedef DelEnvironmentRequest_<ContainerAllocator> Type;

  DelEnvironmentRequest_()
  : environmentUID()
  , apiKey()
  {
  }

  DelEnvironmentRequest_(const ContainerAllocator& _alloc)
  : environmentUID(_alloc)
  , apiKey(_alloc)
  {
  }

  typedef std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  _environmentUID_type;
  std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  environmentUID;

  typedef std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  _apiKey_type;
  std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  apiKey;


  typedef boost::shared_ptr< ::re_srvs::DelEnvironmentRequest_<ContainerAllocator> > Ptr;
  typedef boost::shared_ptr< ::re_srvs::DelEnvironmentRequest_<ContainerAllocator>  const> ConstPtr;
  boost::shared_ptr<std::map<std::string, std::string> > __connection_header;
}; // struct DelEnvironmentRequest
typedef  ::re_srvs::DelEnvironmentRequest_<std::allocator<void> > DelEnvironmentRequest;

typedef boost::shared_ptr< ::re_srvs::DelEnvironmentRequest> DelEnvironmentRequestPtr;
typedef boost::shared_ptr< ::re_srvs::DelEnvironmentRequest const> DelEnvironmentRequestConstPtr;


template <class ContainerAllocator>
struct DelEnvironmentResponse_ {
  typedef DelEnvironmentResponse_<ContainerAllocator> Type;

  DelEnvironmentResponse_()
  : success(false)
  {
  }

  DelEnvironmentResponse_(const ContainerAllocator& _alloc)
  : success(false)
  {
  }

  typedef uint8_t _success_type;
  uint8_t success;


  typedef boost::shared_ptr< ::re_srvs::DelEnvironmentResponse_<ContainerAllocator> > Ptr;
  typedef boost::shared_ptr< ::re_srvs::DelEnvironmentResponse_<ContainerAllocator>  const> ConstPtr;
  boost::shared_ptr<std::map<std::string, std::string> > __connection_header;
}; // struct DelEnvironmentResponse
typedef  ::re_srvs::DelEnvironmentResponse_<std::allocator<void> > DelEnvironmentResponse;

typedef boost::shared_ptr< ::re_srvs::DelEnvironmentResponse> DelEnvironmentResponsePtr;
typedef boost::shared_ptr< ::re_srvs::DelEnvironmentResponse const> DelEnvironmentResponseConstPtr;

struct DelEnvironment
{

typedef DelEnvironmentRequest Request;
typedef DelEnvironmentResponse Response;
Request request;
Response response;

typedef Request RequestType;
typedef Response ResponseType;
}; // struct DelEnvironment
} // namespace re_srvs

namespace ros
{
namespace message_traits
{
template<class ContainerAllocator> struct IsMessage< ::re_srvs::DelEnvironmentRequest_<ContainerAllocator> > : public TrueType {};
template<class ContainerAllocator> struct IsMessage< ::re_srvs::DelEnvironmentRequest_<ContainerAllocator>  const> : public TrueType {};
template<class ContainerAllocator>
struct MD5Sum< ::re_srvs::DelEnvironmentRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "767ef3b7382f30c7731373b0230f1b59";
  }

  static const char* value(const  ::re_srvs::DelEnvironmentRequest_<ContainerAllocator> &) { return value(); } 
  static const uint64_t static_value1 = 0x767ef3b7382f30c7ULL;
  static const uint64_t static_value2 = 0x731373b0230f1b59ULL;
};

template<class ContainerAllocator>
struct DataType< ::re_srvs::DelEnvironmentRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_srvs/DelEnvironmentRequest";
  }

  static const char* value(const  ::re_srvs::DelEnvironmentRequest_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct Definition< ::re_srvs::DelEnvironmentRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "string environmentUID\n\
string apiKey\n\
\n\
\n\
";
  }

  static const char* value(const  ::re_srvs::DelEnvironmentRequest_<ContainerAllocator> &) { return value(); } 
};

} // namespace message_traits
} // namespace ros


namespace ros
{
namespace message_traits
{
template<class ContainerAllocator> struct IsMessage< ::re_srvs::DelEnvironmentResponse_<ContainerAllocator> > : public TrueType {};
template<class ContainerAllocator> struct IsMessage< ::re_srvs::DelEnvironmentResponse_<ContainerAllocator>  const> : public TrueType {};
template<class ContainerAllocator>
struct MD5Sum< ::re_srvs::DelEnvironmentResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "358e233cde0c8a8bcfea4ce193f8fc15";
  }

  static const char* value(const  ::re_srvs::DelEnvironmentResponse_<ContainerAllocator> &) { return value(); } 
  static const uint64_t static_value1 = 0x358e233cde0c8a8bULL;
  static const uint64_t static_value2 = 0xcfea4ce193f8fc15ULL;
};

template<class ContainerAllocator>
struct DataType< ::re_srvs::DelEnvironmentResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_srvs/DelEnvironmentResponse";
  }

  static const char* value(const  ::re_srvs::DelEnvironmentResponse_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct Definition< ::re_srvs::DelEnvironmentResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "bool success\n\
\n\
\n\
";
  }

  static const char* value(const  ::re_srvs::DelEnvironmentResponse_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator> struct IsFixedSize< ::re_srvs::DelEnvironmentResponse_<ContainerAllocator> > : public TrueType {};
} // namespace message_traits
} // namespace ros

namespace ros
{
namespace serialization
{

template<class ContainerAllocator> struct Serializer< ::re_srvs::DelEnvironmentRequest_<ContainerAllocator> >
{
  template<typename Stream, typename T> inline static void allInOne(Stream& stream, T m)
  {
    stream.next(m.environmentUID);
    stream.next(m.apiKey);
  }

  ROS_DECLARE_ALLINONE_SERIALIZER;
}; // struct DelEnvironmentRequest_
} // namespace serialization
} // namespace ros


namespace ros
{
namespace serialization
{

template<class ContainerAllocator> struct Serializer< ::re_srvs::DelEnvironmentResponse_<ContainerAllocator> >
{
  template<typename Stream, typename T> inline static void allInOne(Stream& stream, T m)
  {
    stream.next(m.success);
  }

  ROS_DECLARE_ALLINONE_SERIALIZER;
}; // struct DelEnvironmentResponse_
} // namespace serialization
} // namespace ros

namespace ros
{
namespace service_traits
{
template<>
struct MD5Sum<re_srvs::DelEnvironment> {
  static const char* value() 
  {
    return "872ee923659735e8d49ccdf103c68241";
  }

  static const char* value(const re_srvs::DelEnvironment&) { return value(); } 
};

template<>
struct DataType<re_srvs::DelEnvironment> {
  static const char* value() 
  {
    return "re_srvs/DelEnvironment";
  }

  static const char* value(const re_srvs::DelEnvironment&) { return value(); } 
};

template<class ContainerAllocator>
struct MD5Sum<re_srvs::DelEnvironmentRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "872ee923659735e8d49ccdf103c68241";
  }

  static const char* value(const re_srvs::DelEnvironmentRequest_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct DataType<re_srvs::DelEnvironmentRequest_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_srvs/DelEnvironment";
  }

  static const char* value(const re_srvs::DelEnvironmentRequest_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct MD5Sum<re_srvs::DelEnvironmentResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "872ee923659735e8d49ccdf103c68241";
  }

  static const char* value(const re_srvs::DelEnvironmentResponse_<ContainerAllocator> &) { return value(); } 
};

template<class ContainerAllocator>
struct DataType<re_srvs::DelEnvironmentResponse_<ContainerAllocator> > {
  static const char* value() 
  {
    return "re_srvs/DelEnvironment";
  }

  static const char* value(const re_srvs::DelEnvironmentResponse_<ContainerAllocator> &) { return value(); } 
};

} // namespace service_traits
} // namespace ros

#endif // RE_SRVS_SERVICE_DELENVIRONMENT_H

