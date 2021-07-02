package com.sawan.spring.springcoreadvance.injecting.interfaces;

import org.springframework.stereotype.Component;

@Component("dAO")
public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("Inside OrderDAOImpl --> createOrder()");
	}

}
