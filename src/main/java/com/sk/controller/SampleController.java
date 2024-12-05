package com.sk.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sk/sample")
public class SampleController {

	/// sk/sample/name
	@GetMapping("/name")
	public ResponseEntity<String> sample() {
		return new ResponseEntity<String>("Sumit-Kharat", HttpStatus.OK);
	}

	@GetMapping("/name/{name}")
	public ResponseEntity<String> sample(@PathVariable("name") String name) {
		return new ResponseEntity<String>(name, HttpStatus.OK);
	}

}
