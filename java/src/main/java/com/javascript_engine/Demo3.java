package com.javascript_engine;
/*
 * created @ Thu Mar 10 2022 4:17:34 am
 * ref @ https://www.geeksforgeeks.org/nashorn-javascript-engine-in-java-with-examples/
 */

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Demo3 {
    public static void main(String[] args) {

        // generate Nashorn JavaScript Engine
        ScriptEngine nashEngine = new ScriptEngineManager().getEngineByName("Nashorn");

        try {
            nashEngine.eval(
                    "print('Hello World, directly from JavaScript code within the .java file with help of \"Nashorn Engine\"');");
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}
