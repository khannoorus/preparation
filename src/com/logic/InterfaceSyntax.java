package com.logic;

public class InterfaceSyntax implements Test5  {}

//1
interface Test1 extends Test2 {
	public int a = 100;
	public void test() throws RuntimeException;
}

//2
abstract interface Test2 {
	public int a = 100;
	public void test() throws RuntimeException;
}

//3
interface Test3 {
	public int a = 100;
	public void test();
}

//4
interface Test4 {
	final int x = 2;
	void abc();
}

//5
interface Test5 {
	final int x = 2;
	class Syntax{};
	class track{};
	class slate{};
	public class InterfaceSyntax{}
	public abstract static class xyz {  }
	interface Test2 {}
	interface Test20 {}
	interface Test4 {}
}

abstract class Syntax  {
}

interface VariableInterface  {
//	int x;                        should be initialized
}

class track {}

//Multiple inheritance
/*class Person implements All,B1{  compilation Error
	int age;
	int id;	
}*/
interface All{
	void display();
}
interface B1{
	int display();
}
