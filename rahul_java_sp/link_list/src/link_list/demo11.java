package link_list;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		TreeSet ts=new TreeSet();
//		ts.add(12);
//		ts.add(85);
//		ts.add(114);
//		ts.add(129);
//		ts.add(123);
//		ts.add(120);
//		
//		System.out.println(ts.ceiling(85));//If the given value not present than give niyarest number of in biger number.
//		System.out.println(ts.floor(85));//If the given value not present than give niyarest number of in smaller number.
//		
//		System.out.println(ts.higher(85));//It not check value is present or not just give higher number.
//		System.out.println(ts.lower(85));//It not check value is present or not just give lower number.
//		
//		System.out.println(ts.headSet(129,true));//given number ke chota nuber retun karega 
//		System.out.println(ts.tailSet(129,false));//given number se uper ka value and false mins khudh ko n in lude kare 
//		

//		PriorityQueue pq=new PriorityQueue();
//		pq.add(21);
//		pq.add(29);
//		pq.add(89);
//		
//		System.out.println(pq);
//		
//		System.out.println(pq.poll());//first value remove karta hai //FIFO
//		System.out.println(pq);
//		
//		System.out.println(pq.poll());
//		System.out.println(pq);
//		
//		System.out.println(pq.poll());
//		System.out.println(pq);
		
//		ArrayDeque al=new ArrayDeque();
//		al.add(19);
//		al.add(52);
//		al.add(21);
//		al.add(22);
//		al.add(12);
//		al.add(11);
		
//		System.out.println(al);
//		System.out.println(al.pollFirst());//first value remove karega
//		System.out.println(al.pollLast());//last value remove karega
//		System.out.println(al);
//		
//		System.out.println(al);
//		System.out.println(al.peekFirst());//only see first value but not remove
//		System.out.println(al.peekLast());//only see last value but not remove
//		System.out.println(al);
		
//		Iterator i=al.descendingIterator();//ullta print kareg
//		while(i.hasNext())
//		{
//			System.out.println(i.next());//print karega
//		}
		
		
		ArrayDeque al=new ArrayDeque();
		al.add(19);
		al.add(52);
		al.add(21);
		al.add(22);
		al.add(22);
		al.add(11);
		
		System.out.println(al);
		System.out.println(al.removeLastOccurrence(22));//dobalicat ko remove kar ke ek value rakhata hai 
		System.out.println(al);
		
	}

}
