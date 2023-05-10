package com.example.hello.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
//import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import com.example.hello.entites.user;
import com.example.hello.repository.UserRepository;

@Service
public class userService {
	//private final MongoTemplate mongoTemplate;
	@Autowired
	private UserRepository userRepository;
	
//	public List<user> getUserbyName(String name) {
//		
//			return userRepository.findByName(name).orElse(null);
//		
//	}
	
	public List<user> getUserbyAge(int Age) {
		
		return userRepository.findByAge(Age).orElse(null);
}
	
	
	public user updateUser(String id, user u) {
		u.setId(id);
		return userRepository.save(u);
	}
	
	public void deleteUserById(String id) {
		userRepository.deleteById(id);
	}
	
	public void deleteUserByListId(List<user>ls) {
		for(user id:ls) {
			userRepository.deleteById(id.getId());
		}
	}
	
	public void deleteUserByAge(int age) {
		List<user> ls= getUserbyAge(age);
		for(user u: ls) {
			userRepository.delete(u);;
		}
		
	}
	
//	public user getUserById(String id) {
//		return userRepository.findById(id).orElse(null);
//	}
	
	public List<user> getAllUser(){
		return userRepository.findAll();
	}
	
	public user getUserById(String id) {
		return userRepository.getUser(id);
	}
	
	public user findUserByName(String name) {
		return userRepository.findByName(name);
	}
//	public userService(MongoTemplate monoTemplate) {
//		this.mongoTemplate=monoTemplate;
//	}
	
//	public List<user> delete(String name) {
//		Query query = new Query();
//		query.addCriteria(Criteria.where("Name").is("Chung"));
//		return mongoTemplate.find(query, user.class);
//		
//	}

}
