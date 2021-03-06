/* Auto-generated by genmsg_cpp for file /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_srvs/srv/VisualLocation.srv */

package ros.pkg.re_srvs.srv;

import java.nio.ByteBuffer;


public class VisualLocation extends ros.communication.Service<VisualLocation.Request, VisualLocation.Response> {

  public static java.lang.String __s_getDataType() { return "re_srvs/VisualLocation"; }
  public static java.lang.String __s_getMD5Sum() { return "2fe0fe9f589bf604b428cdddd534bba1"; }

  public java.lang.String getDataType() { return VisualLocation.__s_getDataType(); }
  public java.lang.String getMD5Sum() { return VisualLocation.__s_getMD5Sum(); }

  public VisualLocation.Request createRequest() {
    return new VisualLocation.Request();
  }

  public VisualLocation.Response createResponse() {
    return new VisualLocation.Response();
  }

static public class Request extends ros.communication.Message {

  public java.lang.String name = new java.lang.String();
  public byte attempts;

  public Request() {
  }

  public static java.lang.String __s_getDataType() { return "re_srvs/VisualLocationRequest"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "f01ca0820f3db790a395f93a90ed2cdd"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getServerMD5Sum() { return "2fe0fe9f589bf604b428cdddd534bba1"; }
  public java.lang.String getServerMD5Sum() { return __s_getServerMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "string name\n" +
"int8 attempts\n" +
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
    __l += 4 + name.length();
    __l += 1; // attempts
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    Serialization.writeString(bb, name);
    bb.put(attempts);
  }

  public void deserialize(ByteBuffer bb) {
    name = Serialization.readString(bb);
    attempts = bb.get();
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Request))
      return false;
    Request other = (Request) o;
    return
      name.equals(other.name) &&
      attempts == other.attempts &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.name == null ? 0 : this.name.hashCode());
    result = prime * result + this.attempts;
    return result;
  }
} // class Request

static public class Response extends ros.communication.Message {

  public byte result;

  public Response() {
  }

  public static java.lang.String __s_getDataType() { return "re_srvs/VisualLocationResponse"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "4414c67819626a1b8e0f043a9a0d6c9a"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getServerMD5Sum() { return "2fe0fe9f589bf604b428cdddd534bba1"; }
  public java.lang.String getServerMD5Sum() { return __s_getServerMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "int8 result\n" +
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
    __l += 1; // result
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    bb.put(result);
  }

  public void deserialize(ByteBuffer bb) {
    result = bb.get();
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Response))
      return false;
    Response other = (Response) o;
    return
      result == other.result &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + this.result;
    return result;
  }
} // class Response

} //class

