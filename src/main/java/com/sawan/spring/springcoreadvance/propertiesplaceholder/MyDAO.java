package com.sawan.spring.springcoreadvance.propertiesplaceholder;

public class MyDAO {

	private String dbServer;

	public MyDAO(String dbServer) {
		super();
		this.dbServer = dbServer;
	}

	@Override
	public String toString() {
		return "MyDAO [dbServer=" + dbServer + "]";
	}

}
