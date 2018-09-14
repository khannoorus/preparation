package com.logic;

import java.util.*;

public class CollectionNullTest {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		List<Integer> vector = new Vector<Integer>();
		
		Set<Integer> hashSet = new HashSet<Integer>();
		Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		Set<Integer> treeSet = new TreeSet<Integer>();
		
		Map<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
		Map<Integer,Integer> hashtable = new Hashtable<Integer,Integer>();
		Map<Integer,Integer> linkedHashMap = new LinkedHashMap<Integer,Integer>();
		Map<Integer,Integer> treeMap = new TreeMap<Integer,Integer>();
		
		//List allow null completely
		arrayList.add(null);
		arrayList.add(null);
		linkedList.add(null);
		linkedList.add(null);
		vector.add(null);
		vector.add(null);
		System.out.println();
				 //printing arrayList
				for(Integer i : arrayList){
	        		System.out.println("arrayList " + i);
	        	 } //printing linkedList
        		for(Integer i : linkedList){
        	        System.out.println("linkedList " + i);
        	    } //printing vector
        		for(Integer i : vector){
            		System.out.println("vector " + i);
            	 }
		
		//Set allow null except (TreeSet & HashTable) but set won't allow duplicate (actually it keeps on adding duplicate and overwriting the existing one)
        System.out.println("//Set allow null except (TreeSet & HashTable) but set won't allow duplicate (actually it keeps on adding duplicate and overwriting the existing one)");
		hashSet.add(null);
		System.out.println("hashset doesnot add duplicate so returning "+hashSet.add(null));
		        //printing hashSet
				for(Integer i : hashSet){
					System.out.println("hashSet " + i);
				}
		linkedHashSet.add(null);
		linkedHashSet.add(null);
        		//printing linkedHashSet
        		for(Integer i : linkedHashSet){
    		        System.out.println("linkedHashSet " + i);
		}
        
        //Map allow null except TreeMap but Map won't allow duplicate key (actually it keeps on adding duplicate key and overwriting its corresponding value on the existing one)
        System.out.println("//Map allow null except TreeMap but Map won't allow duplicate key (actually it keeps on adding duplicate key and overwriting its corresponding value on the existing one)");
		hashMap.put(null,null);
		hashMap.put(null,1);
		 //printing hashMap
				for(Integer i : hashMap.keySet()){
					System.out.println("hashMap " + " key : " + i + " value : " + hashMap.get(i));
				}	
		
		linkedHashMap.put(null,null);
		linkedHashMap.put(null,2);
		 //printing linkedHashMap
				for(Integer i : linkedHashMap.keySet()){
					System.out.println("linkedHashMap " + " key : " + i + " value : " + linkedHashMap.get(i));
				}
				
				
		
		//hashtable does not allow null at all. 
        try {
			hashtable.put(null,100);
		} catch (Exception e) {
			System.out.println("//hashtable does not allow null at all. ");
			e.printStackTrace();
		}
		
        //TreeSet does not allow null at all. 
		try {
			treeSet.add(null);
		} catch (Exception e) {
			System.out.println(" //TreeSet does not allow null at all.  ");
			e.printStackTrace();
		}       

      //TreeMap does not allow null at all. 		
		try {
			treeMap.put(null,100);
		} catch (Exception e) {
			System.out.println("//TreeMap does not allow null at all. ");
			e.printStackTrace();
		}
			
		
		
		
	}
}
