package com.zhiyou100.SpringBoot.repository;

import org.springframework.data.repository.CrudRepository;

import com.zhiyou100.SpringBoot.modle.User;
//增删改查
public interface UserRepository extends CrudRepository<User, Integer>{

	
}
