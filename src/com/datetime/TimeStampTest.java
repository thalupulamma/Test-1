package com.datetime;

import java.sql.Timestamp;
import java.util.Date;

public class TimeStampTest {

	 public static void main(String[] args) {
		 Date currentTimeStamp;
		 currentTimeStamp = new Timestamp(System.currentTimeMillis());
		 System.out.println(currentTimeStamp);
	 }
}
