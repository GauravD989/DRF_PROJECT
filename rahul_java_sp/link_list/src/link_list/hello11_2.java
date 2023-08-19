package link_list;

import java.util.HashMap;

public class hello11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(101, "ABC");
		hm.put(102, "PQR");
		hm.put(103, "ABC");
		hm.put(104, "PQR");
		hm.put(101, "ABC");
		hm.put(105, null);
		hm.put(null, "ABC");
		hm.put(null, "ABC");//only one null key are alloud
		System.out.println(hm);
		System.out.println(hm.entrySet());//give set value
		System.out.println(hm.keySet());//give only key
		System.out.println(hm.values());//give only values
		
		hm.remove(102);
		System.out.println(hm);
		
		hm.putIfAbsent(102, "shho");//if not present than add when if present then not add
		System.out.println(hm);
		
		System.out.println(hm.get(104));
		
		System.out.println(hm.replace(105, "XYZ"));
		System.out.println(hm);
		
		

	}

}
