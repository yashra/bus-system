package com.cg.eis.dao;

import java.util.ArrayList;
import java.util.List;

import com.cg.eis.bean.Employee;

public class EmployeeDAO implements IEmployeeDAO{

	List<Employee> li = new ArrayList<Employee>();
	@Override
	public String addEmployee(Employee e) {
		li.add(e);
		return "Employee Added";
	}

	
	

	@Override
	public List<Employee> display() {
		
		return li;
	}
	
	

}
