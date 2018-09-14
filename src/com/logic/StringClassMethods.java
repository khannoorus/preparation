package com.logic;

public class StringClassMethods {

	public static void main(String[] args) {
		String str = "iliveindelhi";
		
		//copyValueOf(char data[])
		String copiedArray = String.copyValueOf(str.toCharArray());
		System.out.println(""+copiedArray);
		
		//replace(char oldChar, char newChar)
		String replacedString = str.replace('i','t');
		System.out.println(""+replacedString);

	}
	
	public String copyValueOfTest(char data[]) {
       return String.copyValueOf(data);
    }

}
