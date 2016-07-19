package com.niit.MyShop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="CartDetails")
@Component
public class CartDetails {
	@Id 
	private String cartid;
	
	@ManyToOne @JoinColumn(name="uId")
	private User user_fk;
	
	@ManyToOne @JoinColumn(name="pId")
	private Product product_fk;
	
	@ManyToOne @JoinColumn(name="cId")
	private Category category_fk;
	
	@ManyToOne @JoinColumn(name="sId")
	private Supplier supplier_fk;
	
	private String qty;
	private double price;
	
	public String getCartid() {
		return cartid;
	}
	public void setCartid(String cartid) {
		this.cartid = cartid;
	}
	public User getUser_fk() {
		return user_fk;
	}
	public void setUser_fk(User user_fk) {
		this.user_fk = user_fk;
	}
	public Product getProduct_fk() {
		return product_fk;
	}
	public void setProduct_fk(Product product_fk) {
		this.product_fk = product_fk;
	}
	public Category getCategory_fk() {
		return category_fk;
	}
	public void setCategory_fk(Category category_fk) {
		this.category_fk = category_fk;
	}
	public Supplier getSupplier_fk() {
		return supplier_fk;
	}
	public void setSupplier_fk(Supplier supplier_fk) {
		this.supplier_fk = supplier_fk;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

}
