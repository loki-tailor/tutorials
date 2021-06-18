package com.ssl.demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocket;

/***
 * created @ Thu Jun 10 2021 8:22:41 am ref @
 */

public class SslSv {
    public static void main(String[] args) {

        SSLServerSocketFactory sf = null;
        SSLServerSocket ss = null;
        SSLSocket socket = null;
        BufferedReader br = null;
        try {

            // socket creation
            sf = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
            ss = (SSLServerSocket) sf.createServerSocket(6017);
            System.out.println("server started...");
            socket = (SSLSocket) ss.accept();

            // read data
            String str = null;
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // print data
            while ((str = br.readLine()) != null) {
                System.out.println(str);
                System.out.flush();
            }

            ss.close();
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("data received from cliient..");
    }
}