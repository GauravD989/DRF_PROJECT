package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.Userdto;
import com.example.demo.service.Userservice;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private Userservice userservice;

	@PostMapping("/createUser")
	public ResponseEntity<Userdto> addUser(@Valid @RequestBody Userdto userdto){
		Userdto createdUser = userservice.createUser(userdto);
		
		return new ResponseEntity<Userdto>(createdUser, HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getUser")
	public ResponseEntity<List<Userdto>> getUser(@RequestBody Userdto userdto){
		List<Userdto> alluser = userservice.getAlluser();
		
		return new ResponseEntity<List<Userdto>>(alluser,HttpStatus.CREATED);
	}
		
	@PutMapping("/updateUser/{userId}")
	public ResponseEntity<Userdto> updateUser(@PathVariable("userId")String id,@RequestBody Userdto userdto)
	{
		Userdto dto = userservice.updateUser(userdto, id);
		return new ResponseEntity<Userdto>(dto, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{userId}")
	public void deleteUser(@PathVariable("userId") String id) {
		userservice.deleteUser(id);
	}
	
	@GetMapping("/Alluers")
	public ResponseEntity<List<Userdto>> getAllusers()
	{
		List<Userdto> Alluser = userservice.getAlluser();
		return new ResponseEntity<List<Userdto>>(Alluser,HttpStatus.OK);
	}
	
	@GetMapping("getid/{userId}")
	public ResponseEntity<Userdto> getbyId(@PathVariable("userId") String id){
		Userdto byId = userservice.getById(id);
		return new ResponseEntity<Userdto>(byId,HttpStatus.OK);
	}
	
	@GetMapping("/email/{email}")
	public ResponseEntity<Userdto> getByEmail(@PathVariable String email)
	{
		Userdto userbyemail = userservice.getByEmail(email);
		return new ResponseEntity<Userdto>(userbyemail, HttpStatus.OK);
		
	}
	
		

}
