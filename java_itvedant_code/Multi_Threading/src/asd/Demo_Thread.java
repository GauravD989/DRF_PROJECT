package asd;

class A extends Thread
{
	public void run() 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			try {
				Thread.sleep(2000);//output ko deneme time lega 1000 mins 1 second
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class B extends Thread
{
	public void run() 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Bye Bye");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class Demo_Thread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		A obj=new A();
		obj.start();
		 
		B obj1=new B();
		obj1.start();
		
		obj.join();
		obj1.join();
		System.out.println("**************Main Method**********");

	}

}
