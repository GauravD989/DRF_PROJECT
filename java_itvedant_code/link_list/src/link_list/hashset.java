package link_list;

import java.rmi.Remote;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hs=new HashSet();
		hs.add(11);
		hs.add(11);
		hs.add(13);
		hs.add(19);
		hs.add(13);
		hs.add(19);
		hs.add(18);
		hs.add(null);
		hs.add(false);
		
		
		System.out.println(hs);
		
		LinkedHashSet l2=new LinkedHashSet();
		for(int i=0;i<=100;i++)
		{
			l2.add(i);
		}
		System.out.println(l2);
		
		l2.add(null);
		System.out.println(l2);
		
		TreeSet ts=new TreeSet();
		ts.add(120);
		ts.add(12);
		ts.add(1200);
		ts.add(1206);
		//ts.add(null);
		System.out.println(ts);
		
		
		HashSet hs1=new HashSet();
		hs1.add(11);
		hs1.add(13);
		hs1.add(19);
		hs1.add(18);
		
		HashSet hs2=new HashSet();
		hs2.add(11);
		hs2.add(13);
		hs2.add(19);
		hs2.add(17);
		hs2.add(15);
		hs2.add(18);
		
		System.out.println(hs1);
		System.out.println(hs2);
		
		
	      

	}

}
