package collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChar {

	private static Scanner s;
	public static Map<Character,Integer> countCharacter(char[] st)
	{
		int count=1,flag=0;
		Map<Character,Integer> m=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<st.length;i++)
		{
			for(int j=i+1;j<st.length;j++)
			{
				if(st[i]==st[j])
					count++;
			}
			
			for(int k=0;k<i;k++)
			{
				if(st[k]==st[i])
					flag=1;
			}
			if(flag!=1)
				m.put(st[i], count);
			flag=0;
			count=1;
		}
		return m;
	}
	public static void main(String[] args)
	{
		s = new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.next();
		char[] st=str.toCharArray();
		System.out.println(countCharacter(st));
	}
}
