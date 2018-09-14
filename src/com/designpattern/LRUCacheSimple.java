package com.designpattern;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheSimple {
	
	 private final static int CACHE_MAX_SIZE = 4;

	@SuppressWarnings("serial")
	public static <K,V> Map<K,V> lruCache() {
		return new LinkedHashMap<K, V>(CACHE_MAX_SIZE, 0.75f, true) { 
			@Override
			protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
				System.out.println(" in method "+eldest.getKey()+" "+eldest.getValue()+ 
						" size() > CACHE_MAX_SIZE "+ (size() > CACHE_MAX_SIZE));
				return size() > CACHE_MAX_SIZE;
			}
		};
	}
	public static void main(String[] args ) {
		Map<Object, Object> lru = LRUCacheSimple.lruCache();   
		
		System.out.println("1,1");
		lru.put("1", "1");
		
		System.out.println("2,2");
		lru.put("2", "2");
		
		System.out.println("3,3");
		lru.put("3", "3");
		
		System.out.println("4,4");
		lru.put("4", "4");
		
		System.out.println("5,5");
		lru.put("5", "5");
		
		System.out.println("6,6");
		lru.put("6", "6");
		
		System.out.println("7,7");
		lru.put("7", "7");
		
		System.out.println("8,8");
		lru.put("8", "8");
		
		System.out.println("9,9");
		lru.put("9", "9");
		
		System.out.println("2,2");
		lru.put("11", "11");
		lru.put("12", "12");
		lru.put("13", "13");
		lru.put("14", "14");
		lru.put("15", "15");
		lru.put("16", "16");
		lru.put("17", "17");
		lru.put("18", "18");
		lru.put("19", "19");
		
		System.out.println(lru);
	}
}