package com.logics;

public class IntParseUnderstand {

    public static void main(String[] args) {
        parseInt("- ", 10); // white space resovles to decimal 32 and goes into
                            // CharacterDataLatin1.class$digit()
        digit(32, 10);

    }

    /**
     * Parses the string argument as a signed integer in the radix specified by the
     * second argument. The characters in the string must all be digits of the
     * specified radix (as determined by whether
     * {@link java.lang.Character#digit(char, int)} returns a nonnegative value),
     * except that the first character may be an ASCII minus sign {@code '-'}
     * ({@code '\u005Cu002D'}) to indicate a negative value or an ASCII plus sign
     * {@code '+'} ({@code '\u005Cu002B'}) to indicate a positive value. The
     * resulting integer value is returned.
     *
     * <p>
     * An exception of type {@code NumberFormatException} is thrown if any of the
     * following situations occurs:
     * <ul>
     * <li>The first argument is {@code null} or is a string of length zero.
     *
     * <li>The radix is either smaller than {@link java.lang.Character#MIN_RADIX} or
     * larger than {@link java.lang.Character#MAX_RADIX}.
     *
     * <li>Any character of the string is not a digit of the specified radix, except
     * that the first character may be a minus sign {@code '-'}
     * ({@code '\u005Cu002D'}) or plus sign {@code '+'} ({@code '\u005Cu002B'})
     * provided that the string is longer than length 1.
     *
     * <li>The value represented by the string is not a value of type {@code int}.
     * </ul>
     *
     * <p>
     * Examples: <blockquote>
     * 
     * <pre>
     * parseInt("0", 10) returns 0
     * parseInt("473", 10) returns 473
     * parseInt("+42", 10) returns 42
     * parseInt("-0", 10) returns 0
     * parseInt("-FF", 16) returns -255
     * parseInt("1100110", 2) returns 102
     * parseInt("2147483647", 10) returns 2147483647
     * parseInt("-2147483648", 10) returns -2147483648
     * parseInt("2147483648", 10) throws a NumberFormatException
     * parseInt("99", 8) throws a NumberFormatException
     * parseInt("Kona", 10) throws a NumberFormatException
     * parseInt("Kona", 27) returns 411787
     * </pre>
     * 
     * </blockquote>
     *
     * @param s     the {@code String} containing the integer representation to be
     *              parsed
     * @param radix the radix to be used while parsing {@code s}.
     * @return the integer represented by the string argument in the specified
     *         radix.
     * @exception NumberFormatException if the {@code String} does not contain a
     *                                  parsable {@code int}.
     */
    public static int parseInt(String s, int radix) throws NumberFormatException {
        /*
         * WARNING: This method may be invoked early during VM initialization before
         * IntegerCache is initialized. Care must be taken to not use the valueOf
         * method.
         */

        if (s == null) {
            throw new NumberFormatException("null");
        }

        if (radix < Character.MIN_RADIX) {
            throw new NumberFormatException("radix " + radix + " less than Character.MIN_RADIX");
        }

        if (radix > Character.MAX_RADIX) {
            throw new NumberFormatException("radix " + radix + " greater than Character.MAX_RADIX");
        }

        int result = 0;
        boolean negative = false;
        int i = 0, len = s.length();
        int limit = -Integer.MAX_VALUE;
        int multmin;
        int digit;

        if (len > 0) {
            char firstChar = s.charAt(0);
            if (firstChar < '0') { // Possible leading "+" or "-"
                if (firstChar == '-') {
                    negative = true;
                    limit = Integer.MIN_VALUE;
                } else if (firstChar != '+')
                    // throw NumberFormatException.forInputString(s);
                    System.out.println("For input string: \"" + s + "\""); // {MODIFIED}

                if (len == 1) // Cannot have lone "+" or "-"
                    // throw NumberFormatException.forInputString(s);
                    System.out.println("For input string: \"" + s + "\""); // {MODIFIED}
                i++;
            }
            multmin = limit / radix;
            while (i < len) {
                // Accumulating negatively avoids surprises near MAX_VALUE
                digit = Character.digit(s.charAt(i++), radix);
                if (digit < 0) {
                    // throw NumberFormatException.forInputString(s);
                    System.out.println("For input string: \"" + s + "\""); // {MODIFIED}
                }
                if (result < multmin) {
                    // throw NumberFormatException.forInputString(s);
                    System.out.println("For input string: \"" + s + "\""); // {MODIFIED}
                }
                result *= radix;
                if (result < limit + digit) {
                    // throw NumberFormatException.forInputString(s);
                    System.out.println("For input string: \"" + s + "\""); // {MODIFIED}
                }
                result -= digit;
            }
        } else {
            // throw NumberFormatException.forInputString(s);
            System.out.println("For input string: \"" + s + "\""); // {MODIFIED}
        }
        return negative ? result : -result;
    }

    // CharacterDataLatin1.class
    static int digit(int ch, int radix) {
        int value = -1;
        if (radix >= Character.MIN_RADIX && radix <= Character.MAX_RADIX) {
            int val = getProperties(ch);
            int kind = val & 0x1F;
            if (kind == Character.DECIMAL_DIGIT_NUMBER) {
                value = ch + ((val & 0x3E0) >> 5) & 0x1F;
            } else if ((val & 0xC00) == 0x00000C00) {
                // Java supradecimal digit
                value = (ch + ((val & 0x3E0) >> 5) & 0x1F) + 10;
            }
        }
        return (value < radix) ? value : -1;
    }

    // CharacterDataLatin1.class
    static final int A[] = new int[256];

    static int getProperties(int ch) {
        char offset = (char) ch;
        int props = A[offset];
        return props;
    }

}