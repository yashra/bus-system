package operators;

import java.util.Scanner;

public class SumCube {
	
	private static Scanner s;
	public static int sumCube(int n)
	{
		int r,sum=0;
		while(n>0)
		{
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args)
	{
		s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int a=s.nextInt();
		System.out.println("Sum of digits of cube are:"+" "+sumCube(a));
	}

}
