package com.logic;

import java.util.*;

public class AllPossibleCombination {

	private static final String INPUT_STRING = "abc";

	public static void main(String[] args) {
		//new AllPossibleCombination().allPossibleCombination(INPUT_STRING);
		char[] arr = INPUT_STRING.toCharArray();
        System.out.print("The combinations are: ");
      //  new AllPossibleCombination().printCombinations(arr, arr.length);
        new AllPossibleCombination().allPossibleCombination(INPUT_STRING);
	}
	
	void combinations(char[] arr, char[] data, int start, int end, int index, int r) { 
        if (index == r) {
            for (int j = 0; j < r; j++)
                System.out.print(data[j] + " ");
            System.out.println();
        }
 
        for (int i = start; i <= end && ((end - i + 1) >= (r - index)); i++) {
            data[index] = arr[i];
            combinations(arr, data, i + 1, end, index + 1, r);
        }
    }
	
	void printCombinations(char[] arr, int N) {
        char[] data = new char[N];
        for (int r = 0; r < arr.length; r++)
            combinations(arr, data, 0, N - 1, 0, r);
    }
	
	public void allPossibleCombination(String s){
		List<String> listSubString = new ArrayList<String>();
		for(int i=0;i<s.length();i++){
			for(int j=i;j<=s.length();j++){
				String subStr = s.substring(i, j);
				listSubString.add(subStr);
			}
		}
		
		for(String i:listSubString){
			System.out.println(i);
		}
	}

}
