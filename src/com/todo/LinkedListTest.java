package com.todo;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		List<String> ll = new LinkedList<String>();
		ll.add("a");ll.add("b");ll.add("c");
		for(String s : ll){
			System.out.println(s);
			ll.remove(2);
		}
	}
}
