package com.cg.service;

import java.util.List;

import com.cg.bean.PnbBank;
import com.cg.bean.Transaction;

public interface ServiceInterface {

	public String createAccount(PnbBank pnb);
	public PnbBank displayDetails(long account_number);
	public Double showBalance(long accountNumber);
	public void deposit(Double deposit, long accountNumber, PnbBank pb);
	public void withdraw(Double withdraw,long accountNumber, PnbBank pb);
	public void transferMoney(double transferBalance, long transferaccountNumber, long accountNumber,PnbBank pb1,PnbBank pb2);
	public List<Transaction> printTransaction(long acc);
	public PnbBank validateLogin(long account_number);
}
