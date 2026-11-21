package com.override;

public class Developer extends Employee {
	
	String programmimglng="java";
	
	
	public void m1() {
		System.out.println("m1 method");
	}
	@Override
	public void empdetails() {
		System.out.println("m2 method override");
	}
	
     public static void main(String[] args) {
		 Developer d=new Developer();
		 System.out.println(d.name);
		 System.out.println(d.empid);
		 System.out.println(d.salary);
		 System.out.println(d.programmimglng);
		 d.m1();
		 d.empdetails();
	}

}
