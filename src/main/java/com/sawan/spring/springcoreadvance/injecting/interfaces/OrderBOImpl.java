package com.sawan.spring.springcoreadvance.injecting.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("bO")
public class OrderBOImpl implements OrderBO {

	@Autowired
	private OrderDAO dao;

	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

	@Override
	public void placeOrder() {
		System.out.println("Inside OrderBOImpl --> placeOrder()");
		dao.createOrder();
	}

}
