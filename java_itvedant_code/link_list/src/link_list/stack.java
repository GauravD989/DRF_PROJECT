package link_list;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack st=new Stack();
		st.push(11);//add karega
		st.push(19);
		st.push(20);
		st.push(96);
		System.out.println(st);
//		
//		System.out.println(st.pop());//last eliment ko delete kar dega.
//		System.out.println(st);
//		
//		System.out.println(st.pop());
//		System.out.println(st);
//		
//		System.out.println(st.pop());
//		System.out.println(st);
		
		
		System.out.println(st.search(96));//kon sa kaha hai vo pata chalta hai

	}

}
