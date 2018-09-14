package com.polymorphism;


//please refer typecasting.object.reference for clarity

class Employee1  {	
	public int display(){
		return 1;		
	}
	public int displ() {
		return 2;		
	}	
	public int spl() {
		return 20;		
	}	
}

class Employee2 extends Employee1 {
	public int display() {
		return 3;		
	}	
	public int d() {
		return 4;		
	}	
	public int dg() {
		return 40;		
	}
}

 class Employee3 extends Employee2 {}
 class Employee4 {}


	public class TestSuperSubClass {

		public static void main(String[] args) {
			
			Employee1 e1 = new Employee2();
			
		//	Employee2 e2 = new Employee1(); // Employee1 is superclass of Employee2, so this concept is not possible in this scenario

			Employee1 e3 = (Employee1) new Employee2();
			Employee1 e5 = (Employee2) new Employee2();
			
			Employee2 e4 = (Employee2) new Employee1();			
		//	Employee2 e6 = (Employee1) new Employee1();
			
		//	Employee1 e7 = new Employee4(); //this concept is only possible in case of inheritance
			
			System.out.println(e1 instanceof Employee1);
		//	System.out.println(Employee1 instanceof e1);   //this way of writing instanceof is incorrect
		}


	}

	
	/*
	 case 1:
	         superclass referenceVariable = instantiate with subclass  ..... POSSIBLE
	         
	         Employee1 e1 = new Employee2();
	
	  case 2:
	         subclass referenceVariable = instantiate with superclass  ..... NOT POSSIBLE
	         
	         Employee2 e2 = new Employee1();  ..... NOT POSSIBLE
	         
	         NOTE: case 2 become possible if we typecast with subclass
	
	  case 3:
	         subclass referenceVariable = (typecast with subclass) instantiate with superclass  ..... POSSIBLE
	         
	         Employee2 e4 = (Employee2) new Employee1();
    */