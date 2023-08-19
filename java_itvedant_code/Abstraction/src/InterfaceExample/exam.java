package InterfaceExample;

interface In1
{
	int add(int a,int b);
//	int sub(int a,int b);
}

interface In2
{
	int sub(int a,int b);
}

class multiple implements In1,In2
{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}
	
}

public class exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		multiple m=new multiple();
		System.out.println(m.add(25, 98));
		
		int x=m.sub(56, 20);
		System.out.println(x);

	}

}
