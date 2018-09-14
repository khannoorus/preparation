package com.logic;

import java.util.*;

public class GenericParameterizedClass<T extends Number> {

	public void add(T t1, T t2){
		System.out.println((t1.intValue()) + (t2.intValue()));;			
	}
	
	public void multiply(T t1, T t2){
		System.out.println((t1.intValue()) * (t2.intValue()));			
	}
	
	public void subtract(T t1, T t2){
		System.out.println((t1.intValue()) - (t2.intValue()));			
	}
	
	public void division(T t1, T t2){
		System.out.println((t1.intValue()) / (t2.intValue()));			
	}
	
	public static void main(String[] args) {
	
		GenericParameterizedClass<Integer> ob = new GenericParameterizedClass<Integer>();
		//ClassGenericParameterized<Double> ob1 = new ClassGenericParameterized<Double>();
		ob.add(1,2);
		ob.multiply(2, 4);
		ob.subtract(15, 6);
		ob.division(6, 3);		
	}	
}

class TestClass1<T>
{
	
}
class TestClass2<ArrayList>  // this is not java.util.ArrayList, its just like a variable 'T'
{
	private static void checkScenario() {
		//	ArrayList<Object> list = new ArrayList<String>();  Compilation Error
			
		}
}