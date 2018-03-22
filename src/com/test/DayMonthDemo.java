package com.test;

public class DayMonthDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt("69");
		int days = num%30;
		int month = num/30;
		System.out.println(days);
		System.out.println(month);
	}

}
