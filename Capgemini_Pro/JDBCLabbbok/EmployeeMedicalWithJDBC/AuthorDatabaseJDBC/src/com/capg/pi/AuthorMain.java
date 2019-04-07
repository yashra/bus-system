package com.capg.pi;



import java.util.Scanner;

import com.capg.bean.Author;
import com.capg.service.AuthorService;

public class AuthorMain {

	private static Scanner s;

	public static void main(String[] args) {
		AuthorService as = new AuthorService();
		s = new Scanner(System.in);
		String c=null;
		
		
		
		System.out.println("=======Author Details Management System========");
		System.out.println();
		
		do {
			System.out.println("========Operations========");
			System.out.println();
			System.out.println("Enter 1 for Create New Author Account");
			System.out.println("Enter 2 for update Author Account");
			System.out.println("Enter 3 for delete Author Account");
			System.out.println("Enter 4 for get Author Account Details");
			System.out.println("Enter 5 for Exit");
			System.out.println();
			System.out.println("Enter your choice : ");
			int ch = s.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.println("Enter Details : ");
				System.out.println();
				System.out.println("Enter AuthorId : ");
				String id=s.next();
				System.out.println("Enter firstName : ");
				String fn=s.next();
				System.out.println("Enter middleName : ");
				String mn=s.next();
				System.out.println("Enter lastName : ");
				String ln=s.next();
				System.out.println("Enter phnNo : ");
				String ph=s.next();
				System.out.println(as.insert(new Author(id,fn,mn,ln,ph)));
				
				break;
			case 2:
				
				System.out.println("UPDATE OPERATIONs:");
				System.out.println();
				System.out.println("Enter 1 for update First name");
				System.out.println("Enter 2 for update Middle name");
				System.out.println("Enter 3 for update Last name");
				System.out.println("Enter 4 for Update Phone number");
				System.out.println("Enter 5 for Exit");
				System.out.println();
				System.out.println("Enter your choice : ");
				int ch1 = s.nextInt();
				switch(ch1)
				{
				case 1:
					System.out.println("Enter AuthorId : ");
					String id1=s.next();
					System.out.println("Enter firstName : ");
					String fn1=s.next();
					System.out.println(as.updateFirst(id1, fn1));
					break;
				case 2:
					System.out.println("Enter AuthorId : ");
					String id2=s.next();
					System.out.println("Enter middleName : ");
					String mn1=s.next();
					System.out.println(as.updateMiddle(id2, mn1));
					break;
				case 3:
					System.out.println("Enter AuthorId : ");
					String id3=s.next();
					System.out.println("Enter lastName : ");
					String ln1=s.next();
					System.out.println(as.updateLast(id3, ln1));
					break;
				case 4:
					System.out.println("Enter AuthorId : ");
					String id4=s.next();
					System.out.println("Enter PhnNumber : ");
					String ph1=s.next();
					System.out.println(as.updatePhn(id4, ph1));
					break;
				case 5:
					System.exit(0);
				default:
					System.out.println("Invalid Choice");
				}
				break;
			case 3:
				System.out.println("Enter AuthorId : ");
				String id5=s.next();
				System.out.println(as.delete(id5));
				break;
			case 4:
				System.out.println("Enter AuthorId : ");
				String id6=s.next();
				as.display(id6).forEach(a->{
					System.out.print("Author Id : "+a.getAuthorId()+"\nFirstName : "+a.getFirstName()+"\nMiddleName : "+a.getMiddleName()+"\nLastName : "+a.getLastName()+"\nPhnone Number : "+a.getPhnNo());
				});;
				break;
			case 5:
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
