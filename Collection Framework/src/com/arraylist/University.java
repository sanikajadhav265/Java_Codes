package com.arraylist;
import java.util.*;

public class University {
	public static void main(String[] args) {
		List<String> puneuniversity = new ArrayList<String>();
		puneuniversity.add("D.Y.Patil");
		puneuniversity.add("PUMBA");

		List<String> kolhapuruniversity = new ArrayList<String>();
		kolhapuruniversity.add("KWC");
		kolhapuruniversity.add("MMT");

		List<List<String>> university = new ArrayList<List<String>>();
		university.add(puneuniversity);
		university.add(kolhapuruniversity);

		System.out.println("---------Using ITR--------");
		Iterator<List<String>> itr = university.iterator();
		while (itr.hasNext()) {
			List<String> collage = itr.next();
			System.out.println(collage);
			Iterator<String> itr1 = collage.iterator();
			while (itr1.hasNext()) {
				System.out.println(itr1.next());
			}
		}
		System.out.println("--------Using For Each Loop---------");
		for(List<String>collage:university) {
			for (String clgname : collage) {
				System.out.println(clgname);

			}
		}

	}
}
