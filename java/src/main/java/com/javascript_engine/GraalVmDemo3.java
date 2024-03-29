package com.javascript_engine;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
/*
 * created @ Thu Mar 10 2022 5:32:00 am
 * ref @ https://golb.hplar.ch/2020/04/java-javascript-engine.html
 */

public class GraalVmDemo3 {
    public static void main(String[] args) throws IOException {

        Path jsPath = null;
        jsPath = Paths.get("src/main/java/com/javascript_engine/factorialize.js");
        System.out.println(jsPath.toAbsolutePath().toString());

        /*-
        // Nashorn
        ScriptEngine nashornEngine = new ScriptEngineManager().getEngineByName("nashorn"); // NPE for JDK15+
        try (BufferedReader reader = Files.newBufferedReader(jsPath)) {
            nashornEngine.eval(reader);
        
            Invocable invocable = (Invocable) nashornEngine;
            Object result = invocable.invokeFunction("fibonacci", 1_000);
        
            System.out.println(result);
        } catch (ScriptException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        */

        // GraalVM
        System.setProperty("polyglot.js.nashorn-compat", "true");

        ScriptEngine graalEngine = new ScriptEngineManager().getEngineByName("graal.js");
        try (BufferedReader reader = Files.newBufferedReader(jsPath)) {
            graalEngine.eval(reader);

            Invocable invocable = (Invocable) graalEngine;
            Object result = invocable.invokeFunction("factorialize", 5);

            System.out.println(result);
            System.out.println(result.getClass());
        } catch (ScriptException | NoSuchMethodException e) {
            e.printStackTrace();
        }

    }
}
