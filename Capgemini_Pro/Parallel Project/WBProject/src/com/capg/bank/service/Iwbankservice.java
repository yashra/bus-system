package com.capg.bank.service;

import com.capg.bank.bean.Wbank;

public interface Iwbankservice {

	public String create_acc(Wbank wb);
	public String checkBalance(String acc_num);
	public String deposit(String acc_num,String acc_type,double amount);
	public String withdraw(String acc_num,String acc_type,double amount);
	public String fundtran(String acc_num,String acc_type,String ifsc_code,double amount);
}
