package com.logics.tu;

public class Addition {

    public static String sumString(String a, String b) {
	String str = "";
	if (a.length() > b.length()) {
	    String t = a;
	    a = b;
	    b = t;
	}
	int n1 = a.length();
	int n2 = b.length();
	a = new StringBuilder(a).reverse().toString();
	b = new StringBuilder(b).reverse().toString();
	int carry = 0;
	for (int i = 0; i < a.length(); i++) {
	    int sum = ((int) (a.charAt(i) - '0') + (int) (b.charAt(i) - '0') + carry);
	    str += (char) (sum % 10 + '0');

	    // Calculate carry for next step
	    carry = sum / 10;
	}
	for (int i = n1; i < n2; i++) {
	    int sum = ((int) (b.charAt(i) - '0') + carry);
	    str += (char) (sum % 10 + '0');
	    carry = sum / 10;
	}

	if (carry > 0)
	    str += (char) (carry + '0');

	// reverse resultant String
	str = new StringBuilder(str).reverse().toString();
	return str;

    }

    public static void main(String[] args) {

	System.out.println(sumString("12345", "1234"));

    }

}
