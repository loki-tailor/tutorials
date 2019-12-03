package com.mongo;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.file.MyFile;
import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class GetSeqIdBasedOnPackage {

    public static void getSeqIdBasedOnPackage(String[] args) {

	String path = "src/res/temp.json";

	List<String> fetchedPackages = new ArrayList<String>();

	List<String> readFileAsList = MyFile.readFileAsList(path);

	MongoClient mongo = new MongoClient("10.100.3.216", 27017);
	MongoDatabase db = mongo.getDatabase("appbazaar");

	MongoCollection<Document> collection = db.getCollection("apps");

	for (int i = 0; i < readFileAsList.size(); i++) {

	    String packageName = readFileAsList.get(i).trim();

	    if (fetchedPackages.contains(packageName)) {
		continue;
	    }

	    System.out.println(packageName.trim());

	    BasicDBObject basicDBObject = new BasicDBObject();
	    basicDBObject.put("status", "active");
	    basicDBObject.put("package", packageName.trim());

	    Document first = collection.find(basicDBObject).first();

	    if (first != null) {

		Integer seqId = (Integer) first.get("seq_id");

		String data = String.valueOf(seqId) + "," + packageName;
		MyFile.append("src/res/temp-2.csv", data);
		fetchedPackages.add(packageName);
	    }
	}

    }

}
