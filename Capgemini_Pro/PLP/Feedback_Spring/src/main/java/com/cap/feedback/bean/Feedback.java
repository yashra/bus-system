package com.cap.feedback.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Feedback_Table")
public class Feedback {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Feedback_ID")
	private int feedback_id;
	@Column(name="Product_ID")
	private int product_id;
	@Column(name="Customer_ID")
	private int customer_id;
	@Column(name="Description")
	private String description;
	public Feedback() {}
	public Feedback(int product_id, int customer_id, String description) {
		super();
		this.product_id = product_id;
		this.customer_id = customer_id;
		this.description = description;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
