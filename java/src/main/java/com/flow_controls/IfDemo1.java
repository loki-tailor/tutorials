package com.flow_controls;

/*- @created 09-02-21 
 * ref: youtube.com/watch?v=4NshxkCx5ac
 */
public class IfDemo1 {
	public static void main(String[] args) {
		double price = 90000;
		String model = "";
		if (price > 100000) {
			model = "Tesla Model X";
		} else if (price <= 100000) {
			model = "Tesla Model S";
		}
		System.out.println(model); // if model is not initialized we get compile
		// error "The local variable model may not have been initialized"
	}
	
	public static void main2(String[] args) {
		double price = 90000;
		String model;
		if (price > 100000) {
			model = "Tesla Model X";
		} else {
			model = "Tesla Model S";
		}
		
		// in this case, no error even though 'model' was not initialized
		System.out.println(model); 
	}	
}
