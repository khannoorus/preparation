package com.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Find a pair of elements from an array whose sum equals a given number
For input = {2,45,7,3,5,1,8,9,9,1} and if Sum is 10
Output
3, 7
8, 2
9, 1
*/

public class ArrayPairSum {


	public static void main(String[] args) {        

		int []a = {2,45,7,3,5,1,8,9,9};
		printSumPairs(a,10);        

	}


	public static void printSumPairs(int []input, int sum){
		
		 // Method 1 : Using Map 
		System.out.println("Method 1 START: Using Map");
		  Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();

		for(int i=0;i<input.length;i++){

			if(pairs.containsKey(input[i]))
				System.out.println(input[i] +" , "+ pairs.get(input[i]));
			else
				pairs.put(sum-input[i], input[i]);
		}
		System.out.println("Method 1 END : Using Map");
		
		// Method 2 : Using List
		System.out.println("Method 2 START: Using List");
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<input.length;i++){			
			if(list.contains(input[i])){
				System.out.println(input[i]+" , "+(sum-input[i]));
			}
			else{
				list.add(sum-input[i]);
			}
		}			
		System.out.println("Method 2 END: Using List");
	}
}
