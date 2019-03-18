package assignments;

import java.util.Scanner;

public class Repeat {
	
	private static Scanner s;

	public static char[] repeat(char[] str)
	{
		int count=1,flag=0;
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i]==str[j])
				{
					count++;
				}
			}
			for(int k=0;k<i;k++)
			{
				if(str[k]==str[i])
				{
					flag=1;
				}
			}
			if(flag!=1)
			{
			System.out.println(str[i]+" "+"appeared for"+" "+count+(count==1?"time":"times"));
			}
			flag=0;
			count=1;
		}
		return str;
	}
	
	public static void main(String[] args)
	{
		s = new Scanner(System.in);
		System.out.println("Enter the String");
		String p=s.next();
		char st[]=p.toCharArray();
		System.out.println(repeat(st));
	}

}
