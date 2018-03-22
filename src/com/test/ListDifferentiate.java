package com.test;

import java.util.ArrayList;
import java.util.List;

public class ListDifferentiate {
	public static void main(String[] args) {

		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();

		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		b.add(1);
		b.add(2);
		b.add(3);
		b.add(4);
		b.add(6);

		List<Integer> c = new ArrayList<>(a);
		c.removeAll(b);
		System.out.println(c.size());

		List<Integer> d = new ArrayList<>(a);
		d.removeAll(c);
		System.out.println(d.size());
		
		if (c.contains(1)) {
			System.out.println("Insert Statement for primary key 1");
		} else if (d.contains(1)) {
			System.out.println("Update Statement for primary key 1");
		}

		// C will be Insert Statements
		// D will be Update Statements
	}
}
