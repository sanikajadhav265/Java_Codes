package com.override;

public class Tester extends Employee{
	
	int numberofbugs=10;
	
	public void m1() {
		System.out.println("m1 Method Called");
	}
	
	public void m2() {
		System.out.println("m2 Method Called");
	}
	
	@Override
	public void empdetails() {
		System.out.println("Override m3 Method");
	}
   public static void main(String[] args) {
	   Tester t=new Tester();
	   System.out.println(t.name);
	   System.out.println(t.empid);
	   System.out.println(t.salary);
	   System.out.println(t.numberofbugs);
       t.m1();
       t.m2();
       t.empdetails();

}
}
