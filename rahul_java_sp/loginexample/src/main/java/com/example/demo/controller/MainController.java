package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
	
	@GetMapping("/loginpage")
	public String login()
	{
		System.out.println("Login page loading");
		return "login";
	}
	
	@PostMapping("/submitpage")
	public String submit() 
	{
		return "submit";
		
	}

}
