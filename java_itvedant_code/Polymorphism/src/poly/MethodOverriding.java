//method overriding
//many class
//same method name
//but 
//same number of parameters or same types

package poly;

class keyoard1
{
	public void enter()
	{
		System.out.println("It starts a new line");
	}
}

class keyoard2
{
	public void enter()
	{
		System.out.println("It closes a window");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		keyoard1 k1=new keyoard1();
		k1.enter();
		keyoard2 k2=new keyoard2();
		k2.enter();

	}

}
