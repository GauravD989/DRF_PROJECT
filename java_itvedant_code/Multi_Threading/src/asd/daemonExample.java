package asd;

public class daemonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method started");
		
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				while(true)
				{
					System.out.println("Deamon thread is running");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
	 	
		t1.setDaemon(true);
		
		t1.start();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Main method stopped");
	}

}
