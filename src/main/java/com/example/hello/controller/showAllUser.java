package com.example.hello.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.hello.entites.user;
import com.example.hello.repository.UserRepository;
import com.example.hello.service.userService;

@Controller
public class showAllUser {
	@Autowired
	private UserRepository repo;
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Autowired
	private userService uService;
	
	@GetMapping("/")
	public String abc(Model model) {
		//List<user> users = repo.findAll();
//		Query query = new Query();
//		query.addCriteria(Criteria.where("Name").is("Chung"));
		//List<user> users = us.;
		//List<user> u = uService.getUserbyName("Chung");
		List<user> u = uService.getUserbyAge(99);
		model.addAttribute("users", u);
		return "index";
	}
	
	@GetMapping("/showAll")
	public String showAllUser(Model model) {
		model.addAttribute("users", repo.findAll());
		return "index";
	}
	
	@GetMapping("/showform")
	public String aaa(Model model) {	
		return "CreateForm";
	}
	
	@GetMapping("/update/{id}")
	public String updateUser(@PathVariable String id, Model model) {
		model.addAttribute("user", uService.getUserById(id));
		return "Update";
	}
//	@PutMapping("/updatee")
//	public String saveUpdate(@RequestBody user userInfo) {
//		user u1 = new user(userInfo.getName(),userInfo.getAge(),userInfo.getPhone_number(),userInfo.isGender(),
//				userInfo.getGmail(),userInfo.getUser_name(),userInfo.getPassword());
//		u1.setId(userInfo.getId());
//		System.out.println(userinfo.getId());
//		System.out.println(userinfo.getName());
//		System.out.println(userinfo.getAge());
//		System.out.println(userinfo.getDob());
		
	//	uService.updateUser(userinfo.getId(), u);
//		return "redirect:showAll";	
//	
//		
//	}
	
	@DeleteMapping("/delete")
	public String deleteUser(@RequestBody user info) {
		//repo.deleteById("643e0f5fe74c7f0946264d1b");
		uService.deleteUserById(info.getId());
		return "redirect:showAll";	
	}
	// delete by age
	@DeleteMapping("/deletebyage")
	public String deleteAge(@RequestBody user info) {
		//repo.deleteByAge(99);
		System.out.println(info.getAge());
		//System.out.println(info.getName());
		uService.deleteUserByAge(info.getAge());
		return "redirect:showAll";
	}
	
//	@DeleteMapping("/delete")
//	public String deleteUser() {
//		Query query = new Query();
//	}
	
//	@CrossOrigin(origins = "http://localhost:4200")
//	@PostMapping("/create")
//	public String CreateNewUser(@RequestBody user userInfo) {
//		System.out.println("haha");
//		user u1 = new user(userInfo.getName(),userInfo.getAge(),userInfo.getDob());
//		repo.insert(u1);
//		//return "";
//		return "redirect:showAll";
//		
//	}
}
