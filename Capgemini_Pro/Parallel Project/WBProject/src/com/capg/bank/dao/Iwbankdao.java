package com.capg.bank.dao;

import com.capg.bank.bean.Wbank;

public interface Iwbankdao {

	public String create_acc(Wbank wb);
	public String deposit(String acc_num, String acc_type, double amount);
	public String withdraw(String acc_num, String acc_type, double amount);
	public String fundtran(String acc_num, String acc_type, String ifsc_code, double amount);
	public String checkBalance(String acc_num);
}
