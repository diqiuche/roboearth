/* Auto-generated by genmsg_java.py for file /opt/ros/fuerte/share/sensor_msgs/msg/LaserScan.msg */

package ros.pkg.sensor_msgs.msg;

import java.nio.ByteBuffer;

public class LaserScan extends ros.communication.Message {

  public ros.pkg.std_msgs.msg.Header header = new ros.pkg.std_msgs.msg.Header();
  public float angle_min;
  public float angle_max;
  public float angle_increment;
  public float time_increment;
  public float scan_time;
  public float range_min;
  public float range_max;
  public float[] ranges = new float[0];
  public float[] intensities = new float[0];

  public LaserScan() {
  }

  public static java.lang.String __s_getDataType() { return "sensor_msgs/LaserScan"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "90c7ef2dc6895d81024acba2ac42f369"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "# Single scan from a planar laser range-finder\n" +
"#\n" +
"# If you have another ranging device with different behavior (e.g. a sonar\n" +
"# array), please find or create a different message, since applications\n" +
"# will make fairly laser-specific assumptions about this data\n" +
"\n" +
"Header header            # timestamp in the header is the acquisition time of \n" +
"                         # the first ray in the scan.\n" +
"                         #\n" +
"                         # in frame frame_id, angles are measured around \n" +
"                         # the positive Z axis (counterclockwise, if Z is up)\n" +
"                         # with zero angle being forward along the x axis\n" +
"                         \n" +
"float32 angle_min        # start angle of the scan [rad]\n" +
"float32 angle_max        # end angle of the scan [rad]\n" +
"float32 angle_increment  # angular distance between measurements [rad]\n" +
"\n" +
"float32 time_increment   # time between measurements [seconds] - if your scanner\n" +
"                         # is moving, this will be used in interpolating position\n" +
"                         # of 3d points\n" +
"float32 scan_time        # time between scans [seconds]\n" +
"\n" +
"float32 range_min        # minimum range value [m]\n" +
"float32 range_max        # maximum range value [m]\n" +
"\n" +
"float32[] ranges         # range data [m] (Note: values < range_min or > range_max should be discarded)\n" +
"float32[] intensities    # intensity data [device-specific units].  If your\n" +
"                         # device does not provide intensities, please leave\n" +
"                         # the array empty.\n" +
"\n" +
"================================================================================\n" +
"MSG: std_msgs/Header\n" +
"# Standard metadata for higher-level stamped data types.\n" +
"# This is generally used to communicate timestamped data \n" +
"# in a particular coordinate frame.\n" +
"# \n" +
"# sequence ID: consecutively increasing ID \n" +
"uint32 seq\n" +
"#Two-integer timestamp that is expressed as:\n" +
"# * stamp.secs: seconds (stamp_secs) since epoch\n" +
"# * stamp.nsecs: nanoseconds since stamp_secs\n" +
"# time-handling sugar is provided by the client library\n" +
"time stamp\n" +
"#Frame this data is associated with\n" +
"# 0: no frame\n" +
"# 1: global frame\n" +
"string frame_id\n" +
"\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public LaserScan clone() {
    LaserScan c = new LaserScan();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += header.serializationLength();
    __l += 4; // angle_min
    __l += 4; // angle_max
    __l += 4; // angle_increment
    __l += 4; // time_increment
    __l += 4; // scan_time
    __l += 4; // range_min
    __l += 4; // range_max
    __l += 4 + ranges.length * 4; // ranges
    __l += 4 + intensities.length * 4; // intensities
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    header.serialize(bb, seq);
    bb.putFloat(angle_min);
    bb.putFloat(angle_max);
    bb.putFloat(angle_increment);
    bb.putFloat(time_increment);
    bb.putFloat(scan_time);
    bb.putFloat(range_min);
    bb.putFloat(range_max);
    bb.putInt(ranges.length);
    for(float val : ranges) {
      bb.putFloat(val);
    }
    bb.putInt(intensities.length);
    for(float val : intensities) {
      bb.putFloat(val);
    }
  }

  public void deserialize(ByteBuffer bb) {
    header.deserialize(bb);
    angle_min = bb.getFloat();
    angle_max = bb.getFloat();
    angle_increment = bb.getFloat();
    time_increment = bb.getFloat();
    scan_time = bb.getFloat();
    range_min = bb.getFloat();
    range_max = bb.getFloat();

    int __ranges_len = bb.getInt();
    ranges = new float[__ranges_len];
    for(int __i=0; __i<__ranges_len; __i++) {
      ranges[__i] = bb.getFloat();
    }

    int __intensities_len = bb.getInt();
    intensities = new float[__intensities_len];
    for(int __i=0; __i<__intensities_len; __i++) {
      intensities[__i] = bb.getFloat();
    }
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof LaserScan))
      return false;
    LaserScan other = (LaserScan) o;
    return
      header.equals(other.header) &&
      angle_min == other.angle_min &&
      angle_max == other.angle_max &&
      angle_increment == other.angle_increment &&
      time_increment == other.time_increment &&
      scan_time == other.scan_time &&
      range_min == other.range_min &&
      range_max == other.range_max &&
      java.util.Arrays.equals(ranges, other.ranges) &&
      java.util.Arrays.equals(intensities, other.intensities) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.header == null ? 0 : this.header.hashCode());
    result = prime * result + Float.floatToIntBits(this.angle_min);
    result = prime * result + Float.floatToIntBits(this.angle_max);
    result = prime * result + Float.floatToIntBits(this.angle_increment);
    result = prime * result + Float.floatToIntBits(this.time_increment);
    result = prime * result + Float.floatToIntBits(this.scan_time);
    result = prime * result + Float.floatToIntBits(this.range_min);
    result = prime * result + Float.floatToIntBits(this.range_max);
    result = prime * result + java.util.Arrays.hashCode(this.ranges);
    result = prime * result + java.util.Arrays.hashCode(this.intensities);
    return result;
  }
} // class LaserScan

