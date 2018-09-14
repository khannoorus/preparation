package com.todo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SetDateFormat {
	
	public void setFormat() throws ParseException
	{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");		
		System.out.println(formatter.format(new Date()));
		
		SimpleDateFormat formatter1 = new SimpleDateFormat("MM/dd/yyyy");
		
		//string to date
		Date d = formatter1.parse(formatter1.format(new Date()));
		System.out.println(d);
	}
	
	public static void main(String[] args) throws ParseException {
		new SetDateFormat().setFormat();
	}
	
	
}
