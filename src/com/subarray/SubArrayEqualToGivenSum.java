package com.subarray;

public class SubArrayEqualToGivenSum {

	//To find total number of pairs present in aaray 
	public static void main(String[] args) {
		
		//only work for positive number in the array
		
		/*example 1 */ System.out.println(new SubArrayEqualToGivenSum().SubArrraySumEquals(new int[] {1,2,3},6));
		/*example 2 */ System.out.println(new SubArrayEqualToGivenSum().SubArrraySumEquals(new int[] {11,5,8,12,3},15));
		/*example 3 */ System.out.println(new SubArrayEqualToGivenSum().SubArrraySumEquals(new int[] {11,5,8,12,3},11));
		/*example 4 */ System.out.println(new SubArrayEqualToGivenSum().SubArrraySumEquals(new int[] {11,5,8,12,3},27));
		/*example 5 */ System.out.println(new SubArrayEqualToGivenSum().SubArrraySumEquals(new int[] {2,5,4,7,3,6},9));
	}

	boolean SubArrraySumEquals(int a[], int givenSum){

		boolean boolSum = false;
		int currentSum = 0;
		int initialIndex = 0;
		int pair = 0;

		for(int i=0;i<a.length;i++){ 

			currentSum = a[i]+currentSum;

			if( currentSum > givenSum){
				currentSum = currentSum - a[initialIndex];
				initialIndex = initialIndex +1;				
			}

			if(currentSum == givenSum){
				boolSum = true;				
				//break;
				pair++;
			}		    
		}
		
		System.out.println("pair : "+pair);

		return boolSum;
	}

}

