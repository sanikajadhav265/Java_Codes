package com.studentmgmtsystem;

import java.util.List;

public class University {

	public static void main(String[] args) {
		Collage clg=new Collage();

		List<Student> stu=clg.addStudentDetails();

		for(Student st:stu) {
			System.out.println(st);
		}

	}

}
