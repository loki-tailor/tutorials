package com.temp;

import java.util.ArrayList;
import java.util.List;

import com.file.MyFile;
import com.google.gson.JsonParser;

public class EventIdExtracting {

	public static void main(String[] args) {
		String readFile = MyFile.readFile("/home/lokesh/Desktop/118.51.003_kintest_1501kintest/run2/temp.json");
		List<String> list = new ArrayList<String>();
		for (String s : readFile.split("\n")) {
			if(list.contains(s)) {
				System.out.println(s);
			} else {
				list.add(s);
			}
			
		}
		System.out.println(list.size());
	}

	public static void readJson(String[] ars) {
		List<String> list = MyFile.readFileAsList("/home/lokesh/Desktop/118.51.003_kintest_1501kintest/run2/temp.json");
		System.out.println(list.size());
		for (String json : list) {
			System.out.println(new JsonParser().parse(json).getAsJsonObject().get("attributes").getAsJsonObject()
					.get("eventid").getAsString());
		}
	}

}
