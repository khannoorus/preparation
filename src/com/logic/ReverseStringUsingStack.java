package com.logic;

import java.util.Stack;
import java.util.StringTokenizer;

public class ReverseStringUsingStack {

	public static void main(String[] args) {

		String str = "my name is noorus khan";
		
		System.out.println(" original string "+ str);
		new ReverseStringUsingStack().reverseString(str);
		
		System.out.println("\n original string "+ str);
		new ReverseStringUsingStack().reverseStringInEachWords(str);
	}

	public void reverseString(String s) {
		char[] charArray = s.toCharArray();

		Stack<Character> stack = new Stack<Character>();

		//reading each character
		for (Character c : charArray) 
			stack.push(c);		

		while(!stack.isEmpty())
			System.out.print(stack.pop());
	}

	public void reverseStringInEachWords(String s) {

		StringTokenizer token = new StringTokenizer(s," ");
		while(token.hasMoreTokens()){
			reverseString(token.nextToken().toString());
			System.out.print(" ");
		}
	}
}
