package com.bigO;

import com.logics.Timer;

/***
    @created 06-03-21

    ref = https://www.youtube.com/watch?v=kS_gr2_-ws8
*/

public class Demo3 {
    public static void sum1(Integer n) {
        Integer total = 0;
        for (Integer i = 0; i<n; i++) {
            total += i;
        } // for-end
        System.out.println("Sum of numbers upto n (" + n + ") = " + total);
    } // method end

    public static void sum2(Integer n) {
        Integer total = n * (n+1) / 2;
        System.out.println("Sum of numbers upto n (" + n + ") = " + total);        
    }

    public static void main_for_sumTest(String... args) {
        long startTimer = Timer.startTimer();
        sum1(Integer.valueOf(args[0]));
        String timeDifference = Timer.timeDifference(startTimer,Timer.stopTimer());
        System.out.println(timeDifference);
        System.out.println();

        startTimer = 0;
        timeDifference = null;
        startTimer = Timer.startTimer();
        sum2(Integer.valueOf(args[0]));
        timeDifference = Timer.timeDifference(startTimer,Timer.stopTimer());
        System.out.println(timeDifference);   
        System.out.println();
        System.out.println();     


    }

    // #################################################################################

    public static void countUpAndDown(Integer n) {
        System.out.println("Going Up!");
        for(int i=0; i<n; i++) {
            System.out.print(i);
        }
        System.out.println("\n");

        System.out.println("Going Down!");
        for(int i = n-1; i >=0; i--) {
            System.out.print(i);
        }
        System.out.println("\n");
    }

    public static void main(String... args) {
        long startTimer = Timer.startTimer();
        countUpAndDown(Integer.valueOf(args[0]));
        String timeDifference = Timer.timeDifference(startTimer,Timer.stopTimer());
        System.out.println(timeDifference);
        System.out.println();
    }
} // class end