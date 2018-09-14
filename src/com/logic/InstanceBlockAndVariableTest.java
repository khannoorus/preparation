package com.logic;

public class InstanceBlockAndVariableTest {

	InstanceBlockAndVariableTest(){
		m("1");
	}
	{
		m("2");
	}
	String m = m("3");
	public static void main(String[] args) {
		InstanceBlockAndVariableTest ob = new InstanceBlockAndVariableTest();
		
		 // m("5");   Cannot make a static reference to the non-static method m(String) 
		
		ob.m("4");    // Have to use object to invoke it

	}

	
	String m(String s){
		System.out.println(s);
		return s;
	}
}


// The class file generated as following

/*public class InstanceBlockAndVariableTest
{

    String m;

    InstanceBlockAndVariableTest()
    {
        m("2");                // 1. instance block get pasted at the begining of constructor
        m = m("3");            // 2. then instance variable get pasted at the begining of constructor
        m("1");               //  3. then it execute the statements written in constructor
    }

    public static void main(String args[])
    {
        InstanceBlockAndVariableTest ob = new InstanceBlockAndVariableTest();
        ob.m("4");
    }

    String m(String s)
    {
        System.out.println(s);
        return s;
    }
}*/




