package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/loginhome")
	public String login()
	{
		System.out.println("login page home");
		return "login";
	}

}
