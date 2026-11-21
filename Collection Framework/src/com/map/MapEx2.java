package com.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapEx2 {
	
	public static void main(String[] args) {
		
		Map<Integer, String>map=new HashMap<Integer, String>();
		map.put(1, "abc");
		map.put(45, "pqr");
		map.put(88, "xyz");
		map.put(3, "lmn");
		System.out.println(map);
		
		System.out.println("========Linkedhash Map========");
		Map<Integer, String>map1=new LinkedHashMap<Integer, String>();
		map1.put(1, "abc");
		map1.put(5, "pqr");
		map1.put(8, "xyz");
		map1.put(3, "lmn");
		System.out.println(map1);
		
		System.out.println("============Tree Map=========");
		Map<Integer, String>map2=new TreeMap<Integer, String>();
		map2.put(1, "abc");
		map2.put(58, "pqr");
		map2.put(81, "xyz");
		map2.put(33, "lmn");
		System.out.println(map2);
	}

}
