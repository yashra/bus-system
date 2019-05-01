package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hashmap {
	public static List<String> sort(Map<Integer,String> m)
	{
		List<String> l=new ArrayList<String>(m.values());
		Collections.sort(l);
		return l;
	}
	
	public static void main(String[] args)
	{
		Map<Integer, String> m=new HashMap<Integer,String>();
		m.put(2, "yash");
		m.put(1, "rahul");
		m.put(3, "jas");
		m.put(5, "ram");
		m.put(4, "amit");
		System.out.println(sort(m));
	}

}
