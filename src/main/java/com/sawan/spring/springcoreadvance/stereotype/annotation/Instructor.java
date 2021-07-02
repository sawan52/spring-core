package com.sawan.spring.springcoreadvance.stereotype.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst")
@Scope("prototype")
public class Instructor {

	// @Value("112")
	// @Value("#{66+44}")
	// @Value("#{T(java.lang.Math).abs(-99)}")

	// @Value("#{new Integer(555)}")
	@Value("#{T(java.lang.Integer).MIN_VALUE}")
	private int id = 002;

	// @Value("Sawan Singh")
	// @Value("#{'Shivam Singh'}")
	// @Value("#{'Shivam Singh'.toUpperCase()}")
	@Value("#{new java.lang.String('Pradum Singh')}")
	private String name = "XYZ_ABC";

	@Value("#{topics}")
	private List<String> topics;

	@Value("#{4+2 > 8}")
	private boolean active;

	@Autowired
	private Profile profile;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", topics=" + topics + ", active=" + active + ", profile="
				+ profile + "]";
	}

}
