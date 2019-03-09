import java.lang.*;
import java.util.*;
class Difference
{
	static int diff=0,number=0,square=0;
	public static int calculateDifference(int n)
	{
		for(int i=1;i<=n;i++)
		{
			number=number+i;
			square=square+i*i;
			
		}
		number=number*number;
		diff=number-square;
		return diff;
	}
	public static void main(String as[])
	{
		int p;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of natural number");
		p=s.nextInt();
		System.out.println(calculateDifference(p));
	}
}
