package com.set;

import java.util.*;

public class SetEx1 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(10);
		set.add(30);
		set.add(50);
		set.add(40);
		set.add(60);
		set.add(null);
		System.out.println(set);
		System.out.println(set.contains(10));
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		set.remove(60);
		System.out.println(set);

		System.out.println("-----------By Using ITR----------");
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("---------By Using For Each Loop--------");
		for (Integer i : set) {
			System.out.println(i);
		}
	}
}

