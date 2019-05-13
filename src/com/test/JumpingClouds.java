package com.test;

import java.util.ArrayList;
import java.util.List;

public class JumpingClouds {

	public static void main(String[] args) {
		//int[] intArray = new int[]{ 0, 0, 1, 0, 0, 1, 0 }; // op-4
		int[] intArray = new int[]{ 0, 0, 0, 0, 1, 0}; // op-3
		
		List<Integer> zerosIndex = countOccurrences(intArray, intArray.length, 0);
		//List<Integer> onessIndex = countOccurrences(intArray, intArray.length, 1);
		int count = 0;
		for(int i=0; i< intArray.length-1; i++) {
			if(zerosIndex.contains(i)) {
				count = count +1 ;
			}
			if(zerosIndex.contains(i) && zerosIndex.contains(i+1) && zerosIndex.contains(i+2)) {
				i = i+1;
			}
			/*if(zerosIndex.contains(i) && zerosIndex.contains(i+1)){
				count = count;
			}else if(zerosIndex.contains(i)){
				count = count +1 ;
			}*/
			/*if((i+1)<intArray.length && zerosIndex.contains(i) && zerosIndex.contains(i+1)) {
				count = count-1;
			}else if(zerosIndex.contains(i)) {
				count = count +1 ;
			}*/
		}
		
		System.out.println(count);
		//System.out.println(zerosIndex.size()-1);
		
	}

	
	static List<Integer> countOccurrences(int arr[], int n, int x) 
    { 
        List<Integer> indexList = new ArrayList<>();
        for (int i=0; i<n; i++) 
            if (x == arr[i]) 
            	indexList.add(i);
        return indexList; 
    } 
	
	
	
}
