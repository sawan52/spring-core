package com.sawan.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/sawan/spring/springjdbc/config.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("JDBCTemplate");

		String sqlQuery = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sqlQuery, new Integer(1), "Shivam", "Singh");
		System.out.println("Number of records inserted are: " + result);

	}

}
