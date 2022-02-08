package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHandler {
	@RequestMapping("/")
	public String index() {
		return "Hello World from SpringBoot ....";
	}

	@RequestMapping("/message")
	public String index(String message) {
		return message;
	}
}
