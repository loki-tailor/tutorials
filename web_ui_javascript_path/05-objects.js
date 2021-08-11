/*
    - 2 ways to create an object

    - object literals
        - simply putting code in 2 curly braces

    - object classes
*/

// object literal
const cookie = {}
console.log(typeof cookie + "\t;\tvalue = \n");
console.log(cookie);
console.log("###########################################");

// object with data
const cookie2 = {
    name: "Chocolate Chip",
    "short name": "CC",
    isSweet: true,
    "+abcde": "property which can be accessible only with square-bracket",

    // funciton in side object-literals
    eatCookie: function () { // 'funciton() is mandatory
        console.log("i am a function from 'object literal': i am eating @ " + this.name);
    }
};
console.log(typeof cookie2 + "\t;\tvalue = \n");
console.log(cookie2); // print class values
cookie2.name = "[upated]" + cookie2.name; // update class property
console.log(cookie2.name);
console.log(cookie2["+abcde"]);

// function calling : from class (anon)
console.log("###########################################");
console.log("doing 'console.log(cookie2.eatCookie);' below: ");
console.log(cookie2.eatCookie); // literally prints the function data
console.log("###########################################");
console.log("doing 'console.log(cookie2.eatCookie());': below: ");
console.log(cookie2.eatCookie()); // performs operations inside a function
// since function returns no values, hence 'undefined' is also printed on console
console.log("###########################################");
console.log("calling only function i.e. cookie2.eatCookie() : below: ");
cookie2.eatCookie()
console.log("###########################################");

// object with empty classes
class CookieEmpty { }
const cookie_empty_obj = new CookieEmpty();
console.log(typeof cookie_empty_obj);
console.log(cookie_empty_obj);
console.log("###########################################");

// object with classes
class Cookie {
    constructor() {
        this.name = "Chocolate Chip";
        // this."short name" = "CC", error
        this.short_name = "CC";
        this.isSweet = true;
        // this."+abcde" = "property which can be accessible only with square-bracket" error
        this._abcde = "abcde";
    }

    eatCookie() {
        console.log("i am a function inside a class & outside a constructor : i am eating @ " + this.name);
    }
}
const cookie_obj = new Cookie();
console.log(typeof cookie_obj);
console.log(cookie_obj);
console.log(cookie_obj.eatCookie); // will print nothing or do nothing
console.log(cookie_obj.eatCookie()); // will call the function
console.log("###########################################");