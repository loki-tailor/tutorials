package com;
/*
 * created @ Sat Jul 03 2021 4:52:28 pm
 * ref @ 
 */

import java.io.IOException;
import java.sql.SQLException;

interface TempInterface {
    public void m1() throws IOException;

    // protected static m2() throws SQLException {} // error: Illegal modifier for
    // the interface method m2; only public, private, abstract, default, static and
    // strictfp are permitted

    private static void m2() throws SQLException {} // no error
}

public class Temp {

}
