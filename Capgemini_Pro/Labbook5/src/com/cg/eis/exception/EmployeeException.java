 package com.cg.eis.exception;
public class EmployeeException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int salary;
	public EmployeeException(int salary){
		this.salary = salary;
	}

	@Override
	public String toString(){
		return "This is EmployeeException created because of less salary of employee";
	}
}