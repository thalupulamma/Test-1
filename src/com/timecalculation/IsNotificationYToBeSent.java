package com.timecalculation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class IsNotificationYToBeSent {

	public static void main(String[] args) {
        System.out.println(determineNotificationSentOrNot("12:45 PM", 60));
	}
	
	private static Boolean determineNotificationSentOrNot(String Time, Integer notificationTime) {
		
		Boolean result = Boolean.FALSE;
		Date date = null;
		try {
			
			Date todayDate = Calendar.getInstance().getTime();

    	    // Display a date in day, month, year format
    	    DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    	    String today = formatter.format(todayDate);
    	    String eventScheduleDateTimeString = today+" "+Time;
    	    
    	    
    	    DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm aa");
    	    date= df.parse(eventScheduleDateTimeString);
    	    
    	     // Calculating Notification Schedule Time
    	     Calendar cal = Calendar.getInstance();
	    	 cal.setTime(date);
	    	 cal.add(Calendar.MINUTE, -notificationTime);
	    	 Date notificationScheduleTime = cal.getTime();
    	    
	    	 System.out.println(notificationScheduleTime);
	    	 
	    	 // Converting Notification Schedule Time in milli seconds
	    	 long notificationScheduleTimeMilliSeconds = notificationScheduleTime.getTime();
	    	 
			// Calculating current instatnce in milli seconds 
			Calendar currentTime = Calendar.getInstance();
			long currentTimeMilliSeconds = currentTime.getTimeInMillis();
			
			System.out.println(currentTimeMilliSeconds);
			System.out.println(notificationScheduleTimeMilliSeconds);
			
			if(notificationScheduleTimeMilliSeconds <= currentTimeMilliSeconds) {
				result = Boolean.TRUE;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
