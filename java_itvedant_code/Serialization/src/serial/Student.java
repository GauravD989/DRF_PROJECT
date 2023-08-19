package serial;

import java.io.Serializable;

public class Student implements Serializable {
	
	private int id;
	private String name;
	private int marks;
	private String school_name;
	public Student(int id, String name, int marks, String school_name) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.school_name = school_name;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getSchool_name() {
		return school_name;
	}
	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", school_name=" + school_name + "]";
	}
	

}
