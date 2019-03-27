package string;

import java.io.FileReader;

public class FileRead {
	public static void main(String[] args)
	{
	try {
	FileReader fr=new FileReader("F:\\Capgemini\\Java_Demo\\Labbook6\\f1.txt");
	int i,count=1;
	while((i=fr.read())!=-1)
	{
		System.out.print((char)i);
		if(i==10)
		{
			System.out.println("Line"+count);
			count++;
		}
	}
	fr.close();
	}
	
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}
