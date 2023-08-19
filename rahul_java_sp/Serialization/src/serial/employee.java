package serial;

import java.io.Serializable;

public class employee implements Serializable {
	private int id;
	private String name;
	transient private int salary;//values not stor
	public employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
