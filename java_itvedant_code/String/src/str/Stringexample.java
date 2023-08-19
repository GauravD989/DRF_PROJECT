//String==26-06-2023
package str;

import java.util.Scanner;

public class Stringexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String s1=new String("Hello");
//		System.out.println(s1);
//		
//		String s2="java";
//		System.out.println(s2);
//		
//		int len=s2.length();
//		System.out.println("The length of string is: "+len);

//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter username : ");
//		String name=sc.nextLine();
//		
//		if(name.length()<6)
//		{
//			System.out.println("username must be more than 6 characters");
//		}
//		else
//		{
//			System.out.println("Username has been set successfuly");
//		}
		
		//concat methods
		/*
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter username : ");
		String name=sc.nextLine();
		
		name=name.concat("@gmail.com");
		System.out.println(name);
		
		System.out.println(name.substring(3));
		System.out.println(name.substring(3,8));*/
		
		/*
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter username : ");
		String uname=sc.nextLine();
		
		System.out.println("enter index: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(uname.substring(a,b+1));
		*/
		
//		String str="Hello";
//		System.out.println(str.charAt(2));
		/*
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter username : ");
		String str=sc.nextLine();
		
		int las_index=str.length()-1;
		for(int i= las_index;i>=0;i--) {
			System.out.println(str.charAt(i));
		}*/
		
		//panindom
		/*
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter username : ");
		String str=sc.nextLine();
		String rev="";
		
		int las_index=str.length()-1;
		for(int i= las_index;i>=0;i--) 
		{
			rev=rev+str.charAt(i);
			
		}
		System.out.println(rev);
		
		if(str.equals(rev))
		{
			System.out.println("It is palindrome");
		}
		else
		{
			System.out.println("It is not a palidrome");
		}*/
		
		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter username : ");
//		String str=sc.nextLine();
//		System.out.println(str.replace('a', '*'));
//		System.out.println(str.toLowerCase());
//		System.out.println(str.toUpperCase());
		
//		String str1="            Ram                 ";
//		System.out.println(str1);
//		str1=str1.trim();
//		System.out.println(str1);//space ko trime kar deta hai
	
		//27-06-2023==replaceAll
//		String str1="                      rahul                             ";
//		System.out.println(str1);
//		
//		str1=str1.replaceAll(" ", "");
//		System.out.println(str1);
//		
//		String str2="                 *abc$%#              ";
//		str2=str2.replaceAll("[$%#*]", "");
//		System.out.println(str2);
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the value: ");
//		String str3=sc.nextLine();
//		str3=str3.replaceAll("[$%#*]", "");
//		System.out.println(str3);
		
		
		//String Builder for mutable String
		/*
		String s="StringF";
		s=s.concat("bjhdjsofsio");
		System.out.println(s);
		
		StringBuilder sb=new StringBuilder("Hello");
		System.out.println(sb);
		sb.append("World");
		System.out.println(sb);*/
		
		/*
		String s1="0123456789";
		StringBuilder sb=new StringBuilder(s1);
		
//		sb.reverse();
//		sb.insert(1, "Hello");
//		sb.delete(1, 6);
//		sb.replace(1, 6, "ABCD");
		
		System.out.println(sb);*/
		
		//String Buffer
//		String s1="0123456789";
//		StringBuffer sb=new StringBuffer(s1);
//		System.out.println(sb);
//		
//		sb.insert(2, "Hello");
//		sb.replace(4, 8, "@");
//		System.out.println(sb);
//
//		System.out.println(sb.substring(3,8));
//		
//		sb.reverse();
//		sb.delete(2, 6);
//		System.out.println(sb);
//		
//		System.out.println(sb.charAt(3)); 
//		
		
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		System.out.println("Enter the character: ");
		char ch=sc.next().charAt(0);//char methods import
		
		int count=0;
		for (int i=0;i<str.length();i++) 
		{
			if(str.charAt(i)==ch)
			{
				count++;
			}
		}
		
		if(count==0)
		{
			System.out.println("Character is not present");
		}
		else
		{
			System.out.println("Count is "+count);
		}
		*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
