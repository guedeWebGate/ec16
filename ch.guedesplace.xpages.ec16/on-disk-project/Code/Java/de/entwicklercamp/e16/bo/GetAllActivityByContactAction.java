package de.entwicklercamp.e16.bo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.openntf.xpt.core.rest.XPTRestException;
import org.openntf.xpt.core.rest.impl.AbstractRestAction;

import de.entwicklercamp.e16.storage.ActivityStorageService;

public class GetAllActivityByContactAction extends AbstractRestAction {

	public GetAllActivityByContactAction() {
		super("activityByContactId", new String[] { "GET" });
	}

	public void execute(HttpServletRequest request, HttpServletResponse response) throws XPTRestException {
		String contactID = request.getParameter("contactId");
		List<Activity> allActivites = ActivityStorageService.getInstance().getObjectsByForeignId(contactID, "lupActivityByContactId");
		emitObject(response, allActivites);
	}

}
