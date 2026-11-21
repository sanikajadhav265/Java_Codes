package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainClass {
	
	public static void main(String[] args) {
		List<String> str=new ArrayList<String>();
		str.add("Sanika");
		str.add("Snehal");
		str.add("Pooja");
		str.add("Apurva");
		
		System.out.println("-----By Using Iterator Method-----");
		Iterator<String>itr=str.iterator();
		while(itr.hasNext()) {
			String s=itr.next();
			System.out.println(s);
		}
		System.out.println("------By Usinng For Each Loop-------");
		for(String s1:str) {
			System.out.println(s1);
		}
		
	}

}
