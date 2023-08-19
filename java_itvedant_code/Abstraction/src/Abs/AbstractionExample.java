package Abs;

abstract class vehicle
{
	abstract void start();
}

class car extends vehicle
{
	void start()
	{
		System.out.println("Car starts with key");
	}
}

class bike extends vehicle
{
	void start()
	{
		System.out.println("Bike starts with key");
	}
}

public class AbstractionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car c=new car();
		c.start();
		bike b=new bike();
		b.start();

	}

}
