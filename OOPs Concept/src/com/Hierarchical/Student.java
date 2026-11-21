package com.Hierarchical;

public class Student extends School {
	
	String studentname="sanika";
	char grade='A';
	float marks=95.68f;
	
	public void displayStudentInfo() {
		System.out.println("Student name is Sanika");
		System.out.println("Student grade is A");
		System.out.println("Student marks is 95.68");
	}
	public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s.schoolname);
		System.out.println(s.location);
		System.out.println(s.studentname);
		System.out.println(s.grade);
		System.out.println(s.marks);
		System.out.println(" ");
		s.displaySchoolInfo();
		s.displayStudentInfo();
	}
	

}
