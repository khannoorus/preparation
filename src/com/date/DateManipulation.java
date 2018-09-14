package com.date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateManipulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar c = Calendar.getInstance();
		 
		Date d = new Date();
		System.out.println("DATE() "+d);
	
		System.out.println("c.getTime() gives u current date "+c.getTime());
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.MONTH));    //it gives one month less
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.DAY_OF_MONTH)+"/"+((c.get(Calendar.MONTH))+1)+"/"+c.get(Calendar.YEAR));
		
		//Return type of add and roll methods are VOID
		c.add(Calendar.DATE,20);System.out.println("getTime() "+c.getTime());
		c.roll(Calendar.DATE,20);System.out.println("getTime() "+c.getTime());
		
		c.set(Calendar.DATE, 1,2);System.out.println("getTime() "+c.getTime());
		
		Date x=c.getTime();
	    c.add(Calendar.DATE, 30);
	    Date y=c.getTime();	    
	    System.out.println("x= "+x+"\n"+"y= "+y);
	    System.out.println(x.equals(y));
	    System.out.println(x.after(y));
	    System.out.println(x.before(y));	
	    
	    //Convert String to date
	    String s1="12/9/4 22:44 ";
	    Date dd=null;
		try {
			dd = new SimpleDateFormat("yy/dd/M hh:mm").parse(s1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println(dd);
	    
	    //converting date to string	    
		 String d2=String.valueOf(dd); 
		 System.out.println(d2);   	
		 
		 //Random no. between (91-100)
		 for(int i=1;i<=5;i++)
		 {
			 double n = Math.random()*100;  //(*100) will ensure that no.is between 0-100 only
			 if(n<91||n>100){i--;continue;}
			 System.out.println(n+" "+"int version "+(int)n);
		 }		 
	}
}
