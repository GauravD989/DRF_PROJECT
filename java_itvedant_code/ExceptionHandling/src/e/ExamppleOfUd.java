package e;
//28-06-2023

class InvalidAgeExeption extends Exception
{
	public InvalidAgeExeption(String str) {
		System.out.println(str);
	}
}
public class ExamppleOfUd {

	public static void main(String[] args) throws InvalidAgeException{
		// TODO Auto-generated method stub
		int age=12;
		if(age<18)
		{
			throw new InvalidAgeException("You are not eligible to vote");
		}

	}

}
