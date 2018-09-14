package com.logic;

import java.util.*;

public class HashSetTest {

	
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(1);set.add(2);set.add(1);		
		System.out.println(set.size());
		
		Set<Emp> s = new HashSet<>();
		Emp e1 = new Emp();
		Emp e2 = new Emp();
		s.add(e1);
		s.add(e2);
		System.out.println(s.size());
	}
	
}

class Emp{
	int id;
}