package com.example.AOPExample.Customer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=
		new AnnotationConfigApplicationContext(Customerconfig.class);
		
		Customer c = context.getBean("customer",Customer.class);
		c.login();
		c.logout();
		

	}

}
