package com.microservices.user.VO;

import com.microservices.user.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class ResponseTemplateVO {
	private User user;
	private Contact contact;
	public ResponseTemplateVO() {
		super();
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "ResponseTemplateVO [user=" + user + ", contact=" + contact + "]";
	}
	public ResponseTemplateVO(User user, Contact contact) {
		super();
		this.user = user;
		this.contact = contact;
	}
	

}
