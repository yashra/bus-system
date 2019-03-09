import java.util.*;
class Check
{
	public static boolean checkNumber(int number)
	{
		int r=number%10;
		while(number>0)
		  number=number/10;
		if(r>number)
		 return true;
		else
		 return false;
	}
	public static void main(String as[])
	{
		int p;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value to check is it increasing or not");
		p=s.nextInt();
		System.out.println(checkNumber(p));
	}
}	