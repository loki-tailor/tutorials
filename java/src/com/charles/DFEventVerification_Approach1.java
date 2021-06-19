package com.charles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.file.FileOps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class DFEventVerification_Approach1 {

    public static void main(String[] args) {

	List<String> eventList = new ArrayList<String>() {
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
	    {
		add("409");
	    }
	};

	String readFile = FileOps.readFile("resources/logs2.json");
	JsonElement je = new JsonParser().parse(readFile);
	JsonArray ja = je.getAsJsonObject().get("charles-session").getAsJsonObject().get("transaction").getAsJsonArray();
	System.out.println("Total Transactions = " + ja.size());
	System.out.println();

	for (String event : eventList) {
	    System.out.println(event + " = " + get_event(ja, "" + event + "").size());
	}

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

	String logsPath = "resources/logs.csv";
	String resultsPath = "resources/results.csv";
	System.out.println();

	// map.get(seqid).forEach(System.out::println);

	for (int i = 0; i < map.size(); i += 1) {

	    String seqid = (String) map.keySet().toArray()[i];
	    System.out.println("SeqId = " + seqid + ", Transactions = " + map.get(seqid).size());

	    for (int j = 0; j < map.get(seqid).size();) {

		String response_event_name = new JsonParser().parse(map.get(seqid).get(j).getAsJsonObject().get("request").getAsJsonObject().get("body").getAsString().replace("\\", "")).getAsJsonObject().get("status").getAsString().trim();
		String response_status_code = map.get(seqid).get(j).getAsJsonObject().get("response").getAsJsonObject().get("_status").getAsString().trim();
		;
		String request_requestTime = map.get(seqid).get(j).getAsJsonObject().get("_requestTimeMillis").getAsString().trim();
		;
		boolean sequencePassStatus = false;

		for (int k = 0; k < eventList.size(); k++) {

		    if (map.get(seqid).get(j).getAsJsonObject().get("request").getAsJsonObject().get("body").getAsString().matches(".*" + eventList.get(k) + ".*")) {

			if (k == 0) {
			    FileOps.append(logsPath, "");
			}

			if (k == eventList.size()) {
			    sequencePassStatus = true;
			}

			FileOps.append(logsPath, i + "." + j + "," + seqid + "," + response_event_name + "," + response_status_code + "," + request_requestTime);
			j++;

		    } // end of event 1
		    else {
			FileOps.append(logsPath, i + "." + j + "," + seqid + "," + response_event_name + "," + response_status_code + "," + request_requestTime);
			j++;
			break;
		    }
		} // loop end - event's lists

		// Record Event Result
		boolean recordResult = j == map.get(seqid).size() ? true : map.get(seqid).get(j).getAsJsonObject().get("request").getAsJsonObject().get("body").getAsString().matches(".*" + eventList.get(0) + ".*");
		if (recordResult) {
		    FileOps.append(resultsPath, i + "," + seqid + "," + response_event_name + "," + sequencePassStatus);
		    sequencePassStatus = false;
		}

	    } // loop end - seqid map.get(i)
	}

    }

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
