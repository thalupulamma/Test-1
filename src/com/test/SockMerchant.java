package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SockMerchant {
	public static void main(String[] args) {
		int[] intArray = new int[]{ 1, 1, 3, 1, 2, 1, 3, 3, 3, 3 }; 
		int count = 0;
		int length = intArray.length;
		List<Integer> a = new ArrayList<>();
		//Step 1: Array Sort
		Arrays.sort(intArray); 
		
		//Step 2: Identifying the distinct elements
		Set<Integer> s = new HashSet<Integer> (); 
		for (int i = 0 ; i < length; i++) {
			 s.add(intArray[i]); 
		}
	    // Step 3: No of occurences of unique elements    
		for (Integer temp : s) {
	       a.add(countOccurrences(intArray, length, temp));
	     }
		
		for(int c : a) {
			count = count+(c/2);
		}
		
		System.out.println(count);
	}
	
	
	static int countOccurrences(int arr[], int n, int x) 
    { 
        int res = 0; 
        for (int i=0; i<n; i++) 
            if (x == arr[i]) 
              res++; 
        return res; 
    } 
}
