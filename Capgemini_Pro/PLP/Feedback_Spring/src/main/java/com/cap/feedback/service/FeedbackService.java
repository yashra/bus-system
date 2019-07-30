package com.cap.feedback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.feedback.bean.Feedback;
import com.cap.feedback.bean.Order;
import com.cap.feedback.dao.FeedbackDao;

@Service
public class FeedbackService implements FeedbackServiceInterface {
	
	@Autowired
	FeedbackDao feedback_dao;
	
	public Feedback add(Feedback _feedback)
	{
//		feedback_dao.save(new Order(101,2001,1));
		return feedback_dao.save(new Feedback(_feedback.getProduct_id(),_feedback.getCustomer_id(),_feedback.getDescription()));
	}

}
