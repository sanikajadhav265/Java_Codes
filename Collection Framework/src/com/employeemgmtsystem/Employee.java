package com.employeemgmtsystem;

public class Employee {

	public int eid;
	public String ename;
	public String address;
	public double salary;

	public Employee(int eid, String ename, String address, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.address = address;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", address=" + address + ", salary=" + salary + "]";
	}





}
