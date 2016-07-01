package com.niit.MyShop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table (name = "product")
@Component
public class Product {
	
	@Id
	@Column(name="ID")
	private String  id;
	private String name;
	private String description;
	private double price;
	@ManyToOne
    @JoinColumn(name="id",nullable = false, updatable = false, insertable = true)
	private Supplier supplier;
	
	@ManyToOne
    @JoinColumn(name="cat_id",nullable = false, updatable = false, insertable = true)
   	private Category category;
	
	
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	

	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	
		
		 
}
