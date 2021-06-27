package com.sawan.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sawan/spring/springcore/set/setconfig.xml");
		CarDealer cd = (CarDealer) context.getBean("car_dealer");
		System.out.println(cd.getName());
		System.out.println(cd.getModels());
		System.out.println(cd.getModels().getClass());
		
	}

}
