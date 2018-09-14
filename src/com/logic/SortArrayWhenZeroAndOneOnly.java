package com.logic;

import java.util.Arrays;

public class SortArrayWhenZeroAndOneOnly {

	public static void main(String[] args) {
		
		new SortArrayWhenZeroAndOneOnly().MethodOne();
		new SortArrayWhenZeroAndOneOnly().MethodTwo();
	}
	
	public void MethodOne(){
		
		int[] a = {0,1,1,0,1,1,0,1,1,1,0,0,0,1,0};
		int sum =0;
		for(int i=0;i<a.length;i++)
			sum = sum + a[i];
		System.out.println("sum = "+sum);
				
		Arrays.fill(a,0,a.length-sum,0);
		Arrays.fill(a,a.length-sum,a.length,1);
		
		System.out.println(Arrays.toString(a));
	}
	
	public void MethodTwo(){
		
		int[] a = {0,1,1,0,1,1,0,1,1,1,0,0,0,1,0};
		int sum =0;
		for(int i=0;i<a.length;i++)
			sum = sum + a[i];
		for(int i=0;i<a.length;i++)
			if(i<a.length-sum)
				a[i]=0;
			else
				a[i]=1;

		System.out.println(Arrays.toString(a));		
	}
}
