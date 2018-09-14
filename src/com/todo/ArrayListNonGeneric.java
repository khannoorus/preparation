package com.todo;

import java.util.ArrayList;

public class ArrayListNonGeneric {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("a");
		
		 list.get(0); // error
		 
		// String s = list.get(0); but if u assign it to any datatype, this give compilation error, 
		                        // how it can know, the type, to which this need to assign

		 Object ob = list.get(0);  //so this always return Object type.
		 
		 String s = (String)list.get(0);
		 
		 Integer si = (Integer) list.get(0); // gives ClassCastException at Runtime
	}

}
