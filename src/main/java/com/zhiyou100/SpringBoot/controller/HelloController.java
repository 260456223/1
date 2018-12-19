package com.zhiyou100.SpringBoot.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou100.SpringBoot.modle.User;

//@RestController 相当于在本类的所有RequestMapping之上贴了
@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String hello(Map<String , Object> map) {

		map.put("msg", "哈哈哈哈啊哈");
		return "hello";
	}

	// SpringBoot支持json，会把返回对象与数组以json方式显示
	@RequestMapping("/getuser")
	public List<User> getUser() {
		List<User> list = new ArrayList<>();
		list.add(new User(1, "张三", 11));
		list.add(new User(2, "张三", 11));
		list.add(new User(3, "张三", 11));
		return list;
	}
}
