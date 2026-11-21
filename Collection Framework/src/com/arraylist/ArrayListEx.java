package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		List<String>maharastra=new ArrayList<String>();
		maharastra.add("Pune");
		maharastra.add("Sangli");
		maharastra.add("Kolhapur");

		List<String> gujrat=new ArrayList<String>();
		gujrat.add("Surat");
		gujrat.add("Rajkot");
		gujrat.add("Ahamdabad");

		List<String> rajsthan=new ArrayList<String>();
		rajsthan.add("Jaisalmer");
		rajsthan.add("Jaipur");
		rajsthan.add("Udaypur");

		List<List<String>>country=new ArrayList<List<String>>();
		country.add(maharastra);
		country.add(gujrat);
		country.add(rajsthan);

		System.out.println("============Using ITR============");
		Iterator<List<String>>itr=country.iterator();
		while(itr.hasNext()) {
			List<String> state=itr.next();
			Iterator<String>itr1=state.iterator();
			while(itr1.hasNext()) {
				System.out.println(itr1.next());
			}
		}
		System.out.println("----------For Each-----------");
		for(List<String>state:country) {
			for(String city:state)
				System.out.println(city);
		}
	}

}
