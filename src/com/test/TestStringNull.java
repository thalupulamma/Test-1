package com.test;

public class TestStringNull {
	public static void main(String[] args) {
		String s1 = null;
		System.out.println(s1);
		System.out.println(isNullOrEmpty(s1));
				
	}


	public static boolean isNullOrEmpty(String x) {
	  return (x == null || x.isEmpty());
	}

}
