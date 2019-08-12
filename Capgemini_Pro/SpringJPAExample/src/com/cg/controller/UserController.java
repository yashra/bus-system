package com.cg.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.bean.User;
import com.cg.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	@RequestMapping("/update")
	public String setupdate()
	{
		return "update";
	}
	@RequestMapping("/logout")
	public String setLogout(HttpSession ses)
	{
		ses.invalidate();
		return "Login";
	}
	@RequestMapping("/profile")
	public String getProfile()
	{
		return "Profile";
	}
	@RequestMapping("/add")
	public String getPage()
	{
		return "User";
	}
	@RequestMapping("/addUser")
	public String addUser(User user,Model m)
	{
		String str=userService.createUser(user);
		m.addAttribute("Message",str);
		return "User";
	}
	@RequestMapping("/Login")
	public String getPage1()
	{
		return "Login";
	}
	@RequestMapping(value="/validateLogin",method=RequestMethod.POST)
	public String checkLogin(@RequestParam("t1")String uid,@RequestParam("t2")String pwd,HttpSession ses)
	{
		User u=userService.validateLogin(uid);
		if(u!=null)
		{
			if(u.getPassword().equals(pwd))
			{
				ses.setAttribute("user",u);
				ses.setMaxInactiveInterval(30);
				return "Welcome";
			}
			else
			{
				ses.setAttribute("msg","Invalid Password");
				return "Login";
			}			
		}
		else
		{
			ses.setAttribute("msg","Invalid User ID");
			return "Login";

		}
	}
	@RequestMapping(value="/Password",method=RequestMethod.POST)
	public String getPass(@RequestParam("t1") String uid,@RequestParam("t3") String pwd,Model m)
	{
		String u=userService.updateUser(uid, pwd);
		m.addAttribute("message",u);
		return "Profile";
	}
	
}
