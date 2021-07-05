package com.so;

import java.util.ArrayList;

/*- @created 08-02-20 @ref = https://stackoverflow.com/questions/8189466/why-am-i-not-getting-a-java-util-concurrentmodificationexception-in-this-example 
*/

import java.util.List;

public class RemoveListElementDemo {    
    private static final List<Integer> integerList;

    static {
        integerList = new ArrayList<Integer>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
    }

    public static void remove(Integer toRemove) {
        for(Integer integer : integerList) {
            if(integer.equals(toRemove)) {                
                integerList.remove(integer);
            }
        }
    }

    public static void main(String... args) {                
        remove(Integer.valueOf(2));

        Integer toRemove = Integer.valueOf(3);
        for(Integer integer : integerList) {
            if(integer.equals(toRemove)) {                
                integerList.remove(integer);
            }
        }
    }
}