/* Auto-generated by genmsg_cpp for file /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_srvs/srv/QueryObjects.srv */

package ros.pkg.re_srvs.srv;

import java.nio.ByteBuffer;


public class QueryObjects extends ros.communication.Service<QueryObjects.Request, QueryObjects.Response> {

  public static java.lang.String __s_getDataType() { return "re_srvs/QueryObjects"; }
  public static java.lang.String __s_getMD5Sum() { return "40ece397ad679f27203bff340007bd45"; }

  public java.lang.String getDataType() { return QueryObjects.__s_getDataType(); }
  public java.lang.String getMD5Sum() { return QueryObjects.__s_getMD5Sum(); }

  public QueryObjects.Request createRequest() {
    return new QueryObjects.Request();
  }

  public QueryObjects.Response createResponse() {
    return new QueryObjects.Response();
  }

static public class Request extends ros.communication.Message {

  public java.lang.String query = new java.lang.String();

  public Request() {
  }

  public static java.lang.String __s_getDataType() { return "re_srvs/QueryObjectsRequest"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "6490a46152f373285fe18f491ed93702"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getServerMD5Sum() { return "40ece397ad679f27203bff340007bd45"; }
  public java.lang.String getServerMD5Sum() { return __s_getServerMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "string query\n" +
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
    __l += 4 + query.length();
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    Serialization.writeString(bb, query);
  }

  public void deserialize(ByteBuffer bb) {
    query = Serialization.readString(bb);
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Request))
      return false;
    Request other = (Request) o;
    return
      query.equals(other.query) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.query == null ? 0 : this.query.hashCode());
    return result;
  }
} // class Request

static public class Response extends ros.communication.Message {

  public java.lang.String result = new java.lang.String();

  public Response() {
  }

  public static java.lang.String __s_getDataType() { return "re_srvs/QueryObjectsResponse"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "c22f2a1ed8654a0b365f1bb3f7ff2c0f"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getServerMD5Sum() { return "40ece397ad679f27203bff340007bd45"; }
  public java.lang.String getServerMD5Sum() { return __s_getServerMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "string result\n" +
"\n" +
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
    __l += 4 + result.length();
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    Serialization.writeString(bb, result);
  }

  public void deserialize(ByteBuffer bb) {
    result = Serialization.readString(bb);
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Response))
      return false;
    Response other = (Response) o;
    return
      result.equals(other.result) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.result == null ? 0 : this.result.hashCode());
    return result;
  }
} // class Response

} //class

