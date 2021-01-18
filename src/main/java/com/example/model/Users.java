package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

//import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Users {
	@Id
	private String uusername;
	private String upassword;
	
	public String getUusername() {
		return uusername;
	}
	public void setUusername(String uusername) {
		this.uusername = uusername;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	
}
