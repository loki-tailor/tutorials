package com.logics.t1;

import java.time.Period;

public class _16_Test {
	public static void main(String[] args) {
		Period period = Period.of(0, 0, 0);
		System.out.println(period);
	}
}

/***
 * 
 * Explanation Period.of(0, 0, 0); is equivalent to Period.ZERO. ZERO period is
 * displayed as P0D, other than that, Period components (year, month, day) with
 * 0 values are ignored.
 * 
 * 
 * 
 * toString()'s result starts with P, and for non-zero year, Y is appended; for
 * non-zero month, M is appended; and for non-zero day, D is appended. P,Y,M and
 * D are in upper case.
 * 
 * 
 * 
 * NOTE: Period.parse(CharSequence) method accepts the String parameter in
 * "PnYnMnD" format, over here P,Y,M and D can be in any case.
 * 
 */