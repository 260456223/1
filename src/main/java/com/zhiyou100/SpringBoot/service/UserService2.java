package com.zhiyou100.SpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.SpringBoot.modle.User;
import com.zhiyou100.SpringBoot.repository.UserRepository2;
@Service
public class UserService2 {

	@Autowired
	private UserRepository2 userRepository2;
	
	public User fingByName(String name){
		return userRepository2.findByName(name);
		
	}
	public User xx(String n){
		return userRepository2.xx(n);
		
	}
}
