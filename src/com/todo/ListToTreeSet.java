package com.todo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.jar.Attributes.Name;


public class ListToTreeSet {
	/**
	 * @param args
	 */
	public void listToTreeSet()
	{
		System.out.println("Inside listToTreeSet");
		Set<String> set = new TreeSet<String>();

		List<String> list = new ArrayList<String>();
		list.add("abc");list.add("pqr");list.add("xyz");list.add("xyz");
		System.out.println("Printing the content of List");
		System.out.println(list);

		set.addAll(list);

		System.out.println("Printing the content of set");
		System.out.println(set+"\n");


		//obtain class objects from list
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
        
		System.out.print("****\n");
		System.out.println(elist.get(0).getId()+elist.get(0).getName());
		System.out.println(elist.get(1).getId()+elist.get(1).getName());
		System.out.println(elist.get(2).getId()+elist.get(2).getName());
		System.out.println(elist.get(3).getId()+elist.get(3).getName());
		System.out.println(elist.get(4).getId()+elist.get(4).getName());
		System.out.print("*****\n");
		
		//Convert this list into the TreeSet

		/*
		Set<Employeee> eSet = new TreeSet<Employeee>();      this will give classCastException as we are
		eset.addAll(eList);                               not giving any logic to treeSet to get sorted
		 */

		Set<Employeee> eset = new TreeSet<Employeee>(new Comparator<Employeee>(){
			@Override
			public int compare(Employeee o1, Employeee o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareToIgnoreCase(o2.getName());
			}			
		});     //Cannot use comparable
		eset.addAll(elist); 
		Iterator<Employeee> it = eset.iterator();
		while(it.hasNext())
		{
			Employeee e = it.next();
			System.out.println(e.getName()+e.getId());
		}
	}

	public void TreeSetToList()
	{
		System.out.println("\nInside TreeSetToList");
		Set<String> set = new TreeSet<String>();

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
		new ListToTreeSet().listToTreeSet();
		new ListToTreeSet().TreeSetToList();
	}

}

/*class NameComparator implements Comparator<Employeee>
{




}
 */