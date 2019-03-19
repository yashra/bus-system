package exceptions;
import java.util.Scanner;
class Prime
{
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter an Integer: ");
		int n = scan.nextInt();
		int i=3; int c=0;
		//int a[] = new int[p];
      System.out.println("Primes numbers are");
for (i = 2 ; i <= n ;i++  )
   {
      for ( c = 2 ; c <=n ; c++ )
      {
         if ( i%c == 0 )
            break;
      }
      if ( c == i )
      {
         System.out.println(i);
        // count++;
      }
   }
	}
}