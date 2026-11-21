package com.StaticKeyword;

import java.text.SimpleDateFormat;

public class StaticMethodExample {
	
	public static void convertDate() {
		SimpleDateFormat sm=new SimpleDateFormat("YYYYMMDDHHSS");
	}
	
	public static void main(String[] args) {
		StaticMethodExample.convertDate();
	}

}
