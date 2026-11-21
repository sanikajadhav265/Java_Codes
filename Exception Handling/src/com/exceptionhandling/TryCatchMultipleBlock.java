package com.exceptionhandling;

public class TryCatchMultipleBlock {

	public static void main(String[] args) {
		System.out.println("--------main method------");
		try {
			String s = args[0];
			System.out.println("value of s is : " + s);
			int i = Integer.parseInt(s);
			int j = 10 / i;
			System.out.println("value of j is : " + j);
			String st = null;
			System.out.println(st.length());
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("-------Exit from main method------");
	}
}


