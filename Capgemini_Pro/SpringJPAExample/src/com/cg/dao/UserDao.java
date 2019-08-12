package com.cg.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.bean.User;

@Repository
@Transactional
public class UserDao {
	@PersistenceContext
	EntityManager em;
	public String createUser(User user)
	{
		em.persist(user);
		return "User create with user ID: "+user.getUserId();
	}
	public User validateLogin(String uid)
	{
		User u=em.find(User.class, uid);
		return u;
	}
	public String updateUser(String uid,String pwd)
	{
		User u=em.find(User.class, uid);
		u.setPassword(pwd);
		em.flush();
		return "Password Updated";
	}
}
