package com.logic;

/*An immutable class is one whose state can not be changed once created. 
There are certain guidelines to create an class immutable.*/

public class ImmutabilityOfReferenceInstance {
	
	public static void main(String[] args) {

	     MutableClass mc = new MutableClass();
	     mc.setId(1);

	     ImmutableClass imc = new ImmutableClass(mc);
	     System.out.println("imc = " + imc); // should print 1

	     mc.setId(2);
	     System.out.println("imc = " + imc); // should still print 1 if immutability works

	     imc.getmClass().setId(3);
	     System.out.println("imc = " + imc); // should still print 1 if immutability works
	}
}

final class ImmutableClass {

	final private MutableClass mClass;

	public ImmutableClass(MutableClass mClass) {
	    this.mClass = (MutableClass)mClass.clone();
	}

	public MutableClass getmClass() {
		return (MutableClass)mClass.clone();
	}	

	@Override
	public String toString() {		
		return String.valueOf(mClass.getId());
	}

}

class MutableClass implements Cloneable{
	private int id;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}	
	
	
	
	@Override
	public Object clone() {
	    try {
	        return super.clone();
	    } catch (CloneNotSupportedException e) {
	        throw new RuntimeException(e);
	    }
	}
}
