package com.striingpractice;

public class StringEx1 {
	
	public static void main(String[] args) {
		
		String s="Sanika";
		System.out.println(s);
		
		String s1=new String("Sanika");
		System.out.println(s1);
		
		s=s.concat("Jadhav");
		System.out.println(s);
		
		s=s.toUpperCase();
		System.out.println(s);
		
		s=s.toLowerCase();
		System.out.println(s);
	
		String s2="Hello Java";
		s2=s2.trim();
		System.out.println(s2);
	
	}
}
