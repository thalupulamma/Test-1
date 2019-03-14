package com.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatTest {
	public static void main(String[] argv) {
	    SimpleDateFormat f = new SimpleDateFormat("EEE MMM dd hh:mm:ss zzz yyyy");
	    System.out.println(f.format(new Date()));
	  }
}
