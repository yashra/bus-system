package threads;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyDataThread implements Runnable {
	
	public CopyDataThread(String s)
	{
		System.out.println("Copy file:"+s);
	}
	
	public void run()
	{
		try {
			FileReader fis=new FileReader("F:\\Capgemini\\Java_Demo\\source.txt");
			FileWriter fos=new FileWriter("F:\\Capgemini\\Java_Demo\\target.txt");
			int p,count=0;
			while((p=fis.read())!=-1)
			{
				fos.write((char)p);
				
				count++;
				if(count==10)
				{	System.out.println("10 characters are copied");
					fos.write("\n");
					count=0;
					Thread.sleep(5000);
				}				
				
			}
			fis.close();
			fos.close();		
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}

	
}
