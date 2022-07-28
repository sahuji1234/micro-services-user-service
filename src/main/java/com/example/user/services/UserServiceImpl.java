package com.example.user.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.user.entity.User;


@Service
public class UserServiceImpl implements UserService{

	List<User> list =List.of(
			
			new User(1311L,"suraj","123456"),
			new User(1312L,"ankit","123456456"),
			new User(1313L,"vishal","12345698"),
			new User(1314L,"narendra","12345645")
			
			);
	
	
	
	@Override
	public User getUser(Long id) {
		
		return this.list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
	}

}
