package com.cap.feedback.dao;

import org.springframework.data.repository.CrudRepository;

import com.cap.feedback.bean.Feedback;

public interface FeedbackDao extends CrudRepository<Feedback, Integer> {

}
