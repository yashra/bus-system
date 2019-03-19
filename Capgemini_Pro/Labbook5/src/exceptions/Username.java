package exceptions;
import java.util.Scanner;
class Username
{
	private static Scanner sc;

	public static void main(String[] args) throws MyException {
		sc = new Scanner(System.in);
		System.out.println("Enter First Name");
		String first=sc.nextLine();
		System.out.println("Enter Second Name");
		String last=sc.nextLine();
		
			// try{
				if(first.length()<1 | last.length()<1)
				{
					throw new MyException("firstname or lastname is empty");
				}
				System.out.println("Validate name");

		// 	}
		// 	catch(MyException ae)
		// 	{
		// 		System.out.println(ae.getMessage());
		// 	}
		}
}
class MyException extends Exception
{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		MyException(String s)
	{
		super(s);
}
	}