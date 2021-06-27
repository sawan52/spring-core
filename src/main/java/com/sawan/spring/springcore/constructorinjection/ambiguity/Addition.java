package com.sawan.spring.springcore.constructorinjection.ambiguity;

public class Addition {

	public Addition(double a, double b) {
		System.out.println("inside DOUBLE constructor");
	}

	public Addition(int a, int b) {
		System.out.println("inside INT constructor");
	}

	public Addition(String a, String b) {
		System.out.println("inside STRING constructor");
	}

}
