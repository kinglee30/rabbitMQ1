package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class LoginController {
	@RequestMapping("/index")
	public String loginin(){
		return "login";
	}
	@RequestMapping("/login")
	public String login(@RequestParam String username,@RequestParam String password){
		if(username.equals(password)){
			return "main";
		}else{
			return "fail";
		}
		
		
	}
}
