package com.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class EpochToDateFromatter {

    public static String getDate(long ecpochDAte) {
	Date date = new Date(ecpochDAte);
	DateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS_zz");
	format.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
	String formatted = format.format(date);
	return formatted;
    }
    
    public static void main(String[] args) {
	System.out.println(getDate(Calendar.getInstance().getTimeInMillis()));
    }

}
