package com.logic;

public class OverloadingAmbigousCase {

	public static void main(String[] args) {
		new OverloadingAmbigousCase().m(10 , 10);

		new OverloadingAmbigousCase().m('a' , 10); //even get promoted to its higher hierarchy and print its ascii value

		//	new OverloadingAmbigousCase().m(10.22 , 10); // but this double value cannot be depromoted to long, int or float
	}

	//The method m(int, float) is ambiguous for the type
	//private void m(int i, float j) { System.out.println("int,float"); }
	//private void m(float i, int j) { System.out.println("float,int"); }

	//int, int executed
		private void m(int i, int j) { System.out.println("int,int");}
	//	private void m(float i, float j) { System.out.println("float,float"); }


	//int, int executed but if int,int commented the long,long get executes datatype promotion 
	//private void m(int i, int j) { System.out.println("int,int");}
	private void m(long i, long j) { System.out.println("long,long "+i+" : "+j); }




}
