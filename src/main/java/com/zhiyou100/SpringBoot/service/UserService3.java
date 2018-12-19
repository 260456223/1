package com.zhiyou100.SpringBoot.service;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import com.zhiyou100.SpringBoot.modle.User;
import com.zhiyou100.SpringBoot.repository.UserRepository3;
@Service
public class UserService3 {

	@Autowired
	private UserRepository3 userRepository3;
	
	public Page<User> UserAll(Pageable page){
		return  userRepository3.findAll(page);
		
	}
	
}
