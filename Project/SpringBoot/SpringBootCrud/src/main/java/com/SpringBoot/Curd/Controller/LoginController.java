package com.SpringBoot.Curd.Controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.Curd.Entity.Login;
import com.SpringBoot.Curd.service.LoginService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import jakarta.servlet.ServletException;

@RestController
public class LoginController {
	@Autowired
	LoginService loginservice;
	
	@PostMapping("/login")
	public String validate(@RequestBody Login user) throws ServletException {
		String jwttoken="";
		//if username or password blank or not to check
		if(user.getUserName()== null || user.getPassword()==null) {
			throw new ServletException("please fill your username or password");
		}
		//take input from the user
		String username=user.getUserName();
		String password=user.getPassword();
		
		//calling the method to Loginuser
		user=loginservice.LoginUser(username, password);
		//To check the user present or not in database
		if(user==null) {
			 throw  new ServletException("User not found");
		}

		jwttoken = Jwts.builder().setSubject(username).claim("roles", "user").setIssuedAt(new Date())
				.signWith(SignatureAlgorithm.HS256, "secretkey").compact();
		
		return jwttoken;
	}

}
