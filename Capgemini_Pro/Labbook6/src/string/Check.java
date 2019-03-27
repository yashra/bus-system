package string;

import java.io.File;
import java.util.Scanner;

public class Check {
	
	private static Scanner s;
	public static void main(String[] args)
	{
		s = new Scanner(System.in);
		System.out.println("Enter the file name");
		String fs=s.next();
		File f=new File(fs);
		boolean exists=f.exists();
		if(exists==true)
		{
			System.out.println("File Found");
			System.out.println("Readable:"+f.canRead());
			System.out.println("Writeable:"+f.canWrite());
			System.out.println("Executable:"+f.canExecute());
			System.out.println("Length:"+f.length());
			System.out.println("Absolute Path:"+f.getAbsolutePath());
			System.out.println("File type:"+getFileExtension(f));
		}
		else
		{
			System.out.println("File Not Found");
		}
	}
	public static String getFileExtension(File f)
	{
		String filename=f.getName();
		if(filename.lastIndexOf(".")!=-1 && filename.lastIndexOf(".")!=0)
			return filename.substring(filename.lastIndexOf(".")+1);
		else
			return "";
	}

}
