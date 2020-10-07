/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.oncologyapp.api.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.oncologyapp.api.OncologyappService;
import org.openmrs.module.oncologyapp.api.dao.OncologyappDao;

public class OncologyappServiceImpl extends BaseOpenmrsService implements OncologyappService {
	
	OncologyappDao dao;
	
	/**
	 * Injected in moduleApplicationContext.xml
	 */
	public void setDao(OncologyappDao dao) {
		this.dao = dao;
	}
	
}
