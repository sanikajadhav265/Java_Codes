package com.Multilevel;

public class GraduteStudent extends Student {
	
	String specilization="OOPs Concept";
	String researchtopic="Ai and Security";
	
	public void displayGraduateInfo() {
		System.out.println("Display Graduate Student Information");
	}
	public static void main(String[] args) {
		GraduteStudent gs=new GraduteStudent();
		System.out.println(gs.name);
		System.out.println(gs.age);
		System.out.println(gs.studentid);
		System.out.println(gs.course);
		System.out.println(gs.specilization);
		System.out.println(" ");
		gs.personInfo();
		gs.displayStudentInfo();
		gs.displayGraduateInfo();
	}

}
