package com.logic;

public class AbstractAndConstructor {

	public static void main(String[] args) {
		 new BA(1);		
	}
}

//Every class (including Abstract class) has the constructor as every subclass required this superclass-constructor 
//to get invoked when subclass create its own object. 
abstract class AB {

	int x;
	
	/*AB(){
		System.out.println("invoked");
	}*/
	
	AB(int x){
		System.out.println("invoked AB with "+x);
	}
}

class BA extends AB{

	int y;

	BA(int y){
		super(y);
		this.y = y;
	}
}
