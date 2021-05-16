package com.exceptions_and_errors;

/*-

    @created = 14-05-21
    @ref: https://www.baeldung.com/java-classcastexception-arrays-arraylist#:~:text=Introduction,it%20is%20not%20an%20instance.

*/

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ClassCastExcep {
    public static void main(String... args) {
        String[] strArr = { "Lokeshwar", "Tailor" };
        
        System.out.println(Arrays.asList(strArr));
        System.out.println(Arrays.asList(strArr).getClass().getName());

        ArrayList<String> strList = (ArrayList<String>) Arrays.asList(strArr);
        /*-
            above gives RUNTIME error as:

            Exception in thread "main" java.lang.ClassCastException: java.util.Arrays$ArrayList cannot be cast to java.util.ArrayList
                    at com.exceptions_and_errors.ClassCastExcep.main(ClassCastExcep.java:20)            
        */

        // solution
        // List<String> strList = Arrays.asList(strArray);
    }
}