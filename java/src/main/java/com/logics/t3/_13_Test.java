package com.logics.t3;

/*
 * created @ Tue Jun 22 2021 12:55:21 pm
 * ref @ 
 */
class _13_Test {
    public static void main(String[] args) {
        String[][] arr = { { "7", "6", "5" }, { "4", "3" }, { "2", "1" } };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                switch (arr[i][j]) {
                    case "2":
                    case "4":
                    case "6":
                        break;
                    default:
                        continue;
                }
                System.out.println(arr[i][j]);
            }
        }
    }
}

/*-

Explanation
case values must evaluate to the same type / compatible type as the switch expression can use. 

switch expression can accept following: 

char or Character, 

byte or Byte, 

short or Short, 

int or Integer, 

An enum only from Java 6, 

A String expression only from Java 7. 



In this case, switch expression [switch (arr[i][j])] is of String type.

Please note that break; statement at Line n4 takes the control to Line n6 (outside switch-case block) and not out of the inner for loop, where as, continue; statement at Line n5 takes the control to the update expression (j++) of Line n2.

arr.length is 3, so outer loop executes 3 times.

1st iteration of outer loop, i=0.

-1st iteration of inner loop, i=0, j=0 and arr[0].length = 3. 0 < 3 evaluates to true.

  arr[0][0] = "7", Line n5 is executed, and it takes the control to j++ (j = 1). 1 < 3 evaluates to true.

-2nd iteration of inner loop

  arr[0][1] = "6", Line n4 is executed, and it takes the control to Line n6. 6 is printed on to the console. Control goes to j++ (j = 2). 2 < 3 evaluates to true.

-3rd iteration of inner loop

  arr[0][2] = "5", Line n5 is executed, and it takes the control to j++ (j = 3).   As 3 < 3 evaluates to false, control exits inner loop and goes to i++.

You must have noticed that 1st iteration of outer loop prints the even number of 1st array { "7", "6", "5" }



Similarly, 2nd iteration of outer loop prints the even number of 2nd array { "4", "3" }, which is 4

and 3rd iteration of outer loop prints the even number of 3rd array { "2", "1" }, which is 2.



Therefore, the output is: 642.

*/