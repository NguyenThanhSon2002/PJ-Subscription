package com.home.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/parents")
@CrossOrigin("*")
public class ParentController {

	// CREATE
	@PostMapping
	public String createParent() {
		return "Create Parent";
	}

	// GET DETAIL
	@GetMapping("/{id}")
	public String getParent(@PathVariable("id") int id) {
		return "Get Parent with id = " + id;
	}
}
