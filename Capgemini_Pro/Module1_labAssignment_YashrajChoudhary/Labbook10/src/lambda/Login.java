package lambda;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

interface accept
{
	public boolean check(String u_name,String pass);
}
public class Login {

	private static Scanner s;

	public static void main(String[] args)
	{
		Map<String,String> m= new LinkedHashMap<String,String>();
		m.put("abc", "1234");
		m.put("yash", "123");
		m.put("jas", "jas");
		m.put("tech", "tech123");
		s = new Scanner(System.in);
		System.out.println("Enter Username");
		String u_name=s.next();
		System.out.println("Enter Password");
		String pass=s.next();
		accept ac=(a,b)->{if(m.containsKey(a)==true && m.containsValue(b)==true) {return true;}
		else {return false;}};
		System.out.println("Credentials are:"+" "+ac.check(u_name, pass));
	}
		
}

