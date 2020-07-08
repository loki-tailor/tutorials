package com.charles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.file.MyFile;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class DFEventVerification_Approach2 {

    public static void main(String[] args) {

	List<String> eventList = new ArrayList<String>() {
	    /**
	     * 
	     */
	    private static final long serialVersionUID = -1946809384846416856L;

	    {
		add("install_clicked");
		add("download_enqueued");
		add("download_url_requested");
		add("download_url_received");
		add("download_started");
		add("download_completed");
		add("install_started");
		add("app_installed");
	    }
	};

	List<String> ignoreStatusCode = new ArrayList<String>() {
	    /**
	     * 
	     */
	    private static final long serialVersionUID = 2979670812013742150L;

	    {
		add("409");
	    }
	};

	// Read File
	String readFile = MyFile.readFile("resources/charles/logs1.json");
	JsonElement je = new JsonParser().parse(readFile);
	JsonArray ja = je.getAsJsonObject().get("charles-session").getAsJsonObject().get("transaction").getAsJsonArray();
	System.out.println("Total Transactions = " + ja.size());
	System.out.println();

	// Print number of each event count
	for (String event : eventList) {
	    System.out.println(event + " = " + get_event(ja, "" + event + "").size());
	}

	// Map each event to it's sequence ID
	Map<String, List<JsonElement>> map = new HashMap<>();
	int transactionCountExcludingErrorCodes = 0;
	for (JsonElement thisJe : ja) {
	    String headerKey = thisJe.getAsJsonObject().get("request").getAsJsonObject().has("headers") ? "headers" : "wheaders";
	    String seq_id = thisJe.getAsJsonObject().get("request").getAsJsonObject().get(headerKey).getAsJsonObject().get("first-line").getAsString().split("/procure/")[1].split("HTTP")[0].replace(" ", "").trim();
	    if (!map.containsKey(seq_id)) {
		map.put(seq_id, new ArrayList<JsonElement>());
	    }

	    String response_status_code = thisJe.getAsJsonObject().get("response").getAsJsonObject().get("_status").getAsString();
	    if (!ignoreStatusCode.contains(response_status_code)) {
		map.get(seq_id).add(thisJe);
		transactionCountExcludingErrorCodes++;
	    }
	}

	System.out.println();
	System.out.println("Transactions = " + transactionCountExcludingErrorCodes + ", Ignoring Status Codes = " + ignoreStatusCode);

	map.keySet().forEach(key -> {
	    System.out.println("Transactions for " + key + " = " + map.get(key).size());
	});

	// Split each sequence_id -> each events based on install_clicked

	Map<String, Map<Integer, List<JsonElement>>> map_seqId_events = new HashMap<>();

	for (String seq_id : map.keySet()) {

	    Map<Integer, List<JsonElement>> thisSeqIdData = new HashMap<>();
	    int eventGroupcount = -1;

	    for (JsonElement tempJe : map.get(seq_id)) {

		if (tempJe.getAsJsonObject().get("request").getAsJsonObject().get("body").getAsString().matches(".*" + eventList.get(0) + ".*")) {

		    eventGroupcount++;
		    thisSeqIdData.put(eventGroupcount, new ArrayList<JsonElement>());

		}

		thisSeqIdData.get(eventGroupcount).add(tempJe);

	    }

	    map_seqId_events.put(seq_id, thisSeqIdData);
	} // loop-end

	String logsPath = "resources/charles/logs.csv";
	String resultsPath = "resources/charles/results.csv";
	MyFile.deleteFile(logsPath);
	MyFile.deleteFile(resultsPath);

	MyFile.append(logsPath, "seq_id,event_name,status_code,_requestTimeMillis");
	MyFile.append(resultsPath, "event_no,seq_id,last_event,result");

	for (String seqid : map_seqId_events.keySet()) {

	    Map<Integer, List<JsonElement>> map_seqId_eventList = map_seqId_events.get(seqid);

	    for (Integer eventNo : map_seqId_eventList.keySet()) {

		List<JsonElement> eventList_je = map_seqId_eventList.get(eventNo);

		List<String> actualEventList = new ArrayList<String>();
		String response_event_name = null;

		for (JsonElement tempJe : eventList_je) {

		    response_event_name = new JsonParser().parse(tempJe.getAsJsonObject().get("request").getAsJsonObject().get("body").getAsString().replace("\\", "")).getAsJsonObject().get("status").getAsString().trim();
		    String response_status_code = tempJe.getAsJsonObject().get("response").getAsJsonObject().get("_status").getAsString().trim();
		    String request_requestTime = tempJe.getAsJsonObject().get("_requestTimeMillis").getAsString().trim();
		    MyFile.append(logsPath, seqid + "," + response_event_name + "," + response_status_code + "," + request_requestTime);

		    actualEventList.add(response_event_name);
		}

		MyFile.append(resultsPath, eventNo + "," + seqid + "," + response_event_name + "," + actualEventList.equals(eventList));
		MyFile.append(logsPath, "");
	    }
	}

	System.out.println();
	System.out.println(MyFile.readFile(resultsPath));

    } // method-end

    public static List<String> get_event(JsonArray ja, String event) {

	List<String> tmpList = new ArrayList<String>();

	for (JsonElement je : ja) {
	    if (je.getAsJsonObject().get("request").getAsJsonObject().get("body").getAsString().matches(".*" + event + ".*")) {
		String headerKey = je.getAsJsonObject().get("request").getAsJsonObject().has("headers") ? "headers" : "wheaders";
		String requestUrl = je.getAsJsonObject().get("request").getAsJsonObject().get(headerKey).getAsJsonObject().get("first-line").getAsString();
		String seqId = requestUrl.split("/procure/")[1].split("HTTP")[0].replace(" ", "").trim();
		tmpList.add(seqId);
	    }
	}

	return tmpList;

    }
}
