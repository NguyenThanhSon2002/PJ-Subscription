package com.home.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/classes")
@CrossOrigin("*")
public class RegistrationController {

	// REGISTER CLASS
	@PostMapping("/{class_id}/register")
	public String register(@PathVariable("class_id") int classId, @RequestParam("student_id") int studentId) {

		// 1. Check sĩ số
		// 2. Check trùng lịch
		// 3. Check subscription

		return "Student " + studentId + " registered to class " + classId;
	}

	@DeleteMapping("/{id}")
	public String cancel(@PathVariable("id") int id) {

		// check thời gian > 24h
		// hoàn lại session nếu cần

		return "Cancel registration id = " + id;
	}
}