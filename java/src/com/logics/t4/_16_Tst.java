package com.logics.t4;

public class _16_Tst {

    static Double d1;
    static int i = 0;

    static {
        try {
            i = d1.intValue();
        } catch (Exception e) {
            System.out.println("inside exception catch..");
        } catch (ExceptionInInitializerError e) {
            System.out.println("initializer-error caught...");
        } finally {
            System.out.println("finally block in static blocck try...catch");
        }
    }

    public static void main(String[] args) {

        System.out.println("HELLOW");

    }
}
