"use strict";
class Foo {
    constructor(name1, name2) {
        this.name1 = name1;
        this.name2 = name2;
    }
    getFName() {
        return this.name1 + this.name2;
    }
}
let a2 = new Foo('arg1', 'arg2');
let someObj = {
    name1: 'test',
    name2: 'test2',
    getFName: () => 'test',
    aProp: 20
};
// duck-typing
a2 = someObj; // allowed since obj structure is same
// a2.aProp //
