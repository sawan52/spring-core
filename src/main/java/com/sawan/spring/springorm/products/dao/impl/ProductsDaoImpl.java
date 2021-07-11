package com.sawan.spring.springorm.products.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.sawan.spring.springorm.products.dao.ProductsDao;
import com.sawan.spring.springorm.products.entity.Products;

@Component
public class ProductsDaoImpl implements ProductsDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	public int create(Products products) {
		return 0;
	}

}
