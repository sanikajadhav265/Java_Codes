package com.TypeCasting;

public class ExplicitTypeCasting {
	public static void main(String[] args) {
		 
		System.out.println("----------------Double-----------------");
		
		double d=23554.4323;
		float f=(float)d;
		System.out.println(f);
		
		long l=(long)d;
		System.out.println(l);
		
		int i=(int)d;
		System.out.println(i);
		
		short s=(short)d;
		System.out.println(s);
		
		byte b=(byte)d;
		System.out.println(b);
		
		System.out.println("---------------Float------------------");
		float f1=45.43f;
		
		long l1=(long)f1;
		System.out.println(l1);
		
		int i1=(int)f1;
		System.out.println(i1);
		
		short s1=(short)f1;
		System.out.println(s1);
		
		byte b1=(byte)f1;
		System.out.println(b1);
		
		System.out.println("-----------------long----------------");
		long l2=223444335l;
		
		int i2=(int)l2;
		System.out.println(i2);
		
		short s2=(short)l2;
		System.out.println(s2);
		
		byte b2=(byte)l2;
		System.out.println(b2);
	}

}
