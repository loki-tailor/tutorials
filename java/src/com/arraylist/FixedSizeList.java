package com.arraylist;

/*- @created 08-02-21

    Ref: Java Doc

    The returned list implements the optional Collection methods, 
    exceptthose that would change the size of the returned list. 
    Those methods leavethe list unchanged and throw UnsupportedOperationException.

    Arrays.asList() returns a fixed-size list
    Arrays.asList() returns a modifiable list
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class FixedSizeList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("loki", "tailor");

        // below will be printed
        System.out.println(list);

        // below will throw run-time exception
        // list.add("lokeshwar");        
        /*- above will give below exception:        
        Exception in thread "main" java.lang.UnsupportedOperationException
                at java.util.AbstractList.add(Unknown Source)
                at java.util.AbstractList.add(Unknown Source)
                at com.arraylist.FixedSizeList.main(FixedSizeList.java:27)        

        */

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next()); // this will printed and then exception
            // list.add("Lokeshwar"); // this will give run-time-exception
        }
    }
}