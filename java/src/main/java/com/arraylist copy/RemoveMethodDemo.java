package com.arraylist;

import java.util.ArrayList;

/*- @created 09-02-21
 * 
 * @ref: https://www.youtube.com/watch?v=4NshxkCx5ac
 */

public class RemoveMethodDemo {
	public static void main(String... args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(100);
		list.add(200);
		
		// below will throw RuntimeException
		// since it's trying to remove value present @ index 100th. :)
		list.remove(100);
		
		// below will actually call the remove(Object) method
		// list.remove(Integer.valueOf(100));
		
		System.out.println(list);
		
	}
}
