package com.FinalKeyword;

  public class FinalMainClass // extends FinalClass
  {
	
	
//		@Override
//		public void m1() {
//			System.out.println("MainClass  Method Called");
//		}
		
	final public static void main(String[] args) {
			
		FinalClass fc=new FinalClass();
		System.out.println(fc.i);
		fc.m1();
		fc.m2(100, 200);
		
		
		
	}

}
