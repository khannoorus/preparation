package com.logic;

import java.util.*;

public class ArrayImmutableTest {

	public static void main(String[] args) {
		
		final int[] x = new int[20];
		//final is only about the reference that is marked by it; 
		//there is no such thing as an immutable array in Java
		//ensuring that an object is immutable
		
		x[0]=9;
		x[1]=8;		
		System.out.println(x[0]+" "+x[1]);
		
		x[0]=91;
		x[1]=81;
		System.out.println(x[0]+" "+x[1]);
		
				
		//x = new int[20];  // -----> you won't be allowed to say
		
		
		int[] a = {1,2,3};
		final int[] b = a;
		a[0] = 10; // Yes this is legal
		//b = new int[10];  // -----> but you won't be allowed to say
		
		
		/*  -------------------Immutable array in Java----------------- */
		
		// Not with primitive arrays. You'll need to use a List or some other data structure:
		List<Integer> items = Collections.unmodifiableList(Arrays.asList(0,1,2,3));
		
		
		
		
		//There is one more way to make an immutable array in Java or, immutable empty array can be created

			final String[] IMMUTABLE = new String[0];
			
			/*Arrays with 0 elements (obviously) cannot be mutated.
			This can actually come in handy if you are using the List.toArray method to convert a List to an array. 
			Since even an empty array takes up some memory, you can save that memory allocation by creating a constant empty array, 
			and always passing it to the toArray method. 
			That method will allocate a new array if the array you pass doesn't have enough space, 
			but if it does (the list is empty), it will return the array you passed, 
			allowing you to reuse that array any time you call toArray on an empty List.*/

			final  String[] EMPTY_STRING_ARRAY = new String[0];
			List<String> emptyList = new ArrayList<String>();
			emptyList.toArray(EMPTY_STRING_ARRAY); // returns EMPTY_STRING_ARRAY
		
		 
	}
	
	 //you can't have immutable arrays in Java.
	 //If you absolutely need a method that returns an array that doesn't influence the original array, 
	 	//then you'd need to clone the array each time:

	 /* public int[] getFooArray() {
	   return fooArray == null ? null : fooArray.clone();
	 }*/
	

}
