package serial;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList();
		
		
		
		for(int i=0;i<=20;i++)
		{
			al.add(i);
			
		}
		
		for(Object a:al)
		{
			System.out.print(", "+a);
			
			
		}
//		
//		System.out.println(al.size());
//		
//		for(int i=0;i<al.size();i++)
//		{
//			System.out.println(al.get(i));
//		}
		
//		Iterator i = al.iterator();
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
	}

}
