package com.test;

import com.test.http.Client;

public class Terminal {
    public static void main(String[] args) {
        Client client = new Client();
        client.getImage("");
    }
}