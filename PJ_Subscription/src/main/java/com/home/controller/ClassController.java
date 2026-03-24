package com.home.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/classes")
@CrossOrigin("*")
public class ClassController {

	// CREATE CLASS
	@PostMapping
	public String createClass() {
		return "Create Class";
	}

	// GET BY DAY
	@GetMapping
	public String getClassesByDay(@RequestParam("day") String day) {
		return "List classes on day = " + day;
	}
}
