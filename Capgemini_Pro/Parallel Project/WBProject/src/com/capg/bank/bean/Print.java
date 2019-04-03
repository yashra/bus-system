package com.capg.bank.bean;

import com.capg.bank.util.WbankRepository;

public class Print {

	private double dep_amt;
	private double withd_amt;
	private double fund_amt;
	private double bank_int;
	public double getDep_amt() {
		return dep_amt;
	}
	public void setDep_amt(double dep_amt) {
		this.dep_amt = dep_amt;
	}
	public double getWithd_amt() {
		return withd_amt;
	}
	public void setWithd_amt(double withd_amt) {
		this.withd_amt = withd_amt;
	}
	public double getFund_amt() {
		return fund_amt;
	}
	public void setFund_amt(double fund_amt) {
		this.fund_amt = fund_amt;
	}
	public double getBank_int() {
		return bank_int;
	}
	public void setBank_int(double bank_int) {
		this.bank_int = bank_int;
	}
	public void depositTran(String acc_num,double amount)
	{
		System.out.println("********DEPOSIT SLIP*********");
		System.out.println("Account Name:"+WbankRepository.getdetails().get(acc_num).getName());
		System.out.println("Account Type:"+WbankRepository.getdetails().get(acc_num).getAcc_type());
		System.out.println("Deposit Amount:"+amount);
		System.out.println("Amount Before:"+WbankRepository.getdetails().get(acc_num).getBalance());
		System.out.println("Total Amount:"+getDep_amt());
	}
	public void WithdrawTran(String acc_num,double amount)
	{
		System.out.println("********WITHDRAWL SLIP*********");
		System.out.println("Account Name:"+WbankRepository.getdetails().get(acc_num).getName());
		System.out.println("Account Type:"+WbankRepository.getdetails().get(acc_num).getAcc_type());
		System.out.println("Withdrawl Amount:"+amount);
		System.out.println("Amount Before:"+WbankRepository.getdetails().get(acc_num).getBalance());
		System.out.println("Remaining Amount:"+getWithd_amt());
	}
	public void fundTrans(String acc_num,double amount,String acc_type)
	{
		System.out.println("********FUND TRANSFER SLIP*********");
		System.out.println("Account Name:"+WbankRepository.getdetails().get(acc_num).getName());
		System.out.println("Account Type:"+acc_type);
		System.out.println("Transfering Amount:"+amount);
		System.out.println("Bank Interest:"+getBank_int());
		System.out.println("Amount Before:"+WbankRepository.getdetails().get(acc_num).getBalance());
		System.out.println("Remaining Amount:"+getFund_amt());
	}
}
