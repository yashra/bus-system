package com.capg.service;


import java.util.List;

import com.capg.bean.Author;
import com.capg.dao.AuthorDao;

public class AuthorService implements IAuthorService{

	AuthorDao dao = new AuthorDao();
	@Override
	public String insert(Author a) {
		if(a.getAuthorId().length()>3 && a.getFirstName().length()>2)
			return dao.insert(a);
		else
			return "Invalid Data";
		
	}

	@Override
	public String updateFirst(String authorId, String firstName) {
		
		return dao.updateFirst(authorId, firstName);
	}

	@Override
	public String delete(String authorId) {
		
		return dao.delete(authorId);
	}


	@Override
	public String updateMiddle(String authorId, String middleName) {
		return dao.updateMiddle(authorId, middleName);
	}

	@Override
	public String updateLast(String authorId, String lastName) {
		return dao.updateLast(authorId, lastName);
	}

	@Override
	public String updatePhn(String authorId, String phnNo) {
		return dao.updatePhn(authorId, phnNo);
	}

	@Override
	public List<Author> display(String authorId) {
		// TODO Auto-generated method stub
		return dao.display(authorId);
	}

}
