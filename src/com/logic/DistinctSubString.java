package com.logic;

import java.util.*;

public class DistinctSubString {

	public static void main(String[] args) {
		//System.out.println(distinct("KINCENVIZH")); //53
		System.out.println("total number of distinct String "+distinct("abcd"));

	}
	
	
	public static int distinct(String s) {
		Set<String> set = new HashSet<String>();		
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j <= i; j++) {
					set.add(s.substring(j, i + 1)); // i+1 is because to include the endIndex
			}
		}
		return set.size();
	}
	
	// Print : This code will show all the distinct substring
	/*public static int distinct(String s) {
		Set<String> set = new HashSet<String>();
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j <= i; j++) {
					set.add(s.substring(j, i + 1));
					System.out.println(s.substring(j, i + 1));
			}
			System.out.println();
		}
		return set.size();
	}*/


}

/*Method substring() is used for getting a substring of a particular String. There are two variants of this method:
String substring(int beginIndex): 
Returns the substring starting from the specified index(beginIndex) till the end of the string. 
For e.g. "Chaitanya".substring(2) would return "aitanya". This method throws IndexOutOfBoundsException 
If the beginIndex is less than zero or greater than the length of String (beginIndex < 0  ||  > length of String).

String substring(int beginIndex, int endIndex): 
Returns the substring starting from the given index(beginIndex) till the specified index(endIndex). 
For e.g. "Chaitanya".substring(2,5) would return "ait". 
It throws IndexOutOfBoundsException 
If the beginIndex is less than zero OR beginIndex > endIndex OR endIndex is greater than the length of String.*/
