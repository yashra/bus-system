package lambda;

import java.util.Scanner;

interface Ipredicate
{
	int fact(int num);
}
class Number
{
	public int fact(int num)
	{
		if(num==0)
			return 1;
		else
			return (num*fact(num-1));
	}
}
public class Fact {
/**
 * @author YASH
 */
	private static Scanner s;

	public static void main(String[] args)
	{
		s = new Scanner(System.in);
		System.out.println("Enter the number for which you need factorial");
		int pr=s.nextInt();
		Ipredicate p=new Number()::fact;
		System.out.println("Factorial of"+pr+":"+p.fact(pr));
	}
}
