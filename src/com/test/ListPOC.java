package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPOC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> databaseList = new ArrayList<>();
		List<Integer> incomingList = new ArrayList<>();

		databaseList.add(1);
		databaseList.add(2);
		databaseList.add(3);
		databaseList.add(4);
		databaseList.add(5);
		databaseList.add(6);
		databaseList.add(7);
		databaseList.add(8);
		incomingList.add(1);
		incomingList.add(2);
		incomingList.add(3);
		incomingList.add(4);
		incomingList.add(6);
		incomingList.add(9);
		incomingList.add(10);

		List<Integer> insertList = new ArrayList<>(incomingList);
		insertList.removeAll(databaseList);
		System.out.println(insertList.size());

		List<Integer> updateList = new ArrayList<>(incomingList);
		updateList.removeAll(insertList);
		System.out.println(updateList.size());
		
		System.out.println(Arrays.toString(insertList.toArray())+ " will be insert List");
		System.out.println(Arrays.toString(updateList.toArray())+ " will be update list");

		// C will be Insert Statements
		// D will be Update Statements
	}
	

}
