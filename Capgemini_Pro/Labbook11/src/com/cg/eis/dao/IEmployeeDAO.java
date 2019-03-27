package com.cg.eis.dao;

import java.util.List;

import com.cg.eis.bean.Employee;

public interface IEmployeeDAO {

	public String addEmployee(Employee e);
	
	public List<Employee> display();
}
