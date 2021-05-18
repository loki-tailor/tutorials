package com.logics.sierra_book.ST_ch6._03;

/*-

    @created 14-05-21

    * unicode characters are best used within single quotes
    * else they are parsed to their actual values 
    * and then compiler starts looking for that decoded data (e.g. could be variable...)

*/

public class Actors {
    public static void main(String[] args) {
        char[] ca = { 0x4e, \u004e, 78 }; // compile error: expected => char[] ca = { 0x4e, '\u004e', 78 };
        System.out.println((ca[0] == ca[1]) + " " + (ca[0] == ca[2]));
        
        // it's 'N' => 0x4e, \u004e, ASCII 78
        System.out.println("\u004e");
        System.out.println(0x4e);
        System.out.println((char)78);
    }
}

/*- OUTPUT

.\com\logics\sierra_book\ST_ch6\_03\Actors.java:11: error: cannot find symbol
        char[] ca = { 0x4e, \u004e, 78 };
                                 ^
  symbol:   variable N
  location: class Actors
1 error

*/