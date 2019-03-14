package com.datetime;

public class DateValidatorTest {
	
	
	public static void main(String[] args) {
		DateValidator dateValidator = new DateValidator();
		boolean result = dateValidator.isThisDateValid("Mon Mar 18 09:00:00 IST 2019", "EEE MMM dd HH:mm:ss ZZZ yyyy");
		System.out.println(result);
	 }
}
