package com.binary.search;

public class BinarySearch {
	
	public int search(int[] a, int x){

		//element to search - x
		
		int index=-1;
		
		int low=0;
		int high=a.length-1;
		int mid=0;
		
		while(low <= high){
			mid = (low + high) / 2;
			if(a[mid] == x)
				index = mid;			
			if(a[mid] < x)
				low = mid+1;
			else
				high = mid-1;
		}		
		
		return index;
	}
	
	public static void main(String[] args) {
		
		int[] a = new int[]{10,200,300,500,900,2500,5000,7000};
		System.out.println(new BinarySearch().search(a,2500));
		
	}
}
