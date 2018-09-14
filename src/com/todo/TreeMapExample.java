package com.todo;

import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map.Entry;

class Employe{
	int id;
	String name;
	String department;
	public Employe(int id, String name,String department) {
		super();
		this.id = id;
		this.name = name;
		this.department=department;
	}
}
public class TreeMapExample {

	public void mapoperations(){
		   Map treemap=new TreeMap();
	//	Map<Integer,String> treemap=new TreeMap<Integer,String>();
		treemap.put(123, "Oracle");
		treemap.put(678, "Java");
		treemap.put(9000, "PHP");
		treemap.put(100,"C++");
		System.out.println(treemap);
		Set set=treemap.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()){
			Object obj=itr.next();
			Map.Entry mapObj=(Map.Entry)obj;
			System.out.print("Key :"+mapObj.getKey());
			System.out.print("\t Value:"+mapObj.getValue()+"\n");           
        }
		
		Employe e1 = new Employe(1,"faizan","CS");
		Employe e2 = new Employe(2,"Zishan","CS");
		Employe e3 = new Employe(1,"Zaid","IT");
		Employe e4 = new Employe(2,"Faisal","IT");
		Map<Integer,Employe> empmap=new TreeMap<Integer,Employe>();
		empmap.put(123, e1);
		empmap.put(678, e2);
		empmap.put(9000, e3);
		empmap.put(100,e4);
		Set s=empmap.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext()){
			Object obj=it.next();
			Map.Entry mapOb=(Map.Entry)obj;
			System.out.print("Key :"+mapOb.getKey());
			System.out.print("\t Value:"+mapOb.getValue()+"\n");           
        }
		
		

}
	
	public static void main(String[] args) {
		new TreeMapExample().mapoperations();
	} 
}

