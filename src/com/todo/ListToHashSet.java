package com.todo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;



public class ListToHashSet {

	/**
	 * @param args
	 */
	public void listToHasSet()
	{
		System.out.println("Inside listToHashSet");
		Set<String> set = new HashSet<String>();
		
		List<String> list = new ArrayList<String>();
		list.add("abc");list.add("pqr");list.add("xyz");list.add("xyz");
		System.out.println("Printing the content of List");
		System.out.println(list);
		
		set.addAll(list);
		
		System.out.println("Printing the content of set");
		System.out.println(set);			
		
		Employeee e1 = new Employeee(1,"abc");
		Employeee e2 = new Employeee(2,"xyz");
		Employeee e3 = new Employeee(3,"pqr");
		Employeee e4 = new Employeee(3,"pqr");

		List<Employeee> elist = new ArrayList<Employeee>();		
		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		elist.add(e1);
		elist.add(e4);	

		System.out.println(elist.get(0).getId()+elist.get(0).getName());
		System.out.println(elist.get(1).getId()+elist.get(1).getName());
		System.out.println(elist.get(2).getId()+elist.get(2).getName());
		System.out.println(elist.get(3).getId()+elist.get(3).getName());
		System.out.println(elist.get(4).getId()+elist.get(4).getName());

		//Convert this list into the HashSet		

		Set<Employeee> eset = new HashSet<Employeee>();    
		eset.addAll(elist); 
		Iterator<Employeee> it = eset.iterator();
		while(it.hasNext())
		{
			Employeee e = it.next();
			System.out.println("        "+e.getName()+e.getId());
		}

		/*
		In the above code it is not adding two same objects 
		(e1 is not get added when tried to add duplicacy)
		but if we really wants that it should check as according.
		to any given field(instance variable)
		then some logic must be implemented
		override hashcode and equals methods.
		*/
		
		
		
		Employeee em1 = new Employeee(1,"abc1");
		Employeee em2 = new Employeee(3,"xyz1");
		Employeee em3 = new Employeee(3,"pqr1");
		Employeee em4 = new Employeee(4,"pqr1");

		List<Employeee> etlist = new ArrayList<Employeee>();		
		etlist.add(em1);
		etlist.add(em2);
		etlist.add(em3);
		etlist.add(em4);	

		System.out.println(etlist.get(0).getId()+etlist.get(0).getName());
		System.out.println(etlist.get(1).getId()+etlist.get(1).getName());
		System.out.println(etlist.get(2).getId()+etlist.get(2).getName());
		System.out.println(etlist.get(3).getId()+etlist.get(3).getName());
		
		//Convert this list into the HashSet
		Set<Employeee> ehset = new HashSet<Employeee>();    
		ehset.addAll(etlist); 
		Iterator<Employeee> ith = ehset.iterator();
		while(ith.hasNext())
		{
			Employeee et = ith.next();
			System.out.println(".... "+et.getName()+et.getId());
		}

		
		
		
		
		
	}
	
	public void hashSetToList()
	{
		System.out.println("\nInside hashSetToList");
		Set<String> set = new HashSet<String>();
		
		List<String> list = new ArrayList<String>();
		set.add("abc");set.add("pqr");set.add("xyz");set.add("xyz");
		System.out.println("Printing the content of set");
		System.out.println(set);
		
		list.addAll(set);
		
		System.out.println("Printing the content of list");
		System.out.println(list);		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ListToHashSet().listToHasSet();
		new ListToHashSet().hashSetToList();
	}

}
