package com.arrays;

/*-
    @created 14-05-21
*/
public class ArrDefaultValue {
    public static void main(String... args) {
        int[] a = new int[3];
		Integer[] b = new Integer[3];
		for(int i : a)
			System.out.println("primitive int : default value = " + i);

        // NPE since Wrapper clases don't assign default values
		for(int i : b)
			System.out.println("Wrapper Integer  : default value = " + i);	
    }
}
/*-
OUTPUT:

primitive int : default value = 0
primitive int : default value = 0
primitive int : default value = 0
Exception in thread "main" java.lang.NullPointerException
        at com.arrays.ArrDefaultValue.main(ArrDefaultValue.java:14)

*/