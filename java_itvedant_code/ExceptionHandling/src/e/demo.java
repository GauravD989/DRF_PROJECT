package e;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

//import javax.swing.filechooser.FileNameExtensionFilter;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//27-06-2023
		/*
		System.out.println(1/1);
		
		System.out.println(1/1);
		System.out.println(1/1);
		
		try
		{
			System.out.println(1/0);
		}
		catch(Exception e)
		{
			System.out.println("Cannot divide by zero");
		}
		
		System.out.println(1/1);*/
		
		//28-06-2023
		/*
		Scanner sc=new Scanner(System.in);
		
		System.out.println(1/1);
		try {
			System.out.println(1/0);
		}
		catch(Exception) {
			System.out.println("cannot divide by zero");
		}
		*/
		/*
		Scanner sc=new Scanner(System.in);
		try {
			int a=sc.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid input");
		}*/
		
		/*
		Scanner sc=new Scanner(System.in);
		try
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("Division is "+(a/b));
		}
		catch (ArithmeticException e) {
			System.out.println("You cannot divide any number by zero");
			
		}
		catch (InputMismatchException e) {
			System.out.println("Please enter a number");
		}*/
		
		/*
		Scanner sc=new Scanner(System.in);
		
		String a=null;
		try {
			System.out.println(a.length());
			}
		catch (NullPointerException e) {
			System.out.println("String is empty");
		}*/
		/*
		Scanner sc=new Scanner(System.in);
		
		String a=null;
		try {
			System.out.println(a.length());
			}
		catch (ArithmeticException e) {//error
			System.out.println("String is empty");
		}
		
		finally {
			System.out.println("Finally bloack");
		}
		
		System.out.println("Code below the exception");
		*/
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age ");
		int age=sc.nextInt();
		if(age<18)
		{
			throw new ArithmeticException("Invalid AGE");
		}*/
		
		/*
		public class demo {
			public static void comp()throw FileNameExtensionFilter
			{
				FileInputStream fis=new FileInptStream();
			}

			public static void main(String[] args) {
				
				Scanner sc=new Scanner(System.in);
				System.out.println("Hr");
				try
				{
					comp();
				}
				catch (FileNotFoundException e) {
					System.out.println("File not found");
				}
			}
		}*/
		

	}

}
