%%
%% Copyright (C) 2010 by Moritz Tenorth
%%
%% This program is free software; you can redistribute it and/or modify
%% it under the terms of the GNU General Public License as published by
%% the Free Software Foundation; either version 3 of the License, or
%% (at your option) any later version.
%%
%% This program is distributed in the hope that it will be useful,
%% but WITHOUT ANY WARRANTY; without even the implied warranty of
%% MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
%% GNU General Public License for more details.
%%
%% You should have received a copy of the GNU General Public License
%% along with this program.  If not, see <http://www.gnu.org/licenses/>.
%%


%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% dependencies

:- register_ros_package(ias_knowledge_base).
:- register_ros_package(comp_cop).
:- register_ros_package(re_ontology).
:- register_ros_package(re_comm).
:- register_ros_package(mod_vis).
:- register_ros_package(knowrob_actions).
:- register_ros_package(knowrob_cad_models).
:- register_ros_package(re_wm_to_knowrob).

:- use_module(library('comp_roboearth')).

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% parse OWL files, register name spaces

% :- owl_parser:owl_parse('/owl/comp_cop.owl', false, false, true).
% :- rdf_db:rdf_register_ns(comp_cop, 'http://ias.cs.tum.edu/kb/comp_cop.owl#', [keep(true)]).


