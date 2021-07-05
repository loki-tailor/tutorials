package com.httpclient;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.concurrent.CompletableFuture;

public class Demo1 {

    public static void main(String[] args) {

        // HttpClient - sendAsync

        HttpClient httpClient = HttpClient.newBuilder().version(Version.HTTP_2).build();

        HttpRequest req = HttpRequest.newBuilder(URI.create("https://google.com")).GET().build();

        CompletableFuture<HttpResponse<String>> resFuture = httpClient.sendAsync(req, BodyHandlers.ofString());

        resFuture.thenAccept(res -> System.out.println(res));
        resFuture.join();

    }

    public static void one(String[] args) throws Exception {

        // HttpClient - send

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpRequest req = HttpRequest.newBuilder(URI.create("https://pluralsight.com")).GET().build();

        HttpResponse<String> res = httpClient.send(req, BodyHandlers.ofString());

        System.out.println(res.headers().map());
    }

}
