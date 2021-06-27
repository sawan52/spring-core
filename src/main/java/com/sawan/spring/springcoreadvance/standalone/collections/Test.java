package com.sawan.spring.springcoreadvance.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sawan/spring/springcoreadvance/standalone/collections/config.xml");
		ProductList productList = (ProductList) context.getBean("productList");
		System.out.println(productList);

	}

}
