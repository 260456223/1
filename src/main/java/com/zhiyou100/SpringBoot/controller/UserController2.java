package com.zhiyou100.SpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhiyou100.SpringBoot.modle.User;
import com.zhiyou100.SpringBoot.service.UserService2;

@RestController
public class UserController2 {

	@Autowired
	UserService2 userService2;

	@RequestMapping("/fingByName")
	public User fingByName(String name){
		return userService2.fingByName("我我");
		
	}
	@RequestMapping("/xx")
	public User xx(String n){
		return userService2.xx("我我");
		
	}
}
