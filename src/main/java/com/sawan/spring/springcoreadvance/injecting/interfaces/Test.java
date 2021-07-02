package com.sawan.spring.springcoreadvance.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sawan/spring/springcoreadvance/injecting/interfaces/new_config.xml");
		OrderBO bo = (OrderBO) context.getBean("bO");
		bo.placeOrder();

	}

}
