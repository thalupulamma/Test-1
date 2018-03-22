package com.test;

import java.util.Scanner;

public class Solution {

   /* public static void main(String[] args) {
        String s = "";
        double d = 0;
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        if(scan.hasNextLine()){
             d = scan.nextDouble();
        }
        if(scan.hasNextLine()){
             s = scan.nextLine();
        }
        if(scan.hasNextLine()){
            s = scan.nextLine();
       }
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }*/
	
	 /*public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("================================");
         for(int i=0;i<3;i++){
        	 if(sc.hasNextLine()){
        		 String s1=sc.next();
                 Integer x=sc.nextInt();
                 System.out.println(s1);
                 System.out.println(x);
        	 }
            
             
             System.out.println(x);
             if(i<2){
            	 sc.nextLine();
             }
             String space1 = "";
             for(int j=0; j< (15- s1.length()); j++){
            	 space1 = space1 + " ";
             }
             if(x.toString().length() < 3){
            	 System.out.println(s1+space1+"0"+x);
             }
             else{
            	 System.out.println(s1+space1+x);
             }
            
             //Complete this line
         }
         System.out.println("================================");

 }*/
	
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i=1; i<= 10; i++){
            System.out.println(N+" x "+i+" = "+(N*i));
        }
    }
}