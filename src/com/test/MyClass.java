package com.test;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class MyClass implements Job{
	
	static int i = 1;
	
	/*public static void main(String args[]) {
		print100();
	}*/
	
	private static void print1(){
		System.out.println(i++);
	}
	
	private static void print3(){
		print1();
		print1();
		print1();
	}
	
	private static void print10(){
		print3();
		print3();
		print3();
		print1();
	}
	
	private static void print30(){
		print10();
		print10();
		print10();
	}
	
	private static void print100(){
		print30();
		print30();
		print30();
		print10();
	}

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		// TODO Auto-generated method stub
		print100();
	}
}
