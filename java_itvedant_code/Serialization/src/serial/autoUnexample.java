package serial;

public class autoUnexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Primitive to Wrapper: Autoboxing
		
		int i=6;
		Integer j=Integer.valueOf(i);
		System.out.println("Autoboxing j="+j);
		
		//Since java 5
		Integer k=i;
		System.out.println("Autoboxing k="+k);
		
		//Wrapper to Primitive:Unboxing
		
		Integer m=new Integer(52);
		int n=m.intValue();
		System.out.println("Unboxing n="+n);
		
		//Since java5
		
		int s=m;
		System.out.println("Unboxing s="+m);
		

	}

}
