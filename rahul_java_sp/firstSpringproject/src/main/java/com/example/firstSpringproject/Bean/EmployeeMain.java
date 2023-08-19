package com.example.firstSpringproject.Bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=
		new AnnotationConfigApplicationContext(EmployeeConflig.class);
		
		Employee e = context.getBean("getEmployee",Employee.class);
		
		System.out.println(e);
		
		Employee e1 =(Employee) context.getBean("getEmployeedetails");
		System.out.println(e1);
		
		
		
		
		
	}

}
