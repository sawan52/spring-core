package com.sawan.spring.springjavaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		// context.register(SpringConfig.class);
		Service service = context.getBean(Service.class);
		Service service2 = context.getBean(Service.class);
		// dao.create();

		// In case of Scope as singleton the hashcode of both service are same whereas
		// when Scope is prototype the hashcode of both service are different.
		System.out.println(service.hashCode());
		System.out.println(service2.hashCode());

		service.save();

		context.close();
	}

}
