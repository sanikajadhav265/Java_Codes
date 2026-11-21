package com.list;

import java.util.List;
import java.util.Vector;

public class ListEx1 {
	
	public static void main(String[] args) {
		
		List v=new Vector();
		System.out.println(v.isEmpty());
		v.add(1);
		v.add(1);
		v.add("Sanika");
		v.add("Pune");
		v.add(89.98);
		v.add(676787564l);
		v.add(null);
		v.add(null);
		System.out.println(v);
		System.out.println(v.get(4));
		System.out.println(v.contains(2));
		v.remove(0);
		System.out.println(v);
		System.out.println(v.size());
		v.remove(6);
		System.out.println(v);
		v.remove(5);
		System.out.println(v);
//		System.out.println(v.isEmpty());
		v.isEmpty();

	}

}
