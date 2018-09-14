

import java.util.*;

public class Pallindrome {
public static void main(String args[]){
	
	String original, reverse= "";
	Scanner in=new Scanner(System.in);
	System.out.println("Please enter your string : ");
	original = in.nextLine(); 
	int length = original.length();
	for (int i = length-1; i >= 0; i--) {
		reverse = reverse + original.charAt(i);
	}
	
	if (original.equals(reverse)) {
		System.out.println("String is pallindrome.");
	}
	else
		System.out.println("String is not pallindrome.");	
}
}