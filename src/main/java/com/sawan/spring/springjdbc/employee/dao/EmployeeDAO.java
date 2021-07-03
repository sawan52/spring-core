package com.sawan.spring.springjdbc.employee.dao;

import java.util.List;

import com.sawan.spring.springjdbc.employee.dto.Employee;

public interface EmployeeDAO {

	int create(Employee employee);

	int update(Employee employee);

	int delete(int id);

	Employee readOneRecord(int id);

	List<Employee> readAllRecords();

}
