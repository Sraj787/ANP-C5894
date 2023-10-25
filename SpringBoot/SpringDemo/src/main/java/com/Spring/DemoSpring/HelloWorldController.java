package com.Spring.DemoSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/home")
	public String helloWorld() {
		return"Hello Java";
	}

}
