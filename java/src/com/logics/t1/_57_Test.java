package com.logics.t1;

public class _57_Test {
    public static void main(String[] args) {
        int a = 7;
        boolean res = a++ == 7 && ++a == 9 || a++ == 9;
        System.out.println("a = " + a);
        System.out.println("res = " + res);
    }
}

/*-
On the same logic, if you check the explanation of your question:

boolean res = a++ == 7 && ++a == 9 || a++ == 9;

= (a++) == 7 && ++a == 9 || (a++) == 9;

= (a++) == 7 && (++a) == 9 || (a++) == 9;

= ((a++) == 7) && ((++a) == 9) || ((a++) == 9);

= ((a++) == 7) && ((++a) == 9) || ((a++) == 9);

= (((a++) == 7) && ((++a) == 9)) || ((a++) == 9);

= ((7 == 7) && ((++a) == 9)) || ((a++) == 9); //a = 8

= (true && ((++a) == 9)) || ((a++) == 9); //a = 8

= (true && (9 == 9)) || ((a++) == 9); //a = 9

= (true && true) || ((a++) == 9); //a = 9

= true || ((a++) == 9); //a = 9 [As, left operand evaluates to true, therefore no need to evaluate the right operand]

= true; //a = 9

So,

a = 9

res = true



Hope this answers your query.

Regards,

Udayan
*/
