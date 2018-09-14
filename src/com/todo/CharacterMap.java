package com.todo;

import java.util.*;

public class CharacterMap {

	public static void main(String[] args) {
		new CharacterMap().display();
	}
	
	public void display(){
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('a', 'p');
		map.put('b', 'q');
		map.put('c', 'r');
	 
			
	   //Printing map
			for(Character c: map.keySet()){
				System.out.println(" key : " +c+ " value : " + map.get(c));
			}
			
	  //Printing map		
			Set<Character> setViewOfMap = map.keySet();
			Iterator<Character> itr = setViewOfMap.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
	
	  //Printing map
			System.out.println(map.keySet());
			System.out.println(map.values());
		
	}
}
