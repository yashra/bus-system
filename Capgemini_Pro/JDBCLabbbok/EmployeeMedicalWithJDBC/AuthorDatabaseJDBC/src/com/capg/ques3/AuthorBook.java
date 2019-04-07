package com.capg.ques3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.capg.util.MyConnection;

public class AuthorBook {

	Connection con=MyConnection.getConnection();
	
	public static String displayBook(String authorid)
	{
		return null;
	}
	
	public String updatePrice(String aname, double price)
	{
		String res = "";
		try {
			PreparedStatement ps=con.prepareStatement("update books set price = ? where authorId= (select authorId from author where firstname=?)");
			ps.setDouble(1,price);
			ps.setString(2,aname);
			
			int x=ps.executeUpdate();
			if(x>0)
				res="Author updated";
		} catch (SQLException e1) {
			res="failed";
			e1.printStackTrace();
		}
		return res;
	}
	
	public static void main(String[] args) {
		

		AuthorBook ab = new AuthorBook();
		System.out.println(ab.updatePrice("pavan", 500));
	}

}
