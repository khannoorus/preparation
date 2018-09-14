package com.date;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToString {

	public void convertDateToString(){

		Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Format formatter1 = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		System.out.println("date : "+date);
		
		String stringDate = formatter.format(date);
		System.out.println("stringDate : "+stringDate);
	}

	public static void main(String[] args) {
		new DateToString().convertDateToString();
	}
	
	

}
