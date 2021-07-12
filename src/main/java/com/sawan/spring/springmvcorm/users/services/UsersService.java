package com.sawan.spring.springmvcorm.users.services;

import java.util.List;

import com.sawan.spring.springmvcorm.users.entity.Users;

public interface UsersService {
	
	int save(Users users);
	
	List<Users> allUsers();

}
