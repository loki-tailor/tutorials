package com.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class AgeCalculation {

    public static void main(String[] args) throws ParseException {
	String s = "1994-12-23";
	Date date = new SimpleDateFormat("dd-MM-yyyy").parse(s);
	System.out.println(Period.between(LocalDate.parse(s), LocalDate.now()).getYears());

    }
}
