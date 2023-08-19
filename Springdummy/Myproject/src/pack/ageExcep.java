package pack;


import java.util.Scanner ;

class AgeException extends Exception 
{
	public AgeException ()
	{
		super ("Invalid Age ");
	}
}                     

public class ageExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age;
		System.out.print("Enter Your Age :");
		age=sc.nextInt();
		
		try {
				if(age<18)
					{
						throw new AgeException();
					}
				else
				{
					System.out.println("Valid age");
				}
			}
		catch(AgeException e)
		{
			System.out.println(e);
		}
		
	}

}
