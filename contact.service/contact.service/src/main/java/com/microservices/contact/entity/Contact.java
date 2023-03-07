package com.microservices.contact.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "contact")
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "contact_id")
	private Long contactId;
	@NotNull
	@NotEmpty
	private String contactNum1;
	@NotNull
	@NotEmpty
	private String contactNum2;
	@NotNull
	@NotEmpty
	private String emailId;

	public Contact() {
		super();
	}

	public Long getContactId() {
		return contactId;
	}

	public void setContactId(Long contactId) {
		this.contactId = contactId;
	}

	public String getContactNum1() {
		return contactNum1;
	}

	public void setContactNum1(String contactNum1) {
		this.contactNum1 = contactNum1;
	}

	public String getContactNum2() {
		return contactNum2;
	}

	public void setContactNum2(String contactNum2) {
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

	public Contact(Long contactId, String contactNum1, String contactNum2, String emailId) {
		super();
		this.contactId = contactId;
		this.contactNum1 = contactNum1;
		this.contactNum2 = contactNum2;
		this.emailId = emailId;
	}

}
