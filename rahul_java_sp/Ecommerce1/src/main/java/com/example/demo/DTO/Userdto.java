package com.example.demo.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Userdto {
	
	
	private String id;
	@NotBlank(message = "Username cannot be blank")
	private String name;
	
	private String about;
	private String gender;
	@Email(message = "Please enter valid email id")
	private String email;
	@Size(min = 6, max = 20, message = "Password must be more than 6 charecters")
	@Pattern(regexp = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[!@#$%^&*]) [a-zA-Z\\d!@#$%^&*]{6,22}$")
	private String password;
	private String image;

}
