package com.example.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Users;
import com.example.service.UsersService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class UsersController {
	
	@Autowired
	UsersService us;
	
	@GetMapping("/users")
	public List<Users> getAll() {
		return us.getAll();
	}
	
	@GetMapping("/user/{uusername}")
	public Users signIn(@PathVariable("uusername") String uusername) {
		return us.getById(uusername);
	}
	
	@PostMapping("/sign-up")
	public String signUp(@RequestBody Users u){  
		us.save(u);
		return "Account created successfully.";
	}
	
	@PutMapping("/forget")
	public String forgetPassword(@RequestBody Users u) {
		us.save(u);
		
		return "Password changed successfully.";
	}
}
