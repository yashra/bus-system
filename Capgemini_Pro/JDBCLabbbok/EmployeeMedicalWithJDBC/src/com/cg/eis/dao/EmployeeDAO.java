package com.cg.eis.dao;

import java.sql.Connection;
import com.cg.eis.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.cg.eis.bean.Employee;

public class EmployeeDAO implements IEmployeeDAO{

	Connection con=MyConnection.getConnection();
	
	@Override
	public String deleteEmployee(int id) {
		String res = "";
		try {
			PreparedStatement ps=con.prepareStatement("delete from emps where id = ?");
			
			ps.setInt(1,id);
			
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
	public List<Employee> display(int id) {
		
		ResultSet rs=null;
		List<Employee> li = null;
		try {
			PreparedStatement ps=con.prepareStatement("select * from emps where id = ?");
			
			ps.setInt(1,id);
			 rs= ps.executeQuery();
			 rs.next();
			li=new ArrayList<Employee>();
			li.add(new Employee(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getString(4),rs.getString(5)));
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return li ;
	}
	
	

}
