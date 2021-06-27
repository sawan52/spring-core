package com.sawan.spring.springcore.lc.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside setter method");
		this.id = id;
	}

	// user defined init() method
	@PostConstruct
	public void hi() {
		System.out.println("Inside Hi method!");
	}

	// user defined destroy() method
	@PreDestroy
	public void bye() {
		System.out.println("Inside Bye method!");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

}
