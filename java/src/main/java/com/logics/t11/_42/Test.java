package com.logics.t11._42;

public class Test {
    public static void main(String[] args) {
        
        args[1] = "Day!"; // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 1
                          // out of bounds for length 1

        System.out.println(args[0] + " " + args[1]);
    }
}

/*-

Runtime Exception

public static void main(String[] args) method is invoked by JVM.

Variable args is initialized and assigned with Program arguments. For example,

java Test: args refers to String [] of size 0.

java Test Hello: args refers to String [] of size 1 and 1st array element refers to "Hello"

java Test 1 2 3: args refers to String [] of size 3 and 1st array element refers to "1", 2nd array element refers to "2" and 3rd array element refers to "3".



Command used in this question: java Test Good, so args refers to String[] of size 1 and element at 0th index is "Good".

args[1] = "Day!"; is trying to access 2nd array element at index 1, which is not available and hence an exception is thrown at runtime.

*/
