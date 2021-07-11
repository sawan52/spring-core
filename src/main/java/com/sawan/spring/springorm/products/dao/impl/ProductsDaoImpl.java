package com.sawan.spring.springorm.products.dao.impl;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.sawan.spring.springorm.products.dao.ProductsDao;
import com.sawan.spring.springorm.products.entity.Products;

public class ProductsDaoImpl implements ProductsDao {

	HibernateTemplate hibernateTemplate;

	@Override
	public int create(Products products) {
		return 0;
	}

}
