package com.mail;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.file.MyFile;

public class Demo2 {

    public static void main(String[] args) throws IOException, ParseException {

	String path = "/home/lokesh/Desktop/emails/email.csv";
	String newPath = "/home/lokesh/Desktop/emails/nemail.csv";

	MyFile.deleteFile(newPath);

	List<String> list = MyFile.readFileAsList(path);
	System.out.println(list.size());

	Queue<String> failureRows = new LinkedList<String>();

	// MyFile.append(newPath, "-" + row);
	// failureRows.clear();
	// continue;

	boolean serverDown = false;
	Long latestFailureTime = null;

	for (String row : list) {

	    if (row.contains("[PROD]")) {

		if (!row.contains("Re:")) {

		    if (row.contains("Hey")) {
			failureRows.add("-" + row);
			continue;
		    } else if (row.contains("Failure")) {

			Date d = new SimpleDateFormat("dd/MM/yyy HH:mm").parse(row.split(",")[5]);
			if (latestFailureTime == null) {
			    latestFailureTime = d.getTime();
			} else {
			    Long diff = d.getTime() - latestFailureTime;

			    if (diff > 1.8e+6) {
				for (String updateRow : failureRows) {
				    if (updateRow.contains("Hey")) {
					MyFile.append(newPath, updateRow);
				    } else if (serverDown && updateRow.contains("Down")) {
					String updatedRow = "NO RECOVERY" + updateRow;
					MyFile.append(newPath, updatedRow);
				    } else {
					String updatedRow = "NO SERVER DOWN" + updateRow;
					MyFile.append(newPath, updatedRow);
				    }

				}
				MyFile.append(newPath, "NO SERVER DOWN" + row);
				failureRows.clear();
				serverDown = false;
			    }
			}

			failureRows.add(row);
			continue;

		    } else if (row.contains("Recovery")) {

			if (serverDown) {

			    for (String updateRow : failureRows) {
				if (updateRow.contains("Hey")) {
				    MyFile.append(newPath, updateRow);
				} else {
				    String updatedRow = "LOGGED RECOVERY" + updateRow;
				    MyFile.append(newPath, updatedRow);
				}
			    }

			    MyFile.append(newPath, "SERVER RECOVERY" + row);
			    failureRows.clear();

			    serverDown = false;
			    continue;

			} else {

			    for (String updateRow : failureRows) {
				if (updateRow.contains("Hey")) {
				    MyFile.append(newPath, updateRow);
				} else {
				    String updatedRow = "NO SERVER DOWN" + updateRow;
				    MyFile.append(newPath, updatedRow);
				}
			    }

			    MyFile.append(newPath, "NO SERVER DOWN" + row);
			    failureRows.clear();
			    continue;
			}

		    } else if (row.contains("Down")) {

			Date d = new SimpleDateFormat("dd/MM/yyy HH:mm").parse(row.split(",")[5]);
			latestFailureTime = d.getTime();
			failureRows.add(row);
			serverDown = true;
			continue;
		    }

		} // end of 'Re:' if

	    } // end of [PROD] if

	} // end of for-loop over rows

	System.out.println(failureRows.size());
	failureRows.forEach(s -> { System.out.println(s);});

    } // end of main

} // end of class
