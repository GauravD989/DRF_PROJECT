package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
public class User {
	@Id
	private String id;
	@Column(length = 20)
	private String name;
	@Column(length = 1000)
	private String about;
	private String gender;
	@Column(unique = true)
	private String email;
	@Column(length = 15)
	private String password;
	private String image;

}
