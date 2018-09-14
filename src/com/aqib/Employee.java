package com.aqib;

public class Employee {

	// 1.Instance fields
	int id;
	String name;
	Double salary;

	// 2. Constructor 

	// default constructor / non-parameterized constructor
	public Employee(){

	}

	// Parameterized constructor
	public Employee(int sr, String ename ){
			id = sr;
			name = ename;
	}
	
	// Parameterized constructor
		public Employee(int sr, String ename, Double sal ){
				id = sr;
				name = ename;
				salary = sal;
		}
		
	// 3.Methods
		public void display(){
			System.out.println("My Employee Class");
		}
		
		public void print(){
			System.out.println(" id " + id + " name " +name+ " salary " +salary);
		}
		
		
		
		
		
}

