package com.logic;

public class OverloadingTest {

	public static void main(String[] args) {
	
		A1 ob = new A1();
		System.out.println("row 1: "+ob.display(1));
		System.out.println("row 2: "+ob.display("aa"));
		System.out.println("row 3: "+ob.display(3.6f));
		
		try {
			System.out.println("row 4: "+ob.display(1.008));
		} catch (Exception e) {	}
		
		//this will land into the public int display(int a)
		System.out.println("row 5: "+ob.display('a'));
	}
	

}

class A1{
	public int display(int a) throws ArithmeticException {
		return 1;
	}
	
	protected int display(String a) {
		return 2;
	}
	
	public int display(float a){
		return 3;
	}
	
	public int display(double a) throws Exception {
		return 4;
	}
	
	//only changing the return type, wont considered in overloading
	/*public String display(float a){
		return 3;
	}*/
}

