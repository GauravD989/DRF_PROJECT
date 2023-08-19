//22-06-2023
package Abs;
abstract class shape
{
	abstract void area();
	public void show()
	{
		System.out.println("Methods");
	}
}
class rectangle extends shape
{
	int length;
	int breadth;
	public void area()
	{
		System.out.println("Area of rectangle is " +(length*breadth));
	}
}
class circle extends shape
{
	int radius;
	public void area()
	{
		System.out.println("Area of circle is "+(Math.PI*radius*radius));
	}
}

public class secondexample {
	
	public static void main(String[] args) {
		rectangle r=new rectangle();
		r.length=12;
		r.breadth=14;
		
		r.area();
		
//		Circle
		
		
		circle c=new circle();
		c.radius=74;
		c.area();
		
	}

}
