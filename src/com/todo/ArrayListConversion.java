package com.todo;
import java.util.ArrayList;
import java.util.List;


public class ArrayListConversion {

	public void arrayToList()
	{		
		int[] a = {1,2,3,4,5,6,7};
		List<Integer> list = new ArrayList<Integer>();
		List<String> li = new ArrayList<String>();
		
		//Array cannot be directly added to the list using addAll() method
		//list.addAll(a); //compilation error
		
		for(int i=0;i<=a.length-1;i++)
		{
		   list.add(a[i]);	
		   li.add(String.valueOf(a[i]));  
		   //integer value is added into String type List.
		}
	
		
		System.out.println("Array is converted into ArrayList \n "+ "list value "+ list+" \n  "+ "li value " +li);
	}

	public void listToArray()
	{
		 List<Integer> list = new ArrayList<Integer>();
		 Integer[] b = new Integer[list.size()];
		 
		 for(int i=0;i<10;i++)
			list.add(i);				
			
		
		b = (list).toArray(b);
		
		System.out.println("ArrayList is Converted into Array");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(" "+b[i]);
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new ArrayListConversion().arrayToList();
		new ArrayListConversion().listToArray();
	}

}
