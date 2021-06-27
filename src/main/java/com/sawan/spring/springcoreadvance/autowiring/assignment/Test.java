package com.sawan.spring.springcoreadvance.autowiring.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sawan/spring/springcoreadvance/autowiring/assignment/config.xml");
		Customer c = (Customer) context.getBean("customer");
		System.out.println(c);

	}

}
