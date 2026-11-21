package com.Polymorphism;

public class Employee2 {
	
	public void salary(int i) {
		System.out.println("Employee Id:"+i);
	}
	
	public void salary(String name) {
		System.out.println("Employee Name:"+name);
	}
	
	public void salary(double s) {
		System.out.println("Employee Salary:"+s);
	}
	
	public void salary(double d,double f) {
		double d1=d+f;
		System.out.println("Employee Total Salary:"+d1);
	}
	
	public static void main(String[] args) {
		Employee2 e=new Employee2();
		e.salary(101);
		e.salary("Sanika");
		e.salary(50000.00);
		e.salary(50000, 40000);
		
		System.out.println(" ");
		Employee2 e2=new Employee2();
		e2.salary(102);
		e2.salary("Pooja");
		e2.salary(70000.00);
		e2.salary(70000.00, 30000.00);
		
	}

}
