# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 2.8

#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:

# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list

# Suppress display of executed commands.
$(VERBOSE).SILENT:

# A target that is always out of date.
cmake_force:
.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /usr/bin/cmake

# The command to remove a file.
RM = /usr/bin/cmake -E remove -f

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/build

# Include any dependencies generated for this target.
include CMakeFiles/DVision.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/DVision.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/DVision.dir/flags.make

CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o: CMakeFiles/DVision.dir/flags.make
CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o: ../src/3rdparty/DVision/PatchFile.cpp
CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o: ../manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o: /opt/ros/fuerte/stacks/bullet/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o: /opt/ros/fuerte/share/geometry_msgs/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o: /opt/ros/fuerte/share/sensor_msgs/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o: /opt/ros/fuerte/share/roslang/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o: /opt/ros/fuerte/share/roscpp/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o: /opt/ros/fuerte/share/rosconsole/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o: /opt/ros/fuerte/stacks/geometry/angles/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o: /opt/ros/fuerte/share/rospy/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o: /opt/ros/fuerte/share/rostest/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o: /opt/ros/fuerte/share/roswtf/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o: /opt/ros/fuerte/share/message_filters/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o: /opt/ros/fuerte/stacks/geometry/tf/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o: /opt/ros/fuerte/share/std_msgs/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o: /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_msgs/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o: /opt/ros/fuerte/stacks/vision_opencv/opencv2/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o: /opt/ros/fuerte/stacks/vision_opencv/cv_bridge/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o: /opt/ros/fuerte/share/ros/core/rosbuild/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o: /opt/ros/fuerte/share/roslib/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o: /opt/ros/fuerte/stacks/pluginlib/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o: /opt/ros/fuerte/stacks/image_common/image_transport/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o: /opt/ros/fuerte/stacks/geometry/tf/msg_gen/generated
CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o: /opt/ros/fuerte/stacks/geometry/tf/srv_gen/generated
CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o: /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_msgs/msg_gen/generated
	$(CMAKE_COMMAND) -E cmake_progress_report /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/build/CMakeFiles $(CMAKE_PROGRESS_1)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o"
	/usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -DBT_USE_DOUBLE_PRECISION -DBT_EULER_DEFAULT_ZYX -W -Wall -Wno-unused-parameter -fno-strict-aliasing -pthread -o CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o -c /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/src/3rdparty/DVision/PatchFile.cpp

CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.i"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -DBT_USE_DOUBLE_PRECISION -DBT_EULER_DEFAULT_ZYX -W -Wall -Wno-unused-parameter -fno-strict-aliasing -pthread -E /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/src/3rdparty/DVision/PatchFile.cpp > CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.i

CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.s"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -DBT_USE_DOUBLE_PRECISION -DBT_EULER_DEFAULT_ZYX -W -Wall -Wno-unused-parameter -fno-strict-aliasing -pthread -S /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/src/3rdparty/DVision/PatchFile.cpp -o CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.s

CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o.requires:
.PHONY : CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o.requires

CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o.provides: CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o.requires
	$(MAKE) -f CMakeFiles/DVision.dir/build.make CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o.provides.build
.PHONY : CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o.provides

CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o.provides.build: CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o

CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o: CMakeFiles/DVision.dir/flags.make
CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o: ../src/3rdparty/DVision/PMVSCamera.cpp
CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o: ../manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o: /opt/ros/fuerte/stacks/bullet/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o: /opt/ros/fuerte/share/geometry_msgs/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o: /opt/ros/fuerte/share/sensor_msgs/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o: /opt/ros/fuerte/share/roslang/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o: /opt/ros/fuerte/share/roscpp/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o: /opt/ros/fuerte/share/rosconsole/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o: /opt/ros/fuerte/stacks/geometry/angles/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o: /opt/ros/fuerte/share/rospy/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o: /opt/ros/fuerte/share/rostest/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o: /opt/ros/fuerte/share/roswtf/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o: /opt/ros/fuerte/share/message_filters/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o: /opt/ros/fuerte/stacks/geometry/tf/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o: /opt/ros/fuerte/share/std_msgs/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o: /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_msgs/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o: /opt/ros/fuerte/stacks/vision_opencv/opencv2/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o: /opt/ros/fuerte/stacks/vision_opencv/cv_bridge/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o: /opt/ros/fuerte/share/ros/core/rosbuild/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o: /opt/ros/fuerte/share/roslib/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o: /opt/ros/fuerte/stacks/pluginlib/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o: /opt/ros/fuerte/stacks/image_common/image_transport/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o: /opt/ros/fuerte/stacks/geometry/tf/msg_gen/generated
CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o: /opt/ros/fuerte/stacks/geometry/tf/srv_gen/generated
CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o: /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_msgs/msg_gen/generated
	$(CMAKE_COMMAND) -E cmake_progress_report /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/build/CMakeFiles $(CMAKE_PROGRESS_2)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o"
	/usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -DBT_USE_DOUBLE_PRECISION -DBT_EULER_DEFAULT_ZYX -W -Wall -Wno-unused-parameter -fno-strict-aliasing -pthread -o CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o -c /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/src/3rdparty/DVision/PMVSCamera.cpp

CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.i"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -DBT_USE_DOUBLE_PRECISION -DBT_EULER_DEFAULT_ZYX -W -Wall -Wno-unused-parameter -fno-strict-aliasing -pthread -E /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/src/3rdparty/DVision/PMVSCamera.cpp > CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.i

CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.s"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -DBT_USE_DOUBLE_PRECISION -DBT_EULER_DEFAULT_ZYX -W -Wall -Wno-unused-parameter -fno-strict-aliasing -pthread -S /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/src/3rdparty/DVision/PMVSCamera.cpp -o CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.s

CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o.requires:
.PHONY : CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o.requires

CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o.provides: CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o.requires
	$(MAKE) -f CMakeFiles/DVision.dir/build.make CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o.provides.build
.PHONY : CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o.provides

CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o.provides.build: CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o

CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o: CMakeFiles/DVision.dir/flags.make
CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o: ../src/3rdparty/DVision/BundleCamera.cpp
CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o: ../manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o: /opt/ros/fuerte/stacks/bullet/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o: /opt/ros/fuerte/share/geometry_msgs/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o: /opt/ros/fuerte/share/sensor_msgs/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o: /opt/ros/fuerte/share/roslang/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o: /opt/ros/fuerte/share/roscpp/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o: /opt/ros/fuerte/share/rosconsole/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o: /opt/ros/fuerte/stacks/geometry/angles/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o: /opt/ros/fuerte/share/rospy/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o: /opt/ros/fuerte/share/rostest/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o: /opt/ros/fuerte/share/roswtf/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o: /opt/ros/fuerte/share/message_filters/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o: /opt/ros/fuerte/stacks/geometry/tf/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o: /opt/ros/fuerte/share/std_msgs/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o: /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_msgs/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o: /opt/ros/fuerte/stacks/vision_opencv/opencv2/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o: /opt/ros/fuerte/stacks/vision_opencv/cv_bridge/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o: /opt/ros/fuerte/share/ros/core/rosbuild/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o: /opt/ros/fuerte/share/roslib/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o: /opt/ros/fuerte/stacks/pluginlib/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o: /opt/ros/fuerte/stacks/image_common/image_transport/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o: /opt/ros/fuerte/stacks/geometry/tf/msg_gen/generated
CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o: /opt/ros/fuerte/stacks/geometry/tf/srv_gen/generated
CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o: /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_msgs/msg_gen/generated
	$(CMAKE_COMMAND) -E cmake_progress_report /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/build/CMakeFiles $(CMAKE_PROGRESS_3)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o"
	/usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -DBT_USE_DOUBLE_PRECISION -DBT_EULER_DEFAULT_ZYX -W -Wall -Wno-unused-parameter -fno-strict-aliasing -pthread -o CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o -c /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/src/3rdparty/DVision/BundleCamera.cpp

CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.i"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -DBT_USE_DOUBLE_PRECISION -DBT_EULER_DEFAULT_ZYX -W -Wall -Wno-unused-parameter -fno-strict-aliasing -pthread -E /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/src/3rdparty/DVision/BundleCamera.cpp > CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.i

CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.s"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -DBT_USE_DOUBLE_PRECISION -DBT_EULER_DEFAULT_ZYX -W -Wall -Wno-unused-parameter -fno-strict-aliasing -pthread -S /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/src/3rdparty/DVision/BundleCamera.cpp -o CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.s

CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o.requires:
.PHONY : CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o.requires

CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o.provides: CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o.requires
	$(MAKE) -f CMakeFiles/DVision.dir/build.make CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o.provides.build
.PHONY : CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o.provides

CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o.provides.build: CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o

CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o: CMakeFiles/DVision.dir/flags.make
CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o: ../src/3rdparty/DVision/PixelPointFile.cpp
CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o: ../manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o: /opt/ros/fuerte/stacks/bullet/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o: /opt/ros/fuerte/share/geometry_msgs/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o: /opt/ros/fuerte/share/sensor_msgs/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o: /opt/ros/fuerte/share/roslang/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o: /opt/ros/fuerte/share/roscpp/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o: /opt/ros/fuerte/share/rosconsole/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o: /opt/ros/fuerte/stacks/geometry/angles/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o: /opt/ros/fuerte/share/rospy/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o: /opt/ros/fuerte/share/rostest/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o: /opt/ros/fuerte/share/roswtf/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o: /opt/ros/fuerte/share/message_filters/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o: /opt/ros/fuerte/stacks/geometry/tf/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o: /opt/ros/fuerte/share/std_msgs/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o: /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_msgs/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o: /opt/ros/fuerte/stacks/vision_opencv/opencv2/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o: /opt/ros/fuerte/stacks/vision_opencv/cv_bridge/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o: /opt/ros/fuerte/share/ros/core/rosbuild/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o: /opt/ros/fuerte/share/roslib/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o: /opt/ros/fuerte/stacks/pluginlib/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o: /opt/ros/fuerte/stacks/image_common/image_transport/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o: /opt/ros/fuerte/stacks/geometry/tf/msg_gen/generated
CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o: /opt/ros/fuerte/stacks/geometry/tf/srv_gen/generated
CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o: /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_msgs/msg_gen/generated
	$(CMAKE_COMMAND) -E cmake_progress_report /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/build/CMakeFiles $(CMAKE_PROGRESS_4)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o"
	/usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -DBT_USE_DOUBLE_PRECISION -DBT_EULER_DEFAULT_ZYX -W -Wall -Wno-unused-parameter -fno-strict-aliasing -pthread -o CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o -c /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/src/3rdparty/DVision/PixelPointFile.cpp

CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.i"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -DBT_USE_DOUBLE_PRECISION -DBT_EULER_DEFAULT_ZYX -W -Wall -Wno-unused-parameter -fno-strict-aliasing -pthread -E /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/src/3rdparty/DVision/PixelPointFile.cpp > CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.i

CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.s"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -DBT_USE_DOUBLE_PRECISION -DBT_EULER_DEFAULT_ZYX -W -Wall -Wno-unused-parameter -fno-strict-aliasing -pthread -S /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/src/3rdparty/DVision/PixelPointFile.cpp -o CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.s

CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o.requires:
.PHONY : CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o.requires

CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o.provides: CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o.requires
	$(MAKE) -f CMakeFiles/DVision.dir/build.make CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o.provides.build
.PHONY : CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o.provides

CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o.provides.build: CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o

CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o: CMakeFiles/DVision.dir/flags.make
CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o: ../src/3rdparty/DVision/SurfSet.cpp
CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o: ../manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o: /opt/ros/fuerte/stacks/bullet/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o: /opt/ros/fuerte/share/geometry_msgs/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o: /opt/ros/fuerte/share/sensor_msgs/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o: /opt/ros/fuerte/share/roslang/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o: /opt/ros/fuerte/share/roscpp/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o: /opt/ros/fuerte/share/rosconsole/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o: /opt/ros/fuerte/stacks/geometry/angles/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o: /opt/ros/fuerte/share/rospy/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o: /opt/ros/fuerte/share/rostest/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o: /opt/ros/fuerte/share/roswtf/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o: /opt/ros/fuerte/share/message_filters/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o: /opt/ros/fuerte/stacks/geometry/tf/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o: /opt/ros/fuerte/share/std_msgs/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o: /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_msgs/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o: /opt/ros/fuerte/stacks/vision_opencv/opencv2/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o: /opt/ros/fuerte/stacks/vision_opencv/cv_bridge/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o: /opt/ros/fuerte/share/ros/core/rosbuild/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o: /opt/ros/fuerte/share/roslib/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o: /opt/ros/fuerte/stacks/pluginlib/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o: /opt/ros/fuerte/stacks/image_common/image_transport/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o: /opt/ros/fuerte/stacks/geometry/tf/msg_gen/generated
CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o: /opt/ros/fuerte/stacks/geometry/tf/srv_gen/generated
CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o: /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_msgs/msg_gen/generated
	$(CMAKE_COMMAND) -E cmake_progress_report /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/build/CMakeFiles $(CMAKE_PROGRESS_5)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o"
	/usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -DBT_USE_DOUBLE_PRECISION -DBT_EULER_DEFAULT_ZYX -W -Wall -Wno-unused-parameter -fno-strict-aliasing -pthread -o CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o -c /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/src/3rdparty/DVision/SurfSet.cpp

CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.i"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -DBT_USE_DOUBLE_PRECISION -DBT_EULER_DEFAULT_ZYX -W -Wall -Wno-unused-parameter -fno-strict-aliasing -pthread -E /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/src/3rdparty/DVision/SurfSet.cpp > CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.i

CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.s"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -DBT_USE_DOUBLE_PRECISION -DBT_EULER_DEFAULT_ZYX -W -Wall -Wno-unused-parameter -fno-strict-aliasing -pthread -S /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/src/3rdparty/DVision/SurfSet.cpp -o CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.s

CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o.requires:
.PHONY : CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o.requires

CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o.provides: CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o.requires
	$(MAKE) -f CMakeFiles/DVision.dir/build.make CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o.provides.build
.PHONY : CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o.provides

CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o.provides.build: CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o

CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o: CMakeFiles/DVision.dir/flags.make
CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o: ../src/3rdparty/DVision/Matches.cpp
CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o: ../manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o: /opt/ros/fuerte/stacks/bullet/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o: /opt/ros/fuerte/share/geometry_msgs/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o: /opt/ros/fuerte/share/sensor_msgs/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o: /opt/ros/fuerte/share/roslang/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o: /opt/ros/fuerte/share/roscpp/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o: /opt/ros/fuerte/share/rosconsole/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o: /opt/ros/fuerte/stacks/geometry/angles/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o: /opt/ros/fuerte/share/rospy/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o: /opt/ros/fuerte/share/rostest/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o: /opt/ros/fuerte/share/roswtf/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o: /opt/ros/fuerte/share/message_filters/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o: /opt/ros/fuerte/stacks/geometry/tf/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o: /opt/ros/fuerte/share/std_msgs/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o: /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_msgs/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o: /opt/ros/fuerte/stacks/vision_opencv/opencv2/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o: /opt/ros/fuerte/stacks/vision_opencv/cv_bridge/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o: /opt/ros/fuerte/share/ros/core/rosbuild/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o: /opt/ros/fuerte/share/roslib/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o: /opt/ros/fuerte/stacks/pluginlib/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o: /opt/ros/fuerte/stacks/image_common/image_transport/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o: /opt/ros/fuerte/stacks/geometry/tf/msg_gen/generated
CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o: /opt/ros/fuerte/stacks/geometry/tf/srv_gen/generated
CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o: /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_msgs/msg_gen/generated
	$(CMAKE_COMMAND) -E cmake_progress_report /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/build/CMakeFiles $(CMAKE_PROGRESS_6)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o"
	/usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -DBT_USE_DOUBLE_PRECISION -DBT_EULER_DEFAULT_ZYX -W -Wall -Wno-unused-parameter -fno-strict-aliasing -pthread -o CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o -c /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/src/3rdparty/DVision/Matches.cpp

CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.i"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -DBT_USE_DOUBLE_PRECISION -DBT_EULER_DEFAULT_ZYX -W -Wall -Wno-unused-parameter -fno-strict-aliasing -pthread -E /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/src/3rdparty/DVision/Matches.cpp > CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.i

CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.s"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -DBT_USE_DOUBLE_PRECISION -DBT_EULER_DEFAULT_ZYX -W -Wall -Wno-unused-parameter -fno-strict-aliasing -pthread -S /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/src/3rdparty/DVision/Matches.cpp -o CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.s

CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o.requires:
.PHONY : CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o.requires

CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o.provides: CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o.requires
	$(MAKE) -f CMakeFiles/DVision.dir/build.make CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o.provides.build
.PHONY : CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o.provides

CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o.provides.build: CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o

CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o: CMakeFiles/DVision.dir/flags.make
CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o: ../src/3rdparty/DVision/PLYFile.cpp
CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o: ../manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o: /opt/ros/fuerte/stacks/bullet/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o: /opt/ros/fuerte/share/geometry_msgs/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o: /opt/ros/fuerte/share/sensor_msgs/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o: /opt/ros/fuerte/share/roslang/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o: /opt/ros/fuerte/share/roscpp/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o: /opt/ros/fuerte/share/rosconsole/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o: /opt/ros/fuerte/stacks/geometry/angles/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o: /opt/ros/fuerte/share/rospy/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o: /opt/ros/fuerte/share/rostest/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o: /opt/ros/fuerte/share/roswtf/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o: /opt/ros/fuerte/share/message_filters/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o: /opt/ros/fuerte/stacks/geometry/tf/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o: /opt/ros/fuerte/share/std_msgs/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o: /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_msgs/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o: /opt/ros/fuerte/stacks/vision_opencv/opencv2/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o: /opt/ros/fuerte/stacks/vision_opencv/cv_bridge/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o: /opt/ros/fuerte/share/ros/core/rosbuild/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o: /opt/ros/fuerte/share/roslib/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o: /opt/ros/fuerte/stacks/pluginlib/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o: /opt/ros/fuerte/stacks/image_common/image_transport/manifest.xml
CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o: /opt/ros/fuerte/stacks/geometry/tf/msg_gen/generated
CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o: /opt/ros/fuerte/stacks/geometry/tf/srv_gen/generated
CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o: /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_msgs/msg_gen/generated
	$(CMAKE_COMMAND) -E cmake_progress_report /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/build/CMakeFiles $(CMAKE_PROGRESS_7)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o"
	/usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -DBT_USE_DOUBLE_PRECISION -DBT_EULER_DEFAULT_ZYX -W -Wall -Wno-unused-parameter -fno-strict-aliasing -pthread -o CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o -c /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/src/3rdparty/DVision/PLYFile.cpp

CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.i"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -DBT_USE_DOUBLE_PRECISION -DBT_EULER_DEFAULT_ZYX -W -Wall -Wno-unused-parameter -fno-strict-aliasing -pthread -E /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/src/3rdparty/DVision/PLYFile.cpp > CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.i

CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.s"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -DBT_USE_DOUBLE_PRECISION -DBT_EULER_DEFAULT_ZYX -W -Wall -Wno-unused-parameter -fno-strict-aliasing -pthread -S /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/src/3rdparty/DVision/PLYFile.cpp -o CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.s

CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o.requires:
.PHONY : CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o.requires

CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o.provides: CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o.requires
	$(MAKE) -f CMakeFiles/DVision.dir/build.make CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o.provides.build
.PHONY : CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o.provides

CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o.provides.build: CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o

# Object files for target DVision
DVision_OBJECTS = \
"CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o" \
"CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o" \
"CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o" \
"CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o" \
"CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o" \
"CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o" \
"CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o"

# External object files for target DVision
DVision_EXTERNAL_OBJECTS =

../lib/libDVision.so: CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o
../lib/libDVision.so: CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o
../lib/libDVision.so: CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o
../lib/libDVision.so: CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o
../lib/libDVision.so: CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o
../lib/libDVision.so: CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o
../lib/libDVision.so: CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o
../lib/libDVision.so: CMakeFiles/DVision.dir/build.make
../lib/libDVision.so: CMakeFiles/DVision.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --red --bold "Linking CXX shared library ../lib/libDVision.so"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/DVision.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/DVision.dir/build: ../lib/libDVision.so
.PHONY : CMakeFiles/DVision.dir/build

CMakeFiles/DVision.dir/requires: CMakeFiles/DVision.dir/src/3rdparty/DVision/PatchFile.o.requires
CMakeFiles/DVision.dir/requires: CMakeFiles/DVision.dir/src/3rdparty/DVision/PMVSCamera.o.requires
CMakeFiles/DVision.dir/requires: CMakeFiles/DVision.dir/src/3rdparty/DVision/BundleCamera.o.requires
CMakeFiles/DVision.dir/requires: CMakeFiles/DVision.dir/src/3rdparty/DVision/PixelPointFile.o.requires
CMakeFiles/DVision.dir/requires: CMakeFiles/DVision.dir/src/3rdparty/DVision/SurfSet.o.requires
CMakeFiles/DVision.dir/requires: CMakeFiles/DVision.dir/src/3rdparty/DVision/Matches.o.requires
CMakeFiles/DVision.dir/requires: CMakeFiles/DVision.dir/src/3rdparty/DVision/PLYFile.o.requires
.PHONY : CMakeFiles/DVision.dir/requires

CMakeFiles/DVision.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/DVision.dir/cmake_clean.cmake
.PHONY : CMakeFiles/DVision.dir/clean

CMakeFiles/DVision.dir/depend:
	cd /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/build && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/build /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/build /home/flavio/Works/Roboearth_iaslab/stacks/roboearth/re_vision/build/CMakeFiles/DVision.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/DVision.dir/depend
