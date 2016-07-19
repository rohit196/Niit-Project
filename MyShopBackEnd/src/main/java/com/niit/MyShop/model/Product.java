package com.niit.MyShop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;
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
    @JoinColumn(name="sid",nullable = false , updatable = false, insertable = true)
	private Supplier supplier_fk;
	
	@ManyToOne
    @JoinColumn(name="cat_id",nullable = false , updatable = false, insertable = true)
   	private Category category_fk;
	
	
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
	public Supplier getSupplier_fk() {
		return supplier_fk;
	}
	public void setSupplier_fk(Supplier supplier_fk) {
		this.supplier_fk = supplier_fk;
	}
	public Category getCategory_fk() {
		return category_fk;
	}
	public void setCategory_fk(Category category_fk) {
		this.category_fk = category_fk;
	}	
		 
}
