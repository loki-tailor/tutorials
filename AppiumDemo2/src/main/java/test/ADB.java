package test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class ADB {

    public static void ga_clearData() {

	String cmdOp = runcommand("adb shell pm clear com.sec.android.app.samsungapps");
	System.out.println(cmdOp);
    }

    public static String runcommand(String command) {
	System.out.println();

	StringBuilder op = new StringBuilder();
	try {
	    String cmd = new String(command.getBytes(Charset.defaultCharset()));
	    System.out.println("$: " + cmd);

	    Process process = new ProcessBuilder(cmd.split(" ")).start();
	    process.waitFor();

	    InputStream is = process.exitValue() != 0 ? process.getErrorStream() : process.getInputStream();
	    BufferedReader br = new BufferedReader(new InputStreamReader(is));

	    StringBuilder sb = new StringBuilder();
	    String temp = "";
	    while ((temp = br.readLine()) != null) {
		op.append(temp);
		op.append("\n");
	    }
	    br.close();

	} catch (Exception e) {
	    e.printStackTrace();
	}
	return op.toString();
    }

}
