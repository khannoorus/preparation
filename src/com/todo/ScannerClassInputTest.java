package com.todo;

import java.util.Scanner;

public class ScannerClassInputTest {

	public static void main(String[] args) {
		
		//If you want to mix string and integer input, create separate scanner object for String and Integer type objects.
		
		Scanner s = new Scanner(System.in);
		Scanner ss = new Scanner(System.in);
		
		int n = s.nextInt();
		String ar =ss.nextLine();
		
		int x = s.nextInt();

	}

}
