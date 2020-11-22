package com.example.springboot.controller;

import com.example.springboot.entity.BatchRequest;
import com.example.springboot.businesslogicservice.BatchRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class HelloController {

	@Autowired
	BatchRequestService batchRequestService;



	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}


	@PostMapping(value = "/req")
	public String execute(@RequestBody BatchRequest batchRequest) {
		batchRequestService.executeReq(batchRequest);
		return UUID.randomUUID().toString();
	}
}
