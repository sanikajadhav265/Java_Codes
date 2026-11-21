package com.StaticKeyword;

public class UserClass {
	
	public static void main(String[] args) {
		
		SBI sbi=new SBI();
		sbi.userid=20;
		System.out.println(sbi.userid);
		sbi.address="Pune";
		System.out.println(sbi.address);
		System.out.println(SBI.ifsccode);
		
		System.out.println(" ");
		SBI sbi1=new SBI();
		sbi1.userid=11;
		System.out.println(sbi1.userid);
		sbi1.address="Akurdi";
		System.out.println(sbi1.address);
		System.out.println(SBI.ifsccode);
		
		System.out.println(" ");
		SBI sbi2=new SBI();
		sbi2.userid=21;
		System.out.println(sbi2.userid);
		sbi2.address="Nigdi";
		System.out.println(sbi2.address);
		System.out.println(SBI.ifsccode);
		
		System.out.println(" ");
		SBI sbi3=new SBI();
		sbi3.userid=23;
		System.out.println(sbi3.userid);
		sbi3.address="Ravet";
		System.out.println(sbi3.address);
		System.out.println(SBI.ifsccode);	
		
	}

}
