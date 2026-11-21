package com.map;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {
	public static void main(String[] args) {
//		
//		Map<Integer,String> m=new HashMap<Integer, String>();
//		m.put(10, "abc");
//		m.put(11, "abc");
//		m.put(43,"xyz");
//		m.put(56, "lmn");
//		System.out.println(m);
		
	  Map<Integer, Double> s=new HashMap<Integer, Double>();
	  s.put(1, 3445.453);
	  s.put(4, 5834234.564);
	  s.put(12, 44568.34565);
	  s.put(23, null);
	  s.put(null, 4563.449);	  
	  System.out.println(s);	  
	  System.out.println(s.get(4));
	  s.remove(12);
	  System.out.println(s);
	  System.out.println(s.isEmpty());
	  System.out.println(s.containsKey(null));
	  System.out.println(s.containsKey(5));
	  s.remove(1, 3445.453);
	  System.out.println(s);
      s.replace(5, 3445.453);
	  System.out.println(s);
	}

}
