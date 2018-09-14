package com.todo;

import java.util.Scanner;

public class AddArrayDynamically {

	public static void main(String[] args) {
		
		 Scanner intScanner = new Scanner(System.in);
		 Scanner stringScanner = new Scanner(System.in);
		 
		 System.out.println("Enter Limit");
		 int limit = intScanner.nextInt();
		 
		 System.out.println("Enter array");
		 String str = stringScanner.nextLine();	
		 
		 String[] line2 = str.split(" ") ;
		   
		   int[] a =  new int[limit];
		   for(int i=0;i<limit;i++){
			   a[i] = Integer.parseInt(line2[i]);
			   System.out.println(a[i]);
			   
		   }
		   
		   intScanner.close();
		   stringScanner.close();
	}
}
