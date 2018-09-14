package com.logic;

public class ObjectCreationDifferentWay {

	public static void main(String args[]) throws NoSuchMethodException, SecurityException{  

		//FGIT
		// I gives any class instance but FGT gives only java.lang.Class class instance
		
		//forName()->F i.e IF WE KNOW THE NAME OF THE CLASS (SHOULD BE FULLY QUALIFIED)
		System.out.println("\nINVOKING TestForNameMethod\n==========================");
		new TestForNameMethod().createObject();

		//getClass()->G i.e IF WE KNOW THE (BOTH)[NAME(TYPE) AND INSTANCE] OF THE CLASS
		System.out.println("\nINVOKING TestGetClassMethod\n==========================");
		Simple obj = new Simple();
		new TestGetClassMethod().createObject(obj);

		//.class syntax-> Type i.e IF TYPE IS AVAILABLE BUT THERE IS NO INSTANCE
		System.out.println("\nINVOKING TestDotClassSyntax\n==========================");
		new TestDotClassSyntax().createObject();

		//newInstance()->I - USED TO CREATE NEW INSTANCE EXISTING INSTANCE OF THAT PARTICULAR CLASS 
		System.out.println("\nINVOKING TestNewInstanceMethod\n==========================");
		new TestNewInstanceMethod().createObject();
	}  
}

class TestForNameMethod{  
	@SuppressWarnings("rawtypes")
	public void createObject(){  
		Class c = null;
		try {
			//get the instance of the class
			c = Class.forName("com.practice.Simple");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println(c.getName());  
	} 
}  

class TestGetClassMethod{  
	@SuppressWarnings("rawtypes")
	void createObject(Object obj){  
		//get the instance of the class
		Class c=obj.getClass(); 

		System.out.println(c.getName());  
	}  
}

class TestDotClassSyntax{  
	@SuppressWarnings("rawtypes")
	void createObject() throws NoSuchMethodException, SecurityException{  
		//get the instance of the class
		Class c = Boolean.class;   
		System.out.println(c.getName());  

		Class c1 = boolean.class;   
		System.out.println(c1.getName());  		  

		Class c2 = Simple.class;   
		System.out.println(c2.getName()); 
		System.out.println(c2.getName()); 
	}  
}

class TestNewInstanceMethod{  
	@SuppressWarnings("rawtypes")
	void createObject(){  
		//get the instance of the class
		try{  
			Class c=Class.forName("com.practice.Simple"); 
			System.out.println("^^^"+c.getDeclaredMethods());
			Simple s=(Simple)c.newInstance();  
			s.message(); 
		}catch(Exception e)	{
			e.printStackTrace();
		}
	}  
} 

/* 
 other methods of java.lang.Class class
 ======================================

getConstructor, getConstructors, getDeclaredConstructor
getMethod, getMethods, getDeclaredMethods
getField, getFields, getDeclaredFields
getSuperclass
getInterfaces
getDeclaredClasses

*/


/*
Method	Description
1) public String getName()	returns the class name
2) public static Class forName(String className)throws ClassNotFoundException	loads the class and returns the reference of Class class.
3) public Object newInstance()throws InstantiationException,IllegalAccessException	creates new instance.
4) public boolean isInterface()	checks if it is interface.
5) public boolean isArray()	checks if it is array.
6) public boolean isPrimitive()	checks if it is primitive.
7) public Class getSuperclass()	returns the superclass class reference.
8) public Field[] getDeclaredFields()throws SecurityException	returns the total number of fields of this class.
9) public Method[] getDeclaredMethods()throws SecurityException	returns the total number of methods of this class.
10) public Constructor[] getDeclaredConstructors()throws SecurityException	returns the total number of constructors of this class.
11) public Method getDeclaredMethod(String name,Class[] parameterTypes)throws NoSuchMethodException,SecurityException	returns the method class instance.
*/

class Simple {

	void message(){
		System.out.println("Hello moto");
	}
	
	private String display(){
		return "Hello display";
	}
}
