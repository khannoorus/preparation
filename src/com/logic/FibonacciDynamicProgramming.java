package com.logic;

public class FibonacciDynamicProgramming {

	private static final int FIB_NUM = 5;
	
	static Integer store[] = new Integer[FIB_NUM+1];
	static int result = -1;
	
	
	public static void main(String[] args) {
		
		for (int i = 0; i < store.length; i++) {
		   store[i] = -1;			
		}
		
		 result = new FibonacciDynamicProgramming().fibonacci(FIB_NUM);
		 System.out.println(result);
	}

	public int fibonacci(int n){
		if(store[n] != -1){
			return store[n];
		}
		if(n==0 || n==1){
			result = 1;
		}
		else {
			result = fibonacci(n-1) +  fibonacci(n-2);
			
		}
		
		store[n] = result;
		return result;
		
	}
	
}
