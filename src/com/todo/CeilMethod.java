package com.todo;

public class CeilMethod {

	public static void main(String[] args) {
		new CeilMethod().convertNumberToCeil();
	}
	
	public void convertNumberToCeil()
	{
		float count = 12;
		
		System.out.println((int)Math.ceil(count/11));
		
	}
}
