package string;
import java.util.Scanner;

public class ValidateUser {

	private static Scanner s;
	public static boolean validation(String str)
	{
		String name = str.substring(0, str.indexOf("_job"));
		if(str.contains("_job") && name.length()>=8)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		System.out.println("Registering Details : ");
		System.out.println("Enter Username (Should end with_job) : ");
		s = new Scanner(System.in);
		String str = s.next();
		boolean b= ValidateUser.validation(str);
		if(b==false)
			System.out.println("Invalid username");
		else
			System.out.println("Valid Username");
	}

}