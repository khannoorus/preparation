package com.polymorphism;

class Super
{
	void modify(final long a,long b)
	{
		System.out.println("Super class modify");
	}
	
	void display(final long a,long b)
	{
		System.out.println("super class display");
	}
}

public class TestSuperSub extends Super {
	
	public static void main (String args[])	{
		
		long a=1,b=2;
		TestSuperSub object = new TestSuperSub();
		object.modify(a,b);
		object.display(1, 2);
		object.print(1,2);
		
		Super s = new TestSuperSub();
		
		s.display(1, 2);	
		//this method (display) is being overridden in subclass
		
		int x=3,y=4;
		s.modify(x, y);
		//this method modify is not being overridden in subclass		
	}
	
	void modify(int... a)	{
		System.out.println("Sub class varargs modify");
	}
	void modify(final int a,int b)	{
		System.out.println("Sub class modify");
	}
	
	
	void display(long... a)	{
		System.out.println("Sub class varargs display");
	}
	void display(final long a,long b){
		System.out.println("sub class display");
	}
	
	
	void print(int... a){
		System.out.println("Sub class varargs print");
	}
	
}

// similar type concept for output, explained in TestPolymorohism.java