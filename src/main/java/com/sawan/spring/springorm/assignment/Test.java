package com.sawan.spring.springorm.assignment;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sawan/spring/springorm/assignment/config.xml");
		PassengerDao dao = (PassengerDao) context.getBean("passengerDao");

		Passenger pass = new Passenger();
		pass.setId(2);
		pass.setFirstName("Rishabh");
		pass.setLastName("Yadav");

		// dao.create(pass);

		// It will update the 'lastname' based on pass object reference Id
		// pass.setLastName("Raj");
		// dao.update(pass);

		// It will delete based on pass object reference Id
		// dao.delete(pass);
		
		// Passenger passenger = dao.getOneRecord(4);

		List<Passenger> result = dao.readAllRecords();
		System.out.println("Passengers records:");
		for (Passenger p : result) {
			System.out.println(p.getId() + " - " + p.getFirstName() + " " + p.getLastName());
		}

	}

}
