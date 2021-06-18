package com.ssl.demo1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/*
 * created @ Thu Jun 10 2021 8:28:46 am ref @
 */

public class SslCl {
    public static void main(String[] args) {

        SSLSocketFactory sf = null;
        SSLSocket sk = null;
        BufferedReader br = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try {

            // connect to server
            sf = (SSLSocketFactory) SSLSocketFactory.getDefault();
            sk = (SSLSocket) sf.createSocket("localhost", 6017);
            System.out.println("client connected to server...");

            // read data from console            
            br = new BufferedReader(new InputStreamReader(System.in));

            // send data to client
            osw = new OutputStreamWriter(sk.getOutputStream());
            bw = new BufferedWriter(osw);
            String str = null;
            while ((str = br.readLine()) != null) {
                bw.write(str);
                bw.flush();
            }
            System.out.println("data sent to server...");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}