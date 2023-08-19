package Collect;

import java.util.ArrayList;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c1=new Customer(101,"ABC",100,"XYZ");
		Customer c2=new Customer(102,"AMl",100,"XOZ");
		Customer c3=new Customer(103,"KAE",100,"GFH");
		
		ArrayList<Customer> al=new ArrayList();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		
		System.out.println(al);
		
		//enhans for loops
		for(Customer c:al)
		{
			System.out.println(c);
		}

	}

}
