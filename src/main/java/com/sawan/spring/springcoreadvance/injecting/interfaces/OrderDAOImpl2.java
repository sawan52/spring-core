package com.sawan.spring.springcoreadvance.injecting.interfaces;

public class OrderDAOImpl2 implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Inside OrderDAOImpl2 --> createOrder()");
	}

}
