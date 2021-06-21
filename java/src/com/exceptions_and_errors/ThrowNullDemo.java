package com.exceptions_and_errors;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowNullDemo {
    public static void one() throws IOException {
        try {
            throw new IOException();
        } catch (IOException ioe) {
            ioe = null;
            throw ioe;
        }
    }

    public static void two()  {
        try {
            throw new SQLException();
        } catch (SQLException e) {
            e = null; // Line 10
            throw e; // Line 11
        }
    }

    public static void three() throws SQLException {
        try {
            throw new SQLException();
        } catch (SQLException e) {
            throw null;
        }
    }

    public static void main(String[] args) throws IOException, SQLException {
        System.out.println("hello world");
        one();
        two();
        three();
    }
}
