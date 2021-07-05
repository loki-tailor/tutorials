package com.logics.t1._31;

import java.time.LocalTime;

public class _07_b_Test {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(16, 40);
        String amPm = time.getHour() >= 12 ? (time.getHour() == 12) ? "PM" : "AM";
        System.out.println(amPm);
    }
}

/*-
Explanation
This question is on ternary operator (?:). If an expression has multiple ternary operators then number of ? and : should match.

Given expression contains 2 ? and 1 : and hence Compilation Error.
*/