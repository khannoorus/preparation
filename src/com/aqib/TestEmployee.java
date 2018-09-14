package com.aqib;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee e = new Employee();		
		System.out.println("default ---> " + " e.id = " + e.id + " e.name = " + e.name + " e.salary = " + e.salary);
		
		Employee e1 = new Employee(123, "akash");
		System.out.println("2 parameter ---> " + " e1.id = " + e1.id + " e1.name = " + e1.name + " e1.salary = " + e1.salary);		
		
		Employee e2 = new Employee(123, "akash", 20000.00);
		System.out.println("3 parameter ---> " + " e2.id = " + e2.id + " e2.name = " + e2.name + " e2.salary = " + e2.salary);
		
		
		
		//Calling of methods
		System.out.println( "************ display *************");
		e.display();
		e1.display();
		e2.display();
		
		//Calling of methods
		System.out.println( "************ print *************");
		e.print();
		e1.print();
		e2.print();
		

	}

}
