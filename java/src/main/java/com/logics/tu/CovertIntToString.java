package com.logics.tu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CovertIntToString {

    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int input = sc.nextInt();
	try {
	    String s = Integer.toString(input);
	    System.out.println("Right");
	} catch (InputMismatchException e) {
	    System.out.println("Wrong");
	}
    }

}
