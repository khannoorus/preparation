package com.designpattern;

public class SingletonObjectDemo{
	
	public static void main(String args[]){
		//Singleton obj = new Singleton();	Compilation error not allowed
		
		/*
		   as such we cannot create object for Singleton directly and  		
		   letting everyone to get the object from my method getSingletonObject()
		   then how can we invoke method of class without object, 
		   making method static and called directly with class name
		*/
		
		//create the Singleton Object..
		Singleton obj = Singleton.getSingletonObject();
		System.out.println("abc"+obj);
		// Your Business Logic
		System.out.println("Singleton object obtained");
		
	}
}
class Singleton{
	  
	private static Singleton singletonObject;
	
	/** A private Constructor prevents any other class from instantiating. */
	private Singleton(){ }
	
	public static synchronized Singleton getSingletonObject()
	{
	    if (singletonObject == null){
	    	singletonObject = new Singleton();
	    }
	    return singletonObject;
	}
	
	/*
	public Object clone()throws CloneNotSupportedException
	{
	    throw new CloneNotSupportedException(); 
	}*/
		  
}