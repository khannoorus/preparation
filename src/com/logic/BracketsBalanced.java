package com.logic;

import java.util.HashMap;
import java.util.Stack;

public class BracketsBalanced {

	public static void main(String args[]){
		String str = "([{({})}])";
		System.out.println((new BracketsBalanced()).isValid(str));
		System.out.println("************");
		System.out.println((new BracketsBalanced()).isBalanced(str));
	}

	public boolean isValid(String s){
		char charArray[] = s.toCharArray();

		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
		
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i < charArray.length; i++){
			Character c = charArray[i];
			if(map.keySet().contains(c)){
				stack.push(c);
			} else
				if(map.values().contains(c)){
					if(!stack.isEmpty() && map.get(stack.peek()) == c){
						stack.pop();
					} else{
						return false;
					}
				}
		}

		return stack.isEmpty();
	}

	public boolean isBalanced(String s) {
		
		char charArray[] = s.toCharArray();
		Stack<Character> stack = new Stack<Character>(); 
		
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
		
		
		for(int i = 0; i < charArray.length; i++){
			Character c =  charArray[i] ;
			if(map.containsKey(c)) {
				stack.push(c);
			} else
				if(!stack.isEmpty() && map.get(stack.peek()) == c){
					stack.pop();
				} else{
					return false;
				}
		}

		return stack.isEmpty();
	}
}