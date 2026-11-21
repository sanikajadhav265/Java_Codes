package com.Interface;

public class StudentDetails implements Student{

	@Override
	public void result() {
		System.out.println("Congratulation for Good Result!!");
		
	}
	
	public static void main(String[] args) {
		Student st=new StudentDetails();
		System.out.println(st.sid);
		System.out.println(st.name);
		System.out.println(st.marks);
		st.result();
	}

	
}
;
