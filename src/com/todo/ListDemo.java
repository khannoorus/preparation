package com.todo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		//List of Integer
		
		List<Integer> listInt = new ArrayList<Integer>();
		listInt.add(1);
		listInt.add(2);
		listInt.add(3);
		
		for(Integer e:listInt)
		{
			System.out.println(e);
		}
	}
	
}
