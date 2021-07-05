 package com.exceptions_and_errors;

/*-
    @created 26-01-21

    [Below text was copy pasted from link: https://www.geeksforgeeks.org/fizz-buzz-implementation/#:~:text=Fizz%20Buzz%20is%20a%20very,5'%20print%20%E2%80%9CBuzz%E2%80%9D.]
    [It resulted in compile-time error, shown at the end of this file]
    [Error is mainly because of the type of quote used in the comments section i.. “Fizz”]

    Fizz Buzz is a very simple programming task, asked in software developer job interviews.

    A typical round of Fizz Buzz can be: 
    Write a program that prints the numbers from 1 to 100 and for multiples of ‘3’ print “Fizz” instead of the number and for the multiples of ‘5’ print “Buzz”. 

    1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, 
    Fizz Buzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, 
    Fizz, 28, 29, Fizz Buzz, 31, 32, Fizz, 34, Buzz, Fizz, ...
*/

public class UmpappableChar {
    public static void main(String[] args) {

        for(int i=0, j=0; i<=100 && j<=100; i++, j++) {
            System.out.println(i + " - " + j);
            break;
        }
    }
}

/*- 

    OUTPUT :-

    PS C:\Users\lokeshwar.tailor\Downloads\git\tutorials\java\src> javac .\com\logics\FizzBuzz.java
.\com\logics\FizzBuzz.java:11: error: unmappable character for encoding Cp1252
    Write a program that prints the numbers from 1 to 100 and for multiples of ΓÇÿ3ΓÇÖ print ΓÇ£FizzΓÇ? instead of the number and for the multiples of ΓÇÿ5ΓÇÖ print ΓÇ£BuzzΓÇ?.
                                                                                                      ^
.\com\logics\FizzBuzz.java:11: error: unmappable character for encoding Cp1252
    Write a program that prints the numbers from 1 to 100 and for multiples of ΓÇÿ3ΓÇÖ print ΓÇ£FizzΓÇ? instead of the number and for the multiples of ΓÇÿ5ΓÇÖ print ΓÇ£BuzzΓÇ?.

     ^
2 errors

*/