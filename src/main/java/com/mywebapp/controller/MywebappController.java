package com.mywebapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MywebappController {
	
	@GetMapping(value="/getMyName")
	public String getName() {
		return "hello, this is lokesh";
			
	}

}
