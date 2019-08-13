package com.cg.service;

import java.util.List;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bean.PnbBank;
import com.cg.bean.Transaction;

import com.cg.dao.DaoInterface;

@Service
public class ServiceClass implements ServiceInterface {
	@Autowired
	DaoInterface dao;
	public String createAccount(PnbBank pnb)
	{
		if(pnb.getPassword().length()<8)
		{
			return "Password should be of length 8 atleast";
		}
		else if(!Pattern.matches("[1-9]{1}[0-9]{1,}", pnb.getAge()))
		{
			return "Age should be numeric";
		}
		else if(!Pattern.matches("[a-zA-Z\\s]*$", pnb.getName()))
		{
			return "Enter the Valid Name";
		}
		else if(!Pattern.matches("[1-9]{1}[0-9]{9}", pnb.getPhone_number()))
		{
			return "Enter Valid Phone Number";
		}
		else
		{
			return dao.createAccount(pnb);
		}
	}
	
	public PnbBank validateLogin(long account_number)
	{
		if(Long.toString(account_number)==null)
			return null;
		else
			return dao.validateLogin(account_number);
	}
	
	public PnbBank displayDetails(long account_number)
	{
		if(Long.toString(account_number)==null)
			return null;
		else
			return dao.validateLogin(account_number);
	}
	
	public Double showBalance(long accno) {
		return dao.showBalance(accno);
	}
	
	public void deposit(Double deposit, long accountNo, PnbBank jb) {

		Double newBalance = deposit + (dao.showBalance(accountNo));
		jb.setBalance(newBalance);
		dao.deposit(deposit, newBalance, accountNo,jb);
		
	}
	public void withdraw(Double withdraw, long accountNo, PnbBank jb) {

		Double newBalance = (dao.showBalance(accountNo))-withdraw  ;
		jb.setBalance(newBalance);
		dao.withdraw(withdraw, newBalance, accountNo,jb);
		
	}
	
	public void transferMoney(double transfer, long transferAccNo, long accountNo, PnbBank jb,PnbBank jb1) {
		double transferBalance = (transfer + (dao.showBalance(transferAccNo)));
		double deduction = (dao.showBalance(accountNo)) - transfer;
		jb1.setBalance(transferBalance);
		jb.setBalance(deduction);
		dao.withdrawWithoutUpdate(jb);
		dao.depositWithUpdate(transfer,accountNo, transferAccNo,jb1);
		dao.transferMoney(transfer, transferAccNo, accountNo);
		
	}
	
	public List<Transaction> printTransaction(long accountNumber) {
		return dao.printTransaction(accountNumber);

	}

}
