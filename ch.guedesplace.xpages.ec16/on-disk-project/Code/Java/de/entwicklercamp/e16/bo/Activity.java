package de.entwicklercamp.e16.bo;

import java.io.Serializable;
import java.util.Date;

import org.openntf.xpt.core.dss.annotations.DominoEntity;
import org.openntf.xpt.core.dss.annotations.DominoStore;
import org.openntf.xpt.core.json.annotations.JSONEntity;
import org.openntf.xpt.core.json.annotations.JSONObject;

@JSONObject(JavaFieldPrefix="")
@DominoStore(Form="Activity", JavaFieldPrefix="", PrimaryFieldClass=String.class, PrimaryKeyField="id", View="lupActivityById")
public class Activity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JSONEntity(jsonproperty="id")
	@DominoEntity(FieldName="id")
	private String id;
	@JSONEntity(jsonproperty="contactid")
	@DominoEntity(FieldName="contactId")
	private String contactId;
	@JSONEntity(jsonproperty="creationdate")
	@DominoEntity(FieldName="creationDate")
	private Date creationDate;
	@JSONEntity(jsonproperty="subject")
	@DominoEntity(FieldName="subject")
	private String subject;
	@JSONEntity(jsonproperty="body")
	@DominoEntity(FieldName="body")
	private String body;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public String getContactId() {
		return contactId;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getBody() {
		return body;
	}

}
