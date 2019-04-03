package com.capg.bank.dao;

import java.util.HashMap;
import java.util.Map;

import com.capg.bank.bean.Print;
import com.capg.bank.bean.Wbank;
import com.capg.bank.util.WbankRepository;

public class Wbankdao implements Iwbankdao {

	String accno;
	static int count=4;
	Map<String,Wbank> map;
	Print p=new Print();
	@Override
	public String create_acc(Wbank wb) {
		accno="WBAN0000910000"+count++;
		map=new HashMap<String,Wbank>();
		map.put(accno, wb);
		return "Account Successfully added";
	}

	@Override
	public String deposit(String acc_num, String acc_type, double amount) {

		if(WbankRepository.getdetails().containsKey(acc_num))
		{
			double wbamt;
			if(WbankRepository.getdetails().get(acc_num).getAcc_type().equalsIgnoreCase(acc_type))
			{
				//wbamt=WbankRepository.getdetails().get(acc_num).getBalance();
				wbamt=map.get(acc_num).getBalance();
				wbamt=wbamt+amount;
				p.setDep_amt(wbamt);
			}
			p.depositTran(acc_num,amount);
			return "Deposited Successfully";
		}
		else
		{
			return "Invalid Account Number";
		}
	}

	@Override
	public String withdraw(String acc_num, String acc_type, double amount) {
		if(WbankRepository.getdetails().containsKey(acc_num)||map.containsKey(acc_num))
		{
			double wbamt;
			if(WbankRepository.getdetails().get(acc_num).getAcc_type().equalsIgnoreCase(acc_type))
			{
				//wbamt=WbankRepository.getdetails().get(acc_num).getBalance();
				wbamt=map.get(acc_num).getBalance();
				wbamt=wbamt-amount;
				p.setWithd_amt(wbamt);
			}
			
			p.WithdrawTran(acc_num, amount);
			return "Withdrawl Sucessfully";
		}
		else
		{
			return "Invalid Account Number";
		}
		
	}

	@Override
	public String fundtran(String acc_num, String acc_type, String ifsc_code, double amount) {
		
		
		if((WbankRepository.getdetails().containsKey(acc_num) && WbankRepository.getdetails().get(acc_num).getIfsc_code().equals(ifsc_code))||(map.containsKey(acc_num)&& map.get(acc_num).getIfsc_code().equals(ifsc_code)))
		{
			if(acc_type.equalsIgnoreCase("NEFT")&& amount<=30000)
			{
				//double wbamt=WbankRepository.getdetails().get(acc_num).getBalance();
				double wbamt=map.get(acc_num).getBalance();
				p.setBank_int(3.5);
				wbamt=wbamt-amount+p.getBank_int();
				p.setFund_amt(wbamt);
			}
			if(acc_type.equalsIgnoreCase("RTGS")&& amount>=30000)
			{
				//double wbamt=WbankRepository.getdetails().get(acc_num).getBalance();
				double wbamt=map.get(acc_num).getBalance();
				p.setBank_int(16.4);
				wbamt=wbamt-amount+p.getBank_int();
				p.setFund_amt(wbamt);
			}
			if(acc_type.equalsIgnoreCase("IMPS")&& amount>=30000)
			{
				//double wbamt=WbankRepository.getdetails().get(acc_num).getBalance();
				double wbamt=map.get(acc_num).getBalance();
				p.setBank_int(20.5);
				wbamt=wbamt-amount+p.getBank_int();
				p.setFund_amt(wbamt);
			}
			p.fundTrans(acc_num, amount, acc_type);;
			return "Fund Transfered Sucessfully";
		}
		else
		{
			return "Invalid Account Number or IFSC code";
		}
		
	}

	@Override
	public String checkBalance(String acc_num) {
		double balance;
		
			balance = WbankRepository.getdetails().get(acc_num).getBalance();
			//balance = map.get(acc_num).getBalance();
			return "Balance:"+balance;
		
		
	}

	

}
