package com.logics.sierra_book.ST_ch5._9;

/*
 * created @ Mon May 31 2021 5:45:55 am
 * ref @ 
 */

class Infinity {
}

public class Beyond extends Infinity {

    static Integer i = 0;
    // above will give NPE if it's not given some value
    // since Integer has default values as NULL

    public static void main(String[] args) {
        int sw = (int) (Math.random() * 3);
        System.out.println(sw);
        switch (sw) {
            case 0: {
                for (int x = 10; x > 5; x++)
                    if (x > 10000000) {
                        x = 10;
                        System.out.println(x);
                    }

            }

            case 1: {
                int y = 7 * i; // NPE
                break;
            }

            case 2: {
                Infinity inf = new Beyond();
                Beyond b = (Beyond) inf;
            }
        }
    }
}
