"use strict";
// the constructor will tell the class to use it arguments as class level variables
class Person3 {
    constructor(fname, lname, shortname) {
        // implicitly this also does
        // this.fname = fname 
        // this.lname = lname 
        this.fname = fname;
        this.lname = lname;
        this.shortname = shortname;
        // i.e. auto-assigns the passed arguments
    }
}
