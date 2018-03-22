package com.test;

public class IdGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer count = 30;
		
		for(int i=0; i< count; i++){
			System.out.println(CustomKeyUtil.generateKey(12));
//			System.out.println("1");
		}
		
	}

}
