package com.logics.sierra_book.ST_ch6._17;

/*- @created = 17-05-21 */

import java.util.*;

public class Baking {
    public static void main(String[] args) {
        ArrayList<String> steps = new ArrayList<String>();
        steps.add("knead");
        steps.add("oil pan");
        steps.add("turn on oven");
        steps.add("roll");
        steps.add("turn on oven");
        steps.add("bake");
        System.out.println(steps);
    }
}

// output: [knead, oil pan, turn on oven, roll, turn on oven, bake]

// duplicate values are allowed in a ArrayList

// we can directly do a sysout on an ArrayList