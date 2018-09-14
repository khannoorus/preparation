package com.logic; 

public class TestNullException {
	
public void display(Exception e){
		System.out.println("in exception");
	}
public void display(Object ob){
	System.out.println("in ob");	
}
public void display(RuntimeException re){
	System.out.println("in re");	
}
public void display(ArithmeticException ae){
	System.out.println("in ae");	
}
public void display(Integer i){	
	System.out.println("in integer");
}
public void display(Float i){	
	System.out.println("in float");
}
public void display(NullPointerException ne){
	System.out.println("in ne");	
}

	public static void main(String[] args)  {
		System.out.println("in main");
		//new TestNullException().display(null);  //CompilationError : The method display(Exception) is ambiguous for the type NullExceptionTest
		/*
		 * here if passing null in display(), 
		 * it will get matched with [public void display (Integer i)], 
		 * but if overloading of exception classes come into the picture then this always resolved to ambiguous
		 *  
		 * they are having precision in following order
		 * 1.Integer Class, ArithmeticException Class, NullPointerException Class
		 * 2.Integer Class, RuntimeException Class
		 * 3.Integer Class, Exception Class
		 * 4.Integer Class
		 * 5.Object Class
		 * 
		 * concept:
		 * ========
		 * under Object class all (Integer class, Float class, Exception class) comes at same level, 
		 * so if any of these two will exist simultaneously then, will be an ambiguous situation
		*/		
	}
}
