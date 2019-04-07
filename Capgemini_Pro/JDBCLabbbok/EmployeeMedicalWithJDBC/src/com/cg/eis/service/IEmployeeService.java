package com.cg.eis.service;

import java.util.List;

import com.cg.eis.bean.Employee;

public interface IEmployeeService {

	public String deleteEmployee(int id);
	public List<Employee> display(int id);
	
}
