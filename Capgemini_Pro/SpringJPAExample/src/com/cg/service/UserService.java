package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bean.User;
import com.cg.dao.UserDao;

@Service
public class UserService {
	@Autowired
	UserDao userDao;
	public String createUser(User user)
	{
		if(user.getUserId().length()<3 || user.getPassword().length()<8)
		{
			return "Invalid Data";
		}
		else
		{
			return userDao.createUser(user);
		}
	}
	public User validateLogin(String uid)
	{
		if(uid.length()<3)
				return null;
		else
			return userDao.validateLogin(uid);
	}
	public String updateUser(String uid,String pwd)
	{
		if(uid.length()<3 || pwd.length()<8)
		{
			return "Invalid Data";
		}
		else
			return userDao.updateUser(uid, pwd);
	}
}
