package com.logics.t3;

import java.time.LocalDate;

public class _3_Test {
    public static void main(String[] args) {
        LocalDate d = LocalDate.parse("1980-10-16");
        System.out.println(d.minusYears(-10));
    }

}

/*-

Explanation
minusYears, minusMonths, minusWeeks, minusDays methods accept long parameter so you can pass either positive or negative value.

If positive value is passed, then that specified value is subtracted and if negative value is passed, then that specified value is added. I think you still remember: minus minus is plus. 



Similarly plusYears, plusMonths, plusWeeks, plusDays methods work in the same manner.

If positive value is passed, then that specified value is added and if negative value is passed, then that specified value is subtracted.

*/