package com.arraylist;

/*- @created 08-02-21

    Ref: Java Doc

    The iterators returned by this class's iterator and listIterator methods are fail-fast:
        if the list is structurally modified at any time after the iterator iscreated, 
        in any way except through the iterator's own remove or add methods, the iterator will 
        throw a ConcurrentModificationException. Thus, in the face ofconcurrent modification, 
        the iterator fails quickly and cleanly, ratherthan risking arbitrary, non-deterministic 
        behavior at an undeterminedtime in the future. 
    
    Note that the fail-fast behavior of an iterator cannot be guaranteedas it is, 
    generally speaking, impossible to make any hard guarantees in thepresence of unsynchronized concurrent modification. 
    Fail-fast iteratorsthrow ConcurrentModificationException on a best-effort basis.
    Therefore, it would be wrong to write a program that depended on this exception for its correctness: 
    the fail-fast behavior of iteratorsshould be used only to detect bugs. 

*/

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class FailFastIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("loki");
        list.add("tailor");


        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {            
            System.out.println(iterator.next());
            
            // #1            
            // when both are uncommented
            // modCount becomes 4 ConcurrentModificationException
            // that resutls in 
            // list.add("lokeshwar"); 
            // list.remove(0); 

            // #2
            // when only remove is performed on iteartor            
            list.remove(0); 


        }
        
    }
}

/*-
OUTPUT:

loki
Exception in thread "main" java.util.ConcurrentModificationException
        at java.util.ArrayList$Itr.checkForComodification(Unknown Source)
        at java.util.ArrayList$Itr.next(Unknown Source)
        at com.arraylist.FailFastIterator.main(FailFastIterator.java:36)

*/        