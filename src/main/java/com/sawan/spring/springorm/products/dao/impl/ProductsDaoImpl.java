package com.sawan.spring.springorm.products.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sawan.spring.springorm.products.dao.ProductsDao;
import com.sawan.spring.springorm.products.entity.Products;

@Component("productDao")
public class ProductsDaoImpl implements ProductsDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public int create(Products products) {
		Integer result = (Integer) hibernateTemplate.save(products);
		return result;
	}

	@Override
	@Transactional
	public void update(Products products) {
		hibernateTemplate.update(products);
	}

	@Override
	@Transactional
	public void delete(Products products) {
		hibernateTemplate.delete(products);
	}

	@Override
	@Transactional
	public Products getOneRecord(int id) {
		Products products = hibernateTemplate.get(Products.class, id);
		return products;
	}

	@Override
	public List<Products> getAllRecords() {
		List<Products> products = hibernateTemplate.loadAll(Products.class);
		return products;
	}

}
