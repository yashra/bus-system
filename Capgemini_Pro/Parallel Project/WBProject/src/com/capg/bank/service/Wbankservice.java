package com.capg.bank.service;
import java.util.regex.Pattern;

import com.capg.bank.bean.Wbank;
import com.capg.bank.dao.Iwbankdao;
import com.capg.bank.dao.Wbankdao;
import com.capg.bank.util.WbankRepository;

public class Wbankservice implements Iwbankservice {

	Iwbankdao dao=new Wbankdao();
	Wbank wbank=new Wbank();
	@Override
	public String checkBalance(String acc_num) {
		
		if(acc_num.length()>16)
			return "INVALID ACCOUNT NUMBER";
		else
			return dao.checkBalance(acc_num);
	}

	@Override
	public String deposit(String acc_num, String acc_type, double amount) {
		if(acc_num.length()>16||WbankRepository.getdetails().get(acc_num).getAcc_type().equals(null)||amount<=0)
			return "INVALID DEPOSIT DETAILS";
		else
			return dao.deposit(acc_num,acc_type,amount);			
	}

	@Override
	public String withdraw(String acc_num, String acc_type, double amount) {
		if(acc_num.length()>16||WbankRepository.getdetails().get(acc_num).getAcc_type().equals(null)||amount<=0)
			return "INVALID WITHDRAWL DETAILS";
		else
			return dao.withdraw(acc_num, acc_type, amount);
	}

	@Override
	public String fundtran(String acc_num, String acc_type, String ifsc_code, double amount) {
		if(acc_num.length()>16||acc_type==null||amount<=0)
			return "INVALID FUND TRANSFER DETAILS";
		else
			return dao.fundtran(acc_num, acc_type, ifsc_code, amount);
	}

	@Override
	public String create_acc(Wbank wb) {
		if(wb.getName().equals(null)||wb.getNom_name().equals(null)||wb.getDob().equals(null)||wb.getPan_no().equals(null)||wb.getPan_no().length()>10||wb.getAd_no()>12||wb.getAddress().equals(null)||wb.getEmail().equals(null)||wb.getBalance()<=0||wb.getAcc_type().equals(null)||wb.getMob_no().length()>10||wb.getPincode()<=0)
			return "INVALID DETAILS";
		else if(Pattern.matches("^[1-9] {3}-^[0-9] {3}-^[0-9] {4}", wb.getMob_no()))
		{
			return "INVALID MOBILE NUMBER";
		}
		else
			return dao.create_acc(wb);
		
	}


}
