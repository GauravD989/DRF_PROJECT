package com.example.AOPExample.Customer;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Myaspect {
	@Before("within(com.example.AOPExample.Customer.Customer)")
	public void makePayment()
	{
		System.out.println("********************Payment started*********************");
	}
	
	@After("within(com.example.AOPExample.Customer.Customer)")
	public void paymentdone()
	{
		System.out.println("*******************Payment Completed*************************");
	}

}
