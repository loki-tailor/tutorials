package com.interface_is_a_obj;
/*
 * created @ Mon May 17 2021 5:58:16 am
 * ref @ https://ohmjavaclasses.blogspot.com/2011/11/is-intreface-inherits-object-clashow.html
 */

public interface InterfaceDeclaringSuperTypeMethod {

    // compile error: The return type is incompatible with Object.toString()
    public void toString();

    // no compile error
    public void equals();

    // compile error: The return type is incompatible with Object.toString()
    public void hashCode();
}
