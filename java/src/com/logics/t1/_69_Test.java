package com.logics.t1;

/*
 * created @ Mon Jun 21 2021 4:58:37 pm
 * ref @ https://www.udemy.com/course/java-oca/learn/quiz/4358470#questions/13662294
 */

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class _69_Test {

    public static void main(String[] args) {
        A.test();
        System.out.println("done");
    }
}

class H {
    private static void perform() throws SQLException {
        try {
            throw new SQLException();
        } catch (Exception e) { // No issues as compiler is aware that try block throws SQLException and this
                                // catch block handles it

            throw new SQLException(); // No issues here as Compiler knows that type is of SQLException and it is
                                      // mentioned in throws clause

        }
    }
}

class G {
    private static void perform() throws SQLException {
        try {
            throw new SQLException();
        } catch (Exception e) {
            // e = new RuntimeException();
            // e = null;
            // e = new SQLException();
            // e = new Exception();
            throw e; // any re-assignment of e will result in compile error
        }
    }
}

class F {
    private static void perform() throws SQLException {
        int i = 0;

        try {
            if (i % 2 == 0)
                throw new SQLException();
            else
                throw new FileNotFoundException();
        } catch (Exception e) { // //This catch block can handle instances of both SQLException and
                                // FileNotFoundException, so no issues here.

            throw e; // Compilation error as compiler is not sure whether at runtime e will refer to
                     // an instance of SQLException or FileNotFoundExeption
        }
    }
}

class E {
    private static void perform() throws SQLException {
        try {
            throw new FileNotFoundException(); // No issues as compiler is aware that try block throws SQLException and
                                               // this
            // catch block handles it
        } catch (Exception e) {
            throw e; // Compile knows that FNFE is throwing but the throws clause is SQLE, not good

        }
    }
}

class D {
    private static void perform() throws SQLException {
        try {
            throw new SQLException(); // No issues as compiler is aware that try block throws SQLException and this
                                      // catch block handles it
        } catch (Exception e) {
            throw e; // Compiler knows that this catch block caught the instance of SQLException, so
                     // re-throwing the same instance has no problem as throws clause mentions
                     // SQLException

        }
    }
}

class C {
    private static void perform() throws SQLException {
        try {
            throw new SQLException(); // compiler knows that there is somehting to catch SQLE
        } catch (SQLException e) { // no issues, as compiler knows that try might throw SQLE
            throw e; // no issues as compiler sees throws clause for SQLE
        }
    }
}

class B {
    private static void perform() {
        try {
            throw new SQLException(); // error as compile sees your are not handling SQLE
        } catch (FileNotFoundException e) { // error as compiler knows that try does not throw FNFE
            throw e;
        }
    }
}

class A {
    public static void test() {
        try {
            _1();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void _1() throws SQLException {
        try {
            Exception e = new SQLException();
            throw e;
        } catch (Exception e) {
            // error as compiler is aware that return will be 'Exception' but you have
            // mentioned 'SQLException'
            throw e; // Unhandeled exception type Exception
        }
    }
}
