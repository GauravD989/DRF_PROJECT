package asd;


class first implements Runnable
{
	public void run() 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("hello");
		}
		
	}
}

public class DemoRuneableThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		first ob=new first();
		
		Thread t1=new Thread(ob);
		t1.start();
		
	}

}
