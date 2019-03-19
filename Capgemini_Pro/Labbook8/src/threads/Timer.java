package threads;

import java.util.Scanner;

public class Timer implements Runnable{
	private int n;
	private static Scanner s;
	public Timer(int n)
	{
		this.n=n;
	}
	public synchronized void run() {
		try {
			System.out.println("Timer Started for "+n);
		for(int i=0;i<=n;i++)
		{
			System.out.println(i);
			Thread.sleep(10000);
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args)
	{
		Timer t;
		System.out.println("Enter the time of timer");
		s = new Scanner(System.in);
		int p=s.nextInt();
		t=new Timer(p);
		Thread th=new Thread(t);
		th.start();
	}

}
