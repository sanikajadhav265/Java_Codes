package com.superandthiskeyword;

public class Child extends Parent {
	
	Child(){
		super();
		System.out.println("Child Constructor");
	}
	
	Child(int i){
		this();
		System.out.println("value of i:"+i);
	}
	
	@Override
	public void run() {
		super.run();
		System.out.println("Child Run");
	}
	
	@Override
	public void walk() {
		super.walk();
		System.out.println("Child Walk");
	}

	public static void main(String[] args) {
		
		Parent p=new Child(12);
		p.run();
		p.walk();
		Parent p1=new Parent();
	}
}
