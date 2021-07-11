package com.sawan.spring.springorm.products.dao;

import java.util.List;

import com.sawan.spring.springorm.products.entity.Products;

public interface ProductsDao {

	int create(Products products);
	
	void update(Products products);
	
	void delete(Products products);
	
	Products getOneRecord(int id);
	
	List<Products> getAllRecords();
	
}
