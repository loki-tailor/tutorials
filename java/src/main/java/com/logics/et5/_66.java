package com.logics.et5;

public class _66 {

	public static String hidePhone(String fullPhoneNo) {

		return new StringBuilder(fullPhoneNo).substring(0, 8) + "xxxx";

//		return new StringBuilder(fullPhoneNo).replace(8, 12, "xxxx").toString();

//		return new StringBuilder(fullPhoneNo).append("xxxx", 8, 12).toString(); // IndexOutOfBoundExcecption

//		return new StringBuilder("xxxx").append(fullPhoneNo, 0, 8).toString();
	}

	public static void main(String[] args) {
		System.out.println(hidePhone("665-412-2525"));

	}
}
