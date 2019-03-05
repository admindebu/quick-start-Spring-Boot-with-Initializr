package org.demo.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/demo")
	public String demoApp(){
		
		return "Hello Spring : Initializer Quick Start ";
	}

}
