package com.sawan.spring.springjdbc.employee.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sawan.spring.springjdbc.employee.dao.EmployeeDAO;
import com.sawan.spring.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sawan/spring/springjdbc/employee/test/config.xml");
		EmployeeDAO dao = (EmployeeDAO) context.getBean("employeeDao");

		Employee employee = new Employee();
		employee.setId(2);
		employee.setFirstName("Pradum");
		employee.setLastName("Singh");

		int result = dao.create(employee);
		System.out.println("Number of records inserted are: " + result);

	}

}
