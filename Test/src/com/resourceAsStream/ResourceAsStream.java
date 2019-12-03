package com.resourceAsStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class ResourceAsStream {

	public static void main(String[] args) throws Exception {
		URL resource = ResourceAsStream.class.getResource("/res/commands.sh");
		System.out.println(resource);
		InputStream resource2 = ResourceAsStream.class.getClassLoader().getResourceAsStream("res/commands.sh");
		System.out.println(resource2);

		BufferedReader br = new BufferedReader(new InputStreamReader(resource2));
		String s = "";
		while ((s = br.readLine()) != null) {
			System.out.println(s);
		}
		br.close();

	}

}
