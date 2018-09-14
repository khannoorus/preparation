package com.logic;

public class ReverseArrayFromIndex {

	public static void main(String[] args) {
		int[] inputArray = {1,2,3,4,5,6};
		int n = 3;
		reverse(inputArray, n);		
		for(int x:inputArray){
			System.out.println(x);
		}
	}
	
	static int[] reverse(int[] inputArray, int n){
		int j=0;
		for(int i=n-1; i>0; i--){
			int temp = inputArray[i];
			inputArray[i] = inputArray[j];
			inputArray[j] = temp;
			j++;			
		}
		return inputArray;		
	}	
}
