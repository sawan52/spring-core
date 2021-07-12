package com.sawan.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sawan.spring.springmvc.dto.Employee;

@Controller
public class ObjectController {

	@RequestMapping("/readObject")
	public ModelAndView sendObject() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayObject");

		Employee employee = new Employee();
		employee.setId(123);
		employee.setName("Sawan");
		employee.setSalary(66000);

		modelAndView.addObject("employee", employee);

		return modelAndView;
	}

}
