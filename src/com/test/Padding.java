package com.test;

public class Padding {

	public static void main(String[] args) {
		Integer noOfDigits = 6;
		String format = "%0"+noOfDigits+"d";
		String seqNo = String.format(format, "32");
		System.out.println(seqNo);
	}

}
