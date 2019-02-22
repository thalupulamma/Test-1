package com.test;

import java.util.Scanner;

public class JavaLoops {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = 0,b = 0,n = 0;
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
        }
        in.close();
        
        calculate(a,b,n);
	}

	private static void calculate(int a, int b, int n) {
		int count = 0;
		for(int i=0; i<n; i++) {
			
			
		}
		
	}

}
