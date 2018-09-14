package com.polymorphism;

class Tyre {
	
	public Tyre() {
		super();
		System.out.println("constructor invoked for tyre");
	}
	public void front(long a) 	{
		System.out.println("Tyre - long front");
	}
	public void back(int a) 	{
		System.out.println("Tyre - int back");
	}
	public void middle(int a) 	{
		System.out.println("Tyre - int middle");
	}
	public void center(int a, int b) 	{
		System.out.println("Tyre - int center");
	}

}

class NewTyre extends Tyre {
	
	public NewTyre() {
		super();
		System.out.println("constructor invoked for New tyre");
	}
	public void front(int a) {
		System.out.println("New Tire - int front");
	}
	public void back(long a) {
		System.out.println("New Tire - long back");
	}
	public void middle(int a, int b) 	{
		System.out.println("NewTyre - int middle");
	}
	public void center(int a, int b) 	{
		System.out.println("NewTyre - int center");
	}

}

class OldTyre{
	
	public OldTyre() {
		super();
		System.out.println("constructor invoked for Old Tyre");
	}
	public void front(int a) {
		System.out.println("old Tire - int front");
	}
	public void front(long a) {
		System.out.println("old  Tire - long front");
	}
}

public class TestPolymorohism {
	public static void main(String[] args) {
		
		int a = 10;
		long b = 10;
		
		Tyre t = new NewTyre();
		
		//================================case 1=================================
		System.out.println("\n case 1 \n");
		t.front(a);
		
		/*
		  explain 1
		  during compilation time method front(int) will be searched in class Tyre, 
		  Though Class Tyre is not having method front(int) but it has method front(long), 
		  as we know that long can accommodate int so this statement compiled successfully.
		  
		  Someone could have this doubt
		  But during the runtime, the object created on heap belong to NewTyre, 
		  so here as per understanding output should be "New Tire - int front" but i am getting the output 
		  as "Tyre - long front" 
		  
		  Clearing doubt for this:
		  subclass method will get invoked in case when it is overridden only, 
		  [public void front(int a)] in Class NewTyre 
		  is not an overridden form of [public void front(long a)] of Class Tyre 
		  
		  Stackoverflow : 
		  http://stackoverflow.com/questions/31998355/inheritance-and-overloading-methods-with-different-argument-data-types-in-java

To sum up:

The compiler only knows about method signatures that exist in the reference type - front(long), in this case.
The compiler puts instructions that mean "use the method with this specific signature or any override (with the same signature).
The runtime environment looks at the actual object, and checks what kind of front(long) it has. 
If it has an override, it will use that. If it has only the original, it will use that.

find the most appropriate method in class Tyre to match the call at compile time;
see whether that has been overridden between Tyre and the actual type at runtime;
call the overridden version if there is one, or Tyre's version if not.
But here haven't overridden the front(long) method at all: supplied methods with different signatures. 
So in step 1 (at compile time) the type system finds Tyre.front(long) and we know long can accommodate int; 
in step 2 (at runtime) it discovers that this hasn't been overridden further down the class hierarchy; 
in step 3 (runtime) it therefore invokes Tyre's version.

Overloads are resolved at compile time based on formal types; overrides are resolved at runtime based on actual types.
		  
	    */ 
		
		
		//================================case 2=================================
		System.out.println("\n case 2 \n");
		t.front(b);
		
		//================================case 3=================================
		System.out.println("\n case 3 \n");
		//t.back(b);   
        
		/* 
		  explain 3
		  during compilation time method back(long) will be searched in class Tyre, 
		  Though Class Tyre is not having method back(long) but it has method back(int), 
		  as we know that int cannot accommodate long so this statement give compilation Error.		  
	    */ 
		
		//================================case 4=================================
		System.out.println("\n case 4 \n");
		t.back(a);
		
		OldTyre ot = new OldTyre();
		ot.front(a);
		
		//================================case 5=================================
		Tyre tm = new NewTyre();
		System.out.println("\n case 5 \n");
		//tm.middle(a,a);
		/* 
		  explain 5
		  during compilation time method middle(int,int) will be searched in class Tyre, 
		  Though Class Tyre is not having method middle(int,int), so it throws compile time error		  
	    */ 
		
		//================================case 6=================================
		
		Tyre tm1 = new NewTyre();
		System.out.println("\n case 6 \n");
		tm1.center(10,100);
		
		/* 
		  explain 6
		  the method which is identified during compile time, will only run and generate output during execution until and unless 
		  its same signature method is not overriding it in its subclass. and that too will able to get execute only if 
		  its subclass object is getting created on heap at runtime (runtime polymorphism).  
		  
		  */ 
		
		
		
	}
}
