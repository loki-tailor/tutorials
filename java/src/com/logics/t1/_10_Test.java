package com.logics.t1;

import java.util.ArrayList;
import java.util.List;

public class _10_Test {

	public static void main(String[] args) {
		List<Character> list = new ArrayList<>();
		list.add(0, 'V');
		list.add('T');
		list.add(1, 'E');
		list.add(3, 'O');

		if (list.contains('O')) {
			list.remove('O');
		}

		for (char ch : list) {
			System.out.print(ch);
		}
	}

}

/***
 * Explanation list.add(0, 'V'); => char 'V' is converted to Character object
 * and stored as the first element in the list. list --> [V].
 * 
 * list.add('T'); => char 'T' is auto-boxed to Character object and stored at
 * the end of the list. list --> [V,T].
 * 
 * list.add(1, 'E'); => char 'E' is auto-boxed to Character object and inserted
 * at index 1 of the list, this shifts T to the right. list --> [V,E,T].
 * 
 * list.add(3, 'O'); => char 'O' is auto-boxed to Character object and added at
 * index 3 of the list. list --> [V,E,T,O].
 * 
 * list.contains('O') => char 'O' is auto-boxed to Character object and as
 * Character class overrides equals(String) method this expression returns true.
 * Control goes inside if-block and executes: list.remove('O');.
 * 
 * 
 * 
 * remove method is overloaded: remove(int) and remove(Object). char can be
 * easily assigned to int so compiler tags remove(int) method.
 * list.remove(<ASCCI value of 'O'>); ASCCI value of 'A' is 65 (this everybody
 * knows) so ASCII value of 'O' will be more than 65.
 * 
 * 
 * 
 * list.remove('O') throws runtime exception, as it tries to remove an item from
 * the index greater than 65 but allowed index is 0 to 3 only.
 */