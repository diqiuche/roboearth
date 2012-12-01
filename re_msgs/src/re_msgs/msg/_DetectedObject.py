"""autogenerated by genpy from re_msgs/DetectedObject.msg. Do not edit."""
import sys
python3 = True if sys.hexversion > 0x03000000 else False
import genpy
import struct

import re_msgs.msg
import geometry_msgs.msg

class DetectedObject(genpy.Message):
  _md5sum = "db086185ac6f68f8b4560ea38a8ec39b"
  _type = "re_msgs/DetectedObject"
  _has_header = False #flag to mark the presence of a Header object
  _full_text = """# Information of object detected in an image by re_vision
#

# detected points in the image
Pixel[] points2d
# detected 3d points in the camera reference
geometry_msgs/Point[] points3d
# pose of the object in the camera reference
geometry_msgs/Pose pose
# detected 3d points in the model reference
geometry_msgs/Point[] points3d_model
# detected 3d points octave
int32[] octave

================================================================================
MSG: re_msgs/Pixel
# top-left corner: (0,0)

int32 x
int32 y
================================================================================
MSG: geometry_msgs/Point
# This contains the position of a point in free space
float64 x
float64 y
float64 z

================================================================================
MSG: geometry_msgs/Pose
# A representation of pose in free space, composed of postion and orientation. 
Point position
Quaternion orientation

================================================================================
MSG: geometry_msgs/Quaternion
# This represents an orientation in free space in quaternion form.

float64 x
float64 y
float64 z
float64 w

"""
  __slots__ = ['points2d','points3d','pose','points3d_model','octave']
  _slot_types = ['re_msgs/Pixel[]','geometry_msgs/Point[]','geometry_msgs/Pose','geometry_msgs/Point[]','int32[]']

  def __init__(self, *args, **kwds):
    """
    Constructor. Any message fields that are implicitly/explicitly
    set to None will be assigned a default value. The recommend
    use is keyword arguments as this is more robust to future message
    changes.  You cannot mix in-order arguments and keyword arguments.

    The available fields are:
       points2d,points3d,pose,points3d_model,octave

    :param args: complete set of field values, in .msg order
    :param kwds: use keyword arguments corresponding to message field names
    to set specific fields.
    """
    if args or kwds:
      super(DetectedObject, self).__init__(*args, **kwds)
      #message fields cannot be None, assign default values for those that are
      if self.points2d is None:
        self.points2d = []
      if self.points3d is None:
        self.points3d = []
      if self.pose is None:
        self.pose = geometry_msgs.msg.Pose()
      if self.points3d_model is None:
        self.points3d_model = []
      if self.octave is None:
        self.octave = []
    else:
      self.points2d = []
      self.points3d = []
      self.pose = geometry_msgs.msg.Pose()
      self.points3d_model = []
      self.octave = []

  def _get_types(self):
    """
    internal API method
    """
    return self._slot_types

  def serialize(self, buff):
    """
    serialize message into buffer
    :param buff: buffer, ``StringIO``
    """
    try:
      length = len(self.points2d)
      buff.write(_struct_I.pack(length))
      for val1 in self.points2d:
        _x = val1
        buff.write(_struct_2i.pack(_x.x, _x.y))
      length = len(self.points3d)
      buff.write(_struct_I.pack(length))
      for val1 in self.points3d:
        _x = val1
        buff.write(_struct_3d.pack(_x.x, _x.y, _x.z))
      _x = self
      buff.write(_struct_7d.pack(_x.pose.position.x, _x.pose.position.y, _x.pose.position.z, _x.pose.orientation.x, _x.pose.orientation.y, _x.pose.orientation.z, _x.pose.orientation.w))
      length = len(self.points3d_model)
      buff.write(_struct_I.pack(length))
      for val1 in self.points3d_model:
        _x = val1
        buff.write(_struct_3d.pack(_x.x, _x.y, _x.z))
      length = len(self.octave)
      buff.write(_struct_I.pack(length))
      pattern = '<%si'%length
      buff.write(struct.pack(pattern, *self.octave))
    except struct.error as se: self._check_types(se)
    except TypeError as te: self._check_types(te)

  def deserialize(self, str):
    """
    unpack serialized message in str into this message instance
    :param str: byte array of serialized message, ``str``
    """
    try:
      if self.points2d is None:
        self.points2d = None
      if self.points3d is None:
        self.points3d = None
      if self.pose is None:
        self.pose = geometry_msgs.msg.Pose()
      if self.points3d_model is None:
        self.points3d_model = None
      end = 0
      start = end
      end += 4
      (length,) = _struct_I.unpack(str[start:end])
      self.points2d = []
      for i in range(0, length):
        val1 = re_msgs.msg.Pixel()
        _x = val1
        start = end
        end += 8
        (_x.x, _x.y,) = _struct_2i.unpack(str[start:end])
        self.points2d.append(val1)
      start = end
      end += 4
      (length,) = _struct_I.unpack(str[start:end])
      self.points3d = []
      for i in range(0, length):
        val1 = geometry_msgs.msg.Point()
        _x = val1
        start = end
        end += 24
        (_x.x, _x.y, _x.z,) = _struct_3d.unpack(str[start:end])
        self.points3d.append(val1)
      _x = self
      start = end
      end += 56
      (_x.pose.position.x, _x.pose.position.y, _x.pose.position.z, _x.pose.orientation.x, _x.pose.orientation.y, _x.pose.orientation.z, _x.pose.orientation.w,) = _struct_7d.unpack(str[start:end])
      start = end
      end += 4
      (length,) = _struct_I.unpack(str[start:end])
      self.points3d_model = []
      for i in range(0, length):
        val1 = geometry_msgs.msg.Point()
        _x = val1
        start = end
        end += 24
        (_x.x, _x.y, _x.z,) = _struct_3d.unpack(str[start:end])
        self.points3d_model.append(val1)
      start = end
      end += 4
      (length,) = _struct_I.unpack(str[start:end])
      pattern = '<%si'%length
      start = end
      end += struct.calcsize(pattern)
      self.octave = struct.unpack(pattern, str[start:end])
      return self
    except struct.error as e:
      raise genpy.DeserializationError(e) #most likely buffer underfill


  def serialize_numpy(self, buff, numpy):
    """
    serialize message with numpy array types into buffer
    :param buff: buffer, ``StringIO``
    :param numpy: numpy python module
    """
    try:
      length = len(self.points2d)
      buff.write(_struct_I.pack(length))
      for val1 in self.points2d:
        _x = val1
        buff.write(_struct_2i.pack(_x.x, _x.y))
      length = len(self.points3d)
      buff.write(_struct_I.pack(length))
      for val1 in self.points3d:
        _x = val1
        buff.write(_struct_3d.pack(_x.x, _x.y, _x.z))
      _x = self
      buff.write(_struct_7d.pack(_x.pose.position.x, _x.pose.position.y, _x.pose.position.z, _x.pose.orientation.x, _x.pose.orientation.y, _x.pose.orientation.z, _x.pose.orientation.w))
      length = len(self.points3d_model)
      buff.write(_struct_I.pack(length))
      for val1 in self.points3d_model:
        _x = val1
        buff.write(_struct_3d.pack(_x.x, _x.y, _x.z))
      length = len(self.octave)
      buff.write(_struct_I.pack(length))
      pattern = '<%si'%length
      buff.write(self.octave.tostring())
    except struct.error as se: self._check_types(se)
    except TypeError as te: self._check_types(te)

  def deserialize_numpy(self, str, numpy):
    """
    unpack serialized message in str into this message instance using numpy for array types
    :param str: byte array of serialized message, ``str``
    :param numpy: numpy python module
    """
    try:
      if self.points2d is None:
        self.points2d = None
      if self.points3d is None:
        self.points3d = None
      if self.pose is None:
        self.pose = geometry_msgs.msg.Pose()
      if self.points3d_model is None:
        self.points3d_model = None
      end = 0
      start = end
      end += 4
      (length,) = _struct_I.unpack(str[start:end])
      self.points2d = []
      for i in range(0, length):
        val1 = re_msgs.msg.Pixel()
        _x = val1
        start = end
        end += 8
        (_x.x, _x.y,) = _struct_2i.unpack(str[start:end])
        self.points2d.append(val1)
      start = end
      end += 4
      (length,) = _struct_I.unpack(str[start:end])
      self.points3d = []
      for i in range(0, length):
        val1 = geometry_msgs.msg.Point()
        _x = val1
        start = end
        end += 24
        (_x.x, _x.y, _x.z,) = _struct_3d.unpack(str[start:end])
        self.points3d.append(val1)
      _x = self
      start = end
      end += 56
      (_x.pose.position.x, _x.pose.position.y, _x.pose.position.z, _x.pose.orientation.x, _x.pose.orientation.y, _x.pose.orientation.z, _x.pose.orientation.w,) = _struct_7d.unpack(str[start:end])
      start = end
      end += 4
      (length,) = _struct_I.unpack(str[start:end])
      self.points3d_model = []
      for i in range(0, length):
        val1 = geometry_msgs.msg.Point()
        _x = val1
        start = end
        end += 24
        (_x.x, _x.y, _x.z,) = _struct_3d.unpack(str[start:end])
        self.points3d_model.append(val1)
      start = end
      end += 4
      (length,) = _struct_I.unpack(str[start:end])
      pattern = '<%si'%length
      start = end
      end += struct.calcsize(pattern)
      self.octave = numpy.frombuffer(str[start:end], dtype=numpy.int32, count=length)
      return self
    except struct.error as e:
      raise genpy.DeserializationError(e) #most likely buffer underfill

_struct_I = genpy.struct_I
_struct_7d = struct.Struct("<7d")
_struct_2i = struct.Struct("<2i")
_struct_3d = struct.Struct("<3d")
