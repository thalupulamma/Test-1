package com.test;

public class Test1 {

	  public static void methodA(int k)
	   {
		  for(int i = 1; i < 4; i++)
			  for(int j = 1; j < 4; j++)
			    if(i < j)
			       assert i!=j : i; 
		
	   }
	  /* public int methodA(int i) 
	   {
	      System.out.println(i+1); 
	      return i+1; 
	   }*/
	   public static void main(String args[]) 
	   {
	      Test1 X = new Test1();
	      Test1.methodA(5);
	   }
}
