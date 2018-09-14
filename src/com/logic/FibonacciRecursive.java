package com.logic;

import java.util.Scanner;

public class FibonacciRecursive {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		 
        System.out.print("Enter number upto which Fibonacci series to print: ");
        int limit = new Scanner(System.in).nextInt();
 
        System.out.println("\n\nFibonacci series upto " + limit +" numbers : ");
        for(int i=0; i<=limit; i++){
            System.out.print(fib(i) +" ");
        }
    } 
	
	//Cleaner code
		public static int fib(int x){
			return x == 1 || x == 2 ?  1 :  fib(x-1) + fib(x -2) ;
	    }
 
    // Java program for Fibonacci number using recursion.
    /*public static int fibonacciRecusion(int x){
        if(x == 1 || x == 2){
            return 1;
        }
 
        return fibonacciRecusion(x-1) + fibonacciRecusion(x -2); //tail recursion
    }    */
	
	
	
}  