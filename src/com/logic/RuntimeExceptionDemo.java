package com.logic;

class MyException extends Exception {

	public MyException(){
	}
}

class MyRuntimeException extends RuntimeException {

	public MyRuntimeException(){
	}
}


public class RuntimeExceptionDemo {

	
	/*public static void display() throws MyException{
		throw new MyException();
	}
	public static void main(String[] args) {

		try {
			display();
		} catch (MyException e) {
			System.out.println("MyException Caught");
		}
	}

	*/
	
	/*public static void display(){
		throw new MyRuntimeException();
	}
	public static void main(String[] args) {
		display();
	}*/
	 
	
	/*	
	 * Unlike runtime exception here, this will not let us to do so because if we are creating custom exception using extends Exception, 
	 * in this scenario i need to handle it using either throws or using try catch block
	 * but same is not true for the scenario, when if we are creating custom exception using extends RuntimeException, 
	 * in this scenario i need not to handle it using either throws or using try catch block
	
	public static void display(){
		throw new MyException();
	}
	public static void main(String[] args) {
		display();
	}
	 
*/
	
	//can we catch runtimeException, i guess yes
	
	public static void display() throws MyRuntimeException{
		throw new MyRuntimeException();
	}
	public static void main(String[] args) {

		try {
			display();
		} catch (MyRuntimeException e) {
			System.out.println("MyRuntimeException Caught");
		}
	}

	
}

