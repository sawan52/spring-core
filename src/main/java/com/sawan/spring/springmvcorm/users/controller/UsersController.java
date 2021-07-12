package com.sawan.spring.springmvcorm.users.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sawan.spring.springmvcorm.users.entity.Users;
import com.sawan.spring.springmvcorm.users.services.UsersService;

@Controller
public class UsersController {

	@Autowired
	private UsersService service;

	public UsersService getUsersService() {
		return service;
	}

	public void setUsersService(UsersService usersService) {
		this.service = usersService;
	}

	@RequestMapping("/registrationPage")
	public String showRegistrationPage() {
		return "userReg";
	}

	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("users") Users users, ModelMap modelMap) {
		int result = service.save(users);
		modelMap.addAttribute("result", "User created with Id " + result);
		return "userReg";
	}

	@RequestMapping("/getUsers")
	public String getUsers(ModelMap model) {
		List<Users> list = service.allUsers();
		model.addAttribute("users", list);
		return "displayUsers";
	}

}
