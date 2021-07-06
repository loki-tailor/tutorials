package com.streams;

import java.util.function.IntPredicate;

/*
 * created @ Tue Jul 06 2021 6:00:06 am
- * ref @ https://dzone.com/articles/java-lambda-method-reference
 */

@FunctionalInterface
interface InumPredicate {
    // boolean check(Demo1 a, int b);

    boolean check(int i);
}

public class MethodRefDemo {
    public static void main(String[] args) {
        Demo1.main(args);
    }
}

// ####################################################################################

class IntPchecker {
    public static boolean isPositive(int n) {
        return n > 0;
    }

    public static boolean isEven(int n) {
        return (n % 2) == 0;
    }
}

class Demo2 {
    public boolean numCheck(InumPredicate p, int n) {
        return p.check(n);
    }

    public static void main(String[] args) {

        Demo2 obj = new Demo2();
        boolean result;
        int num = 10;

        InumPredicate ip1 = n -> (n % 2) == 0;
        result = obj.numCheck(ip1, num);
        System.out.println("1 : " + result);

        result = obj.numCheck(IntPchecker::isEven, num);
        System.out.println("2 : " + result);

        InumPredicate ip2 = n -> n > 0;
        result = obj.numCheck(ip2, -10);
        System.out.println("3 : " + result);

        result = obj.numCheck(IntPchecker::isPositive, -20);
        System.out.println("4 : " + result);
    }
}

// ######################################################################

class Demo1 {
    final private int num;

    public Demo1(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    // check if num is bigger than the input value
    boolean isBigger(int n) {
        return num > n;
    }

    public static void main(String[] args) {

        Demo1 obj = new Demo1(10);

        int numToCompare = 9;

        InumPredicate p = obj::isBigger;

        boolean result = p.check(numToCompare);

        System.out.println(result);
    }
}
