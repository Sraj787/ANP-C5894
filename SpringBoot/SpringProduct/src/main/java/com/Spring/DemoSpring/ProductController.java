package com.Spring.DemoSpring;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	
	
	@PostMapping("/product")//for insert the data
	public String saveProduct(@RequestBody  Product p) {
		
		System.out.println(p);
		return "Product Saved";
		
	}
}
