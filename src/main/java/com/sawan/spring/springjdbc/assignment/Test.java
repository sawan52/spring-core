package com.sawan.spring.springjdbc.assignment;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sawan/spring/springjdbc/assignment/config.xml");
		PassengerDao dao = (PassengerDao) context.getBean("passengerDao");

		Passenger pass = new Passenger();
		pass.setId(3);
		pass.setFirstName("Rishabh");
		pass.setLastName("Thakur");

		// int result = dao.create(pass);
		// System.out.println("Number of rows inserted are: " + result);

		// int result = dao.update(pass);
		// System.out.println("Number of rows updated are: " + result);

		// int result = dao.delete(2);
		// System.out.println("Number of rows deleted are: " + result);

		List<Passenger> result = dao.readRecords();
		System.out.println("Passengers records:");
		for (Passenger p : result) {
			System.out.println(p.getId() + " - " + p.getFirstName() + " " + p.getLastName());
		}

	}

}
