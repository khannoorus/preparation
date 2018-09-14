package com.logic;

public class CallbyValueReference {


	public static void main(String[] args) {
		int y = 1; 
		Persons p = new Persons();
		new CallbyValueReference().diplay(y,p);
		System.out.println("y: "+y+ p.age);
	}

	private void diplay(int i, Persons p) {
		i = 8;
		p.age = 9;
		call(i);
		System.out.println("i: "+i);
	}

	private void call(int i) {
		i=7;
		System.out.println("i*: "+i);
	}

}
class Persons {
	int age;
}

//java behave as call by value for primitive type
/*java behave as call by reference for custome object 
(provided it should not create object with new keyword inside caller method)*/