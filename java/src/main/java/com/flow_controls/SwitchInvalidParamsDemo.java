package com.flow_controls;
/*- @created 15-10-2020
*/
public class SwitchInvalidParamsDemo {
	public static void main(String[] args) {
		int a = 1;
		byte b = 1;
		char c = '1';
		float d = 1.0f;
		short e = 1;
		long f = 1L;
		boolean g = true;
		double h = 1.00000;
		String i = "1";
		
		System.out.println("Variable Type = " + ((Object)i).getClass().getName());
		switch(a) {
			case 1		: System.out.println("inside int(1) case."); break;
			default		: System.out.println("inside default case"); break;
		} // end of switch
	}
} // end of main

// output varies based on the variable in the switch statement