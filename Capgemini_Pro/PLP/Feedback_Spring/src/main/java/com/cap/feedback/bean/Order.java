package com.cap.feedback.bean;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_details")
public class Order {
	private int product_id=0;
	private int customer_id=0;
	@Id
	private int order_id=0;
	
	
	public Order(int product_id, int customer_id, int order_id) {
		super();
		this.product_id = product_id;
		this.customer_id = customer_id;
		this.order_id = order_id;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
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
	

}

