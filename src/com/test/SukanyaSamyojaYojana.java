package com.test;

public class SukanyaSamyojaYojana {

	public static void main(String[] args) {
		int principal = 150000;
		int interest = 8;
		int totalInt = 0;
		
		totalInt = (principal*1*interest)/100;
		for(int i=0; i<21; i++) {
			totalInt = (principal*1*interest)/100;
			principal = principal+totalInt;
		}
		System.out.println(principal);
	}

}
