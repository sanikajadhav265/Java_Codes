package com.override;

public class Manager extends Employee {
 
	int teamsize=30;
	  @Override
	 public void empdetails() {
		  System.out.println("m1 method override");	 
	 }
	  
	  public void m2() {
		  System.out.println("m2 method called");
	  }
	  
	  public static void main(String[] args) {
		Manager m=new Manager();
		System.out.println(m.name);
		System.out.println(m.empid);
		System.out.println(m.salary);
		System.out.println(m.teamsize);
		m.empdetails();
		m.m2();
		
	}
}
