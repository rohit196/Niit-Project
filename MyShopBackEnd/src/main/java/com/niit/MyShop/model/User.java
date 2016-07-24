package com.niit.MyShop.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Component;


@Entity
@Table(name = "user")
@Component
public class User implements Serializable{
		
		@Id @GeneratedValue
		private int id;
		
		@Column(name = "username")
		@Size(min=5,max=10,message="Username should be in 5 - 10 characters" )
		private String username;
		@Column
		@NotNull
		@Length(min=2 ,max=10 ,message="password should be between 5-10 characters")
		private String password;
		
		@Column
		@NotNull
		private String fname;
		
		@Column
		@NotNull
		private String sname;
		
		@Column
		@NotNull
		@Pattern(regexp=".+@.+\\+", message="wrong email")
		private String email;
		
		@Length(min=10 ,max=30,message="address should be between 10-30 charcters")
		private String address;
		@Pattern(regexp="(^$|[0-9]{10}")
		private int mob_no;
		
		private boolean isAdmin;
		private boolean enabled;
		
		

		@OneToMany(fetch=FetchType.EAGER)
		public int getId() {
			return id;
		}
	
		public void setId(int id) {
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
		public boolean isEnabled() {
			return enabled;
		}

		public void setEnabled(boolean enabled) {
			this.enabled = enabled;
		}
		
}
