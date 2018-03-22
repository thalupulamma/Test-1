package com.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class ListAsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> studyLevelVisitIds = new ArrayList<>();
		
		studyLevelVisitIds.add("AAAA");
		studyLevelVisitIds.add("BBBB");
		String filterIds = "'" + StringUtils.join(studyLevelVisitIds, "','") + "'";
		
		System.out.println(filterIds);
	}

}
