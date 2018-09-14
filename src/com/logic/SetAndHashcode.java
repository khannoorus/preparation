package com.logic;

import java.util.HashSet;
import java.util.Set;

public class SetAndHashcode {
	
	public static void main(String[] args) {
		Set<Crow> set = new HashSet<Crow>();
		set.add(new Crow(1,"A"));
		set.add(new Crow(2,"B"));
		set.add(new Crow(1,"A"));
		set.add(new Crow(1,"C"));

		System.out.println(set.size());
	}
}

class Crow{
	
	int id;
	String name;	
	
	public Crow(int val, String str) {
		super();
		this.id = val;
		this.name = str;
	}

	@Override
	public int hashCode() {
		return 0;
	}
	
	/*@Override
	public boolean equals(Object o) {
		if((o instanceof Crow)&&(((Crow)o).id == (this.id) ))
			return true;
		else 
			return false;
	}*/
}