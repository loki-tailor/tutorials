package com.logics.t4;

import java.util.ArrayList;
import java.util.List;

public class _24_Test {

    public static void main(String[] args) {
        List<StringBuilder> dryFruits = new ArrayList<>();

        dryFruits.add(new StringBuilder("Walnut"));
        dryFruits.add(new StringBuilder("Apricot"));
        dryFruits.add(new StringBuilder("Almond"));
        dryFruits.add(new StringBuilder("Date"));

        for (int i = 0; i < dryFruits.size(); i++) {
            if (i == 0) {
                dryFruits.remove(new StringBuilder("Almond"));
            }
        }

        System.out.println(dryFruits);
    }

}

/*-

Explanation
In this example, code is trying to remove an item from the list while iterating using traditional for loop so one can think that this code would throw java.util.ConcurrentModificationException.



But note, java.util.ConcurrentModificationException will never be thrown for traditional for loop. It is thrown for for-each loop or while using Iterator/ListIterator.



In this case dryFruits.remove(new StringBuilder("Almond")); will never remove any items from the list as StringBuilder class doesn't override the equals(Object) method of Object class.



StringBuilder instances created at "dryFruits.add(new StringBuilder("Almond"));" and "dryFruits.remove(new StringBuilder("Almond"));" are at different memory locations and equals(Object) method returns false for these instances.
*/
