package com.logic;

public class InterfaceDefaultTest {

	public static void main(String[] args) {
		IFClass i = new IFClass();
		i.display();
	}

}

interface Au{
	default void display(){
		System.out.println("Au");
	}
}
interface Bu{
	default void display(){
		System.out.println("Bu");
	}
}
class IClass implements Au{}
// class IFClass extends IClass implements Bu{}   //Illegal





class ITClass implements Au{
	public void display(){
		System.out.println("ITClass");
	}
}
class IFClass extends ITClass implements Bu{
	
}