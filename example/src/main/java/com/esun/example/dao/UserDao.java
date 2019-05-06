package com.esun.example.dao;

import java.util.List;

import com.esun.example.model.User;
 

public interface UserDao {

	User findByName(String name);
	
	List<User> findAll();

}