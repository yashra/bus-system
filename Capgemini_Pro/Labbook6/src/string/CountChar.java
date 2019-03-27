package string;
import java.io.FileReader;
import java.io.IOException;

public class CountChar {

	public static void main(String[] args) throws IOException{
		try {
			FileReader fr = new FileReader("F:\\Capgemini\\Java_Demo\\Labbook6\\homecopy.txt");
			int ch,letter=0,space=0,num=0,other=0;
			while((ch=fr.read())!=-1)
			{
				if(Character.isWhitespace((char)ch))
				{
					space++;
				}
				else if(Character.isDigit((char)ch))
				{
					num++;
				}
				else if(Character.isLetter((char)ch))
				{
					letter++;
				}
				else
				{
					other++;
				}
				
			}
			System.out.println("White Spaces :: "+space);
			System.out.println("Numbers :: "+num);
			System.out.println("Letters :: "+letter);
			System.out.println("Special Characters :: "+other);
			fr.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
