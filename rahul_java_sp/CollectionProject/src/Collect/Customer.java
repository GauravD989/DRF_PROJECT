package Collect;

import java.io.Serializable;

public class Customer {
	int id;
	String name;
	int price;
	String prouct_name;
	public Customer(int id, String name, int price, String prouct_name) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.prouct_name = prouct_name;
	}
	@Override
	public String toString() {
		return "Collection [id=" + id + ", name=" + name + ", price=" + price + ", prouct_name=" + prouct_name + "]";
	}
	
	
	

}