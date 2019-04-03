package com.capg.bank.main;

import java.util.Scanner;
import com.capg.bank.bean.Wbank;
import com.capg.bank.service.Iwbankservice;
import com.capg.bank.service.Wbankservice;

public class Wbankmain {

	private static Scanner s;

	public static void main(String[] args)
	{
		s = new Scanner(System.in);
		int in;
		Iwbankservice wbs=new Wbankservice();
		do
		{
		System.out.println("**********Welcome to WBANK WALLET*************");
		System.out.println("1.Create Account");
		System.out.println("2.Deposit Money");
		System.out.println("3.Withdrawl Money");
		System.out.println("4.Fund Transfer");
		System.out.println("5.Check Balance");
		System.out.println("6.Exit");
		System.out.println("Enter the Required Input");
		in=s.nextInt();
		switch(in)
		{
		case 1: System.out.println("Enter the Full-Name:");
				String name=s.nextLine();
				s.nextLine();
				System.out.println("Enter the Nominee-Name:");
				String nom_name=s.nextLine();
				System.out.println("Enter the Date of Birth(DD-MM-YYYY):");
				String dob=s.nextLine();
				System.out.println("Enter the PanCard-No:");
				String pan_no=s.next();
				System.out.println("Enter the Adhaar-No:");
				long ad_no=s.nextLong();
				s.nextLine();
				System.out.println("Enter the Address:");
				String address=s.next();
				System.out.println("Enter the Mobile-No:");
				String mob_no = s.next();
				System.out.println("Enter the Pincode-No:");
				int l=s.nextInt();
				s.nextLine();
				System.out.println("Enter the Email-Id:");
				String email=s.next();
				System.out.println("Enter the Balance:");
				double balance=s.nextDouble();
				s.nextLine();
				System.out.println("Enter the Account type:");
				String acc_type=s.next();
				System.out.println(wbs.create_acc(new Wbank(name, nom_name, dob, pan_no, ad_no, address, mob_no, l, email, balance, acc_type)));
				break;
		case 2: System.out.println("Enter the Account Number:");
				String acc_num=s.next();
				System.out.println("Enter the Account type(Savings/Current)");
				String acc_typed=s.next();
				System.out.println("Enter the Amount");
				double amount=s.nextDouble();
				System.out.println(wbs.deposit(acc_num, acc_typed, amount));
				break;
		case 3: System.out.println("Enter the Account Number:");
				String acc_numw=s.next();
				System.out.println("Enter the Account type(Savings/Current)");
				String acc_typew=s.next();
				System.out.println("Enter the Amount");
				double amountw=s.nextDouble();
				System.out.println(wbs.withdraw(acc_numw, acc_typew, amountw));
				break;
		case 4: System.out.println("Enter the Account Number:");
				String acc_numf=s.next();
				System.out.println("Enter the IFSC Code:");
				String ifsc_code=s.next();
				System.out.println("Enter the Account type(NEFT/RTGS/IMPS)");
				String acc_typef=s.next();
				System.out.println("Enter the Amount");
				double amountf=s.nextDouble();
				System.out.println(wbs.fundtran(acc_numf, acc_typef, ifsc_code, amountf));
				break;
		case 5: System.out.println("Enter the Account Number:");
				String acc_numc=s.next();
				System.out.println(wbs.checkBalance(acc_numc));
				break;
		case 6: System.exit(0);
		default: System.out.println("INVALID INPUT");
		}
		}while(in!=6);
	}
}
