package com.inheritance;

import java.io.IOException;

/*-
 * 	@author lokeshwar @created 08-07-2020
 */

public class IllegalMethodOverrides extends Animal$1 {

    // INVALID: Access modiier more restricitive
    // private void eat() {}
    
    
    // INVALID: Declares a checked exception not defined by superclass version
    // public void eat() throws IOException {}
    
    
    
    // A legal overload, NOT an override, because the argument list changed
    public void eat(String food) {}
    
    
    
    // INVALID: Not an override because of the return type, and not an overload either because there's no change in the argument list 
    //public String eat() {}

}

class Animal$1 {
    public void eat() {

    }
}
