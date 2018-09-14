package com.todo;

public class CharArrayTest {

	public static void main(String[] args) {

		String str = "ababababababab";
		char[] chararry = new char[20];
		chararry = str.toCharArray();
		for(char c:chararry){
			System.out.println(c);
		}

	

	}

}
