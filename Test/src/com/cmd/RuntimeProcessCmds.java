package com.cmd;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RuntimeProcessCmds {

    public static void main(String[] args) {
	System.out.println("START OF SCRIPT\n");
	System.out.println();
	try {

	    // sudo aws ec2 describe-instances --filters
	    // \"Name=tag:spotinst:aws:ec2:group:name,Values=sp-api.appbazaar.com\" | grep
	    // -i 'PRIVATEIPADDRESSES' | awk '{ print $4 }'

	    String rawCmd = "sudo -i aws ec2";

	    String cmd = new String(rawCmd.getBytes(Charset.defaultCharset()));
	    System.out.println("executing below command:\n" + cmd + "\n");

	    Process process = new ProcessBuilder(cmd.split(" ")).start();
	    process.waitFor();

	    InputStream is = process.exitValue() != 0 ? process.getErrorStream() : process.getInputStream();
	    BufferedReader br = new BufferedReader(new InputStreamReader(is));

	    StringBuilder sb = new StringBuilder();
	    String temp = "";
	    while ((temp = br.readLine()) != null) {
		System.out.println(temp);
	    }

	    br.close();

	} catch (Exception e) {
	    System.out.println("Error while execution commands !!");
	    e.printStackTrace();

	}
	System.out.println("\nEND OF SCRIPT");
    }

    public static Matcher matchedStr(String str, String pattern) {
	Pattern p = Pattern.compile(pattern);
	Matcher m = p.matcher(str);
	return m;
    }

}
