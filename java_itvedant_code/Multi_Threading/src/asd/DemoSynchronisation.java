package asd;


class demoS{
	int count;
	int dcount;
	
	public synchronized void increment()
	{
		
		synchronized (this) {
			count++;
		}
		dcount++;
	}
}
public class DemoSynchronisation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		demoS d1=new demoS();
		
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=1;i<=10000;i++)
				{
					d1.increment();
				}
				
			}
		});
		
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				for(int i=1;i<=10000;i++)
				{
					d1.increment();
				}
				
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println(d1.count);
		System.out.println(d1.dcount);

	}

}
