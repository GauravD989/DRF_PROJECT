package asd;

public class DemoRuneable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=1;i<=10;i++)
				{
					System.out.println("Annonymous inner type");
				}
				
			}
		});
		
		t2.start();

	}

}
