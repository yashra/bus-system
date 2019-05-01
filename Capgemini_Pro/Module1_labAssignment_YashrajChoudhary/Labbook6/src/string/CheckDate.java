package string;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CheckDate {
	
	private static Scanner s;

	public static void main(String[] args)
	{
		s = new Scanner(System.in);
		System.out.println("Enter the Date(yyyyMMdd)");
		String str=s.next();
		int year=Integer.parseInt(str.substring(0, 4));
		//System.out.println(year);
		int month=Integer.parseInt(str.substring(4, 6));
		//System.out.println(month);
		int dayOfMonth=Integer.parseInt(str.substring(6, 8));
		//System.out.println(dayOfMonth);
		LocalDate d=LocalDate.of(year, month, dayOfMonth);
		LocalDate d1=LocalDate.now();
		Period p=Period.between(d, d1);
		System.out.println("Current Date:"+d1);
		System.out.println("User Date:"+year+"-"+month+"-"+dayOfMonth);
		System.out.println("Difference is "+p.getYears()+"years,"+p.getMonths()+"months,"+p.getDays()+"Days.");
		
	}

}
