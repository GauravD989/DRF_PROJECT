package com.example.firstSpringproject.Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConflig {
	
	@Bean
	public Employee getEmployee()
	{
		Employee e1=new Employee();
		return e1;
	}
	
	@Bean
	public Employee getEmployeedetails()
	{
		Employee e1=new Employee(111,"PQR",25000);
		return e1;
	}

}
