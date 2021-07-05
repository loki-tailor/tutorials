package com.flow_controls;

/*- @ created = 18-05-21 */

public class ContinueInSwitch {
    public static void main(String... args) {
        switch("red") {
            case "yellow": System.out.println("inside yellow..."); break;
            
            // compile error:
            // error: continue outside of loop
            case "red": System.out.println("inside red..."); continue;

            default: System.out.println("inside default (specifically for red..)");
        }
        System.out.println("done");
    }
}