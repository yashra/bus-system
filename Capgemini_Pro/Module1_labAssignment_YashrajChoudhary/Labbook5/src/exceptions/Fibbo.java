package exceptions;
import java.util.Scanner;
class 	Fibbo 
{  
 private static Scanner s;
public static void main (String args[]) 
    { 
    	s = new Scanner(System.in);
        System.out.println("Enter the nth number to know the value in Fibbonaci Series");
        int n = s.nextInt(); 
        System.out.println("Without recursion Nth value of Fibbonaci series is: "+withoutRecursion(n)); 
        System.out.println("With Recursion Nth value of Fibbonaci series is: "+withRecursion(n));
    } 

   static int withoutRecursion(int n) 
    { 
    
    int f[] = new int[n+2]; 
    int i; 
    f[0] = 0; 
    f[1] = 1; 
      
    for (i = 2; i <= n; i++) 
    { 
        f[i] = f[i-1] + f[i-2];
         
    } 
       
    return f[n]; 
    } 
     static int withRecursion(int n) 
    { 
    
    int f[] = new int[n+2]; 
    int i; 
    f[0] = 0; 
    f[1] = 1; 
      
    for (i = 2; i <= n;) 
    { 
    	return withRecursion(n-1)+withRecursion(n-2);
         
    } 
       
    return f[n]; 
    } 
       
  
} 
	