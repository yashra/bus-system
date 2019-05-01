package assignments;
import java.util.Scanner;
class Reverse {

  private static Scanner s;
  public String rev(int num)
  {
    String r="";
    while(num>0)
    {
      r=r+num%10;
      num=num/10;
    }
    return r;
    
  }
  public static void main(String[] args) {
    System.out.println("Enter number of Elements in Array : ");
    Reverse r= new Reverse();
    s = new Scanner(System.in);
    int n = s.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=s.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      arr[i]=Integer.parseInt(r.rev(arr[i]));
    }
    for(int i=0;i<n-1;i++)
    {
      for(int j=0;j<n-i-1;j++)
      {
        if(arr[j]>arr[j+1])
        {
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
	System.out.println("Sorted Element of Array is : ");
    for(int i=0;i<n;i++)
    {
      System.out.println(arr[i]);
    }
  }

}