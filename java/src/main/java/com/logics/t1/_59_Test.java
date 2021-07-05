package com.logics.t1;

public class _59_Test {
    public static void main(String[] args) {
        Boolean[] arr = new Boolean[2];
        List<Boolean> list = new ArrayList<>();
        list.add(arr[0]);
        list.add(arr[1]);

        if (list.remove(0)) {
            list.remove(1);
        }

        System.out.println(list);
    }
}

/*-

Default values are assigned to all array elements. As Boolean is of reference type, hence arr[0] = null and arr[1] = null. After addition list contains [null, null].

list.remove(0) removes and returns the Boolean object referring to null. If expression can specify Boolean type, so no compilation error over here. At this point list contains [null].

For the boolean expression of if-block, Java runtime tries to extract the stored boolean value using booleanValue() method, and this throws an instance of NullPointerException as booleanValue() method is invoked on null reference.



list.remove(0) throws NullPointerException in this case and list.remove(1); is not executed.

*/