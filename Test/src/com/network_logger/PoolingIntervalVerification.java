package com.network_logger;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.file.MyFile;

public class PoolingIntervalVerification {

    public static void main(String[] args) throws ParseException {
	ArrayList<String> apis = new ArrayList<String>() {
	    {
		add("/config?");
		add("/updates?");
		add("/clientad/ads?");
	    }
	};

	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");

	String[] dateFldr = new File("resources/pooling").list();

	int input = -1;

	try (Scanner scanner = new Scanner(System.in)) {

	    System.out.println("Select Date Folder: ");

	    while (true) {
		for (int i = 0; i < dateFldr.length; i++) {
		    System.out.println(i + ". " + dateFldr[i]);
		}
		System.out.print("Enter your choice, <Q> to quit: ");
		String userText = scanner.nextLine().trim();
		if (userText.equalsIgnoreCase("q")) {
		    System.out.println("Bye ...");
		    System.exit(0);
		}

		if (userText.matches("(\\d*)")) {
		    input = Integer.valueOf(userText);
		    break;
		}
		System.out.println();
	    } // end of while loop

	} catch (Exception e) {
	    e.printStackTrace();
	}

	String date = dateFldr[input];

	String overAllResultPath = "resources/pooling/" + date + "/results.csv";
	MyFile.deleteFile(overAllResultPath);

	String[] files = new File("resources/pooling/" + date).list();

	for (String fileName : files) {

	    String filePath = "resources/pooling/" + date + "/" + fileName;

	    List<String> fileData = MyFile.readFileAsList(filePath);
	    System.out.println(fileData.size() + " = Number of Lines in file - " + filePath);

	    for (String api : apis) {

		String nlFileName = new File(filePath).getName().replace(".txt", "");

		for (int i = 0; i < fileData.size(); i++) {

		    String line = fileData.get(i);

		    if (line.matches(".*" + api + ".*")) {

			String time = fileData.get(i - 2);
			if (time.contains("Response")) {
			    String[] split = time.split("}");
			    time = split[split.length - 1];
			}
			MyFile.append(overAllResultPath, nlFileName + api + "," + time);
		    }

		} // loop-end fileData

		MyFile.append(overAllResultPath, "");

	    } // end of apis

	} // end-of files

    } // main-end

}// class-end
