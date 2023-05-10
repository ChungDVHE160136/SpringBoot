package com.example.hello.entites;

import java.util.List;

public class JwtResponse {
	private String token;
	private String type="Bearer";
	private Long id;
	private String name;
	private String password;
	private List<String> roles;
public JwtResponse() {
	// TODO Auto-generated constructor stub
}
public JwtResponse(String token, String type, Long id, String name, String password, List<String> roles) {
	super();
	this.token = token;
	this.type = type;
	this.id = id;
	this.name = name;
	this.password = password;
	this.roles = roles;
}
public String getToken() {
	return token;
}
public void setToken(String token) {
	this.token = token;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
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
public List<String> getRoles() {
	return roles;
}
public void setRoles(List<String> roles) {
	this.roles = roles;
}

	
}
