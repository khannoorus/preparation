package com.logic;

public class StringTest {

	public static void main(String[] args) {
		new StringTest().stringTesting();
	}
	
	void stringTesting(){
		String a = "hello";
		String b = null;
		String c = "world";
		System.out.println(a+b+c);  // + work easily with null and while printing value consider null also as some string only.
		System.out.println(a.concat(b));  // concat() doesn't work with null, and throws NullPointerException
		//(new StringBuilder("abc")).append(b).append(c);
		System.out.println(" String.valueOf(null) "+String.valueOf(null));
		
		// this above line get converted into  
		// System.out.println((new StringBuilder(String.valueOf(a))).append(b).append(c).toString()); -------(1)
		
		//confusion:
		// StringBuffer and StringBuilder .append(null); The method append(Object) is ambiguous for the type StringBuffer and StringBuilder both.
		// but statement -----(1) executes happily, how ?
		// this is because 
		/* 
		 * definition of append method
		@Override
	    public StringBuilder append(Object obj) {
	        return append(String.valueOf(obj));
	    }
	        String.valueOf(null) gives NullPointerException
	    *
	    */
		
		
	}
}
