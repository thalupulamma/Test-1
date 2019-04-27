package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

public class SecondMinimum {

	
	public static void main(String args[]){  
		
		Integer secondMinimum;
		
		int[] numberslist = {1,2,3,4,5,1,5,6,7};
		
		
		secondMinimum = findSecondMin(numberslist.clone());
		System.out.println("secondMinimum = "+secondMinimum);
		System.out.println(numberslist.length);
	}

	private static Integer findSecondMin(int[] numberslist) {
		Integer minimumValue = null;
		Arrays.sort(numberslist);
		Integer min = numberslist[0];
		List<Integer> list = new ArrayList<Integer>();  
		//list = Arrays.asList(numberslist);
		return minimumValue;
	}
	
	
	//list.removeAll(Arrays.asList(17));
	//array =list.toArray(new Integer[0]);
	
}
