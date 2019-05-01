package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class TestString {
		
	private static Scanner s;
	public static char[] Case(char[] str)
	{
		int a=str.length;
		if(a%2==0)
		{
			int b=a/2;
			for(int i=0;i<b;i++)
			{
				str[i]=(char)(str[i]-32);
			}
				
		}
		else
		{
			int b=(a/2)+1;
			for(int i=0;i<b;i++)
			{
				str[i]=(char)(str[i]-32);
			}
		}
			return str;
	}
	public static void main(String[] args)
	{
		String p;
		s = new Scanner(System.in);
		System.out.println("Enter the String in small charachers");
		p=s.next();
		char st[]=p.toCharArray();
		Arrays.sort(st);
		System.out.println(Case(st));
		
	}
}
