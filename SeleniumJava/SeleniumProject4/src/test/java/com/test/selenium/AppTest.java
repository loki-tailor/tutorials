package com.test.selenium;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest

{
    /**
     * Create the test case
     *
     * @param testName
     *            name of the test case
     */
    @BeforeMethod
    public AppTest() {
	System.out.println("Beforetest");
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
	return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
	assertTrue(true);
    }
}
