package com.logic;

import java.util.HashMap;
import java.util.Map;

public class HashMapObjectKeyTest {

	public static void main(String[] args) {

		

		Map<Nest,Integer> hashMap = new HashMap<Nest,Integer>();
		hashMap.put(null,null);
		hashMap.put(null,1);
		
		Nest n1 = new Nest();
		Nest n2 = new Nest();
		
		hashMap.put(n1,1);
		hashMap.put(n2,11);
		
		hashMap.put(n1,2);
		 //printing hashMap
				for(Nest i : hashMap.keySet()){
					System.out.println("hashMap " + " key : " + i + " value : " + hashMap.get(i));
				}	
		
	}

}

class Nest{
	
}