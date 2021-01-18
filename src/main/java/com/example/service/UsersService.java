package com.example.service;

import java.util.ArrayList;
import java.util.List;

//import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Users;
import com.example.repo.UsersRepo;

@Service
public class UsersService {
	
	@Autowired
	UsersRepo ur;
	
	public void save(Users u) {
		ur.save(u);
	}
	
	public Users getById(String uusername) {
		Users user1 = new Users();
		user1.setUusername("");
		user1.setUpassword("");
		Users user = ur.findById(uusername).orElse(user1);
		return user;
	}
	
	public List<Users> getAll(){
		List<Users> ul = new ArrayList<Users>();
		ur.findAll().forEach(l -> ul.add(l));
		return ul;
	}
	

}
