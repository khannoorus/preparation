import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Super
{ 
    public int i = 0; 

    public Super(String text) /* Line 4 */
    {
        i = 1; 
    } 
} 

class Sub extends Super
{
    public Sub(String text)
    {
        i = 2; 
    } 

    public static void main(String args[])
    {
        Sub sub = new Sub("Hello"); 
        System.out.println(sub.i); 
    } 
}








class PetA 
{
    public static void main(String [] args) 
    {
        PetA p = new PetA();
        p.start();
    }

    void start() 
    {
        long [] a1 = {3,4,5};
        long [] a2 = fix(a1);
        System.out.print(a1[0] + a1[1] + a1[2] + " ");
        System.out.println(a2[0] + a2[1] + a2[2]);
    }

    long [] fix(long [] a3) 
    {
        a3[1] = 7;
        return a3;
    }
}






interface Colorable {}
class Vehicle {}
class Car extends Vehicle implements Colorable {}
public class PetA {
    public static void main(String[] args) {

    	 StringBuffer s1 = new StringBuffer("Hello World");
         s1.insert(6 , "Good ");
         System.out.println(s1);
    }
}





 class Testa {

	public static void main(String[] args) {
		/*
		GetData gd = new GetData();
		
		gd.getIntList().forEach(System.out::println);		
		
		Stream<Integer> intlistStream = gd.getIntList().stream(); 
		intlistStream.filter(i->i>10).collect(Collectors.toList()).forEach(System.out::println);*/	
		/*MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.start();
		t2.start();
		System.out.println("3 ");
		*/
		TreeSet t=new  TreeSet ();
        t.add(null);
        t.add("A");
        System.out.println(t);
	}

}

class Exc0 extends Exception { } 
class Exc1 extends Exc0 { } /* Line 2 */
 class PetA 
{  
    public static void main(String args[]) 
    { 
        try 
        {  
            throw new Exc1(); /* Line 9 */
        } 
        catch (Exc0 e0) /* Line 11 */
        {
            System.out.println("Ex0 caught"); 
        } 
        catch (Exception e) 
        {
            System.out.println("exception caught");  
        } 
    } 
}
 
 
 
 
 
 
 
 
