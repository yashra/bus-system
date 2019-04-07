package com.capg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.capg.bean.Author;
import com.capg.util.MyConnection;

public class AuthorDao implements IAuthorDao{

	Connection con=MyConnection.getConnection();
	@Override
	public String insert(Author a) {
		String res="";
		try {
			PreparedStatement ps = con.prepareStatement("insert into Author values(?,?,?,?,?)");
			ps.setString(1, a.getAuthorId());
			ps.setString(2, a.getFirstName());
			ps.setString(3, a.getMiddleName());
			ps.setString(4, a.getLastName());
			ps.setString(5, a.getPhnNo());
			int x=ps.executeUpdate();
			if(x>0)
				res="Author Created";
		} catch (SQLException e1) {
			
			res="Author Not Created";
			e1.printStackTrace();
		}
		return res;
		
	}

	@Override
	public String updateFirst( String firstName,String authorId) {
		String res = "";
		try {
			PreparedStatement ps=con.prepareStatement("update Author set firstName = ? where authorId = ?");
			ps.setString(1,firstName);
			ps.setString(2,authorId);
			
			int x=ps.executeUpdate();
			if(x>0)
				res="Author updated";
		} catch (SQLException e1) {
			res="failed";
			e1.printStackTrace();
		}
		return res;
	}

	

	@Override
	public String updateMiddle(String authorId, String middleName) {
		String res = "";
		try {
			PreparedStatement ps=con.prepareStatement("update Author set middleName = ? where authorId = ?");
			ps.setString(1,middleName);
			ps.setString(2,authorId);
			
			int x=ps.executeUpdate();
			if(x>0)
				res="Author updated";
		} catch (SQLException e1) {
			res="failed";
			e1.printStackTrace();
		}
		return res;
	}

	@Override
	public String updateLast(String authorId, String lastName) {
		String res = "";
		try {
			PreparedStatement ps=con.prepareStatement("update Author set lastName = ? where authorId = ?");
			ps.setString(1,lastName);
			ps.setString(2,authorId);
			
			int x=ps.executeUpdate();
			if(x>0)
				res="Author updated";
		} catch (SQLException e1) {
			res="failed";
			e1.printStackTrace();
		}
		return res;
	}

	@Override
	public String updatePhn(String authorId, String phnNo) {
		String res = "";
		try {
			PreparedStatement ps=con.prepareStatement("update Author set phnNo = ? where authorId = ?");
			ps.setString(1,phnNo);
			ps.setString(2,authorId);
			
			int x=ps.executeUpdate();
			if(x>0)
				res="Author updated";
		} catch (SQLException e1) {
			res="failed";
			e1.printStackTrace();
		}
		return res;
	}

	@Override
	public String delete(String authorId) {
		String res = "";
		try {
			PreparedStatement ps=con.prepareStatement("delete from Author where authorId = ?");
			
			ps.setString(1,authorId);
			
			int x=ps.executeUpdate();
			if(x>0)
				res="Author Account Deleted";
		} catch (SQLException e1) {
			res="failed";
			e1.printStackTrace();
		}
		return res;
	}

	@Override
	public List<Author> display(String authorId) {
		ResultSet rs=null;
		List<Author> li = null;
		try {
			PreparedStatement ps=con.prepareStatement("select * from Author where authorId = ?");
			
			ps.setString(1,authorId);
			 rs= ps.executeQuery();
			 rs.next();
			li=new ArrayList<Author>();
			li.add(new Author(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return li ;
	}

}
