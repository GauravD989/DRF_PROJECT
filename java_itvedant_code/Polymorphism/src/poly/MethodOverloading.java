//polymorphism
//polymorphism is divided in to tow parts.
//method overloading
//same class 
//same method name
//but 
//Different number of parameters or different types
/*
package poly;

class example
{
	public void printdeatils()
	{
		System.out.println("Hello");
	}
	
	public void printdeatils(String name)
	{
		System.out.println("Hello "+name );
	}
	
	public void printdeatils(int age)
	{
		System.out.println("My age is "+age);
	}
	
	public void printdeatils(String name,int age)
	{
		System.out.println("I am "+name+" "+"My age "+age);
	}
}


public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		example obj=new example();
		obj.printdeatils();
		obj.printdeatils("rahul");
		obj.printdeatils(19);
		obj.printdeatils("Rahul",24);

	}

}*/

package poly;

class example
{
	public int add(int a,int b)// use attributs
	{
		return a+b;//void can not give
	}
	
	public int add(int a,int b,int c)// use attributs
	{
		return a+b+c;//void can not give
	}
	
}


public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		example obj=new example();
		System.out.println(obj.add(15, 21));
		System.out.println(obj.add(15, 21, 25));

	}

}

