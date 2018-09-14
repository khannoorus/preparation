package com.logic;

class MethodHiding {
	// Static method in MethodHiding class which will be hidden in subclass 
	public static void staticMethodToTest() {
		System.out.println("Static or class method \n from MethodHiding - Base class");
	}
}

// Subclass
class Derived extends MethodHiding {
	// This method hides staticMethod() in MethodHiding 
	public static void staticMethodToTest() {
		System.out.println("Static or class method from Derived class");
	}
} 

public class MethodHidingTest {
	public static void main(String args[ ])  {
		MethodHiding obj1 = new Derived();
		// As per overriding rules this should call to class Derive's static 
		// overridden method. Since static method can not be overridden, it 
		// calls MethodHiding's staticMethod() 
		obj1.staticMethodToTest(); 
	}
}