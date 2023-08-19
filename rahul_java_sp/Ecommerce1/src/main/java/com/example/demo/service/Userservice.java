package com.example.demo.service;

import java.util.List;

import com.example.demo.DTO.Userdto;

public interface Userservice {
	
	//Create User
	Userdto createUser(Userdto userdto);
	
	//Update User
	Userdto updateUser(Userdto userdto,String id);
	
	//Delete User
	void deleteUser(String id);
	//To get all users
	List<Userdto> getAlluser();
	//To receive by id
	Userdto getById(String id);
	//To receive by email
	Userdto getByEmail(String email);
	

}
