package com.logic;

import java.util.HashMap;
import java.util.Map;

public class OracleBracket {

	public void display()
	{
		String str = "{class A{} public A( int arr[{ }";
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		int i =0;
		while(i<str.length()){
			Character ch = str.charAt(i);		
			if(map.containsKey(ch))
				{map.put(ch, map.get(ch)+1);}
			else if(ch==')'){
				map.put('(', map.get('(')-1);
			}
			else if(ch=='}'){
				map.put('{', map.get('{')-1);
			}
			else if(ch==']'){
				map.put('[', map.get('[')-1);
			}
			else
			{
				if(ch=='(') map.put(ch,1);
				if(ch=='{') map.put(ch,1);
				if(ch=='[') map.put(ch,1);
			}
			i++;
		}
		
		for(Character ch : map.keySet()){
			System.out.println("key "+ch+" = "+map.get(ch));
		}
	}
	
	
	public static void main(String[] args) {
		new OracleBracket().display();
	}
}

