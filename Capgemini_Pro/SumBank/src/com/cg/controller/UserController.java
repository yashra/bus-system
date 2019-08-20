package com.cg.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.bean.PnbBank;
import com.cg.bean.Transaction;
import com.cg.service.ServiceInterface;

@Controller
public class UserController {

	@Autowired
	ServiceInterface service;
	PnbBank u;
	long accountNumber;

	@RequestMapping("/add")
	public String getPage() {
		return "User";
	}

	@RequestMapping("/Login")
	public String getPage1() {
		return "Login";
	}
	
	@RequestMapping("/logout")
	public String setLogout(HttpSession ses)
	{
		ses.invalidate();
		return "Login";
	}
	

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String addUser(PnbBank pnb, Model m) {
		String str = service.createAccount(pnb);
		m.addAttribute("Message", str);
		return "User";
	}

	@RequestMapping(value = "/validateLogin", method = RequestMethod.POST)

	public String checkLogin(@RequestParam("t1") long account_number, @RequestParam("t2") String pwd, HttpSession ses)

	{
		u = service.validateLogin(account_number);
		accountNumber = account_number;
		if (u != null) {
			if (u.getPassword().equals(pwd)) {
				// m.addAttribute("user", u);
				ses.setAttribute("user", u);
				ses.setMaxInactiveInterval(30);// object gets invalidate after 30secs
				return "Display";
			} else {
				// m.addAttribute("msg", "Invalid Password");
				ses.setAttribute("msg", "Invalid Password");
				return "Login";
			}

		} else {
			// m.addAttribute("msg", "Invalid User ID");
			ses.setAttribute("msg", "Invalid User ID");
			return "Login";
		}

	}

	@RequestMapping("/display")

	public String displayDetails(Model m)

	{
		if (u != null) {
			m.addAttribute("user", u);
			return "Display";

		} else {
			// m.addAttribute("msg", "Invalid User ID");
			m.addAttribute("msg", "Invalid User ID");
			return "Login";
		}

	}

	@RequestMapping("/deposit")

	public String deposit()

	{
		return "Deposit";

	}

	@RequestMapping("/deposit1")

	public String deposit(String amount)

	{
		double amount1 = Double.parseDouble(amount);
		if(amount1 <=0)
		{
			return "Deposit2";
		}
		else
		{
		service.deposit(amount1, accountNumber, u);
		return "Deposit1";
		}
	}

	@RequestMapping("/withdraw")

	public String withdraw()

	{
		return "Withdraw";

	}

	@RequestMapping("/withdraw1")

	public String withdraw1(String amount)

	{
		double balance = service.showBalance(accountNumber);
		double amount1 = Double.parseDouble(amount);

		if (balance < amount1) {
			return "Withdraw2";
		} 
		else if(amount1<=0)
		{
			return "Withdraw3";
		}
		else {
			service.withdraw(amount1, accountNumber, u);
			return "Withdraw1";
		}

	}

	@RequestMapping("/transfer")

	public String transfer()

	{
		return "Transfer";

	}

	@RequestMapping("/transfer1")

	public String transfer1(@RequestParam("account") long account, @RequestParam("amount") String amount)

	{
		PnbBank u1 = service.validateLogin(account);

		double balance = service.showBalance(accountNumber);
		double amount1 = Double.parseDouble(amount);

		if (u1 == null) {
			return "NotExist";

		}
		

		if (Long.toString(account).trim().equals(Long.toString(accountNumber).trim())) {
			return "TransactionFailed";
		}

		else if(amount1 <=0)
		{
			return "Transaction3";
		}
		else if (balance < amount1) {
			return "NotSufficientAmount";
		}
		
		else {
			service.transferMoney(amount1, account, accountNumber, u, u1);
			return "Transaction1";
		}

	}

	@RequestMapping("/printTransaction")
	public String printTransaction(Model m)

	{
		List<Transaction> li = service.printTransaction(accountNumber);
		m.addAttribute("list", li);
		return "PrintTransaction";

	}


}
