package com.example.hello.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import com.example.hello.entites.APIResponse;
import com.example.hello.entites.LoginRequest;
import com.example.hello.entites.user;
import com.example.hello.repository.UserRepository;
//import com.example.hello.service.loginService;
import com.example.hello.service.userService;




@CrossOrigin(origins = "*")
@RestController
public class displayUseRestController {
	@Autowired
	private UserRepository repo;
	
	@Autowired
	private userService uService;
	
//	@Autowired
//	private AuthenticationManager authenticationManager;
//	
//	@Autowired
//	private PasswordEncoder encoder;
	
	@Autowired
//	private loginService lsvc;
	
	
	
	
	
	//@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/createe")
	public String CreateNewUser(@RequestBody user userInfo) {
		System.out.println("haha");
		user u1 = new user(userInfo.getName(),userInfo.getAge(),userInfo.getPhone_number(),userInfo.isGender(),
				userInfo.getGmail(),userInfo.getUser_name(),userInfo.getPassword());
		repo.insert(u1);
		//return "";
		return "Create successfully";
		
	}
	
	//@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/getAllUsers")
	public List<user> getALLUser() {
		return repo.findAll();
		
		
	}
	
	@GetMapping("/getuserbyid/{id}")
	public user getUserById(@PathVariable("id")String id) {
		
		return uService.getUserById(id);
		
	}
	
	@PostMapping("/deleteuser")
	public String deleteUser(@RequestBody List<user> ls) {
		uService.deleteUserByListId(ls);
		return "delete successfully";
	}
	
	@PutMapping("/updatee")
	public String saveUpdate(@RequestBody user userInfo) {
		user u1 = new user(userInfo.getName(),userInfo.getAge(),userInfo.getPhone_number(),userInfo.isGender(),
				userInfo.getGmail(),userInfo.getUser_name(),userInfo.getPassword());
		u1.setId(userInfo.getId());
//		System.out.println(userinfo.getId());
//		System.out.println(userinfo.getName());
//		System.out.println(userinfo.getAge());
//		System.out.println(userinfo.getDob());
		
	   uService.updateUser(u1.getId(), u1);
		return "Update successfully";	
	
		
	}
	
//	@PostMapping("/authlogin")
//	public ResponseEntity<APIResponse> authenticateUser(@RequestBody LoginRequest loginRequest){
//		APIResponse apiResponse= lsvc.login(loginRequest);
//				return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
//	}
	
	
}
	

	
	
//
//	@GetMapping("/showUsers")
//	public List<user> showAllUser(Model model) {
//	//	model.addAttribute("users", repo.findAll());
//	//	return "index";
//		return uService.getAllUser();
//}
//	}
