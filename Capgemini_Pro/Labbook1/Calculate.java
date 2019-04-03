import java.util.*;
class Calculate
{
	public static int calculateSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
	public static void main(String as[])
	{
		int p;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of natural number");
		p=s.nextInt();
		System.out.println(calculateSum(p));
	}
}