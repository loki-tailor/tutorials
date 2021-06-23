package com.logics.t3;

import java.util.function.Predicate;

public class _26_Test {
    public static void main(String[] args) {
        String[] arr = { "*", "**", "***", "****" };
        // Predicate predicate = s -> s.length() < 4; // compile error
        Predicate<String> p = s -> s.length() < 4;
        print(arr, p);
    }

    private static void print(String[] arr, Predicate<String> p) {
        for (String str : arr) {
            if (p.test(str)) {
                System.out.println(str);
            }
        }
    }
}

/*-

------------
output:
*
**
***

------------

Explanation
Though Predicate is a generic interface but raw type is also allowed. Type of the variable in lambda expression is inferred by the generic type of Predicate<T> interface. 



In this case, Predicate pr1 = s -> s.length() < 4; Predicate is considered of Object type so variable "s" is of Object type and Object class doesn't have length() method. So, s.length() causes compilation error.

*/