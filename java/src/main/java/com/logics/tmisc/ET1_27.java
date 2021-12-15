package com.logics.tmisc;

public class ET1_27 {
	public static int getSwitch(String str) {
		return (int) Math.round(Double.parseDouble(str.substring(1, str.length() - 1)));
	}

	public static void main(String[] args) {
		switch (getSwitch("--0.50")) {
		case 0:
			System.out.println("Hello ");
		case 1:
			System.out.println("World ");
			break;
		default:
			System.out.println("Good Bye");
		}
	}
}

/*-

str.substring(1, str.length()-1) => "--0.50".substring(1, (6-1) ) => -0.5 Math.round(-0.5) = 0.0 so getSwitch(...) returns 0 if passed an argument of "--0.50". Now, there is no "break" in case 0 of switch. so the control falls through to the next case ( i.e. case 1) after printing Hello. At case 1, it prints World. And since there is a break. default is not executed.  Observe that rounding is a standard mathematical procedure where the number that lies exactly between two numbers always rounds up to the higher one. So .5 rounds to 1 and -.5 rounds to 0.

*/