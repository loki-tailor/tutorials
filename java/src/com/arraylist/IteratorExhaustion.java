package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
/*- @created 08-02-21  

    Iterator Exhaustion might be used when, we have
    > 1st iteration to be terminated if certain condition is met
    > 2nd iteration should resume where 1st iteration has left :)

*/
import java.util.List;

public class IteratorExhaustion {
    public static void main(String[] args) {
    List<String> list = new ArrayList<>();
        list.add("loki");
        list.add("tailor");


        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {            
            System.out.println(iterator.next());
        }  

        // this loop won't execute since interator is exhausted
        // will have to fetch new iterator
        while(iterator.hasNext()) {            
            System.out.println(iterator.next());
        }    

        System.out.println(list);              
    }
}

/*- OUTPUT
loki
tailor
[loki, tailor]
*/