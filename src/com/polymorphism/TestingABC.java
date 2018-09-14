package com.polymorphism;


//STEP 1 : TestingABC 
//THEN 
//STEP 2 : ExplicitObjectCasting

public class TestingABC {

	public static void main(String[] args) {
		
		C c = new C();
		A b = (B) c;  //statement 1
		
		//where  c is the underlying object of class C here
		// if consider A x = new B(), here underlying object for x is of class A
	}
}


/*summary*/
/* 
 * Two rules, violation of which gives Compile time error:
 * Referring statement 1-
 *     1. there must be some relationship between c's TYPE (i.e class C (underlying object must be considered))
 *         and class B can be anything P<->C, C<->P, SAME
 *     2. Class B must be child of class A
 * 
 * One rule, violation of which gives Run time error:
 *  Referring statement 1-
 *     1. there must be some relationship between c's TYPE (i.e class C) and class B can be anything P<->C, C<->P, SAME
 *     2. c's TYPE (i.e class C) must be child of class B
 */
	
class A {

}
class B extends A{

}
class C extends B {

}
