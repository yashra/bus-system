package lambda;

interface Expression
{
 public double number(int x,int y);	
};

public class Power {

	
	public static void main(String[] args)
	{
		Expression e=(a,b)->{return Math.pow(a,b);};
		System.out.println((int)e.number(2,3));
		
	}
}
