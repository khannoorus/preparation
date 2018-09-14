package com.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortMultiplefieldComparable {

	public static void main(String[] args) {
		Employer e1 = new Employer(1,"a","ab");
		Employer e2 = new Employer(3,"d","bc");
		Employer e3 = new Employer(4,"b","cd");
		Employer e4 = new Employer(2,"b","de");

		List<Employer> emp = new ArrayList<Employer>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);

		Collections.sort(emp);

		System.out.println("*****output****");
		System.out.println("id "+"name "+"department");
		for(Employer e:emp){
			System.out.println(e.id+"    "+e.name+"    "+e.department);
		}
	}
}

class Employer implements Comparable<Employer>{
	int id;
	String name;
	String department;

	public Employer(int id, String name,String department) {
		super();
		this.id = id;
		this.name = name;
		this.department=department;
	}

	@Override
	public int compareTo(Employer e) {
		int valName = this.name.compareTo(e.name);
		if(valName==0){
			int valId = this.id-(e.id);
			if(valId==0){
				return this.department.compareTo(e.department);
			}
			else
				return valId;			
		}
		else
			return valName;
	}
}