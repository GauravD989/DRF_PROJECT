package com.example.firstSpringproject.Autowiring;

import org.springframework.stereotype.Component;

@Component
public class Product {
	private int productId;
	private String productname;
	public Product(int productId, String productname) {
		super();
		this.productId = productId;
		this.productname = productname;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productname=" + productname + "]";
	}
	

}
