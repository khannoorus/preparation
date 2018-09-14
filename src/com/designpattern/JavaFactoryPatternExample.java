package com.designpattern;

/*
 * Factory pattern whenever you see an opportunity to encapsulate object creation code 
 * and see chance of creating different object in near future.
 * 
 */ 

public class JavaFactoryPatternExample
{
  public static void main(String[] args)
  {	  
	  /*
	   * Since static factory method have return type as Interface,
	   * it allows you to replace implementation with better 
	   * performance version in newer release
	   * 
       */
	  
	Employee emp = EmployeeFactory.getEmployee("Good");
    emp.aboutSalary();

    emp = EmployeeFactory.getEmployee("Excellent");
    emp.aboutSalary();

    emp = EmployeeFactory.getEmployee("Average");
    emp.aboutSalary();
  }
}


/**
 * Our Factory class.
 */
class EmployeeFactory
{
  public static Employee getEmployee(String criteria)
  {
    if ( criteria.equals("Average") )
      return new Tester();
    else if ( criteria.equals("Good") )
      return new Finance();
    else if ( criteria.equals("Excellent") )
      return new Developer();

    return null;
  }
}


/**
 * Our Employee interface.
 */
interface Employee
{
  public void aboutSalary ();
}


// Our concrete class implementations 

class Tester implements Employee
{
  public void aboutSalary()
  {
    System.out.println("The Tester says Average");
  }
}

class Finance implements Employee
{
  public void aboutSalary()
  {
    System.out.println("The Finance says Good");
  }
}

class Developer implements Employee
{
  public void aboutSalary()
  {
    System.out.println("The Developer says Excellent");
  }
}

