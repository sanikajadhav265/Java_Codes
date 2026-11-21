package com.superandthiskeyword;

public class YConstructor extends XConstructor{

	   YConstructor() {
		this(1);//super();
		System.out.println("Y Construtor");
	}
	
	YConstructor(int i){
		this("Sanika", 20.0);
		System.out.println("Y Parametherised Constructor");
	}
	
	YConstructor(String s, double d){
	    super("Pooja");
		System.out.println("Y double Parameterised Constructor");	
	}
	
	
	public static void main(String[] args) {
		
		YConstructor yc=new YConstructor();
		
	}
}
