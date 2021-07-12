package com.sawan.spring.springmvcorm.users.dao;

import java.util.List;

import com.sawan.spring.springmvcorm.users.entity.Users;

public interface UsersDao {
	
	int create(Users users);
	
	List<Users> getAllUsers();

}
