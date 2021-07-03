package com.sawan.spring.springjdbc.employee.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sawan.spring.springjdbc.employee.dao.EmployeeDAO;
import com.sawan.spring.springjdbc.employee.dto.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(Employee employee) {
		String sql = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
		return result;
	}

}
