package com.niit.MyShop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table( name= "USER_DETAILS")
@Component
public class UserDetails {
	 private String id;
	 private String name;
	 @Column(name ="mail_id")
	 private String mailId;
	 private String address;
	 @Column(name ="contact_number")
	 private String contactNumber;
	 
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 
	

}
