package com.datetime;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateDemo {
	
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.toString());
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		System.out.println(formatter.format(d));		
	}

}
