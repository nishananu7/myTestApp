package com.example.testapp;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class ProductController {

@GetMapping(path="/products")
	public String listProducts() {
		
		String productName="Three Seater Sofa";
	
		return "productName";
	}

}
