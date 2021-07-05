package com.logics.t4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class _2_Tst {
    public static void main(String[] args) {
        System.out.println(DateTimeFormatter.ISO_DATE_TIMEF);
        LocalDate date = LocalDate.of(1987, 9, 1);
        String str = date.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(str);
    }
}
