package com.example.AOPExample.Customer;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan(basePackages = "com.example.AOPExample.Customer")
@EnableAspectJAutoProxy
public class Customerconfig {
	

}
