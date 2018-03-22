package com.javatpoint.fileex;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) {
		try {  
            Writer w = new FileWriter("output.txt");  
            String content = "Primesoft";  
            w.write(content);  
            w.close();  
            System.out.println("Done");  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  

	}

}
