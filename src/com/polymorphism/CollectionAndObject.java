package com.polymorphism;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionAndObject {

	public static void main(String[] args) {
		new CollectionAndObject().test();
	}

	public void test(){
		
		Employees1[] e = new Employees2[3];
	//	Employees2[] ep = new Employees1[3];   //compilation error
		
	//	List<Employees2> em = new ArrayList<Employees1>();      //compilation error
	//	List<Employees1> emp = new ArrayList<Employees2>();      //compilation error
		
		
		List<Employees1> employee1 = new ArrayList<Employees1>();
		List<Employees2> employee2 = new ArrayList<Employees2>();
	//	employees1 = employees2;         //compilation error
	//	employees2 = employees1;         //compilation error
		
		
		List emi = new ArrayList();
		List<Employees1> empi = new ArrayList();	
		List empz = new ArrayList<Employees2>();
		List empy = new ArrayList<Employees1>();
		
		emi = empi;
		empi = emi;
		
		emi = empz;
		empz = emi;
		
		emi = empy;
		empy = emi; 
		
		
		empz = empi;
		empi = empz;
		
		empz = empy;
		empy = empz;
		
		empi = empy;
		empy = empi; 
		
		
	//	Set<Employees2> em1 = new HashSet<Employees1>();        //compilation error
	//	Set<Employees1> emp1 = new HashSet<Employees2>();      //compilation error
	}
}

class Employees1  {	
	public int display(){
		return 1;		
	}
	public int print() {
		return 2;		
	}	
	public int move() {
		return 20;		
	}	
}

class Employees2 extends Employees1 {
	public int display() {
		return 3;		
	}	
	public int print() {
		return 4;		
	}	
	public int track() {
		return 40;		
	}
}

 class Employees3 extends Employees2 {}
 class Employees4 {}




