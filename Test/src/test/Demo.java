package test;

import java.net.UnknownHostException;
import java.util.Arrays;

public class Demo {

	public static void main(String[] args) throws UnknownHostException {

		// System.out.println(String.format("%2$s", "abc","def"));

//		String iniFilePath = "I:\\IT_WSD\\FIX\\Selenium.Automation\\conf\\Connection.Server.ini";
//
//		System.out.println("java.net.InetAddress.getLocalHost().getHostName() - "
//				+ java.net.InetAddress.getLocalHost().getHostName());
//		System.out.println();
//
//		System.out.println("iniFilePath - " + iniFilePath);
//		System.out.println();
//
//		final String[] iniFile = new String[] { iniFilePath,
//				getHAServerBlockName(java.net.InetAddress.getLocalHost().getHostName()) };
//
//		System.out.println("iniFile - " + Arrays.toString(iniFile));

	}

	public static String getHAServerBlockName(final String hostname) {
		return hostname != null && hostname.contains(".") ? hostname.toLowerCase().substring(0, hostname.indexOf("."))
				: hostname != null ? hostname.toLowerCase() : "";
	}

}
