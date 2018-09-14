package com.aqib;

public class Person1 extends Person{

	// Person - Parent class / Superclass
	// Person1 - Child class / Subclass
	
	public static void main(String[] args) {
		
		int y = ptint();
		//Runtime polymorphism
		Person p2 = new Person1();
		p2.display();
		
		Person1 p3 = new Person1();
		p3.display();	
		
		Transport t1 = type();
		System.out.println(t1.id);
		
	}
	
	public static Transport type(){
		System.out.println("person1 class display");
		Transport t = new Transport();
		/*t.id = 1;
		t.name = "abc";*/
		Train tr = new Train();
		return tr;
	}	
	
	public int ptint(){
		System.out.println("person1 class display");
		int x = 4;
		return x;
	}	
	
}

//======================================

class Transport{
	int id;
	String name;
	public void mode(){
		System.out.println("Land");
	}
}
class Train extends Transport{
	
}

class Bus extends Transport{
	
}
class Car extends Transport{
	
}
class Aeroplane extends Transport{
	public void mode(){
		System.out.println("Air");
	}
}


















