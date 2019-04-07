package com.cg.eis.service;

import java.util.List;

import com.cg.eis.bean.Employee;
import com.cg.eis.dao.EmployeeDAO;

public class EmployeeService implements IEmployeeService{

	EmployeeDAO dao = new EmployeeDAO();
	@Override
	public String deleteEmployee(int id) {
		return dao.deleteEmployee(id);
	}

	@Override
	public List<Employee> display(int id) {
		
		return  dao.display(id);
	}

	
	
}
