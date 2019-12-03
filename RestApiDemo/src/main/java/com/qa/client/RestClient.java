package com.qa.client;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.JSONException;

public class RestClient {

    public CloseableHttpResponse get(String url) throws ClientProtocolException, IOException, JSONException {
	CloseableHttpClient HttpClient = HttpClients.createDefault();

	// 1.Get Request
	HttpGet httpget = new HttpGet(url);
	CloseableHttpResponse closeablehttpResponse = HttpClient.execute(httpget);
	return closeablehttpResponse;
    }

    public CloseableHttpResponse get(String url, HashMap<String, String> hashMap) throws ClientProtocolException, IOException, JSONException {
	CloseableHttpClient HttpClient = HttpClients.createDefault();

	// 1.Get Request
	HttpGet httpget = new HttpGet(url);

	for (Map.Entry<String, String> entry : hashMap.entrySet()) {
	    httpget.addHeader(entry.getKey(), entry.getValue());
	}
	CloseableHttpResponse closeablehttpResponse = HttpClient.execute(httpget);
	return closeablehttpResponse;
    }

}
