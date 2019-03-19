package com.cg.eis.exception;
import com.cg.eis.exception.EmployeeException;
class ValidatingSalary{//To compile code in pacakges stay in ur normal directory then compile javac validating/ValidatingString.java....to run java validating.ValidatingString
	private static java.util.Scanner scanner;

	public static void main(String[] args) {
		
	
	System.out.println(" Enter salary of employee to be validated");
		scanner = new java.util.Scanner(System.in);
		int salary = scanner.nextInt();
		try{
			if(salary < 3000)
				throw new EmployeeException(salary);
			System.out.println("Salary is validated");
		}catch(EmployeeException e){
			System.out.println(e);
		}
	}
}
