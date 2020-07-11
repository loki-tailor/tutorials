package com.inheritance;

/*-
	@author lokeshwar @created 10-07-2020
*/

class Foo {} // OK
class Button {} // OK
// class Bar implements Foo {} // compile error: interface expected here
interface Baz{} // OK
interface Fi {} // OK
// interface Fee implements Baz {} // interface cannot implement interfaces. compile error: '{' expected

// interface Zee implements Foo {} // interface cannot implement classes. compile error: '{' expected

// interface Zoo extends Foo {} // interfaces cannot extend classes. compile error: interface expected here

interface Boo extends Fi {} // OK

// class Toon extends Foo, Button {} // classes can't extend multiple classes. compile error: '{' expected

class Zoom implements Fi, Baz {} // OK

interface Vroom extends Fi, Baz {} // OK

class Yow extends Foo implements Fi {} // OK

class Yow2 extends Foo implements Fi, Baz {} // OK

