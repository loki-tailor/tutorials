package com.logics.sierra_book.ST_ch6._06;

/*_
    @created = 14-05-21

    C. Five Objects were created
    F. Two objects are eligible for GC
*/

class Dozens {
    int[] dz = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
}

public class Eggs {
    public static void main(String[] args) {

        // only ref variables created, no objects
        // 1 object created for da
        // object 1 @ da$
        Dozens[] da = new Dozens[3];

        // 2 objects created
        // obj 2 @ da[0] > Dozens$
        // obj 3 @ da[0] > Dozens > dz$
        da[0] = new Dozens();

        // 2 objects created
        // object 4 @ d > Dozen
        // object 5 @ d > Dozen > dz$
        Dozens d = new Dozens();

        // 1 object referenced only
        da[1] = d;

        // 1 objects ready for GC
        // object 4 + 5
        d = null;

        // only reference nullified
        // da[1] = null;
        System.out.println(da[1] + "done");
    }
}
