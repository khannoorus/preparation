package com.logic;

public class EqualsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu1 = new Student(10);
		Student stu2 = new Student(10);
		System.out.println(stu1.equals(stu2));
		 
		
		Integer st1 = new Integer(10);
		Integer st2 = new Integer(10);
	    System.out.println("..."+st1.equals(st2));
		 
	}
}
                            /*
                                 Qus: for primitive class also i m creating 
                            two dufferent reference then the hash code 
                            shud be differnt.it shud return false.
                            second thing is (why it is not invoking the override
                            method in the case of primitive.)
                            
                            */
class Student
{
	private int id;
	Student(int value)
	{
		id = value;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	/*public boolean equals(Object o)
	{
		if((o instanceof Student)&&( ((Student)o).getId() == (this.getId()) ))
			return false;
		else 
			return true;
	}*/
	
	/*public boolean equals(Object o)
	{		
	    return false;
	}*/
}