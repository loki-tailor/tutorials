package com.logics.t1;

interface ILog {
    default void log() {
        System.out.println("default iLog");
    }

    static void log2() {
        System.out.println("static iLogs");
    }
}

abstract class ALog {

    public static void log() {
        System.out.println("abstract log()");
    }

    public static void log2() {
        System.out.println("abstract log2()");
    }

    abstract void log3();
}

public class _60_Test extends ALog implements ILog {

    @Override
    void log3() {
        // TODO Auto-generated method stub

    }

}
