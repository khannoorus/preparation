package com.logic;

public class TestFinally {

	public static void main (String args[])	{
		System.out.println("0");
		try		{
			return;
		}
		catch(Exception ex)		{
			System.out.println("main");
		}
		finally		{
			new TestFinally().display();
		    System.out.println("4");
		}

		System.out.println("5");
	}
	
	public void display ()	{

		System.out.println("1");
		try		{
			return;
		}
		catch(Exception ex)		{
			System.out.println("display");
		}
		finally		{
			System.out.println("2");
		}

		System.out.println("3");
	}
	
	public void print ()	{

		System.out.println("1print");
		try		{
			System.out.println("print");
		}
		finally		{
			System.out.println("2print");
		}

		System.out.println("3print");
	}

}

