package Collect;

import java.util.ArrayList;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al1=new ArrayList();
		
		for(int i=1;i<=10;i++)
		{
			al1.add(i);
		}
		
		ArrayList al2=new ArrayList();
		for(int i=11;i<=20;i++)
		{
			al2.add(i);
		}
		
		System.out.println(al1);
		System.out.println(al2);
		
		al1.addAll(al2);
		
		System.out.println(al1);
		System.out.println(al2);
		
		

	}

}
