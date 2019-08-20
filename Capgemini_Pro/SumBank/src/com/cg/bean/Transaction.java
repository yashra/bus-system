package com.cg.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transaction1")
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int transId;
	private String transaction;
	private double amount;
	private long accNo;
	public Transaction(String transaction, double amount, long accountNumber) {
		super();
		this.transaction = transaction;
		this.amount = amount;
		this.accNo = accountNumber;
	}
	
	public Transaction() {}
	
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public int getTransId() {
		return transId;
	}
	public void setTransId(int transId) {
		this.transId = transId;
	}
	public String getTransaction() {
		return transaction;
	}
	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	
}
