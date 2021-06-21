package com.logics.t1;

import java.time.LocalDate;
import java.time.LocalTime;

public class _34_Test {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("1947-08-14");
        LocalTime time = LocalTime.MAX;
        System.out.println(date.atTime(time));
    }

}
