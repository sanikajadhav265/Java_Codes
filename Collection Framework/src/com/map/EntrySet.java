package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EntrySet {
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(101,"abc");
		map.put(3,  "pqr");
		map.put(67, "xyz");
		map.put(23, "lmn");
		map.put(89, "def");

		System.out.println("==========Using EntrySet()===========");
		Set<Entry<Integer, String>>set=map.entrySet();
		Iterator<Entry<Integer , String>>itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());	
		}
		
		System.out.println("=========Using For Each Loop========");
		for(Entry<Integer, String> i:set) {
			System.out.println(i);
		}
		
		System.out.println("========Using Values()============");
		Collection<String> ValueSet = map.values();
		Iterator<String> itr2=ValueSet.iterator();
		while(itr2.hasNext()) {
			String s=itr2.next();
			System.out.println(s);
		}
	}
}
