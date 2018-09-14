package com.java8;

public class MethodReferenceTest {

	public static void main(String[] args) {
		
	}
	
	public void display(){
		/*Person stu = new Person();
		getAge = Person::getAge;*/
		
		Person p = new Person();
		
		Student getMarks = p::getMarks;
		
		Student getAge = Person::getAge;
		
		
	}

}

class Person implements Student{
	 static int getAge() {
		return 10;
	}

	@Override
	public int getMarks() {
		return 100;
	}
}

interface Student{
	int getMarks();
	//int getSection();
}
