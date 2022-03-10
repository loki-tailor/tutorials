package com.javascript_engine;
/*
 * created @ Thu Mar 10 2022 4:32:23 am
 * ref @ https://golb.hplar.ch/2020/04/java-javascript-engine.html
 * 
 * This example will no longer run on Java 15+, so we switch to the
 * 
 * JavaScript Engine
 * JDK-6 = Rhino
 * JDK-8 = Nashorn
 * JDK-11 = Nashorn (deprecated)
 * JDK-15+ = GraalVM (maven)
 */

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class GraalVmDemo1 {
    public static void main(String[] args) {
        try {
            ScriptEngine engine = new ScriptEngineManager().getEngineByName("graal.js");

            engine.eval("print('Hello World!');");
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}
