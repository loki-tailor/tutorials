package com.exceptions_and_errors;
/*
 * created @ Wed May 19 2021 6:50:46 am
 * ref @ 
 */

public class CustomRuntimeException {

    public static void main(String[] args) {
        throw new CustRuntimeException();
    }
}

class CustRuntimeException extends RuntimeException {}

/*- output

Exception in thread "main" com.exceptions_and_errors.CustRuntimeException
        at com.exceptions_and_errors.CustomRuntimeException.main(CustomRuntimeException.java:10)

*/
