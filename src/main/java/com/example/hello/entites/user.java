package com.example.hello.entites;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;

@Service
public class user {

	@Id
	private String id;
	private String name;
	private int age;
	private String phone_number;
	private boolean gender;
	private String gmail;
	private String user_name;
	private String password;
	
	
	public user() {
		// TODO Auto-generated constructor stub
	}


	public user(String name, int age, String phone_number, boolean gender, String gmail, String user_name,
			String password) {
		super();
		this.name = name;
		this.age = age;
		this.phone_number = phone_number;
		this.gender = gender;
		this.gmail = gmail;
		this.user_name = user_name;
		this.password = password;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getPhone_number() {
		return phone_number;
	}


	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}


	public boolean isGender() {
		return gender;
	}


	public void setGender(boolean gender) {
		this.gender = gender;
	}


	public String getGmail() {
		return gmail;
	}


	public void setGmail(String gmail) {
		this.gmail = gmail;
	}


	public String getUser_name() {
		return user_name;
	}


	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	
	
	
}
