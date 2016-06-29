package com.niit.MyShop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="CATEGORY")
@Component
public class Category {
	
	@Id
	@Column(name = "ID")
	private String id;
	@Column(name = "TYPE")
	private String type;
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "ID")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return type;
	}
	public void setName(String name) {
		this.type = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setType(String string) {
		// TODO Auto-generated method stub
		
	}
	public Category get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
