package com.override;

public class Employee  {
	
	int empid=101;
	String name="Sanika";
	double salary=50000;
	
	public void empdetails() {
		System.out.println("Display Employee Information");
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
