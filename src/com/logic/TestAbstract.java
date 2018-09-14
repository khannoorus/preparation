package com.logic;

class TestAbstract {
	
	int a;
	public static void main(String[] args) {
		new TestAbstract().display();
		//System.out.println(a);   //Cannot make a static reference to the non-static field a
	}

	public void display() {
		System.out.println("main "+a);		
	}

}



/*  //logic 1:
abstract class Tek {     // zero to 100% abstraction, here 0% abstraction	
	int a;
	public static void main(String[] args) {
		new TestAbstract().display();
	}

	public void display() {
		System.out.println("abstarct "+a);		
	}

}
*/


/*  //logic 2:
final class Teak {
	
	int a;
	public static void main(String[] args) {
		new TestAbstract().display();
	}

	public final void display() {    //no need to make it final actually when class is already final, 
                              		// see when class is final means u cannot extend this class so when u cannot even 
		                            // extend the class then how u would be able to override its method.
		System.out.println("final "+a);		
	}

}
*/


/*  //logic 3:
abstract class Teka {     // zero to 100% abstraction, here 0% abstraction	
	int a;
	
	//public abstract static void m1();  //Cannot make static method as abstract

}
*/