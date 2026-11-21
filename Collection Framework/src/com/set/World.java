package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class World {

	public static void main(String[] args) {

		Set<String> maha = new HashSet<String>();
		maha.add("Pune");
		maha.add("Sangli");
		maha.add("Mumbai");

		Set<String> guj = new HashSet<String>();
		guj.add("Surat");
		guj.add("Rajkot");
		guj.add("Ahmedabad");

		Set<Set<String>> india = new HashSet<Set<String>>();
		india.add(guj);
		india.add(maha);

		Set<String> shanghai = new HashSet<String>();// beijing
		shanghai.add("Huangpu");
		shanghai.add("Xuhui");

		Set<String> beijing = new HashSet<String>();
		beijing.add("Dongcheng");
		beijing.add("Chaoyang");

		Set<Set<String>> china = new HashSet<Set<String>>();
		china.add(shanghai);
		china.add(beijing);

		Set<Set<Set<String>>> world = new HashSet<Set<Set<String>>>();
		world.add(china);
		world.add(india);

		System.out.println("==============By Using ITR==============");
		Iterator<Set<Set<String>>> itr = world.iterator();
		while (itr.hasNext()) {
			Set<Set<String>> country = itr.next();
			Iterator<Set<String>> itr1 = country.iterator();
			while (itr1.hasNext()) {
				Set<String> state = itr1.next();
				Iterator<String> itr2 = state.iterator();
				while (itr2.hasNext()) {
					System.out.println(itr2.next());
				}

			}

		}
		System.out.println("=============By Using For Each Loop=========");
		for (Set<Set<String>> set1 : world) {
			for (Set<String> set2 : set1) {
				for (String city : set2) {
					System.out.println(city);
				}
			}
		}

	}
}
