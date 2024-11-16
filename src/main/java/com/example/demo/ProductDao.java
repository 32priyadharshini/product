package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {

	@Autowired
	ProductRepo pr;
	public Product post(Product a) {
		// TODO Auto-generated method stub
		return pr.save(a);
		
	}
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}

}
