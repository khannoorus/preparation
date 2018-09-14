package com.logic;

public class TraverseArrayWithoutLoop {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		new TraverseArrayWithoutLoop().traverse(arr,0);
	}

	private void traverse(int[] arr, int index) {
		if(arr.length-1 >= index){
			System.out.println(index +" : "+arr[index]);
			traverse(arr, ++index);
		}
	}
	
	void display(){
		
	}

}
