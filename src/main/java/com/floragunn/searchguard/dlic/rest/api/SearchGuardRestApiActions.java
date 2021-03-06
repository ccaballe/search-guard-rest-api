/*
 * Copyright 2016 by floragunn UG (haftungsbeschränkt) - All rights reserved
 * 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed here is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * This software is free of charge for non-commercial and academic use. 
 * For commercial use in a production environment you have to obtain a license 
 * from https://floragunn.com
 * 
 */
package com.floragunn.searchguard.dlic.rest.api;

import org.elasticsearch.rest.RestModule;

public class SearchGuardRestApiActions {

	public static void addActions(final RestModule module) {
		module.addRestAction(UserApiAction.class);
		module.addRestAction(RolesMappingApiAction.class);
		module.addRestAction(RolesApiAction.class);
		module.addRestAction(ActionGroupsApiAction.class);
		module.addRestAction(GetConfigurationApiAction.class);
	}
}
