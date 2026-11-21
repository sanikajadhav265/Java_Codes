package com.set;

import java.util.*;
public class DiffHSLHSTS {
	
	public static void main(String[] args) {
		
		System.out.println("------------HashSet------------------");
		Set<String>hs=new HashSet<String>();
		hs.add("Sanika");
		hs.add("Pooja");
		hs.add("Snehal");
		hs.add("Apurva");
		hs.add(null);
		System.out.println(hs);
		
		System.out.println("------------LinkedhashSet-----------");
		Set<String>lhs=new LinkedHashSet<String>();
		lhs.add("Sanika");
		lhs.add("Pooja");
		lhs.add("Snehal");
		lhs.add("Apurva");
		lhs.add(null);
        System.out.println(lhs);
        
        System.out.println("-----------Tree Set----------------");
        Set<String>ts=new TreeSet<String>();
        ts.add("Sanika");
        ts.add("Sanika");
		ts.add("Pooja");
		ts.add("Snehal");
		ts.add("Apurva");
		//ts.add(null);
		System.out.println(ts);
		
		System.out.println("----------BY USING ITR----------");
		Iterator<String>itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("====================");
		Iterator<String>itr1=lhs.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("=====================");
		Iterator<String>itr2=ts.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("-------------BY UISNG FOR EACH LOOP--------");
		for(String str:hs) {
			System.out.println(str);
		}
		System.out.println("======================");
		for(String str1:lhs) {
			System.out.println(str1);
		}
		System.out.println("=========================");
		for(String str2:ts) {
			System.out.println(str2);
		}
		
	}
}
