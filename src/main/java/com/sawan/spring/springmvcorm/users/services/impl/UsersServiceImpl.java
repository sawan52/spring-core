package com.sawan.spring.springmvcorm.users.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sawan.spring.springmvcorm.users.dao.UsersDao;
import com.sawan.spring.springmvcorm.users.entity.Users;
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

	@Override
	@Transactional
	public int save(Users users) {
		// Business Logic can we implemented here...
		return dao.create(users);
	}

}
