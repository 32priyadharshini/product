package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin("http://localhost:4200")
@RestController
public class ProductController {
	@Autowired
	ProductService ps;
	@PostMapping("post")
	public Product post(@RequestBody Product a) {
		return ps.post(a);
	}
	@GetMapping("getAll")
	public List<Product> getall(){
		return ps.getall();
	}

}
