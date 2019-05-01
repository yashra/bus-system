package com.cg.eis.service;

import java.util.List;

import com.cg.eis.bean.Employee;

public interface IEmployeeService {

	public String addEmployee(Employee e);
	public List<Employee> display();
	public String findInsuranceScheme(double sal,String des);
}
