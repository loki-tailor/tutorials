package com.javascript_engine;
/*
 * created @ Thu Mar 10 2022 4:21:28 am
 * ref @ https://www.geeksforgeeks.org/nashorn-javascript-engine-in-java-with-examples/
 */

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/***
 * passing a variable to a .js file from java and then executing that .js file
 * thru Nashorn JS Engine
 */

public class Demo4 {
    public static void main(String[] args) {

        ScriptEngine engine = new ScriptEngineManager().getEngineByName("Nashorn");

        Bindings bind = engine.getBindings(ScriptContext.ENGINE_SCOPE);

        bind.put("userName", "Lokeshwar Tailor");

        try {
            engine.eval(new FileReader("src/main/java/com/javascript_engine/demo2.js"));
        } catch (FileNotFoundException | ScriptException e) {
            e.printStackTrace();
        }
    }
}
