package string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Token {
	
	private static Scanner s;

	public static void main(String[] args)
	{
		s = new Scanner(System.in);
		System.out.println("Enter the value of integer");
		String p=s.nextLine();		
		StringTokenizer st=new StringTokenizer(p, ",");
		//System.out.println(st.countTokens());
		int sum=0;
		while(st.hasMoreTokens())
		{
			String n=st.nextToken();
			int i=Integer.parseInt(n);
			sum=sum+i;
			System.out.println(n);
		}
		
		System.out.println(sum);
		
	}

}
