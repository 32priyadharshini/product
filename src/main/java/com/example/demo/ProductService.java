package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	ProductDao pd;

	public Product post(Product a) {
		// TODO Auto-generated method stub
		return pd.post(a);
	}

	public List<Product> getall() {
		// TODO Auto-generated method stub
		return pd.getAll();
	}

}
