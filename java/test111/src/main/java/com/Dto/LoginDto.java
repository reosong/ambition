package com.Dto;

public class LoginDto {

	String name;
	String password;
	String email;
	
	public LoginDto(String name, String password, String email) {
		this.name = name;
		this.password = password;
		this.email = email;
		
	}

	public String getName() {
		return name;
	}

	

	public String getPassword() {
		return password;
	}



	public String getEmail() {
		return email;
	}



	
	
	
	
}
