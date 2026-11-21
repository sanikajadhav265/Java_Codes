package com.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class UniEx {

	public static void main(String[] args) {

		Set<String> mumbaiUniversity = new LinkedHashSet<String>();
		mumbaiUniversity.add("NM College");
		mumbaiUniversity.add("JBIMS College");

		Set<String> puneUniversity = new LinkedHashSet<String>();
		puneUniversity.add("FC College");
		puneUniversity.add("S P College");

		Set<String> kolhapurUniversity = new LinkedHashSet<String>();
		kolhapurUniversity.add("KWC");
		kolhapurUniversity.add("MMT");

		Set<Set<String>> university = new LinkedHashSet<Set<String>>();
		university.add(kolhapurUniversity);
		university.add(mumbaiUniversity);
		university.add(puneUniversity);

		System.out.println("=================By Using ITR==========");
		Iterator<Set<String>> itr = university.iterator();
		while (itr.hasNext()) {
			Set<String> college = itr.next();

			Iterator<String> itr2 = college.iterator();
			while (itr2.hasNext()) {
				System.out.println(itr2.next());
			}
		}
		System.out.println("===========By Using For Each Loop=========");
		for (Set<String> set : university) {
			for (String college : set) {
				System.out.println(college);
			}

		}

	}
}
