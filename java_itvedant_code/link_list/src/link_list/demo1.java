package link_list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList l1=new LinkedList();
		
		l1.add(11);
		l1.add(12);
		l1.add(13);
		
		//Collections.sort(l1);
		Collections.sort(l1,Collections.reverseOrder());
		System.out.println(l1);
		
		System.out.println(l1);
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		
		//System.out.println("contains: "+l1.contains(120));
		
	}

}
