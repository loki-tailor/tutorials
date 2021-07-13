package com.logics.t11._58;

// note: casting is given preference over var-args in method argument resolving

public class Test {

	private static void m(int i) { System.out.print(1); }

	private static void m(int i, int j) { System.out.print(2); }

	private static void m(int... args) { System.out.print(3); }

	private static void m(char... args) { System.out.print(4); }

	public static void main(String... args) {
		m('A'); // 1

		m('A', 'A'); // 2

		m('A', 'A', 'A'); // 4

		m('A', 'A', 'A', 'A'); // 4

		m('A', 'A', 'A', 'A', 'A'); // 4

		m(1, 2, 'A', 4); // 3

		m(1, 'A'); // 2

		m('A', 21); // 2

		m('A', 'B', 'C', 22); // 3

		m('A', 'B', 'C', '2'); // 4

		m(1, 2, 3, 4); // 3
	}
}