//22-06-2023==Interface
/*
package InterfaceExample;

interface I1
{
	void show();//interface method (does not have a body)
}

class demo implements I1
{
	public void show()
	{
		System.out.println("Show method in demo");
	}
}

class demo1 implements I1
{
	public void show()
	{
		System.out.println("Show method in 2nd class");
	}
}

public class FirstExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		demo d1=new demo();
		d1.show();
		
		demo1 d2=new demo1();
		d2.show();

	}

}*/

package InterfaceExample;

interface I1
{
	void show();//interface method (does not have a body)
	int add(int a,int b);//int method
}

class demo implements I1
{
	public void show()
	{
		System.out.println("Show method in demo");
	}
	public int add(int a,int b)//int type methods
	{
		return a+b;
	}
}

class demo1 implements I1
{
	public void show()
	{
		System.out.println("Show method in 2nd class");
	}
	public int add(int a,int b)//int type methods
	{
		return a+b;
	}
}

public class FirstExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		demo d1=new demo();
		d1.show();
		System.out.println(d1.add(450, 210));//call int methods
		
		demo1 d2=new demo1();
		d2.show();
		System.out.println(d2.add(450, 210));

	}

}