package com.var;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Demo2 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list = new CopyOnWriteArrayList<>();
		list = new LinkedList<>();

		var list2 = new ArrayList<>();
		list2 = new CopyOnWriteArrayList<>();
		list2 = new LinkedList<>();		
	}
}

/*- compile erro for list 2:

.\com\var\Demo2.java:16: error: incompatible types: cannot infer type arguments for CopyOnWriteArrayList<>
                list2 = new CopyOnWriteArrayList<>();
                                                ^
    reason: no instance(s) of type variable(s) E exist so that CopyOnWriteArrayList<E> conforms to ArrayList<Object>
  where E is a type-variable:
    E extends Object declared in class CopyOnWriteArrayList
.\com\var\Demo2.java:17: error: incompatible types: cannot infer type arguments for LinkedList<>
                list2 = new LinkedList<>();
                                      ^
    reason: no instance(s) of type variable(s) E exist so that LinkedList<E> conforms to ArrayList<Object>
  where E is a type-variable:
    E extends Object declared in class LinkedList
2 errors

*/