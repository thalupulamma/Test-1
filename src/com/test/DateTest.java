package com.test;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateTest {
	public static void main(String[] args) {
		/*Date date1 = new Date();
		System.out.println(date1);

		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
		// or pass in a command line arg: -Duser.timezone="UTC"

		Date date2 = new Date();
		System.out.println(date2);
		
		System.out.println(new java.sql.Date (date1.getTime()).getTime());
		
		java.util.Date utilDate = new java.util.Date();
	    Timestamp sqlDate = new java.sql.Timestamp(utilDate.getTime());
	    System.out.println("utilDate:" + utilDate);
	    System.out.println("sqlDate:" + sqlDate);*/
		
		Date parsedDate = null;
		
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
		try {
			parsedDate = dateFormat.parse("");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
