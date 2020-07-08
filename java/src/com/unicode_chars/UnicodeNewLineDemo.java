/*-
	created @ 21-03-20
	@author lokeshwar
*/

package com.unicode_chars;

public class UnicodeNewLineDemo {
    
    /**

	public static void main(String[] args) throws Exception {
	    
		// \u000A is a unicode escape for the line feed (LF)
	        // \u0055 is a Unicode escape for the capital U character (U)
		System.out.println("Hello \u0055nicode");
		System.out.println("Hello \u0055nicode".length());
		System.out.println("'\\u0055' is a Unicode escape for the capital U character (U)");
		
	
	}


	/***	NOTES:

		* Unicode escapes start with \\u and the compiler expects four hexadecimal digits to be followed. 
		  When this rule is not met, the compiler will throw an error.

		* ABOVE CODE WILL GET COMPILED IN BELOW MANNER:
			The Java Language Specification says that lexical translation is performed in the following 3 steps, 
			where each step is applied to the result of the previous step:

			1. Translation of Unicode escapes.
			2. Divide stream of input characters into lines by recognizing line terminators (LF, CR or CR LF).
			3. Discard whitespace and comments and tokenize the result from the previous step.

		i.e. \u000A is first parsed and the text is made likewise as new line and then compilation comes into picture.	

		public static void main(String[] args) throws Exception {
			// 
			\u000A is a unicode escape for the line feed (LF)
			// \u0055 is a Unicode escape for the capital U character (U)
			System.out.println("Hello \u0055nicode");
			System.out.println("Hello \u0055nicode".length());
			System.out.println("'\\u0055' is a Unicode escape for the capital U character (U)");
		}	

	*/
} // end of class
