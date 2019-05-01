package lambda;

interface Space
{
	public void display(String s);
}
public class Spacestring {
	
	public static void main(String[] args)
	{
		Space sp=(s)->{for(int i=0;i<s.length();i++) {System.out.print(s.charAt(i)+" ");}};
		sp.display("Three");
	}

}
