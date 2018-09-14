package com.binary.search;

public class BinarySearchInfiniteArray 
{
	static int low=0;
	static int high = 1;

	public static void main(String[] args) {
		
		// here is one assumption -> element is always present inside array
		
		/* Note :-
				 if we try to search last element 100000, this will throw java.lang.ArrayIndexOutOfBoundsException, 
				 but in actual it is infinite array so this actually wont run out of index bound error.
				 but we cannot create infinite error so actually we can ignore that case.
			*/	

		int arr[] = new int[]{3, 5, 7, 9, 10, 90, 
				100, 130, 140, 160, 170, 560, 561, 700, 900, 1000, 9000, 
				10000, 13000, 14000, 16000, 17000, 51000, 70000, 90000, 100000};

		int x = 560;	//element to search - x

		int ans = binarySearch(arr,x,low, high);

		while (ans==-1){	
			if(x > arr[high]){
				low = high+1;
				high = 2*high;  // or this could be 3*high or 4*high
			}
			ans = binarySearch(arr,x,low, high);
		}

		if(ans != -1){
			System.out.println("Element found at index " + ans);
		}
	}

	static int binarySearch(int a[], int x, int low, int high)
	{

		int index=-1;
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

















}