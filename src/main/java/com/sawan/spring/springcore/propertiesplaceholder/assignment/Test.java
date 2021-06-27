package com.sawan.spring.springcore.propertiesplaceholder.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sawan/spring/springcore/propertiesplaceholder/assignment/config.xml");
		WsClient wsclient = (WsClient) context.getBean("wsClient");
		System.out.println(wsclient);

	}

}
