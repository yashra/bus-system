package com.cap.feedback.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.feedback.bean.Feedback;

import com.cap.feedback.service.FeedbackServiceInterface;

@CrossOrigin(origins="http://localhost:4200/")
@RestController
@RequestMapping("/api")
public class FeedbackController {
	@Autowired
	FeedbackServiceInterface feedback_service;
	
	@PostMapping(value="/feed")
	public Feedback add(@RequestBody Feedback feed_get)
	{
		System.out.println(feed_get.getDescription());
		Feedback _feedback=feedback_service.add(new Feedback(feed_get.getProduct_id(),feed_get.getCustomer_id(),feed_get.getDescription()));
		return _feedback;
	}
	
	@Get
	public int getFeedbackId()
	{
		
	}
}
