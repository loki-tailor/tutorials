package com.logics.sierra_book.ST_ch5._7;
/*
 * created @ Wed May 19 2021 7:27:45 am
 * ref @ 
 */

class SubException extends Exception {
}

class SubSubException extends SubException {
}

public class CC {
    void doStuff() throws SubException {
    }
}

class CC2 extends CC {
    void doStuff() throws SubSubException {

    }
}

class CC3 extends CC {
    // void doStuff() throws Exception {}
    // above gives below compile time error
    /*- Exception Exception is not compatible with throws clause in CC.doStuff()Java(67109266) */
}

class CC4 extends CC {
    void doStuff(int x) throws Exception {
    }
}

class CC5 extends CC {
    void doStuff() {

    }

    /*-
        The overriding method can throw narrower or fewer exceptions than the overridden method.
    */
}
