package com.sawan.spring.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sawan/spring/springcore/list/listconfig.xml");
		Hospital hosp = (Hospital) context.getBean("hospital");
		System.out.println(hosp.getName());
		System.out.println(hosp.getDepartments());
		System.out.println(hosp.getDepartments().getClass());
	}

}
