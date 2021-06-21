package com.logics.t1;

/**
 * _20_Test
 */
public class _20_Test {

}

interface Printable {
    public void setMargin();

    public void setOrientation();
}

abstract class Paper implements Printable { // Line 7
    public void setMargin() {
    }
    // Line 9
}

class NewsPaper extends Paper { // Line 12
    public void setMargin() {
    }
    // Line 14
}

/*-
Explanation
First you should find out the reason for compilation error. Methods declared in Printable interface are implicitly abstract, no issues with Printable interface.



class Paper is declared abstract and it implements Printable interface, it overrides setMargin() method but setOrientation() method is still abstract. No issues with class Paper as it is an abstract class and can have 0 or more abstract methods. 



class NewsPaper is concrete class and it extends Paper class (which is abstract). So class NewsPaper must override setOrientation() method OR it must be declared abstract.



Replacing Line 9 with 'public abstract void setOrientation();' is not necessary and it will not resolve the compilation error in NewsPaper class.



Replacing Line 7 with 'class Paper implements Printable {' will cause compilation failure of Paper class as it inherits abstract method 'setOrientation'.

*/