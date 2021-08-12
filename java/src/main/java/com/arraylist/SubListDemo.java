package com.arraylist;
/*
 * created @ Fri Aug 06 2021 8:12:20 am
 * ref @ 
 */

import java.util.List;
import java.util.ArrayList;

public class SubListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("P");
        list.add("O");
        list.add("T");
        System.out.println("list @ " + list);

        List<String> subList = list.subList(1, 2);
        System.out.println("sublist @ " + subList);

        subList.set(0, "E");
        System.out.println("list after @ subList.set(0, \"E\") @ " + list);
        System.out.println("sublist after @ subList.set(0, \"E\") @ " + subList);

        // add to original list an itme
        // list.add("S");
        // System.out.println("list after @ list.add('S') @ " + list);
        // System.out.println("subList after @ list.add('S') @ " + subList); : java.util.ConcurrentModificationException

        // add to sub-list : no errors :P
        subList.add("S");
        System.out.println("list after @ subList.add('S') @ " + list);
        System.out.println("subList after @ subList.add('S') @ " + subList); 
        
        subList.clear(); // no error
        System.out.println("list after @ subList.clear() @ "  + list);
        System.out.println("subList after @ subList.clear() @ "  + subList);
    }
}
