package com.zhiyou100.SpringBoot.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.SpringBoot.modle.User;
import com.zhiyou100.SpringBoot.repository.UserRepository;
@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	public void save(User user){
		userRepository.save(user);
	}
	public void datele(int  id){
		userRepository.deleteById(id);
	}
	public User getUser(int id){
				
		return userRepository.findById(id).get();		
	}
	public Iterable<User> getAllUser(){
		
		return userRepository.findAll();		
	}
}
