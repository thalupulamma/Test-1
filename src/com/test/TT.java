package com.test;

public class TT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer n = 3;
		/*for(int i = 0; i< n ; i++) {
			System.out.println(F(n));
		}*/
		
		System.out.println(F(n));
	}

	public static Integer F(Integer n) {
		 if (n == 0) return 0;
		 else if (n == 1) return 1;
	       else return F(n-1)+F(n-2);

	}
}
