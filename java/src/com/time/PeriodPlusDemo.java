package com.time;

import java.time.Period;
import java.time.temporal.TemporalAmount;

public class PeriodPlusDemo {
    public static void main(String[] args) {
        Period original = Period.of(2000, 05, 15);

        System.out.println(original);
        System.out.println(original.plus(Period.ofDays(16)));
        System.out.println(original.plus(Period.ofDays(17)));
        
    }
}
