package com.StaticKeyword;

public class StaicBlockExample {
	
	int rollNo=12;
	
	String name="Sanika";
	
	static String subjectname="Java";
	
	static String Collagename="PCCOE";
	
	public void m1() {
		System.out.println("----------Non Static Block----------");
		System.out.println(subjectname);
		System.out.println(Collagename);
		System.out.println(rollNo);
		System.out.println(name);
	}
	
	public static void m2() {
		System.out.println("----------------Static Block---------------");
	    System.out.println(subjectname);
	    System.out.println(Collagename);
	    
	    StaicBlockExample sb=new StaicBlockExample();
	    System.out.println(sb.rollNo);
	    System.out.println(sb.name);
	}
	
}
