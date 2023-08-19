package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class demoLocalDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		
		LocalTime lm= LocalTime.now();
		System.out.println(lm);
		
		LocalDateTime ldt= LocalDateTime.now();
		System.out.println(ldt);
		
		
		
		DateTimeFormatter pattern= DateTimeFormatter.ofPattern("dd*/*MM*/*YYYY");
		String format= pattern.format(ld);
		
		System.out.println(format);
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter date Pattern ");
//		String s=sc.nextLine();
//		DateTimeFormatter pat= DateTimeFormatter.ofPattern(s);
//		String form = pat.format(ld);
//		System.out.println(form);
		
		System.out.println("date Time===============");
		LocalDate ll=LocalDate.of(2023, 8, 12);
		System.out.println(ll);
		
		System.out.println(ll.plusDays(10));
		System.out.println(ll.minusDays(10));
		System.out.println(ll.plusMonths(10));
		System.out.println(ll.plusYears(10));
		
		
		LocalTime lt=LocalTime.of(12,25,5);
		System.out.println(lt);
		System.out.println(lt.plusMinutes(10));
		
	}

}
