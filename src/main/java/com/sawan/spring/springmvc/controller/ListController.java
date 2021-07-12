package com.sawan.spring.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sawan.spring.springmvc.dto.Employee;

@Controller
public class ListController {

	@RequestMapping("/readList")
	public ModelAndView sendList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");

		Employee employee1 = new Employee();
		employee1.setId(101);
		employee1.setName("Sawan");
		employee1.setSalary(80000);

		Employee employee2 = new Employee();
		employee2.setId(102);
		employee2.setName("Pradum");
		employee2.setSalary(70000);

		Employee employee3 = new Employee();
		employee3.setId(103);
		employee3.setName("Satyam");
		employee3.setSalary(60000);

		ArrayList<Employee> listOfEmployees = new ArrayList<>();
		listOfEmployees.add(employee1);
		listOfEmployees.add(employee2);
		listOfEmployees.add(employee3);

		modelAndView.addObject("employeeList", listOfEmployees);

		return modelAndView;
	}

}
