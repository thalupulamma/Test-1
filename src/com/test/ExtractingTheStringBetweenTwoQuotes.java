package com.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
public class ExtractingTheStringBetweenTwoQuotes {
	
	public static void main(String[] args) {
		ExtractingTheStringBetweenTwoQuotes test = new ExtractingTheStringBetweenTwoQuotes();
		List<String> pkIds =  new ArrayList<>();
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					"/home/prime/Migration work/VIMP_21022019/SSAVDCFFLABLES_SDXPROD200_MIG.txt"));
			String line = reader.readLine();
			while (line != null) {
//				System.out.println(line);
				pkIds.add(test.extractPkId(line));
				// read next line
				line = reader.readLine();
				
			}
			reader.close();
			
			System.out.println(pkIds.size());
			test.writeIntoFile(pkIds);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private String extractPkId(String str) {
		String pkId = "";
		try {
			int nine = StringUtils.ordinalIndexOf(str, "'", 9);
			int ten =  StringUtils.ordinalIndexOf(str, "'", 10);
			pkId = str.substring(nine, ten+1);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return pkId;
	}
	
	private void writeIntoFile(List<String> queryList) {
		PrintWriter writer;
		try {
			writer = new PrintWriter("/home/prime/Migration work/PRODPKIDS.txt", "UTF-8");
			for(String q : queryList) {
				writer.println(q);
			}
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
	}
}
