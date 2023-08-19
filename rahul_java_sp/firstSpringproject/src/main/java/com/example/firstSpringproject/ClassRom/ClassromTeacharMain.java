package com.example.firstSpringproject.ClassRom;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class ClassromTeacharMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ApplicationContext context = new AnnotationConfigApplicationContext(ClassromTeacharConfig.class);

		Classrom c1 = context.getBean("classrom", Classrom.class);
		Teachar t1 = context.getBean("teachar", Teachar.class);
		
		c1.setRoomno(1);
		c1.setSubject("java");
		
		t1.setTid(123);
		t1.setTname("adg");
		
		System.out.println(c1);
		System.out.println(t1);

	}

}
