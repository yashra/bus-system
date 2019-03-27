package com.cg.eis.service;

import java.util.List;

import com.cg.eis.bean.Employee;
import com.cg.eis.dao.EmployeeDAO;

public class EmployeeService implements IEmployeeService{

	EmployeeDAO dao = new EmployeeDAO();
	@Override
	public String addEmployee(Employee e) {
		if(e.getId()<4 && e.getName().length()<4 )
		{
			return "INVALID INPUT";
		}
		else
		{
			return dao.addEmployee(e);
		}
	}

	@Override
	public List<Employee> display() {
		
		return  dao.display();
	}

	@Override
	public String findInsuranceScheme(double sal, String des) {
		if(sal<5000 && des.equals("clerk"))
		{
			return "No Scheme";
		}
		else if(5000<sal || sal<20000 && des.equals("system associate"))
		{
			return "Scheme C";
		}
		else if(20000<=sal || sal<40000 && des.equals("programmer"))
		{
			return "Scheme B";
		}
		else if( sal<40000 && des.equals("manager"))
		{
			return "Scheme A";
		}
		else
		{
			return "INVALID";
		}
	}

	
}
