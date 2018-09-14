package com.logic;

public class DataTypePromotion {
	public static void main(String[] args) {
		Short x =1;
		new DataTypePromotion().display(x); //Short can be put inside int
		
		int y =1;
	//	new DataTypePromotion().print(y);  int cannot put into Short
	}

	private void print(Short y) {
		System.out.println("hi : "+y);
	}

	private void display(int x) {
		System.out.println("hi : "+x);
	}


}
