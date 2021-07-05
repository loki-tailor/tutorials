package com.okhttp;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

class InvokeGet implements Runnable {

	String url;

	public InvokeGet(String url) {
		
		this.url = url;
	}

	@Override
	public void run() {
		
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder().url(url).build();
		try (Response response = client.newCall(request).execute()) {
			long resTime = response.receivedResponseAtMillis() - response.sentRequestAtMillis();
			int resCode = response.code();
			System.out.println("Thread ID - " + Thread.currentThread().getId() + ", resCode = " + resCode
					+ ", resTime = " + resTime + ", url = " + url);
			if (String.valueOf(resCode).startsWith("4")) {
				throw new Exception("4xx ERROR CAUGHT for ABOVE!!");
			}
			System.out.println("Some other operation in this thread - " + Thread.currentThread().getId());
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			Thread.currentThread().interrupt();
		}
	}

}

public class MainThreads {

	public static void main(String[] args) {
		System.out.println(Calendar.getInstance().getTime());

		String baseUrl = "https://jsonplaceholder.typicode.com/posts/";
		List<Thread> list = new ArrayList<Thread>();
		for (int i = 0; i <= 50; i++) {
			Thread t = new Thread(new InvokeGet(baseUrl + i));
			t.start();
			try {
				list.add(t);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		list.forEach(t -> {
			try {
				t.join();
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		System.out.println(Calendar.getInstance().getTime());
	}
}
