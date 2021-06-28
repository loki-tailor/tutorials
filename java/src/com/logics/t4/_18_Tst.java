package com.logics.t4;

public class _18_Tst {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("SpaceStation");
        sb.delete(5, 6).insert(5, "S").toString().toUpperCase();
        System.out.println(sb);
    }
}

/*-

Explanation
sb - > "SpaceStation"

sb.delete(5, 6) -> "Spacetation"

sb.insert(5, " S") -> "Space Station"

sb.toString() -> Creates a new String object "Space Station"

"Space Station".toUpperCase() -> Creates another String object "SPACE STATION" but the String object is not referred and used.



Method invocation on sb modifies the same object, so after insert(5, " S") method invocation sb refers to "Space Station" and this is printed to the Console.

*/
