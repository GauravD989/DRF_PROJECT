package serial;

import java.io.Serializable;

public class customer implements Serializable {
	
	private int id;
	private String name;
	private int price;
	private String product_name;
	public customer(int id, String name, int price, String product_name) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.product_name = product_name;
	}
	@Override
	public String toString() {
		return "customer [id=" + id + ", name=" + name + ", price=" + price + ", product_name=" + product_name + "]";
	}

}
