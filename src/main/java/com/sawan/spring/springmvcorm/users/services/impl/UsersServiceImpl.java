package com.sawan.spring.springmvcorm.users.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sawan.spring.springmvcorm.users.dao.UsersDao;
import com.sawan.spring.springmvcorm.users.services.UsersService;

@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersDao dao;

	public UsersDao getDao() {
		return dao;
	}

	public void setDao(UsersDao dao) {
		this.dao = dao;
	}

}
