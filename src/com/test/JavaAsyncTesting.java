package com.test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class JavaAsyncTesting {
	public static void main(String[] args) throws Exception {
		 FileWriter fw=new FileWriter("/home/prime/testout.txt");    
         fw.write("Welcome to Primesoft.");    
         fw.close(); 
		callMethod();
	}

	private static void callMethod() {
		  
		CompletableFuture.runAsync(() -> {
		 FileWriter fw;
		try {
			int sum = 0;
			fw = new FileWriter("/home/prime/text.txt");
		    for(int i=0; i< 100; i++) {
		    	sum = sum+i;
		    }
		    fw.write(sum);
		    fw.close(); 
		} catch (IOException e) {
			e.printStackTrace();
		}    
		});
		System.out.println("Hello Jan");
	}
}
