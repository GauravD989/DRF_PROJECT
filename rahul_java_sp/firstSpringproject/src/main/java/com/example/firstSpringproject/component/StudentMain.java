package com.example.firstSpringproject.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=
		new AnnotationConfigApplicationContext(StudentConfig.class);
		
		Student bean =(Student) context.getBean("student");
		
		//Student bean2= context.getBean("student",student.class);
		System.out.println(bean);

	}

}
