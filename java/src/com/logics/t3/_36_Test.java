package com.logics.t3;

import java.util.ArrayList;

/*
 * created @ Wed Jun 23 2021 7:32:22 am
 * ref @ 
 */

public class _36_Test {
    public static void main(String[] args) {
        ArrayList<Integer> original = new ArrayList<>();
        original.add(new Integer(10));
        ArrayList<Integer> cloned = (ArrayList<Integer>) original.clone();
        Integer i = cloned.get(0);
        ++i;
        System.out.println(cloned);
    }
}

/*-

Let's see what is happening during execution:

main(String [] args) method goes on to the top of the STACK.

1. ArrayList<Integer> original = new ArrayList<>(); => It creates an ArrayList object [suppose at memory location 15EE00] and variable 'original' refers to it.

2. original.add(new Integer(10)); => It creates an Integer object [suppose at memory location 25AF06] and adds it as a first element of the ArrayList. This means element at 0th index of the ArrayList instance refers to Integer object at the memory location 25AF06.

3. ArrayList<Integer> cloned = (ArrayList<Integer>) original.clone(); => original.clone() creates a new array list object, [suppose at memory location 45BA12] and then it will copy the contents of the ArrayList object stored at [15EE00]. So, cloned contains memory address of the same Integer object.

In this case, original != cloned, but original.get(0) == cloned.get(0). This means both the array lists are created at different memory location but refer to same Integer object. 

4. Integer i1 = cloned.get(0); => cloned.get(0) returns the Integer object stored at the memory location 25AF06 and variable 'i1' refers to it. 

5. ++i1; => As Integer object is immutable, hence ++i1; creates a new Integer object with value 11 and suppose this newly created Integer object is stored at memory location 38AB00. This means variable 'i1' stops referring to Integer object at the memory location 25AF06 and starts referring to Integer object at the memory location 38AB00.

Cloned list stays intact and still refers to Integer object at memory location 25AF06.

6. System.out.println(cloned); => Prints [10] on to the console as cloned contains an element which refers to Integer object containing value 10.

*/