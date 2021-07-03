package com.sawan.spring.springjdbc.assignment;

import java.util.List;

public interface PassengerDao {

	int create(Passenger passenger);

	int update(Passenger passenger);

	int delete(int id);

	List<Passenger> readRecords();

}
