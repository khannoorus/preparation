package com.logic;

public class MainMethodStory {


	//concept 1 : final
	//========================================
	/* final keyword: legal 
	 * public static final void main(String[] args) { }*/  
	//This is legal : final keyword says its subclass cannot inherit this method.
	

	//concept 2 : Abstract
	//========================================
	/* Abstract keyword: Not legal 
	 /*public abstract void main(String[] args);	*/
	/*This is not legal : abstract keyword wont give any compilation error 
	 This also ask to make the class as Abstract as well
	 
	 but at RUNTIME :  
	           Error: Main method is not static in class com.core.keyword please define the main method as:
	                 public static void main(String[] args)
	 */         


	//concept 3 : private / protected
   //========================================
	/* Protected/Private Modifier: Can be protected/private as like different other method but it is now no more main method.
	 * protected static void main(String[] args) { } 
	 * Private static void main(String[] args) {} */
	
	/* at RUNTIME error : if we try to run a java file
	 * Error: Main method not found in class com.core.keywords.MainMethodStory, please define the main method as:
      public static void main(String[] args)
      or a JavaFX application class must extend javafx.application.Application
	*/


	//concept  : Overloading
	//========================================
	/*Overloading : Yes Legal, can be overloaded to any extent 
	 * but still the signature for main method would not change at run time still the main method only with its own signature is required. */
	/*public static void main(String[] args) {
		System.out.println("I am main");
	}
	public static void main(int[] args) {}
	public static void main(String args) {}
	*/
	
	
	//concept 5 : Overriding
	//========================================
	/*Override: This is not legal, main() is static so cannot override
	 public static void main(String[] args) {}
	 
	 1.private method cannot be overridden:
	 ------------------------------------
	 No, a private method cannot be overridden since it is not visible from any other class. 
	 You have declared a new method for your subclass that has no relation to the superclass method. 
	 One way to look at it is to ask yourself whether it would be legal to write super.func() in the Derived class. ... 
	 You are not overriding.
	 
	 2.Static method cannot be overridden:
	 ------------------------------------
	 We can declare static methods with same signature in subclass, 
	 but it is not considered overriding as there won’t be any run-time polymorphism. Hence the answer is ‘No’.
     If a derived class defines a static method with same signature as a static method in base class, 
     the method in the derived class hides the method in the base class. This is also called method hiding. (MethodHidingTest.java) 
	 
	  3.final method cannot be overridden:
	 ------------------------------------
	 
	 */
}
