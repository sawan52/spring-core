package com.sawan.spring.springcore.lc.assignment;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {

	private int ticketNo;

	public int getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(int ticketNo) {
		System.out.println("inside setTicketNo method");
		this.ticketNo = ticketNo;
	}

	@Override
	public String toString() {
		return "TicketReservation [ticketNo=" + ticketNo + "]";
	}

	// init method
	@PostConstruct
	public void initialize() {
		System.out.println("inside initialize method");
	}

	// destroy method
	@PreDestroy
	public void cleanUp() {
		System.out.println("inside cleanUp method");
	}

}
