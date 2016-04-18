package de.entwicklercamp.e16.storage;

import java.util.UUID;

import org.openntf.xpt.core.dss.AbstractStorageService;

import de.entwicklercamp.e16.bo.Activity;

public class ActivityStorageService extends AbstractStorageService<Activity> {

	private static final ActivityStorageService service = new ActivityStorageService();
	
	public static ActivityStorageService getInstance() {
		return service;
	}
	
	@Override
	public Activity createObject() {
		Activity act = new Activity();
		act.setId(UUID.randomUUID().toString());
		return act;
	}
 
}
