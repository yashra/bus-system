package com.cg.eis.dao;

import java.util.List;

import com.cg.eis.bean.Employee;

public interface IEmployeeDAO {

	public String deleteEmployee(int id);
	
	public List<Employee> display(int id);
}
