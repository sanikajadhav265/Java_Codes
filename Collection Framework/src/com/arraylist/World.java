package com.arraylist;
import java.util.*;

public class World {
	
	public static void main(String[] args) {

		List<String> maha = new ArrayList<String>();
		maha.add("Pune");
		maha.add("Sangli");
		maha.add("Kolhapur");		
		List<String> gujarat = new ArrayList<String>();
		gujarat.add("Surat");
		gujarat.add("Rajkot");
		gujarat.add("Ahamdabad");

		List<List<String>> india = new ArrayList<List<String>>();
		india.add(maha);
		india.add(gujarat);

		List<String> newyork = new ArrayList<String>();
		newyork.add("Albany");
		newyork.add("Buffalo");
		List<String> california = new ArrayList<String>();
		california.add("Fresno");
		california.add("San Jose");

		List<List<String>> usa = new ArrayList<List<String>>();
		usa.add(newyork);
		usa.add(california);

		List<List<List<String>>> world = new ArrayList<List<List<String>>>();
		world.add(india);
		world.add(usa);

		System.out.println("-------------Using ITR---------------");
		Iterator<List<List<String>>> itr = world.iterator();
		while (itr.hasNext()) {
			List<List<String>> country = itr.next();

			Iterator<List<String>> itr1 = country.iterator();
			while (itr1.hasNext()) {
				List<String> state = itr1.next();
				System.out.println(state);

				Iterator<String> itr2 = state.iterator();
				while (itr2.hasNext()) {
					System.out.println(itr2.next());
				}
			}		
		}
		System.out.println("-------Using For Each Loop---------");
		for (List<List<String>> list : world) {
			for(List<String> list1:list){
				//System.out.println(list1);
				for(String city:list1) {
				System.out.println(city);
				}
			}		
		}

	}

}
