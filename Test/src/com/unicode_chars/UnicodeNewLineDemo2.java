/*-
	created @ 21-03-20
	@author lokeshwar
*/

package com.unicode_chars;

public class UnicodeNewLineDemo2 {

	public static void main(String[] args) throws Exception {
		// \u000A System.out.println("This sentence is within the comments but with '\\u000A' i.e. new Line Feed (LF) unicode char");
	        // \u0055 is a Unicode escape for the capital U character (U)
		System.out.println("Hello \u0055nicode");
		System.out.println("Hello \u0055nicode".length());
		System.out.println("'\\u0055' is a Unicode escape for the capital U character (U)");
	}
} // end of class
