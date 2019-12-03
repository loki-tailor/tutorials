package com.mongo;

import java.util.List;

import org.bson.Document;
import org.bson.types.ObjectId;

import com.file.MyFile;
import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.UpdateResult;
import com.redis.Redis;

// db.getCollection('currentdynamiccollections').updateMany({status:'enabled',universe:'samsung', target:'home'},{$set:{status:"disabled"}})

public class UpdateDC {

    public static void main(String[] args) {

	// getObjectIdsOfPresentActiveDC();

	disable();

	// enable(30);

	// Redis.flush();

    }

    public static void enable(int number) {

	String path = "src/res/temp.json";

	List<String> readFileAsList = MyFile.readFileAsList(path);

	for (int i = 0; i < number; i++) {

	    String s = readFileAsList.get(i);

	    MongoClient mongo = new MongoClient("10.100.3.216", 27017);
	    MongoDatabase db = mongo.getDatabase("appbazaar");

	    MongoCollection<Document> collection = db.getCollection("currentdynamiccollections");

	    BasicDBObject basicDBObject = new BasicDBObject();
	    basicDBObject.put("_id", new ObjectId(s));

	    Document document = new Document("$set", new Document("status", "enabled"));

	    UpdateResult updateMany = collection.updateMany(basicDBObject, document);

	    System.out.println(updateMany);
	}

    }

    public static void disable() {

	MongoClient mongo = new MongoClient("10.100.4.216", 27017);
	MongoDatabase db = mongo.getDatabase("appbazaar");

	MongoCollection<Document> collection = db.getCollection("regionaldynamiccollections");

	BasicDBObject basicDBObject = new BasicDBObject();
	basicDBObject.put("status", "enabled");
	basicDBObject.put("universe", "samsung");
	basicDBObject.put("target", "home");
	basicDBObject.put("languages", "en-US");

	Document document = new Document("$set", new Document("status", "disabled"));

	UpdateResult updateMany = collection.updateMany(basicDBObject, document);

	System.out.println(updateMany);

    }

    public static void getObjectIdsOfPresentActiveDC() {
	MongoClient mongo = new MongoClient("10.100.3.216", 27017);
	MongoDatabase db = mongo.getDatabase("appbazaar");

	MongoCollection<Document> collection = db.getCollection("regionaldynamiccollections");

	BasicDBObject basicDBObject = new BasicDBObject();
	basicDBObject.put("status", "enabled");
	basicDBObject.put("universe", "samsung");
	basicDBObject.put("target", "home");
	basicDBObject.put("languages", "en-US");

	FindIterable<Document> find = collection.find(basicDBObject);
	for (Document d : find) {
	    System.out.println(d.get("_id", ObjectId.class));
	}

    }

}
