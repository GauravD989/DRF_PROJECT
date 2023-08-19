package compareter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Idcomparator implements Comparator<employee>{
	@Override
	public int compare(employee e1, employee e2) {
		// TODO Auto-generated method stub
		if(e1.id>e2.id)
		{
			return 1;//swqp
		}
		else
		{
			return -1;//dont swap
		}
	}
	
}

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Student s1=new Student(101,"ABC", 60);
//		Student s2=new Student(192,"PQR", 74);
//		Student s3=new Student(153,"XYZ", 96);
//		
//		ArrayList<Student> al=new ArrayList<Student>();
//		al.add(s1);
//		al.add(s2);
//		al.add(s3);
//		
//		System.out.println(al);
//		Collections.sort(al);
//		System.out.println(al);
		
		employee e1=new employee(101, "ABC", 25000);
		employee e2=new employee(106, "AVC", 40000);
		employee e3=new employee(104, "ABC", 65000);
		
		ArrayList<employee> al=new ArrayList<employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		System.out.println(al);
		Idcomparator id=new Idcomparator();
		
		Collections.sort(al,id);
		System.out.println(al);
		
		
		

	}

}


