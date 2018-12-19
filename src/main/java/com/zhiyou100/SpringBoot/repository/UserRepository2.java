package com.zhiyou100.SpringBoot.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.zhiyou100.SpringBoot.modle.User;
//增删改查
public interface UserRepository2 extends Repository<User, Integer>{

	//查询方法要以get、find，或者read开头。条件查询属性用关键字连接，查询的首字母要大写
	
	//使用query注解，写hql语句。
	
	public User findByName(String name);
	
	@Query("from User where name=:n")
	public User xx(@Param("n")String n);
		
	
}
