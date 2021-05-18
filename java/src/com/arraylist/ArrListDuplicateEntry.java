package com.arraylist;

/*- @created 14-05-21 */
import java.util.ArrayList;
import java.util.List;

public class ArrListDuplicateEntry {
    public static void main(String... args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(1);
        System.out.println(list1);
    }
}

/*- output: [1, 2, 1] */