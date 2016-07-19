package com.niit.MyShop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Entity
@Table(name = "user")
@Component
public class User {
		
		@Id
		private String id;
		@Column(name = "username")
		private String username;
		private String password;
		private String fname;
		private String sname;
		private String email;
		private String address;
		private int mob_no;
		private boolean isAdmin;
		
		
		@OneToMany(fetch=FetchType.EAGER)
		public String getId() {
			return id;
		}
	
		public void setId(String id) {
			this.id = id;
		}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getMob_no() {
			return mob_no;
		}
		public void setMob_no(int mob_no) {
			this.mob_no = mob_no;
		}
	
			
		
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
	
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public boolean isAdmin() {
			return isAdmin;
		}
		public void setAdmin(boolean isAdmin) {
			this.isAdmin = isAdmin;
		}
		
		
}
