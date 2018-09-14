package com.logic;

public class StaticTest
{
	private static int p = test();
	private int q = print();
	
	static {
		System.out.println("inside static A block");
	}
	
	public static int test() {
		System.out.println("inside static test method ");
		return 99;
	}
	
	public static int print() {
		System.out.println("inside static print method ");
		return 100;
	}
	static {
		System.out.println("inside static B block");
	}
	
	public static  void main(String args[])	{
		print();
		System.out.println("value of p "+p);
		new StaticTest().display();
	}
	
	public void display(){
		System.out.println("value of q "+q);
	}
	
}
/*
* The conclusion is that first the static variable get initialized even before 
  the execution of the static block.
  
* preference of execution : 
* 1.static variable initialization
* 2.static block execution;
* 3.main() method 
* 
*/
