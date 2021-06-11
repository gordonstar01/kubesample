package com.skcc.sample3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	@GetMapping("/test")
	public String sample() {
		
		return "sample world";
	}
}
