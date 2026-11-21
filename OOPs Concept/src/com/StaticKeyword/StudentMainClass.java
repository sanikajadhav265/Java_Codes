package com.StaticKeyword;

public class StudentMainClass {
	
	public static void main(String[] args) {
		Student std =new Student();
		std.id=12;
		System.out.println("Student Id:"+std.id);
		std.name="Sanika";
		System.out.println("Student Name:"+std.name);
		System.out.println("Student Collage Name:"+Student.collagename);
		System.out.println("Student Address:"+Student.address);
		
		System.out.println(" ");
		Student std1=new Student();
		std1.sid=13;
		System.out.println("Student Id:"+std1.sid);
		std1.sname="Apurva";
		System.out.println("Student Name:"+std1.sname);
		System.out.println("Student Collage Name:"+Student.collagename);
		System.out.println("Student Address:"+Student.address);
		
		System.out.println(" ");
		Student std2=new Student();
		std2.stid=14;
		System.out.println("Student Id:"+std2.stid);
		std2.stname="Om";
		System.out.println("Student Name:"+std2.stname);
		System.out.println("Student Collage Name:"+Student.collagename);
		System.out.println("Student Address:"+Student.address);
		
	}
	

}
