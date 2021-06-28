package com.logics.t6;

import java.util.ArrayList;
import java.util.List;

public class _27 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(4);
        list.add(0, "loki");
        list.add(2, "bad data");

        System.out.println(list);
    }
}

/*-

Explanation
ArrayList are different than arrays, though behind the scene ArrayList uses Object[] to store its elements. 



There are 2 things related to ArrayList, one is capacity and another is actual elements stored in the list, returned by size() method. If you don't pass anything to the ArrayList constructor, then default capacity is 10 but this doesn't mean that an ArrayList instance will be created containing 10 elements and all will be initialized to null. 



In fact, size() method will still return 0 for this list. This list still doesn't contain even a single element. You need to use add method or its overloaded counterpart to add items to the list. Even if you want to add null values, you should still invoke some methods, nothing happens automatically.



In this question, new ArrayList<>(4); creates an ArrayList instance which can initially store 4 elements but currently it doesn't store any data. 



Another point you should remember for the certification exam: Addition of elements in ArrayList should be continuous. If you are using add(index, Element) method to add items to the list, then index should be continuous, you simply can't skip any index.



In this case, list.add(0, "Array"); adds "Array" to 0th index. so after this operation list --> [Array].  You can now add at 0th index (existing elements will be shifted right) or you can add at index 1 but not at index 2. list.add(2, "List"); throws an instance of java.lang.IndexOutOfBoundsException.
*/