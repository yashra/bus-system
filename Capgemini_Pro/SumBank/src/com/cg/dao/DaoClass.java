package com.cg.dao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

import com.cg.bean.PnbBank;
import com.cg.bean.Transaction;




@Repository
@Transactional
public class DaoClass implements DaoInterface {
	
	@PersistenceContext
	EntityManager em;
	public String createAccount(PnbBank pnb)
	{
		long x = (int)(Math.random()*((8856-1253)+1))+1253;
		pnb.setAccount_number(x);
		em.persist(pnb);
		return "Account created with account number: "+pnb.getAccount_number();
	}
	
	public PnbBank validateLogin(long account_number)	
	{
		PnbBank b = em.find(PnbBank.class, account_number);
		return b;
		
	}
	
	public PnbBank displayDetails(long account_number)
	{
		PnbBank b = em.find(PnbBank.class, account_number);
		return b;
		
	}
	
	public Double showBalance(long accountNumber) {

		String qStr = "SELECT balance FROM PnbBank bank WHERE bank.account_number=:number";
		TypedQuery<Double> query = em.createQuery(qStr, Double.class);
		query.setParameter("number", accountNumber);
		Double bal = query.getSingleResult();
		return bal;

	}
	
	@Transactional
	public void deposit(Double deposit, Double newBalance, long accountNumber, PnbBank pb) {
		em.merge(pb);

		String date = generateDateAndTime();
		String str = "Money deposited at " + date;
		storeTransaction(str, deposit, accountNumber);

	}
	
	@Transactional
	public void withdraw(Double withdraw, Double newBalance, long accountNumber, PnbBank pb) {
		em.merge(pb);

		String date = generateDateAndTime();
		String str = "Money withdrawn at " + date;
		storeTransaction(str, withdraw, accountNumber);

	}
	
	
	@Transactional
	public void depositWithUpdate(Double deposit, long accountNo,long transferAccNo,PnbBank pb) {
		em.merge(pb);
		String date = generateDateAndTime();
		String str = "Money transfered from Acc. "+accountNo +" at " + date;
		storeTransaction(str, deposit, transferAccNo);
	}
	
	@Transactional
	public void withdrawWithoutUpdate(PnbBank pb) {
		em.merge(pb);

	}
	
	@Transactional
	public void transferMoney(double transferBalance, long transferaccountNumber, long accountNumber) {
		String date = generateDateAndTime();
		String str = "Money Transferred to Acc: " + transferaccountNumber + " at " + date;
		storeTransaction(str, transferBalance, accountNumber);

	}
	
	@Transactional
	public void storeTransaction(String str, double amount, long accountNumber) {
		
		Transaction trans = new Transaction(str, amount, accountNumber);
		em.persist(trans);
		
	}

	public String generateDateAndTime() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		String date = dtf.format(now);
		return date;
	}
	
	public List<Transaction> printTransaction(long acc) {
		Query q = em.createQuery("from Transaction t where t.accNo = :n", Transaction.class);
		q.setParameter("n", acc);
		@SuppressWarnings("unchecked")
		List<Transaction> li = q.getResultList();

//		for (Transaction t : li) {
//
//			System.out.println(
//					"Transaction ID: " + t.getTransId() + "  " + t.getTransaction() + " Amount: " + t.getAmount());
//		}
		return li;

	}
}
