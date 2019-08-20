package com.cg.dao;

import java.util.List;

import com.cg.bean.PnbBank;
import com.cg.bean.Transaction;

public interface DaoInterface {

	public String createAccount(PnbBank pnb);
	public PnbBank displayDetails(long account_number);
	public Double showBalance(long accountNumber);
	public void deposit(Double deposit, Double newBalance, long accountNumber, PnbBank pb);
	public void withdraw(Double withdraw, Double newBalance, long accountNumber, PnbBank pb);
	public void transferMoney(double transferBalance, long transferaccountNumber, long accountNumber);
	public void storeTransaction(String str, double amount, long accountNumber);
	public List<Transaction> printTransaction(long acc);
	public PnbBank validateLogin(long account_number);
	public void withdrawWithoutUpdate(PnbBank pb);
	public void depositWithUpdate(Double deposit, long accountNo,long transferAccNo,PnbBank pb);
}
