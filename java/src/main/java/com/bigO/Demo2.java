package com.bigO;

/***
    @created 06-03-21

    ref = https://www.youtube.com/watch?v=itn09C2ZB9Y

    more efficient      O(1)            =   constant
                        O(long n)       =   logarithmic
                        O(n)            =   linear
                        O(n log n)      =   linear * log
                        O(n * n)        =   quadratic
    less efficient      O(2 * n)        =   exponential
                    
*/

public class Demo2 {
       
    // TIME COMPLEXITY O(n)
    public static void bigO_n() {
        char[] data = {'A', 'B', 'C'};
        for(int i = 0 ; i < data.length ; i++) {
            System.out.println(data[i]);
        }
    } 

    // TIME COMPLEXITY O(n + x)
    public static void bigO_n_plus_x() {
        
        char[] data1 = {'A', 'B', 'C'};
        int[] data2 = {1, 2, 3, 4, 5};

        for(int i = 0 ; i < data1.length ; i++) {
            System.out.println(data1[i]);
        }

        for(int j = 0 ; j < data2.length ; j++) {
            System.out.println(data2[j]);
        }
    } 

    // TIME COMPLEXITY O(n * x)
    public static void bigO_n_times_x() {
        
        char[] data1 = {'A', 'B', 'C'};
        int[] data2 = {1, 2, 3, 4, 5};

        for(int i = 0 ; i < data1.length ; i++) {           
            for(int j = 0 ; j < data2.length ; j++) {
                System.out.println(data1[i] + " : " + data2[j]);
            } // loop-2 end
        } // loop-1 end
    } // method end    

    // TIME COMPLEXITY O(n ^ 2)
    public static void bigO_n_square() {
        
        char[] data1 = {'A', 'B', 'C'};

        for(int i = 0 ; i < data1.length ; i++) {           
            for(int j = 0 ; j < data1.length ; j++) {
                System.out.println(data1[i] + " : " + data1[j]);
                System.out.println(data1[i] + " : " + data1[j]); // constants have no effect on Big-O notation i.e. O(n^2 + 4) is same as O(n^2)
                System.out.println(data1[i] + " : " + data1[j]); // constants have no effect on Big-O notation
                System.out.println(data1[i] + " : " + data1[j]); // constants have no effect on Big-O notation
            } // loop-2 end
        } // loop-1 end
    } // method end 

  // TIME COMPLEXITY O(n ^ 2 + n) is nothing but O(n^2) (omitting lesser complex)
    public static void bigO_considering_worst_complex() {
        
        char[] data1 = {'A', 'B', 'C'};

        for(int i = 0 ; i < data1.length ; i++) {           
            for(int j = 0 ; j < data1.length ; j++) {
                System.out.println(data1[i] + " : " + data1[j]);
            } // loop-2 end
        } // loop-1 end

        for(int j = 0 ; j < data1.length ; j++) {
            System.out.println(data1[j] + " : " + data1[j]);
        } // loop-2 end        
    } // method end     

    // SPACE COMPLEXITY: O(1)
    public static void bigO_one_space() {
        char[] data = {'A', 'B', 'C'};

        for(int i = 0; i < data.length ; i++) {
            System.out.println(data[i]);
        } // loop end
    } // method end


    // SPACE COMPLEXITY: O(n)
    public static void bigO_n_space() {
        char[] data = {'A', 'B', 'C'};
        char[] bkp = new char[data.length];

        for(int i = 0; i < data.length ; i++) {
            bkp[i] = data[i];
        } // loop end        
    } // method end   

   // SPACE COMPLEXITY: O(n^2)
    public static void bigO_n_square_space() {
        char[] data = {'A', 'B', 'C', 'D'};
        char[][] bkp = new char[data.length][];

        for(int i = 0; i < data.length ; i++) {
            bkp[i] = new char[data.length];
            for(int j=0; j<data.length; j++) {
                bkp[i][j] = data[i];
            }
        } // loop end    

        for(char[] temp : bkp) {
            System.out.println(java.util.Arrays.toString(temp));
        }
    } // method end         

   public static void main(String... args) {
         bigO_n_square_space();
    } // main end         

} // class end