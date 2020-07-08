package com.strings;

import java.util.Scanner;

public class ReverseSentence {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	String temp[] = s.split(" ");
	for (int i = temp.length - 1; i >= 0; i--) {
	    System.out.print(temp[i] + " ");
	}

    }

}
