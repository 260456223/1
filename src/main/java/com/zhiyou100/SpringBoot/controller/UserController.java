package com.zhiyou100.SpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhiyou100.SpringBoot.modle.User;
import com.zhiyou100.SpringBoot.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping("/save")
	public void save() {
		User user = new User();
		user.setName("张三");
		user.setAge(18);
		userService.save(user);
	}

	@RequestMapping("/delete")
	public void delete() {
		userService.datele(1);
	}

	@RequestMapping("/get")
	public User get() {

		return userService.getUser(1);
	}

	@RequestMapping("/getAll")
	public Iterable<User> getAll() {

		return userService.getAllUser();
	}
}
