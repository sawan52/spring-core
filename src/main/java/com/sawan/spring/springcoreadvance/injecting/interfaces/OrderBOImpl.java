package com.sawan.spring.springcoreadvance.injecting.interfaces;

public class OrderBOImpl implements OrderBO {

	private OrderDAO dao;

	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

	@Override
	public void placeOrder() {
		System.out.println("Inside OrderBO --> placeOrder()");
		dao.createOrder();
	}

}
