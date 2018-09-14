package com.todo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetImplementation {

	public static void main(String[] args) {
		Set<Employee> emp = new HashSet<Employee>();
		new SetImplementation().addEmployee(emp);
		/*
		Sort method cannot be implemented over the Set, only applicable for List
		Collections.sort(emp);
		for sorting in SET use treeset
		*/
		System.out.println("populated set values : "+emp);
		
		
		new SetImplementation().removeEmployee(emp);
		System.out.println("populated set values after removal operation : "+emp);
		
	}

	private void addEmployee(Set<Employee> emp) {
		Employee e1 = new Employee(1,"faizan","CS");
		Employee e2 = new Employee(2,"Zishan","CS");
		Employee e3 = new Employee(1,"Zaid","IT");
		Employee e4 = new Employee(2,"Faisal","IT");
		System.out.println(emp.add(e1)+"..."+e1.department+"="+e1.department.hashCode()+"..."+" hashcode of object "+e1.hashCode());
		System.out.println(emp.add(e2)+"..."+e2.department+"="+e2.department.hashCode()+"..."+" hashcode of object  "+e2.hashCode());
		System.out.println(emp.add(e3)+"..."+e3.department+"="+e3.department.hashCode()+"..."+" hashcode of object  "+e3.hashCode());
		System.out.println(emp.add(e4)+"..."+e4.department+"="+e4.department.hashCode()+"..."+" hashcode of object  "+e4.hashCode());		
	}
	
	private void removeEmployee(Set<Employee> emp) {
		Iterator<Employee> i= emp.iterator();
		emp.remove(i.next());
	}
}

class Employee{
	int id;
	String name;
	String department;
	public Employee(int id, String name,String department) {
		super();
		this.id = id;
		this.name = name;
		this.department=department;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + this.name + this.department;
	}
	
	//using hashcode for department, let the code to add all employee becoz all employee's name are different
	/*@Override
	public int hashCode(){
		System.out.print(name+" "+name.hashCode()+" ");
		return name.hashCode();		
	}	
	@Override
	public boolean equals(Object ob){
		Employee e = (Employee)ob;
		return this.name.equals(e.name);		
	}*/
	
	//using hashcode for department, let the code not to add all employee becoz all departments are not different	
	@Override
	public int hashCode(){
		//System.out.print("**"+department+" "+department.hashCode()+" "+"**");
		return department.hashCode();		
	}
	@Override
	public boolean equals(Object ob){
		Employee e = (Employee)ob;
		return this.department.equals(e.department);		
	}	
}
