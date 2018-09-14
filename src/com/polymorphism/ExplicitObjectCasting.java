package com.polymorphism;


// Go and read this link with its doubt clearing comments, explained excellence. 
//http://way2java.com/casting-operations/object-casting/



//STEP 1 : TestingABC.java
// THEN 
//STEP 2 : ExplicitObjectCasting.java

public class ExplicitObjectCasting {

	public static void main(String args[])
	{
		Car f = new Car();
		Car f1 = new Car();
		Car f2 = new Car();
		Audi r = new Audi();
		Audi r1 = new Audi();
		Audi r2 = new Audi();
		Audi r3 = new Audi();

		//  f = r;                   // subclass to superclass, valid
		//  r = f;	                // superclass to subclass, not valid, compilation error

		//To do this superclass to subclass, super class to subclass, explicit casting is required

		f=r;
		/*Before doing explicit casting, you must store the subclass object in the super class object. 
			   Once stored,then during explicit casting, superclass object returns subclass object 
			   (which you have stored earlier).*/
		/*In implicit casting, we place the reference of a subclass object in super class object (here f=r).
			  In explicit casting, we get back the subclass reference object from super class object. */
		/* if f = r does not exist earlier. 
			     It will be a an exception (not compilation error but ClassCastException). 
			     That is, "before doing explicit casting, implicit casting must be done".*/

		/*--------------------CASE:1-------------------*/
		System.out.println("CASE:1");
		Audi y;
		y = (Audi) f;     // explicit casting, assigning superclass to subclass through explicit casting. 
		y.start();	     // present in both superclass & subclass, II-execute
		                 // actually this 'f' is 'r' only, see in above explanation point-2
		y.stop();       // present in subclass only.
		y.move();        // present in superclass only. (Audi already extend Car)	
		
		
		/*NOTE : CASE:2, CASE:3, CASE:4 are not very relevant, description given in respective cases*/
		
		/*--------------------CASE:2-------------------*/
		System.out.println("CASE:2");
		Audi p;
    //  p = (Car) f1;  // doesn't make any sense,
                         /* same as, (p = f1, assigning superclass to subclass directly, means implicitly, 
                            this scenario ideally not possible)*/
		
		/*--------------------CASE:3-------------------*/
		System.out.println("CASE:3");
		Car s;
		s = (Audi) r3;    // doesn't make any sense, 
                    	 // same as (s = r3, assigning subclass to superclass directly means implicitly)
		
		/*--------------------CASE:4-------------------*/
		System.out.println("CASE:4");
		Car q = null;
		q = (Car) r1;   //this scenario is same as q = r1, implicit type casting		
		q.start();	     // present in both superclass & subclass, II-execute (donot think that casting is affecting the object creation, consider that it is only to remove compilation or runtime error)   
		//q.stop();       // present in subclass only, then obviously compilation error
		q.move();        // present in superclass only. (Audi already extend Car)
		
		
		/*--------------------CASE:5-------------------*/
		System.out.println("CASE:5");
		Car c = new Car();
		//((Audi) c).stop(); ((Audi) c).start();
        // Runtime, ClassCastException : 
		//ClassCastException in Java comes when we try to type cast an object and object is not of the type we are trying to cast into.
		//here, c is the type of Car but during runtime we are trying to cast it in Audi type. Will give ClassCastException.
        // from superclass we cannot call subclass method, until and unless we have instantiated the superclass reference with subclass object
		
		
		Car c1 = new Audi();   
		((Audi) c1).stop();	   // we are doing explicit casting here, Car c1 = new Audi(); so, present in subclass only, II-execute
		//c1.stop();          // Cannot call directly, give compilation error obviously
		
		//or, this same above code in the different way,
		Car c2 = new Audi();
		Car c3 = c2;
		//c3.stop();	    //compilation error, stop method not present in Car
		//Audi a1 = c2;    // trying to instantiate Subclass object with Superclass
		Audi a1 = (Audi) c2;   // this is also form of an explicit casting, c2 already being assigned with audi reference through implicit casting.
		a1.stop();        // present in subclass only, II-execute
		
		
		((Audi) c1).start();	// present in both superclass & subclass, II-execute
	}
}

class Car
{
	public void start()		// I
	{
		System.out.println("Car start");
	}
	public void move()		// I
	{
		System.out.println("Car move");
	}
}   
class Audi extends Car
{
	public void start()		// II
	{
		System.out.println("Audi start");
	}
	public void stop()		// II
	{
		System.out.println("Audi stop");
	} 
}

/*
                                   Instantiating subclass reference from superclass : Explicit casting
                                   ====================================================================
                                   Significance :  Calling subclass method from the superclass reference
                                   ======================================================================
    y = (Audi) f; 
	this form of notation is only possible in case of inheritance and that too when we try for explicit casting,
	means casting the object gives a feeling that although the object created on heap is f(Car) only here but because we have typecasted it to Audi, 
	so the reference here y will become the reference of Audi and will call the methods of Audi class now, yes it is  correct only,
	but this notation that give this kind of feeling is correct only in the case of explicit casting rest this notation wont do anything,
	unlike this case, the object that get created on heap that only will be responsible to call its class methods. 
	Also, because it is explicit casting (we are instantiating subclass reference) thatswhy we would be able to call method of both the classes.
	[for reference see case-1].
	
	=========================================================================================================================================
	
	                         Another Notation used for above directly - ((Audi) c1).stop(); 
	                         ==============================================================
	                         
    Car c1 = new Audi();
    ((Audi) c1).stop();
    
    this form of notation is only possible in case of inheritance and that too when superclass is instantiated 
    using the subclass object, means Ideally c1 should be instantiated through implicit casting (must be like run time polymorphism) first
    then only this notation will work as expected means, created Car reference but calling subclass method that is not present in superclass, 
    but still it works fine. [for reference see case-5].
        
    Class B extends A {}
    B ob = new B();
    ob.display();
    during compilation time it will see the reference ob belong to which class its B. Now it will search the method in B, 
    if its there then fine, will successfully compiled and will successfully run.
    if it is not there, then it try to find in Class A, if its there then fine, will successfully compiled and will successfully run.
      
    Class B extends A {}
    A ob = new A();
    ob.display();
    during compilation time it will see the reference ob belong to which class its A. Now it will search the method in A, 
    if its there then fine, will successfully compiled and will successfully run.
    if it is not there (suppose method display belong to subclass B), then it will give compilation error. 
    To remove this error, need to cast with subclass object 
    ((B) ob).display(); // No compilation error but it will give Runtime:ClassCastException, do read case:5
    To remove this error, means calling subclass method through the reference of superclass, process will go like this....
    
    A ob = new B();
    ob.display();  // still give compilation error
    ((B) ob).display(); //  will successfully compiled and will successfully run and call subclass method.
      
	
*/

