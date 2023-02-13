package com.spring.lombok.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.lombok.entity.Producttt;
import com.spring.lombok.repo.productRepo;

@RestController
public class productController {
     @Autowired
	private productRepo pr;
	
	@PostMapping("saveproduct")
	public Producttt save(@RequestBody Producttt p) {
		Producttt producttt=pr.save(p);
		return p;
		
		
	}
}
