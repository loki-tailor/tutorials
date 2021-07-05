package com.okhttp;

import java.io.File;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/*-
	@author lokeshwar @created 09-07-2020

	Testing APK Upload on 'https://developer.appbazaar.com/'
*/

public class IndusDevApi {
    
    public static void main(String[] args) {
	try {
	    OkHttpClient client = new OkHttpClient().newBuilder()
		    .build();
		  MediaType mediaType = MediaType.parse("text/plain");
		  RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
		    .addFormDataPart("file","app-debug.apk",
		      RequestBody.create(MediaType.parse("application/octet-stream"),
		      new File("/home/lokesh/git/tutorials/android/Test/app/build/outputs/apk/debug/app-debug.apk")))
		    .build();
		  Request request = new Request.Builder()
		    .url("http://00.00.0.000/devapi/edit/apk/upgrade?package=com.demo.v12")
		    .method("POST", body)
		    .addHeader("authorization", "Bearer <token_here>")
		    .build();
		  Response response = client.newCall(request).execute();
		  System.out.println(response.body().string());
	} catch(Exception e) {
	    
	}
    }

    public static void generateToken(String[] args) {
	try {

	    String url = "http://00.000.0.000/devapi/auth/token";
	    MediaType mediaType = MediaType.parse("text/plain");
	    RequestBody body = RequestBody.create("", mediaType);

	    String token = "Bearer <access_token>";
	    Request request = new Request.Builder().url(url).post(body).addHeader("Authorization", token).build();

	    Response response = new OkHttpClient().newCall(request).execute();
	    System.out.println(response);
	    System.out.println(response.body().string());

	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

}
