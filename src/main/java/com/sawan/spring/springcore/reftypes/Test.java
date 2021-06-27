package com.sawan.spring.springcore.reftypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sawan.spring.springcore.list.Hospital;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sawan/spring/springcore/reftypes/config.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);

	}

}
