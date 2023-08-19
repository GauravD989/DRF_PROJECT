package com.example.firstSpringproject.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.firstSpringproject.Bean.Employee;

public class CustomerProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(CustomerProductConfig.class);

		Customer c1 = context.getBean("customer", Customer.class);
		Product p1 = context.getBean("product", Product.class);
		
		c1.setId(101);
		c1.setName("ABC");
		
		p1.setProductId(123456);
		p1.setProductname("fan");
		
		System.out.println(c1);
		System.out.println(p1);

	}

}
