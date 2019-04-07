package com.capg.ques3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class MyConnection {

		private static Connection con;
		static {
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public static Connection getConnection()
		{
			return con;
		}
	}


