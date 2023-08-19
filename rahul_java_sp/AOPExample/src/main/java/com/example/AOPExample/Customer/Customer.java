package com.example.AOPExample.Customer;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	public void login()
	{
		System.out.println("Login Successfully");
	}
	
	public void logout()
	{
		System.out.println("Logout Successfully");
	}

}
