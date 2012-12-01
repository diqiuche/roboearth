/** \file ObjectDetectorDummy.cpp
 * \brief ObjectDetectorDummy node
 *
 * Node that provides the SearchFor (object) service for recognizing objects
 * in images for simulation data
 * 
 * This file is part of the RoboEarth ROS WP1 package.
 * 
 * It file was originally created for <a href="http://www.roboearth.org/">RoboEarth</a>.
 * The research leading to these results has received funding from the European Union Seventh Framework Programme FP7/2007-2013 under grant agreement no248942 RoboEarth.
 *
 * Copyright (C) 2010 by <a href="mailto:dorian@unizar.es">Dorian Galvez-Lopez</a>, University of Zaragoza
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * \author Dorian Galvez-Lopez
 * \version 1.0
 * \date 2010
 * \image html http://www.roboearth.org/sites/default/files/RoboEarth.org_logo.gif
 * \image latex http://www.roboearth.org/sites/default/files/RoboEarth.org_logo.gif
***********************************************/

/**
 * Parameters:
 * -c camera_model: loads the configuration of the given camera 
 * -d: activates debug mode to save intermediate images
 */

#include <vector>
#include <string>
#include "ObjectDetectorClass.h"

using namespace std;

// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

//static const std::string LOCAL_MODEL = "../dummy_models/bottle1"; // ###
//static const std::string LOCAL_MODEL_2 = "../dummy_models/bed1"; // ###
//static const std::string LOCAL_MODEL_3 = "../dummy_models/cabinet1"; // ###
static const std::string LOCAL_MODEL = "../dummy_models/van";

// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

int main(int argc, char **argv)
{
  vector<string> paths;
  paths.push_back(LOCAL_MODEL);
  
  //paths.push_back(LOCAL_MODEL_2);
  //paths.push_back(LOCAL_MODEL_3);
  
	ObjectDetectorClass odc;
	odc.runObjectDetectorDummyNode(argc, argv, paths);
	return 0;
}

// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

