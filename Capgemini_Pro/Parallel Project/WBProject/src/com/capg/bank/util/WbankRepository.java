package com.capg.bank.util;

import java.util.HashMap;
import java.util.Map;


import com.capg.bank.bean.Wbank;

public class WbankRepository {

	private static final Map<String,Wbank> wbank;
	static {
			//Details Added
			wbank= new HashMap<String,Wbank>();
			wbank.put("WBAN000091000001",new Wbank("Yashraj Choudhary","Krishna Choudhary","01-12-1997","AAAJP1234C",000011113333,"Rama mandi Jalandhar","9224455663",144401,"yashrajc147@gmail.com",10000,"Current"));
			wbank.put("WBAN000091000002",new Wbank("Yashraj Patil","Krishna Patil","02-11-1994","AAAJP2233C",0000122243333,"Model town Jalandhar","9356468975",144401,"yashrajp152@gmail.com",20000,"Saving"));
			wbank.put("WBAN000091000003",new Wbank("Soman Choudhary","Kiran Choudhary","03-10-1995","AAAJP3414B",000015556666,"Rama mandir Jalandhar","9223366457",144401,"Somanc224@gmail.com",30000,"Saving"));
			wbank.put("WBAN000091000004",new Wbank("Amit Kumar","Aman Kumar","04-11-1996","AAAJP3355D",000022554455,"Vinyard Park Jalandhar","9556677994",144401,"Amitk33@gmail.com",40000,"Current"));					
	 	   }
	public static Map<String,Wbank> getdetails()
	{
		return wbank;
	}
}
