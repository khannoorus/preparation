package com.subarray;

public class SubArrayOfMaxSum {

	public static void main(String[] args) {
		/*example 1 */ System.out.println(new SubArrayOfMaxSum().maxSubArrraySum(new int[] {1,2,3}));
		/*example 2 */ System.out.println(new SubArrayOfMaxSum().maxSubArrraySum(new int[] {-2,-3,4,-1,-2,1,5,-3})); //MaxSumOfSubArray (4,-1,-2,1,5)
		/*example 3 */ System.out.println(new SubArrayOfMaxSum().maxSubArrraySum(new int[] {-1,-2,-3}));
		/*example 4 */ System.out.println(new SubArrayOfMaxSum().maxSubArrraySum(new int[] {-1,2,-3,6}));  //alone no. 6 is greater
		
		System.out.println(" ********************* Kadane's Algorithm ************************ ");
		
		/*example 1 */ System.out.println(new SubArrayOfMaxSum().maxSubArrraySumKadane(new int[] {1,2,3}));
		/*example 2 */ System.out.println(new SubArrayOfMaxSum().maxSubArrraySumKadane(new int[] {-2,-3,4,-1,-2,1,5,-3})); //MaxSumOfSubArray (4,-1,-2,1,5)
		/*example 3 */ System.out.println(new SubArrayOfMaxSum().maxSubArrraySumKadane(new int[] {-1,-2,-3}));
		/*example 4 */ System.out.println(new SubArrayOfMaxSum().maxSubArrraySumKadane(new int[] {-1,2,-3,6})); 
	}
	
	int maxSubArrraySum(int a[]){
		int finalSum = a[0];
		int CurrentSum = a[0];
		for(int i=1;i<a.length;i++){  //loop should start from 1 and not zero
			CurrentSum = findMax(a[i],a[i]+CurrentSum);
			finalSum = findMax(finalSum,CurrentSum);
		}		
		return finalSum;
	}

	public int findMax(int n1, int n2){
	   return n1>n2?n1:n2;
	}
	
	
	int maxSubArrraySumKadane(int a[]){
		int start = 0, end = 0, temp = 0;
		
		int max = a[0];
		int upToHere = 0;
		
		for(int i=0;i<a.length;i++){ 
			
			upToHere = upToHere + a[i];
			
			if(upToHere > max){
				max = upToHere;
				start = temp;
				end = i;
			}
			
			if(upToHere < 0){
				upToHere = 0;
				temp = i + 1;
			}
		}	
		
		System.out.print( "start : "+ start + " end : "+end + " for sum : ");
		return max;
	}
}
