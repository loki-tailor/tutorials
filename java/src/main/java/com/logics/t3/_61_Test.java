package com.logics.t3;

abstract class Helper {
    int num = 100;
    String operation = null;

    protected abstract void help();

    void log() {
        System.out.println("Helper-Log");
    }
}

public class _61_Test extends Helper {

    private int num = 100;
    protected String operations = "LOGGING";

    // @Override
    /*- void help() { } // compile error: Cannot reduce the visibility of the inherited method from Helper */

    // right option 1:
    // @Override public void help() { System.out.println("LogHelper - Help"); }
    // @Override public void help() { System.out.println("LogHelper - Help"); }

    // right option 2: remove 'protected from parent and keep below as-is'
    // @Override void help() { System.out.println("LogHelper - Help"); }

    // right option 3:
    @Override
    protected void help() {
        System.out.println("LogHelper - Help");
    }

    void log() {
        System.out.println("LogHelper - Log");
    }

    public static void main(String[] args) {
        new _61_Test().help();
    }

}
