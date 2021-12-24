package com.example.aoploggingdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {

	Logger LOGGER = LoggerFactory.getLogger(MessageController.class);
	
	@GetMapping("/")
	public String getMessage() {
		LOGGER.info("[MessageController] - Inside getMessage method");
		return "Welcome to Gain Java Knowledge";
	}
 
}
