package com.logic;

public class OverridingTest {

}

class A{
	public int display() {
		return 0;
	}
	
	protected int print() {
		return 0;
	}
	
	public int temp() throws ArithmeticException{
		return 0;
	}
}

class B extends A{
	
	//RETURN TYPE
	//is also considered in case of overriding, if retuRn type is changed then compilation error, 
	//this wont even let to create a method (only can be changed with return of compatible subclass)
	/*public String display() {
		return "abc";
	}*/
	
	
	//ACCESS MODIFIER
	//can be increase the access modifier, protected to public
	@Override
	public int print() {
		return 0;
	}
	
	
	//EXCEPTION
	//Exception class scope cannot be increased
	/*@Override
	public int temp() throws Exception {
		return 0;
	}*/
}