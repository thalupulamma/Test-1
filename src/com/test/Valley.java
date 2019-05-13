package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Valley {

	public static void main(String[] args) {
		System.out.println(countingValleys(12, "DDUUDDUDUUUD"));
		//System.out.println(countingValleys(8, "UDDDUDUU"));
	}
	
	static int countingValleys(int n, String s) {
		int count = 0;
		List<Integer> a = new ArrayList<>();
		char[] stringToCharArray = s.toCharArray();
		a.add(count);
		for(int i=0; i<n; i++) {
			if(String.valueOf(stringToCharArray[i]).equals("U")) {
				count = count + 1;
			}else if(String.valueOf(stringToCharArray[i]).equals("D")) {
				count = count - 1;
				a.add(count);
			}
		}
		int c = countOccurrences(a, a.size(), -1);
		
		return c;
    }
	
	static int countOccurrences(List<Integer> arr, int n, int x) 
    { 
        int res = 0; 
        for (int i=0; i<n; i++) 
            if (x == arr.get(i)) 
              res++; 
        return res; 
    } 
}
