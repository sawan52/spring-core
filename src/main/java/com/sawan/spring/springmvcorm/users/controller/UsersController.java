package com.sawan.spring.springmvcorm.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sawan.spring.springmvcorm.users.services.UsersService;

@Controller
public class UsersController {

	@Autowired
	private UsersService usersService;

	public UsersService getUsersService() {
		return usersService;
	}

	public void setUsersService(UsersService usersService) {
		this.usersService = usersService;
	}

}
