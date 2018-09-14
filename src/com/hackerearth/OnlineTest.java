package com.hackerearth;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlineTest {

	
public static void main(String[] args) {
	
	System.out.println(nthBooleanPalindrome(1));	
	System.out.println(nthBooleanPalindrome(3));	
	System.out.println(nthBooleanPalindrome(5));
	Scanner s = new Scanner(System.in);
	s.nextInt();
	for(int i =0 ; i <4;i++){
		s.nextInt();
		
	}
		
	
}


public static final int nthBooleanPalindrome(int n) {
    if (n == 1) return 0;
    if (n == 2) return 1;
    int m = 31 - Integer.numberOfLeadingZeros(n);
    int c = 1 << (m - 1);
    int b;
    if (n >= 3*c) {
        int a = n - 3*c;
        int d = 2*c*c;
        b = d + 1;
        int k2 = 1;
        for (int i = 1; i < m; i++) {
            k2 <<= 1;
            b += a*k2/c%2*(k2 + d/k2);
        }
    }
    else {
        int a = n - 2*c;
        int d = c*c;
        b = d + 1 + (n%2*c);
        int k2 = 1;
        for (int i = 1; i < m - 1; i++) {
            k2 <<= 1;
            b += a*k2/c%2*(k2 + d/k2);
        }
    }
    return b;
}


}

