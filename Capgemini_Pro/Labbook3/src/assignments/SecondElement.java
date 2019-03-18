package assignments;
import java.util.Scanner;
public class SecondElement {

	private static Scanner s;
	public static int getSecondSmallest(int[] arr)
	{
		int i,j,swap,min=arr[0];
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					swap=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=swap;
				}
			}
		}
		/*for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}*/
		for(i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		return min;
	}
	public static void main(String[] args)
	{
		s = new Scanner(System.in);
		int n;
		System.out.println("Enter the size of array");
		n=s.nextInt();
		System.out.println("Enter the elements in array");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Minimum Element is:"+getSecondSmallest(a));
	}
}

