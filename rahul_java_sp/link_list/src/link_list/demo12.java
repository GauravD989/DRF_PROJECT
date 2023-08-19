package link_list;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class demo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		LinkedHashMap<Integer, String> lm=new LinkedHashMap<Integer, String>();
//		lm.put(101, "ABC");
//		lm.put(102, "PQR");
//		lm.put(103, "STU");
//		lm.put(null, "STU");
//		
//		System.out.println(lm);
//		
//		System.out.println(lm.entrySet());
//		System.out.println(lm.keySet());
//		System.out.println(lm.values());
//		
//		System.out.println(lm.getOrDefault(112, null));
//		
//		System.out.println(lm.containsKey(101));
//		System.out.println(lm.containsValue("PQR"));

		TreeMap lm = new TreeMap();
		
		lm.put(101, "ABC");
		lm.put(102, "PQR");
		lm.put(103, "STU");
		lm.put(104, "WER");
	
		
		System.out.println(lm);
		
		System.out.println(lm.entrySet());
		System.out.println(lm.keySet());
		System.out.println(lm.values());
		
		System.out.println(lm.getOrDefault(112, null));
		
		System.out.println(lm.containsKey(101));
		System.out.println(lm.containsValue("PQR"));
		
		System.out.println(lm);
		System.out.println(lm.ceilingKey(103));
		System.out.println(lm.higherKey(103));
		
		System.out.println(lm.floorKey(102));
		System.out.println(lm.lowerKey(102));
		
		System.out.println(lm.headMap(104));
		System.out.println(lm.tailMap(104));
		System.out.println(lm.subMap(101, true, 110, true));
		
		

	}

}
