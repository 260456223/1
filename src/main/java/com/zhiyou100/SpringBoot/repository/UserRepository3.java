package com.zhiyou100.SpringBoot.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.zhiyou100.SpringBoot.modle.User;
//增删改查
public interface UserRepository3 extends PagingAndSortingRepository<User, Integer>{

	//查询方法要以get、find，或者read开头。条件查询属性用关键字连接，查询的首字母要大写
	
	//使用query注解，写hql语句。
	
	
	
}
