package com.logics.t11._41;

import java.io.IOException;
import java.sql.SQLException;

public class Test {

    private static void m() throws SQLException {
        try {
            throw new SQLException();
        } catch (Exception e) {
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            m();
        } catch (SQLException e) {
            System.out.println("CAUGHT SUCCESSFULLY");
        }
    }
}

/*-

Explanation
Even though it seems like method m() will not compile successfully, but starting with JDK 7, it is allowed to use super class reference variable in throw statement referring to sub class Exception object.



In this case, method m() throws SQLException and compiler knows that variable e (Exception type) refers to an instance of SQLException only and hence allows it.



Program executes successfully and prints CAUGHT SUCCESSFULLY on to the console.

*/