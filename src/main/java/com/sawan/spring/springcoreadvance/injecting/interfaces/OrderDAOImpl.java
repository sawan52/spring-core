package com.sawan.spring.springcoreadvance.injecting.interfaces;

public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Inside OrderDAO --> createOrder()");
	}

}
