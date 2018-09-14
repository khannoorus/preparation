package com.todo;

public class Employeee {
	
	int id=0;
	String name=null;
	public Employeee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//overriding for hashset implementation
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Employeee e = (Employeee)obj;
		return this.getName().equalsIgnoreCase(e.getName());
	}
	
}
