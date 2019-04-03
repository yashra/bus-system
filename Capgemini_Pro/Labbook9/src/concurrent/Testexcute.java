package concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Testexcute {
	
	public static void main(String[] args)
	{
		Runnable r=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(Thread.currentThread().getName()+"is Running");
			}
		};
		ExecutorService ex=Executors.newFixedThreadPool(5);
		for(int i=0;i<20;i++)
		{
			ex.execute(r);
		}
	}

}
