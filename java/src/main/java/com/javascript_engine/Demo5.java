package com.javascript_engine;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/*
 * created @ Thu Mar 10 2022 4:27:29 am
 * ref @ https://www.geeksforgeeks.org/nashorn-javascript-engine-in-java-with-examples/\
 * 
 * calling javascript functions
 */

public class Demo5 {
    public static void main(String[] args) {
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("nashorn");

        try {
            ee.eval(new FileReader("src/main/java/com/javascript_engine/demo3.js"));
        } catch (FileNotFoundException | ScriptException e) {
            e.printStackTrace();
        }

        Invocable invocable = (Invocable) ee;
        try {
            // calling 1st function
            invocable.invokeFunction("func1");

            // call 2nd function with arguments
            invocable.invokeFunction("func2", "lokeshwar  tailor");
        } catch (NoSuchMethodException | ScriptException e) {
            e.printStackTrace();
        }
    }
}
