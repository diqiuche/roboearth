/* Auto-generated by genmsg_cpp for file /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_srvs/srv/DelActionRecipe.srv */

package ros.pkg.re_srvs.srv;

import java.nio.ByteBuffer;


public class DelActionRecipe extends ros.communication.Service<DelActionRecipe.Request, DelActionRecipe.Response> {

  public static java.lang.String __s_getDataType() { return "re_srvs/DelActionRecipe"; }
  public static java.lang.String __s_getMD5Sum() { return "0e76089db06866f69154779bbe023e21"; }

  public java.lang.String getDataType() { return DelActionRecipe.__s_getDataType(); }
  public java.lang.String getMD5Sum() { return DelActionRecipe.__s_getMD5Sum(); }

  public DelActionRecipe.Request createRequest() {
    return new DelActionRecipe.Request();
  }

  public DelActionRecipe.Response createResponse() {
    return new DelActionRecipe.Response();
  }

static public class Request extends ros.communication.Message {

  public java.lang.String recipeUID = new java.lang.String();
  public java.lang.String apiKey = new java.lang.String();

  public Request() {
  }

  public static java.lang.String __s_getDataType() { return "re_srvs/DelActionRecipeRequest"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "316b185cf52a12d43931fdc8ff5191ca"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getServerMD5Sum() { return "0e76089db06866f69154779bbe023e21"; }
  public java.lang.String getServerMD5Sum() { return __s_getServerMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "string recipeUID\n" +
"string apiKey\n" +
"\n" +
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
    __l += 4 + recipeUID.length();
    __l += 4 + apiKey.length();
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    Serialization.writeString(bb, recipeUID);
    Serialization.writeString(bb, apiKey);
  }

  public void deserialize(ByteBuffer bb) {
    recipeUID = Serialization.readString(bb);
    apiKey = Serialization.readString(bb);
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Request))
      return false;
    Request other = (Request) o;
    return
      recipeUID.equals(other.recipeUID) &&
      apiKey.equals(other.apiKey) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.recipeUID == null ? 0 : this.recipeUID.hashCode());
    result = prime * result + (this.apiKey == null ? 0 : this.apiKey.hashCode());
    return result;
  }
} // class Request

static public class Response extends ros.communication.Message {

  public boolean success;

  public Response() {
  }

  public static java.lang.String __s_getDataType() { return "re_srvs/DelActionRecipeResponse"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "358e233cde0c8a8bcfea4ce193f8fc15"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getServerMD5Sum() { return "0e76089db06866f69154779bbe023e21"; }
  public java.lang.String getServerMD5Sum() { return __s_getServerMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "bool success\n" +
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
    __l += 1; // success
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    bb.put((byte)(success ? 1 : 0));
  }

  public void deserialize(ByteBuffer bb) {
    success = bb.get() != 0 ? true : false;
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Response))
      return false;
    Response other = (Response) o;
    return
      success == other.success &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.success ? 1231 : 1237);
    return result;
  }
} // class Response

} //class

