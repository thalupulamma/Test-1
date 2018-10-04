package com.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstNonRepeatingChar("abcdegaas"));;
	}
	
	 public static char firstNonRepeatingChar(String word) {
	        Set<Character> repeating = new HashSet<>();
	        List<Character> nonRepeating = new ArrayList<>();
	        for (int i = 0; i < word.length(); i++) {
	            char letter = word.charAt(i);
	            if (repeating.contains(letter)) {
	                continue;
	            }
	            if (nonRepeating.contains(letter)) {
	                nonRepeating.remove((Character) letter);
	                repeating.add(letter);
	            } else {
	                nonRepeating.add(letter);
	            }
	        }
	        return nonRepeating.get(0);
	    }

}
