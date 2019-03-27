package string;

import java.util.Scanner;

public class Positive {
	
	private static Scanner s;

	public static void main(String[] args)
	{
		s = new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.next();
		System.out.println("Positive String:"+getPositivestring(str));
	}

	public static boolean getPositivestring(String str)
	{
		int f=0;
		for(int i=str.length()-1;i>0;i--)
		{
			if(str.charAt(i)<str.charAt(i-1))
				f=1;
				
		}
		if(f==0)
			return true;
		return false;
	}
}
