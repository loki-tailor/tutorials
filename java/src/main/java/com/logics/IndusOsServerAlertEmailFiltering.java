package com.logics;

import java.util.List;

import com.file.FileOps;

public class IndusOsServerAlertEmailFiltering {

    public static void main(String[] args) {
	List<String> readFileAsList = FileOps.readFileAsList("/home/lokesh/Desktop/temp.txt");
	for (String s : readFileAsList) {

	    String day = s.substring(0, 2);
	    String month = s.substring(3, 5);
	    String year = s.substring(6, 10);
	    String time = s.split(" ")[1];

	    String date = month + "/" + day + "/" + year + " " + time;
	    System.out.println(date);

	}
    }

}
