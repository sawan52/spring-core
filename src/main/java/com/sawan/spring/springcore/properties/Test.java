package com.sawan.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sawan.spring.springcore.list.Hospital;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sawan/spring/springcore/properties/config.xml");
		CountriesAndLanguages cal = (CountriesAndLanguages) context.getBean("properties");
		System.out.println(cal);
		
	}

}
