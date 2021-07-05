package com.logics.tu;

public class IsSubset {

    static boolean isSubset(int a[], int b[]) {
	int i = 0, j = 0;
	while (i < a.length && j < b.length) {
	    if (a[i] == b[j]) {
		i++;
		j++;

		if (j == b.length) {
		    return true;
		}
	    } else {
		i++;
		j = 0;
	    }
	}

	return false;

    }

    static boolean isSubString(String a, String b) {
	int i = 0, j = 0;
	while (i < a.length() && j < b.length()) {
	    if (a.charAt(i) == b.charAt(j)) {
		i++;
		j++;

		if (j == b.length()) {
		    return true;
		}
	    } else {
		i++;
		j = 0;
	    }
	}

	return false;

    }

    public static void main(String[] args) {
	int set[] = { 1, 2, 3, 4, 5, 6, 7 };
	int subSet[] = { 3, 4, 5, 0 };
	String s = "HelloWorld";
	String ss = "elloW";
	boolean flag = isSubset(set, subSet);
	System.out.println(flag);
	flag = isSubString(s, ss);
	System.out.println(flag);
    }

}
