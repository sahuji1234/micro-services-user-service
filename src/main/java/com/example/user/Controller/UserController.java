package com.example.user.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.user.entity.User;
import com.example.user.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
 
	@Autowired
	private UserService userService;
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") Long userId) {	
		User user= this.userService.getUser(userId);
     	List contacts =	this.restTemplate.getForObject("http://contact-service/contact/user/"+userId, List.class);
		user.setContacts(contacts);
		return user;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
