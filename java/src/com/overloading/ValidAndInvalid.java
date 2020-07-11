package com.overloading;

/*-
 * 	@author lokeshwar @created 09-07-20
 */

public class ValidAndInvalid {

    void roadBike() {
    }

    // INVALID :- based on access specifier
    // public void roadBike() {}
    // private void roadBike() {}
    // protected void roadBike() {}

    // INVALID :- based on return type
    // String roadBike() { return ""; }
    // int roadBike() { return 0; }

    String roadBike(String frame) {
	return "carbon-" + frame;
    }

    // VALID: different type of argument
    String roadBike(StringBuilder groupset) {
	return new StringBuilder("Shimano 105").toString();
    }

    // INVALID: Even though this is throwing exception
    // String roadBike(String fork) throws IOException { return "alu-carbon fork"; }
    
    
    // BELOW all are valid
    void roadBike(int qty) {}
    void roadBike(Integer qty) {}
    void roadBike(String name, int qty) {}
    void roadBike(int price, String model) {}

}
