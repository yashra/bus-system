package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeService es = new EmployeeService();
		//List<Employee> li = new ArrayList<Employee>();
		es.addEmployee(new Employee(1001,"jas",20000,"Programmer","Scheme B"));
		es.addEmployee(new Employee(1002,"taran",1000,"Clerk","No Scheme"));
		es.addEmployee(new Employee(1003,"pavan",50000,"manager","Scheme A"));
		es.addEmployee(new Employee(1004,"ram",20000,"system associate","Scheme C"));
		System.out.println(es.findInsuranceScheme(1000, "clerk"));
		System.out.println(es.display());
	}

}
