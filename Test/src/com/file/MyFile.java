package com.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class MyFile {

    /*
     * Written by Satish Kumar on Friday 1/7/2016
     * 
     */

    // Use this method to create new file or overwrite all the existing content to
    // write new content passed to the method
    public static void write(String path, String content) {
	try {
	    File file = new File(path);
	    // If file doesn't exists, then create it
	    if (!file.exists()) {
		file.createNewFile();
	    }
	    FileWriter fw = new FileWriter(file.getAbsoluteFile());
	    BufferedWriter bw = new BufferedWriter(fw);
	    // Write in file
	    bw.write(content);
	    // Close connection
	    bw.close();
	} catch (Exception e) {
	    System.out.println(e);
	}
    }

    // Call this method to append data to the existing file
    public static synchronized void append(String path, String content) {
	PrintWriter out = null;
	try {
	    out = new PrintWriter(new BufferedWriter(new FileWriter(path, true)));
	    out.println(content);
	} catch (IOException e) {
	    System.err.println(e);
	} finally {
	    if (out != null) {
		out.close();
	    }
	}
    }

    public static void createDir(final String dirName) {
	try {
	    final File homeDir = new File(System.getProperty("user.home"));
	    final File dir = new File(homeDir, dirName);
	    if (!dir.exists() && !dir.mkdirs()) {
		System.out.println("Couldn't create dir:" + dir.getAbsolutePath());
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    public static String readFile(final String filePath) {
	try {
	    BufferedReader br = new BufferedReader(new FileReader(filePath));
	    StringBuilder sb = new StringBuilder();
	    String line = br.readLine();

	    while (line != null) {
		sb.append(line);
		sb.append(System.lineSeparator());
		line = br.readLine();
	    }
	    br.close();
	    return sb.toString();

	} catch (Exception e) {

	}
	return null;
    }

    public static List<String> readFileAsList(final String filePath) {

	List<String> list = new ArrayList<String>();
	try {
	    BufferedReader br = new BufferedReader(new FileReader(filePath));
	    StringBuilder sb = new StringBuilder();
	    String line = br.readLine();

	    while (line != null) {
		list.add(line);
		line = br.readLine();
	    }
	    br.close();
	    return list;

	} catch (Exception e) {

	}
	return list;
    }

    public static void deleteFile(final String filePath) {
	try {

	    final File file = new File(filePath);
	    if (file.exists() && file.delete()) {
		//System.out.println("Deleted File:" + file.getAbsolutePath());
	    } else {
		//System.out.println("Couldn't delete file:" + file.getAbsolutePath());
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}
