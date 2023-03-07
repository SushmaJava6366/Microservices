package com.microservices.user.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Contact {
	private Long contactId;
	private Long contactNum1;
	private Long contactNum2;
	private String emailId ;

	public Contact() {
		super();
	}

	public Long getContactId() {
		return contactId;
	}

	public void setContactId(Long contactId) {
		this.contactId = contactId;
	}

	public Long getContactNum1() {
		return contactNum1;
	}

	public void setContactNum1(Long contactNum1) {
		this.contactNum1 = contactNum1;
	}

	public Long getContactNum2() {
		return contactNum2;
	}

	public void setContactNum2(Long contactNum2) {
		this.contactNum2 = contactNum2;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", contactNum1=" + contactNum1 + ", contactNum2=" + contactNum2
				+ ", emailId=" + emailId + "]";
	}

	public Contact(Long contactId, Long contactNum1, Long contactNum2, String emailId) {
		super();
		this.contactId = contactId;
		this.contactNum1 = contactNum1;
		this.contactNum2 = contactNum2;
		this.emailId = emailId;
	}

	
	
}
