package com.test;

import java.util.ArrayList;
import java.util.List;

public class StringRemoveTest {

	public static void main(String[] args) {
		 List<String> totalList = new ArrayList<>();
		 List<String> toBeRemovedlist = new ArrayList<>();
		 
		 totalList.add("'THT718G3AUX7'");
		 totalList.add("'RP1F6BDE01KP'");
		 
		 toBeRemovedlist.add("'THT718G3AUX7'");
		 
		 totalList.removeAll(toBeRemovedlist);
		 
		 System.out.println(totalList.size());
		 
	}

}
