package com.logics.tu;

public class RemoveCharFromString {

    public static void main(String[] args) {
	String s = "programming";
	char t[] = s.toCharArray();
	int j = 0, count = 0;

	for (int i = 0; i < t.length; i++) {
	    if (t[i] != 'm') {
		t[j++] = t[i];
	    } else
		count++;
	}
	while (count > 0) {
	    t[j++] = '\0';
	    count--;
	}
	System.out.println(t);
    }

}
