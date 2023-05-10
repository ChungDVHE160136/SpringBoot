//package com.example.hello.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.security.core.userdetails.User;
//import org.springframework.stereotype.Service;
//
//import com.example.hello.entites.APIResponse;
//import com.example.hello.entites.LoginRequest;
//import com.example.hello.entites.user;
//import com.example.hello.jwt.JwtUtility;
//import com.example.hello.repository.UserRepository;
//
//@Service
//public class loginService {
//		@Autowired
//		private UserRepository userRepository;
//		@Autowired 
//		private JwtUtility jwtUtility;
//		
//		public APIResponse login(LoginRequest loginRequest) {
//			APIResponse apiResponse = new APIResponse();
//			System.out.println("aaaa");
//			user u =userRepository.findByName(loginRequest.getName());
//	
//			if(u==null) {
//				apiResponse.setData("user login faild");
//				return apiResponse;
//			}
//				
//			String token = jwtUtility.generateJwt(u);
//			apiResponse.setData(token);
//			
//			return apiResponse;
//		}
//		
//	  
//		
//}
