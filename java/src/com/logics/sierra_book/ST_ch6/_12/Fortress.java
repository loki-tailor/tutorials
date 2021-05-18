package com.logics.sierra_book.ST_ch6._12;

/*- @created 17-05-21 */

import java.util.*;

public class Fortress {
    
    private String name;
    private ArrayList<Integer> list;
    
    Fortress() { list = new ArrayList<>(); }
    
    String getName() { return name; }
    
    void addToLiist(int x) { list.add(x); }

    ArrayList getList() { return list; } // line 9: this line breaks encapsulation

    // When encapsulating a mutable object like an ArrayList, your getter must return 
    // a reference to a copy of the object, not just the reference to the original object
}