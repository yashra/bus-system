package com.capg.dao;



import java.util.List;

import com.capg.bean.Author;

public interface IAuthorDao {

	public String insert(Author a);
	public String updateFirst(String authorId,String firstName);
	public String updateMiddle(String authorId, String middleName);
	public String updateLast(String authorId, String lastName);
	public String updatePhn(String authorId, String phnNo);
	public String delete(String authorId);
	public List<Author> display(String authorId);
	
}
