import java.util.*;
class Pow
{
	public static boolean checkNumber(int n)
	{
		if(n==0)
		 return false;
		while(n!=1)
		{
		   if(n%2!=0)
		   { return false; }
		  n=n/2;
		}
		return true;
	}
	public static void main(String as[])
	{
		int p;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value to check power of 2");
		p=s.nextInt();
		System.out.println(checkNumber(p));
	}
}