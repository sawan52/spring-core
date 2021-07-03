package com.sawan.spring.springjdbc.employee.dao;

import com.sawan.spring.springjdbc.employee.dto.Employee;

public interface EmployeeDAO {
	
	int create(Employee employee);
	
	int update(Employee employee);
	
	int delete(int id);

}
