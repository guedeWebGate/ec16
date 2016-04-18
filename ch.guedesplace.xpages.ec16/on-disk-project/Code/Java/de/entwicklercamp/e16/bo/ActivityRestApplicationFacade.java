package de.entwicklercamp.e16.bo;

import org.openntf.xpt.core.rest.AbstractRestService;

public class ActivityRestApplicationFacade extends AbstractRestService {

	@Override
	protected void initActionsAndMethods() {
		addAction(new GetAllActivityByContactAction());

	}
}
