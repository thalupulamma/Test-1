package com.test;

import java.math.BigInteger;

public class DoubleDoubleTestWithBigInteger {

	public static void main(String[] args) {
		
		Integer  i= 64;
		BigInteger op =   new BigInteger("1"); 
		for(Integer k=1; k<=i; k++){
			op = op.multiply(new BigInteger("2"));
			System.out.println(op);
		}
	}

}
