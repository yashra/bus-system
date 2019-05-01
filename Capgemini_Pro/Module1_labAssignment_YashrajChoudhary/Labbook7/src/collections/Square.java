package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Square {

	private static Scanner s;
	public static Map<Integer,Integer> getSquares(int[] num)
	{
		int i,j;
		Map<Integer,Integer> m=new HashMap<Integer,Integer>();
		for(i=0;i<num.length;i++)
		{
			j=num[i]*num[i];
			m.put(num[i],j);
		}
		return m;
	}
	public static void main(String[] args)
	{
		s = new Scanner(System.in);
		System.out.println("Enter the length of Numbers to be Entered");
		int n=s.nextInt();
		System.out.println("Enter the Numbers");
		int[] num=new int[n];
		for(int i=0;i<n;i++)
		{
			num[i]=s.nextInt();
		}
		System.out.println(getSquares(num));
	}
}
