package com.studentmgmtsystem;

public class Student {	
	public int sid;
	public String sname;
	public String address;
	public float marks;	
	public Student(int sid, String sname, String address, float marks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.address = address;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", address=" + address + ", marks=" + marks + "]";
	}



}
