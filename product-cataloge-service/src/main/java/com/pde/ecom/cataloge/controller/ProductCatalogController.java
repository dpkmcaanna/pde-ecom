package com.pde.ecom.cataloge.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pde.ecom.cataloge.model.Product;

@RestController
@RequestMapping("/api/v1/product")
public class ProductCatalogController {

	private static Map<String, Product> productCatalog = new HashMap<>();

	@PostMapping
	public String addProduct(@RequestBody Product product) {
		productCatalog.put(product.getId(), product);
		return "product added successfully";
	}

	@GetMapping("/{id}")
	public Product getProductDetails(@PathVariable String id) {
		return productCatalog.get(id);
	}

	@GetMapping
	public List<Product> getProductList() {
		return new ArrayList<Product>(productCatalog.values());
	}

	@PutMapping
	public String updateProduct(@RequestBody Product product) {
		productCatalog.put(product.getId(), product);
		return "product updated successfully";
	}

	@DeleteMapping("/{id}")
	public String deleteProduct(@PathVariable String id) {
		productCatalog.remove(id);
		return "product deleted successfully";
	}
}
