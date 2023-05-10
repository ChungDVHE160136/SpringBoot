package com.example.hello.entites;

public class LoginRequest {
	private String name;
	private String password;
	public LoginRequest() {
		// TODO Auto-generated constructor stub
	}
	public LoginRequest(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
