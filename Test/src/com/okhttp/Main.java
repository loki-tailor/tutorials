package com.okhttp;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Main {

	// references:
	// https://stackoverflow.com/a/43541656

	// 1. Choosing any API to check if the server is up and running will result in
	// discrepancy, if that APIs functionality is broken at random point of testing

	// 2. We can ping a machine using InetAddress
	// source: https://www.javascan.com/195/ping-ip-address-in-java-example

	static OkHttpClient client = new OkHttpClient();
	static long overAllTime = 0;

	public static String run(String url) throws Exception {
		Request request = new Request.Builder().url(url).build();
		try (Response response = client.newCall(request).execute()) {
			long resTime = response.receivedResponseAtMillis() - response.sentRequestAtMillis();
			overAllTime += resTime;
			return String.valueOf(response.code()).concat(", ").concat(String.valueOf((resTime)));
		}
	}

	public static void main(String[] args) throws Exception {

		String baseUrl = "https://jsonplaceholder.typicode.com/posts/";
		for (int i = 1; i <= 5; i++) {
			String url = baseUrl + i;
			String res = run(url);
			System.out.println(res);
			System.out.println();
		}
		System.out.println(overAllTime);

	}

}
