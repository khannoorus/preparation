package com.binary.search;

public class searchElementInRotatedSortedArray {

	public int search(int[] a){

		//element to search - x
		int x=500;
		int index=-1;

		int low=0;
		int high=a.length-1;
		int mid=0;

		while(low <= high){
			mid = (low + high) / 2;
			if(a[mid] == x)
				index = mid;	

			//means sorted part can happen to be RHS
			if(a[mid] <= a[high]){
				if(x > a[mid] && x <= a[high])
					low = mid+1;
				else
					high = mid-1;
			}

			//means sorted part can happen to be LHS
			if(a[low] <= a[mid]){
				if(x >= a[low] && x < a[mid])
					high = mid-1;
				else
					low = mid+1;
			}
		}	

		return index;
	}

	public static void main(String[] args) {

		int[] a = new int[]{2500,5000,7000,10,200,300,500,900};
		System.out.println(new searchElementInRotatedSortedArray().search(a));

	}
}
