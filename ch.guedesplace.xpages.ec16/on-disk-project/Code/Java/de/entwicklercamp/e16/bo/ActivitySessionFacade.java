package de.entwicklercamp.e16.bo;

import de.entwicklercamp.e16.storage.ActivityStorageService;

public class ActivitySessionFacade {

	public Activity createActivityWithContactId(String contactId) {
		Activity act = ActivityStorageService.getInstance().createObject();
		act.setContactId(contactId);
		return act;
	}

	public void save(Activity act) {
		ActivityStorageService.getInstance().save(act);
	}
}
