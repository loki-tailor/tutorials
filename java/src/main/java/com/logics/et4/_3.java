package com.logics.et4;

public class _3 {

	static String[] days = { "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday" };

	public static void main(String[] args) {

		int index = 0;

		for (String day : days) {

			if (index == 3) {
				break;
			} else {
				continue;
			}

			index++; // ArrayIndexOutOfBound if "if..else" is not there and we run as-is
			// else if "if..else" is there, the above will give "unreachable code"

			if (days[index].length() > 3) {
				days[index] = day.substring(0, 3);
			}
		}
		System.out.println(days[index]);
	}
}
