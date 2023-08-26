package com.example.demo.validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AboutValidator implements ConstraintValidator<ValidateAbout, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		if(value.length()<20)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

}
