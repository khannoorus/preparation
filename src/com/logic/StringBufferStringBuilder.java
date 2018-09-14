package com.logic;

public class StringBufferStringBuilder {

	public void display(){
		
	StringBuffer sbf = new StringBuffer();
	// sbf = "khetan"; Type mismatch: cannot convert from String to StringBuffer
	sbf.append("khetan1 "); 
	System.out.println("1: "+sbf);
	
	 //sbf.append(null); The method append(Object) is ambiguous for the type StringBuffer
	
	sbf.append("khetan2 ");  //appending some new text
	System.out.println("2: "+sbf);
	
	StringBuilder sbd = new StringBuilder();
	//sbd = "sakra"; Type mismatch: cannot convert from String to StringBuffer
	sbd.append("sakra1 ");
	System.out.println("3: "+sbd);
	
    // sbd.append(null); The method append(Object) is ambiguous for the type StringBuilder
	
	sbd.append("sakra2 ");	//appending some new text
	System.out.println("4: "+sbd);
	
	System.out.println("5: "+" StringBuffer and StringBuilder "+ sbf+" "+sbd);
	//System.out.println(sbf+sbd); The operator + is undefined for the argument type(s) StringBuffer, StringBuilder
	
	String str = "abc ";
	System.out.println("6: "+str+123);
	
	System.out.println("7: "+"String and StringBuffer : "+str+sbf);
	System.out.println("8: "+"String and StringBuilder : "+str+sbd);
	
	//System.out.println(null); compilation error
	
	}
	
	public static void main(String[] args) {
		new StringBufferStringBuilder().display();
	}
	
	
	
	
}
