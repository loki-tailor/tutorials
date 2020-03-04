package com.demo.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;

/*'
    Sample output :-

    2020-03-02 12:04:17.987 28007-28042/com.demo.test I/System.out: @Parameterized.Parameters - START
    2020-03-02 12:04:17.987 28007-28042/com.demo.test I/System.out: @Parameterized.Parameters - END
    2020-03-02 12:04:18.010 28007-28042/com.demo.test I/System.out: @BeforeClass - START
    2020-03-02 12:04:18.010 28007-28042/com.demo.test I/System.out: Inside 'void initialization()'
    2020-03-02 12:04:18.010 28007-28042/com.demo.test I/System.out: @BeforeClass - END
    2020-03-02 12:04:18.021 28007-28042/com.demo.test I/System.out: @Test - START
    2020-03-02 12:04:18.021 28007-28042/com.demo.test I/System.out: @Test - END
    2020-03-02 12:04:18.038 28007-28042/com.demo.test I/System.out: @Test - START
    2020-03-02 12:04:18.038 28007-28042/com.demo.test I/System.out: @Test - END
*/

@RunWith(Parameterized.class)
public class JUnitDemos {

    private static int totalCycles = 2;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        System.out.println("@Parameterized.Parameters - START");
        //initialization(); commented here, since it's called in @BeforeClass
        Collection<Object[]> resultCollection = new ArrayList<>();
        for (int i=0;i<totalCycles;i++) {
            resultCollection.add(new Object[]{});
        }
        System.out.println("@Parameterized.Parameters - END");
        return resultCollection;
    }

    @BeforeClass
    public static void initialization() {
        System.out.println("@BeforeClass - START");
        System.out.println("Inside 'void initialization()'");
        System.out.println("@BeforeClass - END");
    }

    @Test
    public void welcomeWizardTest() {
        System.out.println("@Test - START");
        System.out.println("@Test - END");
    }
}