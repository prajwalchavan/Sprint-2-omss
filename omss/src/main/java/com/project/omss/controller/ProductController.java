package com.project.omss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.omss.entity.Product;
import com.project.omss.service.ProductServiceImpl;

@RestController
public class ProductController {
	
	@Autowired
	ProductServiceImpl productService;

	@PostMapping("/ProductAdd")
	private String saveProduct(@RequestBody Product Product) {
	return Product.getProductId() + " " + productService.saveOrUpdate(Product);
	}
	
	@GetMapping("/getProducts")
	private List<Product> getAllProducts() {
		return productService.getAllProducts();
	}
}
