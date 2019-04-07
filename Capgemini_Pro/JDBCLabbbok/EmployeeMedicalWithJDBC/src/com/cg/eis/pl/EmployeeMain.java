package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.service.EmployeeService;

public class EmployeeMain {

	private static Scanner s;
	

	public static void main(String[] args) {
		EmployeeService es = new EmployeeService();
		
		s = new Scanner(System.in);
		String c=null;
		System.out.println("=======Employee Management System========");
		System.out.println();
		
		do {
			System.out.println("========Operations========");
			System.out.println();
			System.out.println("Enter 1 for Display");
			System.out.println("Enter 2 for Delete");
			System.out.println("Enter 3 for exit");
			System.out.println();
			System.out.println("Enter your choice : ");
			int ch = s.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter Employee Id : ");
				int id = s.nextInt();
				es.display(id).forEach(e->{
					System.out.print("Employee Id : "+e.getId()+"\nName : "+e.getName()+"\nSalary : "+e.getSalary()+"\nDesignation : "+e.getDesignation()+"\nInsurance scheme : "+e.getInsuranceScheme());
				});;
				break;
			case 2:
				System.out.println("Enter Employee ID : " );
				int id2 = s.nextInt();
				System.out.println(es.deleteEmployee(id2));
				break;
			case 3:
				System.exit(0);
			default:
				System.out.println("Invalid Choice");
		}
		System.out.println();
		System.out.println("if you want to continue further press y");
		c=s.next();
	}while(c.equals("y"));
		
		}
	}


