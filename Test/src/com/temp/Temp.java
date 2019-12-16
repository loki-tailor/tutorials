package com.temp;


public class Temp {

}
// ########################################################################################################################################

/*

// static import java.lang.Integer.*;
// Below compile error comes when above is uncommented and compiled
// com/temp/Temp.java:3: error: class, interface, or enum expected
// static import java.lang.Integer.*;
//        ^

import static java.lang.Integer.*;

class Temp_StaticImportDemo {

	public static void main (String[] args) {
		System.out.println(MAX_VALUE);
		System.out.println(toHexString(16));
	}

} // end of class

*/

// ########################################################################################################################################

/*

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.file.MyFile;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

class Temp_OLD {



    public static void main(String[] args) {
	packageFromBannerAppsDb();	
    }

    public static void packageFromBannerAppsDb() {
	String path = "src/res/temp.json";
	JsonElement parse = new JsonParser().parse(MyFile.readFile(path));
	JsonArray ja = parse.getAsJsonObject().get("packages").getAsJsonArray();

	for (JsonElement je : ja) {
	    System.out.println(je.getAsString());
	}
    }

    public static void nameFromCollectionsApiResponse() {
	String path = "src/res/temp.json";
	JsonElement parse = new JsonParser().parse(MyFile.readFile(path));
	JsonArray ja = parse.getAsJsonObject().get("list").getAsJsonArray();

	for (JsonElement je : ja) {
	    System.out.println(je.getAsJsonObject().get("package").getAsString());
	}
    }

    public static void namefromCollectionDoc() {
	String path = "src/res/temp.json";
	JsonElement parse = new JsonParser().parse(MyFile.readFile(path));
	JsonArray ja = parse.getAsJsonObject().get("data").getAsJsonArray();
	JsonArray ja2 = null;

	for (JsonElement je : ja) {
	    if (je.getAsJsonObject().get("language").getAsString().equals("en-US")) {
		ja2 = je.getAsJsonObject().get("packages").getAsJsonArray();
		break;
	    }
	}

	for (JsonElement je : ja2) {
	    System.out.println(je.getAsJsonObject().get("package").getAsString());
	}

    }

    public static void name() {

	String path = "src/res/temp.json";
	JsonElement parse = new JsonParser().parse(MyFile.readFile(path));
	JsonArray ja = parse.getAsJsonObject().get("collections").getAsJsonArray();

	for (JsonElement je : ja) {
	    System.out.println(je.getAsJsonObject().get("name").getAsString());
	}

    }

    public static void rank() {

	String path = "src/res/temp.json";
	JsonElement parse = new JsonParser().parse(MyFile.readFile(path));
	JsonArray ja = parse.getAsJsonObject().get("collections").getAsJsonArray();

	List<Integer> list = new ArrayList<Integer>();

	for (JsonElement je : ja) {
	    list.add(je.getAsJsonObject().get("rank").getAsInt());
	}

	list.forEach(System.out::println);

	Collections.sort(list);
	System.out.println();

	list.forEach(System.out::println);

    }

}
*/

// ########################################################################################################################################
