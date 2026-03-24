package com.home.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/subscriptions")
@CrossOrigin("*")
public class SubscriptionController {

	// CREATE
	@PostMapping
	public String createSubscription() {
		return "Create Subscription";
	}

	// USE SESSION
	@PutMapping("/{id}/use")
	public String useSession(@PathVariable("id") int id) {
		return "Use 1 session of subscription " + id;
	}

	// GET DETAIL
	@GetMapping("/{id}")
	public String getSubscription(@PathVariable("id") int id) {
		return "Get subscription detail id = " + id;
	}
}
