/*-
	created @ 21-03-20
	@author lokeshwar
*/

package com.unicode_chars;

public class IllFormedUnicodeEscape {
    public static void main(String[] args) {

	/*-
	 *  below comment will give compilation error since 'backwardSlash u' is used as a unicode ecape
	 *  
	 */

	// changing \\user to singleBackwardSlash u -> will give compilation error
	// user data is read from C:\data\\users\profile
	System.out.println("User data");
    }
} // end of class
