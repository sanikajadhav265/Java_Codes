package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex3 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "abc");
		map.put(3, "pqr");
		map.put(67, "xyz");
		map.put(23, "lmn");
		map.put(89, "def");
		System.out.println("==========By Using KeySet()==========");
		Set<Integer> set = map.keySet();
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			Integer i = itr.next();
			System.out.println(i + " " + map.get(i));
		}

		System.out.println("==========By Using For Each Loop============");
		for (Integer i : set) {
			System.out.println(i + " " + map.get(i));
		}
	}

}
