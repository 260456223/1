package com.zhiyou100.SpringBoot.controller;

import java.util.List;

import javax.print.attribute.standard.PageRanges;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhiyou100.SpringBoot.modle.User;
import com.zhiyou100.SpringBoot.service.UserService3;

@RestController
public class UserController3 {

	@Autowired
	UserService3 userService3;


	
	@RequestMapping("/userAll")
	public List<User> userAll(){

		Pageable page=new PageRequest(0,2);
		Page<User> p=userService3.UserAll(page);
		//当前查询的页数
		System.out.println(p.getNumber());
		//查询的信息数
		System.out.println(p.getNumberOfElements());
		//查询的总条数
		System.out.println(p.getSize());
	
		System.out.println(p.getContent());
	//	System.out.println(5/0);
		return p.getContent();
		
	}

}
