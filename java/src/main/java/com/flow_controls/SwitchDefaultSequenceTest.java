package com.flow_controls;

/*- @created = 18-05-21 */

public class SwitchDefaultSequenceTest {
    public static void main(String... args) {
        one(args[0]);
        // two(args[0]);
    }

    static void two(String a) {
        switch(Integer.valueOf(a)) {
            case 2: System.out.println("2"); break;
            default: System.out.println("default"); break;
            case 3: System.out.println("3"); break;
            case 4: System.out.println("4"); break;
        }

        /*-
        OUTPUT:

        ----------------------------
        when a = -10
        default
        ----------------------------
        when a = 2
        2
        ----------------------------
        basically, when it encounters break; execution will exit the switch() case.
        */
    }

    static void one(String a) {
        switch(Integer.valueOf(a)) {
            case 2: System.out.println("2");
            default: System.out.println("default");
            case 3: System.out.println("3");
            case 4: System.out.println("4");
        }

        /*-

        OUTPUT:
        ----------------------------
        when a = 2: 
        2
        default
        3      
        4        
        ----------------------------
        when a = 7:
        default
        3
        4        
        ----------------------------
        when a = 4:
        4
        ----------------------------
        when a = 3:
        3
        4
        ----------------------------
        */
    }
}