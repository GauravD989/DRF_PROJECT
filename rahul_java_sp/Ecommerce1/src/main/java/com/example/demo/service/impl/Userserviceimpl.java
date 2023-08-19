package com.example.demo.service.impl;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.Userdto;
import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.Userservice;

@Service
public class Userserviceimpl implements Userservice {
	
	@Autowired
	UserRepository repository;

	@Override
	public Userdto createUser(Userdto userdto) {
		// TODO Auto-generated method stub
		
		//Generate Random ID
		String id = UUID.randomUUID().toString();
		userdto.setId(id);
		//Cpnversion from dto to Entity
		User u = dtoToEntity(userdto);
		
		User savedUser = repository.save(u);
		
		//entity toDto
		Userdto savedDto = entityToDto(savedUser);
		return savedDto;
	}

	@Override
	public Userdto updateUser(Userdto userdto, String id) {
		// TODO Auto-generated method stub
		User u = repository.findById(id).orElseThrow(()->new RuntimeException("User Not found"));
		u.setName(userdto.getName());
		u.setAbout(userdto.getAbout());
		u.setImage(userdto.getImage());
		u.setGender(userdto.getGender());
		u.setEmail(userdto.getEmail());
		u.setPassword(userdto.getPassword());
		
		User savedUser = repository.save(u);
		Userdto saveddto = entityToDto(savedUser);
		
		return saveddto;
	}

	@Override
	public void deleteUser(String id) {
		// TODO Auto-generated method stub
		User u = repository.findById(id).orElseThrow(()->new RuntimeException("User not found"));
		repository.delete(u);
		
	}

	@Override
	public List<Userdto> getAlluser() {
		// TODO Auto-generated method stub
		List<User> Userlist = repository.findAll();
		List<Userdto> dtolist = Userlist.stream().map(user->entityToDto(user)).collect(Collectors.toList());
		
		
		return dtolist;
	}

	@Override
	public Userdto getById(String id) {
		// TODO Auto-generated method stub
		User u = repository.findById(id).orElseThrow(()->new RuntimeException("user not found by this id"));
		Userdto dto = entityToDto(u);
		
		return dto;
	}

	@Override
	public Userdto getByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	
	//Dto to entity
	public User dtoToEntity(Userdto userdto)
	{
		
		User u = User.builder()
		.id(userdto.getId())
		.name(userdto.getName())
		.about(userdto.getAbout())
		.password(userdto.getPassword())
		.email(userdto.getEmail())
		.gender(userdto.getGender())
		.image(userdto.getImage())
		.build();
		
		return u;
	}
	
	//entity to DTO
	public Userdto entityToDto(User user)
	{
		Userdto dto = Userdto.builder()
		.id(user.getId())
		.name(user.getName())
		.password(user.getPassword())
		.image(user.getImage())
		.about(user.getAbout())
		.email(user.getEmail())
		.gender(user.getGender())
		.build();
		
		return dto;
	}

}
