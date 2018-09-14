package com.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortWithMapValues {

	public static void main(String[] args) {
		new SortWithMapValues().display();
	}

	public void display(){

		Map<String,Integer> map = new HashMap<String,Integer>();

		map.put("a", 10);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 400);
		map.put("e", 5);
		map.put("f", 16);


		System.out.println("KeySet");
		List list1 = new ArrayList(map.keySet());

		for(Object val:list1){
			System.out.println(val);
		}

		System.out.println("Values");
		List list2 = new ArrayList(map.values());

		for(Object val:list2){
			System.out.println(val);
		}

		System.out.println("EntrySet");
		/*List list = new ArrayList(map.entrySet());*/
		List list = new ArrayList();
		list.addAll(map.entrySet());
		for(Object val:list){
			System.out.println(val);
		}

		System.out.println("Sorted by value of Map");		
		Set<Entry<String, Integer>> set = map.entrySet();
		/* List<Entry<String, Integer>> list5 = new ArrayList<Entry<String, Integer>>(set);*/
		List<Entry<String, Integer>> list5 = new ArrayList<Entry<String, Integer>>();
		list5.addAll(set);

		/*

        //not required in current context, just only for knowledge

        Set<Entry<String, Integer>> s = map.entrySet();
        Iterator<Entry<String, Integer>> itr = s.iterator();
        while(itr.hasNext()){
        	System.out.println("!! "+itr.next());
        	System.out.println("~~ "+(Map.Entry)itr.next());
        }

		 */

		//Either we can write here Map.Entry or Entry
		/*Collections.sort( list5, new Comparator<Entry<String, Integer>>()
		{ 
			public int compare( Entry<String, Integer> key1, Entry<String, Integer> key2 )
			{
				//System.out.println((key2.getValue()) . compareTo (key1.getValue()));            	
				return (key2.getValue()) . compareTo (key1.getValue());
			}
		} );*/
		
		Collections.sort( list5, new ValueComparator());
		for(Object val:list5){
			System.out.println(val);
		}

		/* 
		 * Other way of printing the data
        for(Map.Entry<String, Integer> entry:list5){
            System.out.println(entry.getKey()+" ==== "+entry.getValue());
        }
		 */



		/*
		 // Other approach that uses separate Class ByValue defined below
		  System.out.println("Sorted by value of Map");
		  List list6 = new ArrayList(map.entrySet());
		  Collections.sort(list6, new ByValue());
		  for(Object val:list6){
			System.out.println(val);
		}*/



	}
}

/*class ByValue implements Comparator<Map.Entry<String, Integer>> {
		public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
			return o1.getValue().compareTo(o2.getValue());
		}
	}*/

class ValueComparator implements Comparator<Entry<String, Integer>> {
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		return o1.getValue().compareTo(o2.getValue());
	}
}




