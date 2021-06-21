package com.logics.t1;

import java.sql.SQLException;

public class _53_Test {

    private static void getData() throws SQLException {

        try {

            throw new SQLException();

        } catch (Exception e) {

            // } catch (SQLException e) {

            e = new SQLException();

            throw e;

        }

    }

    public static void main(String[] args) {

        try {

            getData();

        } catch (SQLException e) {

            System.out.println("SQL");

        }

    }

}
