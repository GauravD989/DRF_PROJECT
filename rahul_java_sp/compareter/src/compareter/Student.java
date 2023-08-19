package compareter;

public class Student implements Comparable<Student> {
	
	int id;
	String name;
	int marks;
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		return this.id-s.id;
		
	}

}
