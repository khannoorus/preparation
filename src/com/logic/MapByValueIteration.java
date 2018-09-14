package com.logic;

import java.util.*;

public class MapByValueIteration {

	public static void main(String[] args) {
		HashMap<String, Integer> hMap = new HashMap<>();
		hMap.put("1", 1);
		hMap.put("2", 2);
		hMap.put("3", 3);
		int co = 0;
		Collection c = hMap.values();
		Iterator itr = c.iterator();
		while (itr.hasNext()) {
			if((Integer)(itr.next())>2){
				co++;
			}
			System.out.println("value : "+itr.next());
		}
	}
}
