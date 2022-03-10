package com.javascript_engine;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/*
 * created @ Thu Mar 10 2022 3:59:03 am
 * ref @ https://www.geeksforgeeks.org/nashorn-javascript-engine-in-java-with-examples/F
 */

public class Demo2 {

    public static void main(String[] args) {

        // generate Nashorn JavaScript Engine
        ScriptEngine nashoScriptEngine = new ScriptEngineManager().getEngineByName("Nashorn");
        // System.out.println(nashoScriptEngine);

        // reading javascript file
        try {

            // file path
            FileReader fs = new FileReader("src/main/java/com/javascript_engine/demo1.js");

            // DEBUG: printing contents of js file
            // BufferedReader br = new BufferedReader(fs);
            // System.out.println(fs);
            // String s = "";
            // while ((s = br.readLine()) != null)
            // System.out.println(s);

            // read and execute JS file
            nashoScriptEngine.eval(fs);

        } catch (ScriptException | IOException e) {
            e.printStackTrace();
        }
    }

}
