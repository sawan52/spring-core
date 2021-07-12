package com.sawan.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sawan.spring.springmvc.dto.User;

@Controller
public class UserController {

	@RequestMapping("/registrationPage")
	public String showRegistrationPage() {
		return "userReg";
	}

	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute User user, ModelMap modelMap) {
		System.out.println(user);
		modelMap.addAttribute("user", user);
		return "regResult";
	}

}
