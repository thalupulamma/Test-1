package com.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	private static final String FILENAME = "/home/prime/Desktop/studyjsonobjects/studyJSONObjectTZR3JQ.txt";
	
	public String readFile() throws IOException {
	    BufferedReader br = new BufferedReader(new FileReader(FILENAME));
	    try {
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();

	        while (line != null) {
	            sb.append(line);
	            sb.append("\n");
	            line = br.readLine();
	        }
	        return sb.toString();
	    } finally {
	        br.close();
	    }
	}
}




