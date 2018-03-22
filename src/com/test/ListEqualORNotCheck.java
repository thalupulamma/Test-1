package com.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListEqualORNotCheck {

	public static void main(String[] args) {
		List<String> a = new ArrayList<>();
		List<String> b = new ArrayList<>();
		
		Boolean result = listEqualsNoOrder(a, b);
		System.out.println(result);
	}
	
	public static <T> boolean listEqualsNoOrder(List<T> l1, List<T> l2) {
		 final Set<T> s1 = new HashSet<>(l1);
		 final Set<T> s2 = new HashSet<>(l2);
		 
		 return s1.equals(s2);
	}
}
