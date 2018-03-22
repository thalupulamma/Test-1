package com.javatpoint.fileex;

import java.io.FileWriter;

public class FileWriterExample {

	public static void main(String[] args) {
		try{    
	           FileWriter fw=new FileWriter("testout.txt");    
	           fw.write("Welcome to Primesoft.");    
	           fw.close();    
	          }catch(Exception e){System.out.println(e);}    
	          System.out.println("Success...");    
	     }    
	}

