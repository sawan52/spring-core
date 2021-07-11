package com.sawan.spring.springorm.assignment;

import java.util.List;

public interface PassengerDao {

	int create(Passenger passenger);

	void update(Passenger passenger);

	void delete(Passenger passenger);

	Passenger getOneRecord(int id);

	List<Passenger> readAllRecords();

}
