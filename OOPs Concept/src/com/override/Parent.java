package com.override;

public class Parent {
	
	public void m1() {
		System.out.println("Parent M1 Method");
	}
	
    public void m2(int i) {
    	System.out.println("M2 Static Method");
    }

    public int m3() {
    	System.out.println("M3 Method");
    	return 10;
    }
    
    public Parent m4() {
    	System.out.println("M4 Method");
     Parent p=new Parent();
     return p;
    }
    
    private void m5() {
    	System.out.println("M5 Method");
    }
    
    public final void m6() {
    	System.out.println("M6 Method");
    }
    
    public static void m7() {
    	System.out.println("M7 Static Method");
    }
}
