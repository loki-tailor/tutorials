package com.test;


public class TestDemo {

    @org.junit.jupiter.api.Test
    public void demoTestJunit5() {
        System.out.println("junit5 demo test..");
        org.junit.jupiter.api.Assertions.assertFalse(false);
    }

    /*-
    below is for JUnit4
    @org.junit.Test
    public void demoTest() {
        System.out.println("demo test");
        org.junit.Assert.assertFalse(false);
    }
    */
}
 