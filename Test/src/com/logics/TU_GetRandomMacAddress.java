package com.logics;

import java.util.Random;

public class TU_GetRandomMacAddress {

    public static void main(String[] argv) throws Exception {
	System.out.println(getRandomMacAddress());
    }// from w w w . j av a2 s.c o m

    public static String getRandomMacAddress() {
	String mac = "";
	Random r = new Random();
	for (int i = 0; i < 6; i++) {
	    int n = r.nextInt(255);
	    mac += String.format("%02x", n) + " ";
	}
	return mac.toUpperCase();
    }

}
