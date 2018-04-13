package com.test;

import java.io.*;
 
public class FileReadingWithLine
{
    public static void main(String[] args) throws IOException 
    {
        // PrintWriter object for output.txt
        PrintWriter pw = new PrintWriter("/home/prime/Documents/text1.txt");
         
        // BufferedReader object for input.txt
        BufferedReader br1 = new BufferedReader(new FileReader("/home/prime/Documents/text.txt"));
         
        String line1 = br1.readLine();
         
        // loop for each line of input.txt
        while(line1 != null)
        {
            if(line1.length() > 5) {
            	line1 = line1.substring(5);
            }
           
            pw.println(line1);
             
            line1 = br1.readLine();
        }
         
        pw.flush();
         
        // closing resources
        br1.close();
        pw.close();
         
        System.out.println("File operation performed successfully");
    }
}