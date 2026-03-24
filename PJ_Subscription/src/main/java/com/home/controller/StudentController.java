package com.home.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/students")
@CrossOrigin("*")
public class StudentController {

	// CREATE
	@PostMapping
	public String createStudent() {
		return "Create Student (with parent_id)";
	}

	// GET DETAIL + parent
	@GetMapping("/{id}")
	public String getStudent(@PathVariable("id") int id) {
		return "Get Student + Parent info with id = " + id;
	}
}